/*     */ package br.com.hikvision.minmoe.utils;
/*     */ 
/*     */ import br.com.thidi.middleware.configurations.RestTemplateConfig;
/*     */ import br.com.thidi.middleware.resource.CLogger;
/*     */ import com.fasterxml.jackson.databind.ObjectMapper;
/*     */ import java.util.Map;
/*     */ import java.util.UUID;
/*     */ import java.util.regex.Matcher;
/*     */ import java.util.regex.Pattern;
/*     */ import org.apache.commons.codec.digest.DigestUtils;
/*     */ import org.springframework.http.HttpEntity;
/*     */ import org.springframework.http.HttpHeaders;
/*     */ import org.springframework.http.HttpMethod;
/*     */ import org.springframework.http.ResponseEntity;
/*     */ import org.springframework.util.MultiValueMap;
/*     */ import org.springframework.web.client.HttpClientErrorException;
/*     */ import org.springframework.web.client.RestTemplate;
/*     */ 
/*     */ 
/*     */ public class HikbisionDigestAuthRestUtil
/*     */ {
/*  22 */   private final RestTemplate restTemplate = RestTemplateConfig.getRestTemplate();
/*  23 */   ObjectMapper objectMapper = new ObjectMapper();
/*     */   private final String username;
/*     */   private final String password;
/*     */   
/*     */   public HikbisionDigestAuthRestUtil(String username, String password) {
/*  28 */     this.username = username;
/*  29 */     this.password = password;
/*     */   }
/*     */ 
/*     */   
/*     */   public <T> ResponseEntity<String> executeWithDigestAuth(String url, HttpMethod method, HttpEntity<T> entity) throws Exception {
/*     */     try {
/*  35 */       ResponseEntity<String> initialResponse = this.restTemplate.exchange(url, method, entity, String.class, new Object[0]);
/*  36 */       if (initialResponse.getStatusCode().is2xxSuccessful()) {
/*  37 */         return initialResponse;
/*     */       }
/*  39 */       throw new Exception(initialResponse.toString());
/*  40 */     } catch (HttpClientErrorException e) {
/*  41 */       if (e.getStatusCode().value() == 401) {
/*  42 */         String wwwAuthenticateHeader = e.getResponseHeaders().getFirst("WWW-Authenticate");
/*     */         
/*  44 */         if (wwwAuthenticateHeader != null) {
/*     */           try {
/*  46 */             DigestParams digestParams = parseDigestParams(wwwAuthenticateHeader);
/*  47 */             String digestAuthHeader = calculateDigestAuthHeader(digestParams, url, method.name());
/*     */             
/*  49 */             HttpHeaders newHeaders = new HttpHeaders();
/*  50 */             if (entity == null) {
/*  51 */               newHeaders.set("Authorization", digestAuthHeader);
/*  52 */               HttpEntity<T> httpEntity = new HttpEntity(null, (MultiValueMap)newHeaders);
/*  53 */               CLogger.logHikvisionDebug("Execute auth request", 
/*  54 */                   "\n\nEntity: " + httpEntity.toString());
/*     */               
/*  56 */               return this.restTemplate.exchange(url, method, httpEntity, String.class, new Object[0]);
/*     */             } 
/*  58 */             HttpHeaders existingHeaders = entity.getHeaders();
/*     */             
/*  60 */             if (existingHeaders == null || existingHeaders.isEmpty()) {
/*  61 */               newHeaders.set("Authorization", digestAuthHeader);
/*     */             } else {
/*  63 */               newHeaders.putAll((Map)existingHeaders);
/*  64 */               newHeaders.set("Authorization", digestAuthHeader);
/*     */             } 
/*     */             
/*  67 */             HttpEntity<T> updatedEntity = new HttpEntity(entity.getBody(), (MultiValueMap)newHeaders);
/*     */ 
/*     */ 
/*     */             
/*  71 */             return this.restTemplate.exchange(url, method, updatedEntity, String.class, new Object[0]);
/*     */           }
/*  73 */           catch (Exception e1) {
/*  74 */             throw e1;
/*     */           } 
/*     */         }
/*     */       } else {
/*  78 */         CLogger.logHikvisionError("Execute initial request", "Error during request: " + e.getMessage());
/*     */       } 
/*  80 */     } catch (Exception ex) {
/*  81 */       throw ex;
/*     */     } 
/*     */     
/*  84 */     return null;
/*     */   }
/*     */   
/*     */   private DigestParams parseDigestParams(String wwwAuthenticateHeader) {
/*  88 */     DigestParams params = new DigestParams();
/*     */     
/*  90 */     Pattern pattern = Pattern.compile("(\\w+)=\"([^\"]+)\"");
/*  91 */     Matcher matcher = pattern.matcher(wwwAuthenticateHeader);
/*     */     
/*  93 */     while (matcher.find())
/*  94 */     { String key = matcher.group(1);
/*  95 */       String value = matcher.group(2);
/*     */       String str1;
/*  97 */       switch ((str1 = key).hashCode()) { case -1010695135: if (!str1.equals("opaque")) {
/*     */             continue;
/*     */           }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 108 */           params.opaque = value;case 112146: if (!str1.equals("qop"))
/*     */             continue;  params.qop = value;case 105002991: if (!str1.equals("nonce"))
/*     */             continue;  params.nonce = value;
/*     */         case 108386959: if (!str1.equals("realm"))
/* 112 */             continue;  params.realm = value; }  }  return params;
/*     */   }
/*     */   
/*     */   private String calculateDigestAuthHeader(DigestParams params, String uri, String method) {
/* 116 */     String nc = "00000001";
/* 117 */     String cnonce = generateCnonce();
/*     */     
/* 119 */     String response = calculateDigest(this.username, params.realm, this.password, method, uri, params.nonce, nc, cnonce, 
/* 120 */         params.qop);
/*     */     
/* 122 */     return String.format(
/* 123 */         "Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", qop=%s, nc=%s, cnonce=\"%s\", response=\"%s\", opaque=\"%s\"", new Object[] {
/* 124 */           this.username, params.realm, params.nonce, uri, params.qop, nc, cnonce, response, params.opaque
/*     */         });
/*     */   }
/*     */   
/*     */   private String calculateDigest(String username, String realm, String password, String method, String uri, String nonce, String nc, String cnonce, String qop) {
/* 129 */     String A1 = String.valueOf(username) + ":" + realm + ":" + password;
/* 130 */     String ha1 = DigestUtils.md5Hex(A1);
/*     */     
/* 132 */     String A2 = String.valueOf(method) + ":" + uri;
/* 133 */     String ha2 = DigestUtils.md5Hex(A2);
/*     */     
/* 135 */     return DigestUtils.md5Hex(String.valueOf(ha1) + ":" + nonce + ":" + nc + ":" + cnonce + ":" + qop + ":" + ha2);
/*     */   }
/*     */   
/*     */   private String generateCnonce() {
/* 139 */     return UUID.randomUUID().toString();
/*     */   }
/*     */   
/*     */   private static class DigestParams {
/*     */     String realm;
/*     */     String nonce;
/*     */     String qop;
/*     */     String opaque;
/*     */   }
/*     */ }


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\hikvision\minmo\\utils\HikbisionDigestAuthRestUtil.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
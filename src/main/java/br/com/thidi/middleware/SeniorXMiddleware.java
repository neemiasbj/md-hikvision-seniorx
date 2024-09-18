package br.com.thidi.middleware;

import java.io.InputStream;
import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import br.com.seniorx.services.SeniorHandlerService;
import br.com.seniorx.services.SeniorWebSocketService;
import br.com.thidi.middleware.resource.CLogger;
import br.com.thidi.middleware.services.PropertiesService;
import br.com.thidi.middleware.utils.PropertiesUtilImpl;
import jakarta.annotation.PostConstruct;

@SpringBootApplication
@ComponentScan(basePackages = { "br.com.hikivision.seniorx.controller" })
public class SeniorXMiddleware {

	static PropertiesService ps = new PropertiesService();

	@Bean
	public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryCustomizer() {
		return factory -> factory.setPort(Integer.valueOf(PropertiesUtilImpl.getValor("api.port") == null ? "8080" : PropertiesUtilImpl.getValor("api.port"))); // Aqui você define a porta manualmente
	}

	public static void main(String[] args) {
		SpringApplication.run(SeniorXMiddleware.class, args);
	}

	@PostConstruct
	public void init() {

		CLogger.logPropertiesInfo("Conex", "Versão: " + getVersion());
		CLogger.logPropertiesInfo("FILE CONFIG DATA", "api.port: " + PropertiesUtilImpl.getValor("api.port"));
		CLogger.logPropertiesInfo("FILE CONFIG DATA", "senior.senior.websocket.reconnect.interval.seconds: " + PropertiesUtilImpl.getValor("senior.websocket.reconnect.interval.seconds"));
		CLogger.logPropertiesInfo("FILE CONFIG DATA", "senior.partner_key: " + PropertiesUtilImpl.getValor("senior.partner_key"));
		CLogger.logPropertiesInfo("FILE CONFIG DATA", "senior.driver_key: " + PropertiesUtilImpl.getValor("senior.driver_key"));
		CLogger.logPropertiesInfo("FILE CONFIG DATA", "senior.api.sdk.uri: " + PropertiesUtilImpl.getValor("senior.api.sdk.uri"));
		CLogger.logPropertiesInfo("FILE CONFIG DATA", "senior.api.sdk.timeout: " + PropertiesUtilImpl.getValor("senior.api.sdk.timeout"));
		CLogger.logPropertiesInfo("FILE CONFIG DATA", "senior.websocket.uri: " + PropertiesUtilImpl.getValor("senior.websocket.uri"));
		CLogger.logPropertiesInfo("FILE CONFIG DATA", "time.pooling.pendency.seconds: " + PropertiesUtilImpl.getValor("time.pooling.pendency.seconds"));
		CLogger.logPropertiesInfo("FILE CONFIG DATA", "time.keep.alive.senior.seconds: " + PropertiesUtilImpl.getValor("time.keep.alive.senior.seconds"));
		CLogger.logPropertiesInfo("FILE CONFIG DATA", "time.waiting.resttemplate.seconds: " + PropertiesUtilImpl.getValor("time.waiting.resttemplate.seconds"));

		SeniorWebSocketService ws = new SeniorWebSocketService();
		ws.start();

		SeniorHandlerService shs = new SeniorHandlerService();
		shs.start();

//		PendencyQueueService pqs = new PendencyQueueService();
//		pqs.start();

	};

	public synchronized String getVersion() {

		String version = null;

		try {
			Properties p = new Properties();
			InputStream is = getClass().getResourceAsStream("/META-INF/maven/br.com.telematica/conex/pom.properties");
			if (is != null) {
				p.load(is);
				version = p.getProperty("version", "");
			}
		} catch (Exception e) {
			// ignore
		}

		if (version == null) {
			Package aPackage = getClass().getPackage();
			if (aPackage != null) {
				version = aPackage.getImplementationVersion();
				if (version == null) {
					version = aPackage.getSpecificationVersion();
				}
			}
		}

		if (version == null) {
			version = "";
		}

		return version;

	}

}

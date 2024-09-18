package br.com.thidi.middleware;

import java.io.InputStream;
import java.util.Collections;
import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.seniorx.services.SeniorHandlerService;
import br.com.seniorx.services.SeniorWebSocketService;
import br.com.thidi.middleware.resource.CLogger;
import br.com.thidi.middleware.services.PropertiesService;
import br.com.thidi.middleware.utils.PropertiesUtilImpl;
import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class Middleware {

	static PropertiesService ps = new PropertiesService();

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Middleware.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", PropertiesUtilImpl.getValor("api.port") == null ? "8080" : PropertiesUtilImpl.getValor("api.port")));
		app.run(args);
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

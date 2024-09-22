package br.com.thidi.middleware;

import java.io.InputStream;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.Collections;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.slf4j.MDC;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.thidi.middleware.resource.CLogger;
import br.com.thidi.middleware.services.PropertiesService;
import br.com.thidi.middleware.utils.PropertiesUtilImpl;

@SpringBootApplication
public class Middleware extends Thread {

	static PropertiesService ps = new PropertiesService();
	private static Logger logger = LogManager.getLogger();

	@Override
	public void run() {
		startMiddleware();
	}

	public static void main(String[] args) {
		Middleware c = new Middleware();
		c.run();
	}

	public void startMiddleware() {

		RuntimeMXBean rt = ManagementFactory.getRuntimeMXBean();
		String pid = rt.getName();
		MDC.put("PID", pid);

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

		SpringApplication app = new SpringApplication(Middleware.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.setDefaultProperties(Collections.singletonMap("server.port", PropertiesUtilImpl.getValor("api.port")));

		app.run();

		while (true) {

			try {
				Thread.sleep(1000 * 60 * 30);
				logger.info("CONEX ALIVE");
			} catch (Exception e) {
				// e.printStackTrace();
			}

		}
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

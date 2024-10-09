package br.com.thidi.middleware;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ServiceManager {

	private static Logger logger = LogManager.getLogger();

	private Middleware middleware;

	private static ServiceManager servicemanager;

	public ServiceManager() {
	}

	public static void main(String[] args) {
		execute(args);
	}

	public static void execute(String args[]) {

//		logger.info(args[0].toUpperCase());

		String cmd = "start";

		if (args.length > 0) {

			cmd = args[0];

			if ("start".equals(cmd) || "start".equals(cmd)) {

				if (servicemanager == null) {
					servicemanager = new ServiceManager();
				}

				if ("start".equals(cmd)) {
					servicemanager.start();
				} else {
					servicemanager.stop();
				}
			}

		}
	}

	public boolean start() {

		logger.info("SERVICO INICIANDO...");

		middleware = new Middleware();
		middleware.start();

		return true;

	}

	public void stop() {

		logger.info("SERVICO PARANDO...");

		// service.setStop();

		logger.info("SERVICO PARADO");

	}

}

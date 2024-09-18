package br.com.thidi.middleware.resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CLogger {

	private static final Logger SENIOR_LOGGER = LogManager.getLogger("SENIOR_LOGGER");
	private static final Logger HIKIVISION_LOGGER = LogManager.getLogger("HIKIVISION_LOGGER");
	private static final Logger WEBSOCKET_LOGGER = LogManager.getLogger("WEBSOCKET_LOGGER");
	private static final Logger SPRING_LOGGER = LogManager.getLogger("SPRING_LOGGER");
	private static final Logger LOGGER = LogManager.getLogger("LOGGER");
	private static final Logger PROPERTIES = LogManager.getLogger("PROPERTIES");
	private static final Logger FILE = LogManager.getLogger("FILE");
	private static final Logger GENERAL = LogManager.getLogger("GENERAL");

	public static void logWebSocketInfo(String func, String message) {
		String logMessage = getFormattedLogMessage(func, message);
		WEBSOCKET_LOGGER.info(logMessage);
	}

	public static void logSpringInfo(String func, String message) {
		String logMessage = getFormattedLogMessage(func, message);
		SPRING_LOGGER.info(logMessage);
	}

	public static void logSeniorInfo(String func, String message) {
		String logMessage = getFormattedLogMessage(func, message);
		SENIOR_LOGGER.info(logMessage);
	}

	public static void logHikivisionInfo(String func, String message) {
		String logMessage = getFormattedLogMessage(func, message);
		HIKIVISION_LOGGER.info(logMessage);
	}

	public static void logSeniorError(String func, String message) {
		String logMessage = getFormattedLogMessage(func, message);
		SENIOR_LOGGER.error(logMessage);
	}

	public static void logHikivisionError(String func, String message) {
		String logMessage = getFormattedLogMessage(func, message);
		HIKIVISION_LOGGER.error(logMessage);
	}

	public static void logWebSocketError(String func, String message) {
		String logMessage = getFormattedLogMessage(func, message);
		WEBSOCKET_LOGGER.error(logMessage);
	}

	public static void logWebSocketDebug(String func, String message, Throwable throwable) {
		String logMessage = getFormattedLogMessage(func, message);
		String errorMessage = throwable.getMessage();
		WEBSOCKET_LOGGER.debug(logMessage + " - " + errorMessage);
	}

	public static void logHikivisionDebug(String func, String message) {
		HIKIVISION_LOGGER.debug(getFormattedLogMessage(func, message));
	}

	public static void logSeniorDebug(String func, String message, Throwable throwable) {
		String logMessage = getFormattedLogMessage(func, message);
		String errorMessage = throwable.getMessage();
		SENIOR_LOGGER.debug(logMessage + " - " + errorMessage);
	}

	public static void logSeniorDebug(String func, String message) {
		String logMessage = getFormattedLogMessage(func, message);
		SENIOR_LOGGER.debug(logMessage);
	}

	public static void logHikivisionError(String func, String message, Throwable throwable) {
		String logMessage = getFormattedLogMessage(func, message);
		String errorMessage = throwable.toString();
		HIKIVISION_LOGGER.error(logMessage + " - " + errorMessage);
	}

	public static void logSeniorError(String func, String message, Throwable throwable) {
		String logMessage = getFormattedLogMessage(func, message);
		String errorMessage = throwable.toString();
		SENIOR_LOGGER.error(logMessage + " - " + errorMessage);
	}

	public static void loggerInfo(String func, String message) {
		String logMessage = getFormattedLogMessage(func, message);
		LOGGER.info(logMessage);
	}

	public static void loggerError(String func, String message, Throwable throwable) {
		String logMessage = getFormattedLogMessage(func, message);
		String errorMessage = throwable.toString();
		LOGGER.error(logMessage + " - " + errorMessage);
	}

	public static void logWebSocketError(String func, String message, Throwable throwable) {
		String logMessage = getFormattedLogMessage(func, message);
		String errorMessage = throwable.getMessage();
		WEBSOCKET_LOGGER.error(logMessage + " - " + errorMessage);
	}

	public static void logPropertiesInfo(String func, String message) {
		String logMessage = getFormattedLogMessage(func, message);
		PROPERTIES.info(logMessage);
	}

	public static void logPropertiesError(String func, String message, Throwable throwable) {
		String logMessage = getFormattedLogMessage(func, message);
		String errorMessage = throwable.toString();
		PROPERTIES.error(logMessage + " - " + errorMessage);
	}

	public static void logPropertiesDebug(String func, String message, Throwable throwable) {
		String logMessage = getFormattedLogMessage(func, message);
		String errorMessage = throwable.getMessage();
		PROPERTIES.debug(logMessage + " - " + errorMessage);
	}

	public static void logFileInfo(String func, String message) {
		String logMessage = getFormattedLogMessage(func, message);
		FILE.info(logMessage);
	}

	public static void logFileError(String func, String message, Throwable throwable) {
		String logMessage = getFormattedLogMessage(func, message);
		String errorMessage = throwable.toString();
		FILE.error(logMessage + " - " + errorMessage);
	}

	public static void logGeneralDebug(String func, String message, Throwable throwable) {
		String logMessage = getFormattedLogMessage(func, message);
		String errorMessage = throwable.getMessage();
		FILE.debug(logMessage + " - " + errorMessage);
	}

	public static void logGeneralInfo(String func, String message) {
		String logMessage = getFormattedLogMessage(func, message);
		GENERAL.info(logMessage);
	}

	public static void logGeneralError(String func, String message, Throwable throwable) {
		String logMessage = getFormattedLogMessage(func, message);
		String errorMessage = throwable.toString();
		GENERAL.error(logMessage + " - " + errorMessage);
	}

	public static void logFileDebug(String func, String message, Throwable throwable) {
		String logMessage = getFormattedLogMessage(func, message);
		String errorMessage = throwable.getMessage();
		GENERAL.debug(logMessage + " - " + errorMessage);
	}

	private static String getFormattedLogMessage(String func, String message) {
		return String.format("* %s * %s", func, message);
	}
}

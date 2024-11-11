 package br.com.thidi.middleware.resource;
 
 import org.apache.logging.log4j.LogManager;
 import org.apache.logging.log4j.Logger;
 
 public class CLogger
 {
   private static final Logger SENIOR_LOGGER = LogManager.getLogger("");
   private static final Logger HIKVISION_LOGGER = LogManager.getLogger("");
   private static final Logger WEBSOCKET_LOGGER = LogManager.getLogger("");
   private static final Logger SPRING_LOGGER = LogManager.getLogger("");
   private static final Logger LOGGER = LogManager.getLogger("");
   private static final Logger PROPERTIES = LogManager.getLogger("");
   private static final Logger FILE = LogManager.getLogger("");
   private static final Logger GENERAL = LogManager.getLogger("");
   
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
   
   public static void logHikvisionInfo(String func, String message) {
     String logMessage = getFormattedLogMessage(func, message);
     HIKVISION_LOGGER.info(logMessage);
   }
   
   public static void logSeniorError(String func, String message) {
     String logMessage = getFormattedLogMessage(func, message);
     SENIOR_LOGGER.error(logMessage);
   }
   
   public static void logHikvisionError(String func, String message) {
     String logMessage = getFormattedLogMessage(func, message);
     HIKVISION_LOGGER.error(logMessage);
   }
   
   public static void logWebSocketError(String func, String message) {
     String logMessage = getFormattedLogMessage(func, message);
     WEBSOCKET_LOGGER.error(logMessage);
   }
   
   public static void logWebSocketDebug(String func, String message, Throwable throwable) {
     String logMessage = getFormattedLogMessage(func, message);
     String errorMessage = throwable.getMessage();
     WEBSOCKET_LOGGER.debug(String.valueOf(logMessage) + " - " + errorMessage);
   }
   
   public static void logHikvisionDebug(String func, String message) {
     HIKVISION_LOGGER.debug(getFormattedLogMessage(func, message));
   }
   
   public static void logSeniorDebug(String func, String message, Throwable throwable) {
     String logMessage = getFormattedLogMessage(func, message);
     String errorMessage = throwable.getMessage();
     SENIOR_LOGGER.debug(String.valueOf(logMessage) + " - " + errorMessage);
   }
   
   public static void logSeniorDebug(String func, String message) {
     String logMessage = getFormattedLogMessage(func, message);
     SENIOR_LOGGER.debug(logMessage);
   }
   
   public static void logHikvisionError(String func, String message, Throwable throwable) {
     String logMessage = getFormattedLogMessage(func, message);
     String errorMessage = throwable.toString();
     HIKVISION_LOGGER.error(String.valueOf(logMessage) + " - " + errorMessage);
   }
   
   public static void logSeniorError(String func, String message, Throwable throwable) {
     String logMessage = getFormattedLogMessage(func, message);
     String errorMessage = throwable.toString();
     SENIOR_LOGGER.error(String.valueOf(logMessage) + " - " + errorMessage);
   }
   
   public static void loggerInfo(String func, String message) {
     String logMessage = getFormattedLogMessage(func, message);
     LOGGER.info(logMessage);
   }
   
   public static void loggerError(String func, String message, Throwable throwable) {
     String logMessage = getFormattedLogMessage(func, message);
     String errorMessage = throwable.toString();
     LOGGER.error(String.valueOf(logMessage) + " - " + errorMessage);
   }
   
   public static void logWebSocketError(String func, String message, Throwable throwable) {
     String logMessage = getFormattedLogMessage(func, message);
     String errorMessage = throwable.getMessage();
     WEBSOCKET_LOGGER.error(String.valueOf(logMessage) + " - " + errorMessage);
   }
   
   public static void logPropertiesInfo(String func, String message) {
     String logMessage = getFormattedLogMessage(func, message);
     PROPERTIES.info(logMessage);
   }
   
   public static void logPropertiesError(String func, String message, Throwable throwable) {
     String logMessage = getFormattedLogMessage(func, message);
     String errorMessage = throwable.toString();
     PROPERTIES.error(String.valueOf(logMessage) + " - " + errorMessage);
   }
   
   public static void logPropertiesDebug(String func, String message, Throwable throwable) {
     String logMessage = getFormattedLogMessage(func, message);
     String errorMessage = throwable.getMessage();
     PROPERTIES.debug(String.valueOf(logMessage) + " - " + errorMessage);
   }
   
   public static void logFileInfo(String func, String message) {
     String logMessage = getFormattedLogMessage(func, message);
     FILE.info(logMessage);
   }
   
   public static void logFileError(String func, String message, Throwable throwable) {
     String logMessage = getFormattedLogMessage(func, message);
     String errorMessage = throwable.toString();
     FILE.error(String.valueOf(logMessage) + " - " + errorMessage);
   }
   
   public static void logGeneralDebug(String func, String message, Throwable throwable) {
     String logMessage = getFormattedLogMessage(func, message);
     String errorMessage = throwable.getMessage();
     FILE.debug(String.valueOf(logMessage) + " - " + errorMessage);
   }
   
   public static void logGeneralInfo(String func, String message) {
     String logMessage = getFormattedLogMessage(func, message);
     GENERAL.info(logMessage);
   }
   
   public static void logGeneralError(String func, String message, Throwable throwable) {
     String logMessage = getFormattedLogMessage(func, message);
     String errorMessage = throwable.toString();
     GENERAL.error(String.valueOf(logMessage) + " - " + errorMessage);
   }
   
   public static void logFileDebug(String func, String message, Throwable throwable) {
     String logMessage = getFormattedLogMessage(func, message);
     String errorMessage = throwable.getMessage();
     GENERAL.debug(String.valueOf(logMessage) + " - " + errorMessage);
   }
   
   private static String getFormattedLogMessage(String func, String message) {
     return String.format("* %s * %s", new Object[] { func, message });
   }
 }


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\thidi\middleware\resource\CLogger.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
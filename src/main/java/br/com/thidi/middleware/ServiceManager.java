 package br.com.thidi.middleware;
 
 import org.apache.logging.log4j.LogManager;
 import org.apache.logging.log4j.Logger;
 
 public class ServiceManager
 {
   private static Logger logger = LogManager.getLogger();
 
   
   private static Middleware middleware;
 
   
   private static ServiceManager servicemanager;
 
   
   public static void main(String[] args) {
     execute(args);
   }
 
 
 
   
   public static void execute(String[] args) {
     String cmd = "start";
     
     if (args.length > 0) {
       
       cmd = args[0];
       
       if ("start".equals(cmd) || "start".equals(cmd)) {
         
         if (servicemanager == null) {
           servicemanager = new ServiceManager();
         }
         
         if ("start".equals(cmd)) {
           start();
         } else {
           stop();
         } 
       } 
     } 
   }
 
   
   public static void start(String[] args) {
     if (servicemanager == null) {
       servicemanager = new ServiceManager();
     }
     start();
   }
   
   public static void stop(String[] args) {
     if (servicemanager != null) {
       stop();
     }
   }
 
   
   public static boolean start() {
     logger.info("SERVICO INICIANDO...");
     
     middleware = new Middleware();
     middleware.start();
     
     return true;
   }
 
 
   
   public static void stop() {
     logger.info("SERVICO PARANDO...");
 
 
     
     logger.info("SERVICO PARADO");
   }
 }


/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\thidi\middleware\ServiceManager.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
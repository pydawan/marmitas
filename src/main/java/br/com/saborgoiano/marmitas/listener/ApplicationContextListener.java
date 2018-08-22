package br.com.saborgoiano.marmitas.listener;

import javax.servlet.ServletContextEvent;

import lombok.extern.log4j.Log4j;

/**
 * @author thiago-amm
 * @version v1.0.0 22/08/2018
 * @since v1.0.0
 */
@Log4j
public class ApplicationContextListener {
   
   public void contextInitialized(ServletContextEvent servletContextEvent) {
      log.info("Aplicação iniciada.");
   }
   
   public void contextDestroyed(ServletContextEvent servletContextEvent) {
      log.info("Aplicação finalizada.");
   }
   
}

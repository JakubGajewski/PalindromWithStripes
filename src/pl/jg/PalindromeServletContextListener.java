package pl.jg;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class PalindromeServletContextListener implements ServletContextListener	{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("Kontekst umiera!!");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("Kontekst siê pojawi³!");
		
	}		
}

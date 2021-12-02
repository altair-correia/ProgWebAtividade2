package com.atvd.avaliativa.controlador;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.atvd.avaliativa.modelo.SistemaDisciplina;

@WebListener
public class ContextListener implements ServletContextListener{
	
	public static final String SISTEMA_DISCIPLINA = "sistemaDisciplina";
	
	@Override
	public void contextInitialized(ServletContextEvent event) {
		ServletContext context = event.getServletContext(); //associa o evento � aplica��o do sistema_disciplina como vari�vel est�tica.
		context.setAttribute(SISTEMA_DISCIPLINA, new SistemaDisciplina());
		//
	}

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		ServletContext context = event.getServletContext();
		context.removeAttribute(SISTEMA_DISCIPLINA); //associa o evento � aplica��o do sistema_disciplina como vari�vel est�tica.
		
	}
	

}

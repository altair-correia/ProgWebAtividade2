package com.atvd.avaliativa.controlador;

import java.io.IOException;

import javax.naming.Context;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.atvd.avaliativa.modelo.Disciplina;
import com.atvd.avaliativa.modelo.SistemaDisciplina;

/**
 * Servlet implementation class ServletControlador
 */
@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String resposta = request.getParameter("resposta"); //resposta que é dada através do link
		
		SistemaDisciplina sistema = (SistemaDisciplina) getServletContext()
				.getAttribute(ContextListener.SISTEMA_DISCIPLINA);
		
		String redirecionaTo = "menu.jsp";
		//string responsável para indicar a página que será redirecionado, no caso ao 'menu.jsp'.
		
		if ("cadastro".equals(resposta)) {
			redirecionaTo = "cadastroDisciplinas.jsp";
		}else if ("addDisciplina".equals(resposta)) {
			Disciplina d = new Disciplina(); //definindo a classe disciplina para realizar os sets de Nome e Nota.
			d.setNome(request.getParameter("nome"));
			d.setNota(request.getParameter("nota"));
			
			sistema.adicionar(d);//usando o método adicionar() da classe "Disciplina" para adicionar uma nova disciplina no array (lista).
			
			request.setAttribute("lista", sistema.listarDisciplinas());
			redirecionaTo = "listaDisciplinas.jsp";
			
		}else if ("listar".equals(resposta)) {
			request.setAttribute("lista", sistema.listarDisciplinas());
			redirecionaTo = "listaDisciplinas.jsp";
		}else {
			redirecionaTo = "menu.jsp"; //redirecionando para o menu principal
		
		}
		request.getRequestDispatcher(redirecionaTo).forward(request, response);
		
		
	}

}

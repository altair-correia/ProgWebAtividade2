package com.atvd.avaliativa.modelo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ServletAutentica")
public class ServletAutentica extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String USUARIO = "usuario"; // vari�vel string est�tica que receber� o campo Login/Usu�rio com o intuito de gerar a sess�o;
       
    public ServletAutentica() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter saida = response.getWriter();
		
		saida.write("<html><body>");
		
		String usuario = request.getParameter(USUARIO); // recebe o campo login/usu�rio que no caso � 'professor' como par�metro correto.
		String senha = request.getParameter("senha"); // recebe o campo senha que no caso � 'progweb2021' como par�metro correto.
		
		if (autentica(usuario,senha)) {
			HttpSession sessao = request.getSession(); //criando a sess�o
			sessao.setAttribute(USUARIO, usuario); //registrando o usu�rio com o nome do usu�rio na sess�o.
			
			response.sendRedirect(request.getContextPath()+"/menu.jsp"); //redirecionando para o programa 'menu.jsp'.
		}else {
			saida.write("Usu�rio ou senha incorretos. <br>");
			saida.write("<a href=\"autentica.jsp\">Tente novamente aqui.</a>");
		}
		
		
	}
	private boolean autentica(String usuario, String senha) {
		
// Aqui indicamos que quando o usu�rio for "professor" e a senha for "Progweb2021",
// ser� criada uma sess�o e haver� um redirecionamento para a p�gina inicial.
		
		if (usuario.equals("professor") && senha.equals("Progweb2021")) {
			return true;
		}
		
		return false;
	}

}

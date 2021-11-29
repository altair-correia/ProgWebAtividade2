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
	private static final String USUARIO = "usuario"; // variável string estática que receberá o campo Login/Usuário com o intuito de gerar a sessão;
       
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
		
		String usuario = request.getParameter(USUARIO); // recebe o campo login/usuário que no caso é 'professor' como parâmetro correto.
		String senha = request.getParameter("senha"); // recebe o campo senha que no caso é 'progweb2021' como parâmetro correto.
		
		if (autentica(usuario,senha)) {
			HttpSession sessao = request.getSession(); //criando a sessão
			sessao.setAttribute(USUARIO, usuario); //registrando o usuário com o nome do usuário na sessão.
			
			response.sendRedirect(request.getContextPath()+"/menu.jsp"); //redirecionando para o programa 'menu.jsp'.
		}else {
			saida.write("Usuário ou senha incorretos. <br>");
			saida.write("<a href=\"autentica.jsp\">Tente novamente aqui.</a>");
		}
		
		
	}
	private boolean autentica(String usuario, String senha) {
		
// Aqui indicamos que quando o usuário for "professor" e a senha for "Progweb2021",
// será criada uma sessão e haverá um redirecionamento para a página inicial.
		
		if (usuario.equals("professor") && senha.equals("Progweb2021")) {
			return true;
		}
		
		return false;
	}

}

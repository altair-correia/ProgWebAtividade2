<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Menu</title>
</head>
<body style="text-align: center; margin-top: 15rem; background: #022; color: #fff; font-family: 'Poppins', sans-serif;"> 
<%
//verificação do login do usuário
String sessao=(String)session.getAttribute("usuario");
if (sessao == null){%>
	<a href="autentica.jsp">Realize o Login primeiro!</a>
	
	<%}else{ %>
<%@ include file="header.jsp" %>
<h1>Menu</h1>
<li>
	<a href="ServletControlador?resposta=cadastro" style="text-decoration: none; color: #0f9">Cadastrar Disciplina e Notas</a>
</li>
<br>
<li>	
<a href="ServletControlador?resposta=listar" style="text-decoration: none; color: #0f9">Listar Disciplinas e Notas</a>
</li>
<%} %>
</body>
</html>
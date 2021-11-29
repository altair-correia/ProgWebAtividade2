<%@page import="java.util.List"%>
<%@page import="com.atvd.avaliativa.modelo.Disciplina"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listar as Disciplinas</title>
</head>
<body style="margin-top: 15rem; background: #402; color: #fff; font-family: 'Poppins', sans-serif;">
<%
//autenticando se o usuário está logado através do uso session
String sessao=(String)session.getAttribute("usuario");
if (sessao == null){%>
	<a href="autentica.jsp" style="text-decoration: none; color: #fff">Faça primeiro o login</a>
	
	<%}else{ %>
<%@ include file="header.jsp" %>
<br><br>
<table border="1" >
	<tr>
		<td>Nome</td>
		<td>Nota</td>
		<td>Situação</td>
	</tr>
	<%
	List<Disciplina> lista = (List<Disciplina>) request.getAttribute("lista");
	for(Disciplina disciplina : lista){
	%>
	<tr>
		<td><%= disciplina.getNome() %></td>
		<td><%= disciplina.getNota() %></td>
		<td><%= disciplina.getSituacao() %></td>
	</tr>
	<%
		}
	%>

</table>
<br>
<a href="menu.jsp" style="text-decoration: none; color: #fff">Voltar ao menu principal.</a><br><br>
<a href="ServletControlador?resposta=cadastro" style="text-decoration: none; color: #fff">Cadastrar outra matéria.</a>
<%} %>
</body>
</html>
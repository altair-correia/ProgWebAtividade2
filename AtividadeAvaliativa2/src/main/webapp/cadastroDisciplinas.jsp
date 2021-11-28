<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="script.js"></script>
<title>Cadastro Disciplina</title>
</head>
<body>
<%
//verificacao se o usuario esta logado
String sessao=(String)session.getAttribute("usuario");
if (sessao == null){%>
	<a href="autentica.jsp">Faça primeiro o login</a>
	
	<%}else{ %>
<%@ include file="header.jsp" %>
<br><br>
<form action="ServletControlador" method="post">
<input type="hidden" name="resposta" value="addDisciplina">
<label for="nome">Nome Disciplina: </label>
<input type="text" name="nome" id="nome">
<br>
<label for="nota">Nota: </label>
<input type="text" onkeyup="autenticaNumero(this.value)" name="nota" id="nota">
<br><br>
<input type="submit" value="Cadastrar"> 
</form>
<br>
<a href="menu.jsp">Voltar ao menu principal.</a><br><br>
<%} %>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="script.js"></script>
<title>Cadastrar Disciplina</title>
<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600;&display=swap" rel="stylesheet">
</head>
<body style="text-align: center; margin-top: 15rem; background: #508; color: #fff; font-family: 'Poppins', sans-serif;">
<%
//usando sessio e autenticando se o usuário está logado
String sessao=(String)session.getAttribute("usuario");
if (sessao == null){%>
	<a href="autentica.jsp">Realize o login primeiro</a>
	
	<%}else{ %>
<%@ include file="header.jsp" %>
<br><br>
<form action="ServletControlador" method="post">
<input type="hidden" name="resposta" value="addDisciplina">
<label for="nome">Nome da Disciplina: </label><br><br>
<input type="text" name="nome" id="nome">
<br><br>
<label for="nota">Nota: </label><br><br>
<input type="text" onkeyup="autenticaNumero(this.value)" name="nota" id="nota">
<br><br>
<input type="submit" value="Cadastrar"> 
</form>
<br><br>
<a href="menu.jsp" style="text-decoration: none; color: #fff">Voltar ao menu principal.</a><br><br>
<%} %>
</body>
</html>
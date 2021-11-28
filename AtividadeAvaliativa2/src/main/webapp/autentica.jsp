<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="script.js"></script>
<title>Realizar login</title>
</head>
<body>
<form action="ServletAutentica" method="post">
	<label>Usuario:</label>
	<input type="text" onkeyup="autenticaLetra(this.value)" name="usuario">
	<br>
	
	<label>Senha:</label>
	<input type="password" name="senha">
	<br><br>
	
	<input type="submit" value="Enviar">
</form>
</body>
</html>
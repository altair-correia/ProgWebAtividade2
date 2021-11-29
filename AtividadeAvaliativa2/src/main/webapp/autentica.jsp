<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Realizando Login...</title>
<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600;&display=swap" rel="stylesheet">
<script type="text/javascript" src="script.js"></script>
</head>
<body style="text-align: center; margin-top: 15rem; background: #012; color: #fff; font-family: 'Poppins', sans-serif;">
<form action="ServletAutentica" method="post">
	<label>Login/Usuário:</label><br>
	<input type="text" onkeyup="autenticaLetra(this.value)" name="usuario">
	<br><br>
	
	<label>Senha:</label><br>
	<input type="password" name="senha">
	<br><br>
	
	<input type="submit" value="Logar">
</form>
</body>
</html>
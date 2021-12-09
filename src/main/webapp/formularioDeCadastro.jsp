<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro</title>
</head>
	<body>
	<h1>Cadastro</h1>
		<div id="formulario">
			<form method="post" action="CadastroPessoa">
				<label for="nome">Nome: </label>
				<input type="text" id="nome" name="nome"><br>
				<br> 
				<label for="endereco">Endereço: </label> 
				<input type="text" id="endereco" name="endereco">
				<br><br>
				<label for="telefone">Telefone: </label> 
				<input type="text" id="telefone" name="telefone"> 
				<br><br>
				<input type="submit" value="Cadastrar">
			</form>
		</div>
	</body>
</html>
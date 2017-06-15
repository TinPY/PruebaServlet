<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>UNDEC - Prueba Servlet</title>
</head>
<body>


<form name="form" method="post" action="Formulario">

	<label for="nombre">Nombre: </label>
	<input id="nombre" type="text" name="nombre" value="">
	
	<label for="apellido">Apellido: </label>
	<input id="apellido" type="text" name="apellido" value="">
	
	<label for="dni">DNI: </label>
	<input id="dni" type="text" name="dni" value="">
	
	<input type="submit" value="Obtener Número Aleatorio" />

</form>

</body>
</html>
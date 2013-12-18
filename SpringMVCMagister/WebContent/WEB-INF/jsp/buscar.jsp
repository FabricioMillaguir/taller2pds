<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Resultado Busqueda</title>
</head>
<body>
<h2>Registros Encontrados</h2>

<form:form action="filtrar.html" method="post">
	<select name="atributo">
	<option value="rut">Rut</option>
	<option value="nombre">Nombre</option>
	<option value="celular">Celular</option>
	<option value="correo">Correo</option>
	<option value="direccion">Direccion</option>
	</select>
	<input type="text" name="busqueda" />
	<input type="submit" value="buscar"/>
</form:form>

<br/>
<input type="button" value="Back" onclick="javascript:history.back()"/>
</body>
</html>
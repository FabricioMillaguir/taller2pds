<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Resultado Busqueda</title>
</head>
<body>
<h2>Registros Encontrados</h2>

<form:form action="filtrarCliente.html" method="post">
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

<table width="50%">
    <tr>
    	<th>Rut</th>
        <th>Nombre</th>
        <th>Apellido Paterno</th>
        <th>Apellido Materno</th>
        <th>Correo</th>
        <th>Celular</th>
        <th>Direccion</th>
    </tr>
    
    <c:forEach items="${clienteForm.clientes}" var="cliente" varStatus="status">
        <tr>
        		
        		<td>${cliente.rut}</td>
            	<td>${cliente.nombre}</td>
            	<td>${cliente.apellidoPaterno}</td>
            	<td>${cliente.apellidoMaterno}</td>
            	<td>${cliente.correo}</td>
            	<td>${cliente.celular}</td>
            	<td>${cliente.direccion}</td>
            	
            <form:form action="opcionesCliente.html" method="post">
            	<td><input type="hidden" value="${cliente.id}" name="id" ></td>
            	<td><input type="submit" value="Opciones del Cliente" /></td>
            </form:form>
            
        </tr>
    </c:forEach>
    
    
</table> 

<br/>
<input type="button" value="Back" onclick="javascript:history.back()"/>
</body>
</html>
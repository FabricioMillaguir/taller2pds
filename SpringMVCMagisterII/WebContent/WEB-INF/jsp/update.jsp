<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Modificar Datos Cliente</title>
</head>
<body>
<h2>Formulario Modificacion</h2>

<form:form method="post" action="modificarCliente.html">
 
    <table>
    <c:forEach items="${clienteForm.clientes}" var="cliente" varStatus="status">
    <tr>
    <td><input type="hidden" value="${cliente.id_cliente}" name="id_cliente" ></td>
    </tr>
    <tr> 	
        <td>Rut</td>
 		<td><input name="rut" value="${cliente.rut}"></td>
    </tr>
    <tr>
    	<td>Nombre</td>
 		<td><input name="nombre" value="${cliente.nombre}"></td>
    </tr>
    <tr>
        <td>Apellido Paterno</td>
 		<td><input name="apellido_paterno" value="${cliente.apellido_paterno}"></td>
    </tr>
    <tr>
        <td>Apellido Materno</td>
 		<td><input name="apellido_materno" value="${cliente.apellido_materno}"></td>
    </tr>
    <tr>
        <td>Correo</td>
 		<td><input name="correo" value="${cliente.correo}"></td>
    </tr>
    <tr>
        <td>Celular</td>
 		<td><input name="celular" value="${cliente.celular}"></td>
    </tr>
    <tr>
        <td>Direccion</td>
 		<td><input name="direccion" value="${cliente.direccion}"></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Modificar cliente" />
        </td>
    </tr>
    </c:forEach>
</table>  
     
</form:form>
</body>
</html>
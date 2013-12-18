<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Mostrar Clientes</title>
</head>
<center>
<h2>Clientes Registrados</h2>
<table width="100%">
    <tr>
        <th><spring:message code="label.nombre" /></th>
        <th><spring:message code="label.apellido_paterno" /></th>
        <th><spring:message code="label.apellido_materno" /></th>
        <th><spring:message code="label.rut" /></th>
        <th><spring:message code="label.celular" /></th>
        <th><spring:message code="label.correo" /></th>
        <th><spring:message code="label.direccion" /></th>
    </tr>
    <c:forEach items="${clienteForm.clients}" var="clients" varStatus="status">
        <tr>
            <td>${clients.nombre}</td>
            <td>${clients.apellido_paterno}</td>
            <td>${clients.apellido_materno}</td>
            <td>${clients.rut}</td>
            <td>${clients.celular}</td>
            <td>${clients.correo}</td>
            <td>${clients.direccion}</td>
          
        </tr>
    </c:forEach>
</table>  
<br/>
<form:form method="post" action="menu.html">
        <td colspan="2">
            <input type="submit" value="            Volver                "/>
        </td>
</form:form>
</center>
</body>
</html>
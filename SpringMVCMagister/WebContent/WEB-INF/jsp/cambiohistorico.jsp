<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Resultado Cambios Historicos</title>
</head>
<body>
<h2>Registros Encontrados</h2>

<table width="50%">
    <tr>
    	<th>Rut</th>
        <th>Nombre</th>
        <th>Apellido Paterno</th>
        <th>Apellido Materno</th>
        <th>Correo</th>
        <th>Celular</th>
        <th>Direccion</th>
        <th>Fecha cambio</th>
    </tr>
    
    <c:forEach items="${clienteHistoricosForm.clienteHistoricos}" var="clienteHistorico" varStatus="status">
        <tr>
        		
        		<td>${clienteHistorico.rut}</td>
            	<td>${clienteHistorico.nombre}</td>
            	<td>${clienteHistorico.apellido_paterno}</td>
            	<td>${clienteHistorico.apellido_materno}</td>
            	<td>${clienteHistorico.correo}</td>
            	<td>${clienteHistorico.celular}</td>
            	<td>${clienteHistorico.direccion}</td>
            	<td>${clienteHistorico.fecha_cambio}</td>
            	
            	
            
        </tr>
    </c:forEach>
    
    
</table> 

<br/>
<input type="button" value="Back" onclick="javascript:history.back()"/>
</body>
</html>
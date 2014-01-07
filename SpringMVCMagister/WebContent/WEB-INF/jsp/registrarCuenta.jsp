<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>Registrar cuenta a Cliente</title>
</head>
<body>
<h2>Formulario Registro Cuenta</h2>
<form:form method="post" action="registrarCuenta.html">
<select name="idServicio">
<c:forEach items="${servicioForm.servicios}" var="servicio" varStatus="status">
  
	<option value="${servicio.id}" >${servicio.tipoDeServicio}</option>
	
	</c:forEach>
 </select>
    <table>
    <tr> 	
 		<td><input type="hidden" name="idCliente" value="${clienteVO.id}"></td>
    </tr>
    
    <tr> 	
    <td><input type="radio" name="habilitada" value=true checked="checked"/>Habilitada</td>

    </tr>
    <tr>
    <td><input type="radio" name="habilitada" value=false />Deshabilitada</td>
    
    <tr>
    
    <tr>
        <td colspan="2">
            <input type="submit" value="Agregar Cuenta"/>
        </td>
    </tr>
    
   
</table>  
     
</form:form>
</body>
</html>
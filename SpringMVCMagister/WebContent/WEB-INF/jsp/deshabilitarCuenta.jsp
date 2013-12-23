<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>Desactivar cuenta a Cliente</title>
</head>
<body>
<h2>Formulario Registro Cuenta</h2>
<form:form method="post" action="deshabilitarCuenta.html">
<select name="idCuenta">
<c:forEach items="${cuentaForm.cuentas}" var="cuenta" varStatus="status">
  
	<option value="${cuenta.id}" >${cuenta.servicioVO.tipoDeServicio}</option>
	
	 </c:forEach>
 </select>

    <table>
    
    <tr> 	
    <td><input type="radio" name="habilitada" value=true checked="checked"/>Habilitada</td>

    </tr>
    <tr>
    <td><input type="radio" name="habilitada" value=false />Deshabilitada</td>
    
    <tr>
        <td colspan="2">
            <input type="submit" value="Deshabilitar Cuenta"/>
        </td>
    </tr>
    
   
</table>  
     
</form:form>
</body>
</html>
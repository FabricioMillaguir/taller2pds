<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>Registrar cuenta a Cliente</title>
</head>
<body>
<h2>Formulario Registro Cuenta</h2>
<form:form method="post" action="mostrarRegistrarConsumo.html">
<select name="idCuenta">
<c:forEach items="${cuentaForm.cuentas}" var="cuenta" varStatus="status">
  
	<option value="${cuenta.id}" >${cuenta.servicioVO.tipoDeServicio}</option>
	
	</c:forEach>
 </select>
        
    <tr>
        <td colspan="2">
            <input type="submit" value="Nuevo Consumo"/>
        </td>
    </tr>
    

     
</form:form>
</body>
</html>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Opciones Cuentas del Cliente</title>

<script type="text/javascript" >
<script type="text/javascript" >
function funcion()
{
  var seleccion=document.getElementById('idCuenta');
  //document.getElementById('registrarCuenta').value=seleccion.selectedIndex;
  //document.getElementById('registrarCuenta').value=seleccion.options[seleccion.selectedIndex];
  document.getElementById('tipoServicio').value=seleccion.options[seleccion.selectedIndex].value;  
}
</script>
</head>
<body>

	
	<h3>Seleccione una cuenta</h3>

	<select name="idCuenta" id="idCuenta" onchange="funcion();" >
	<option>Selecciona cuenta</option>
<c:forEach items="${cuentaForm.cuentas}" var="cuenta" varStatus="status">
  
	<option value="${cuenta.id}">${cuenta.servicioVO.tipoDeServicio}</option>
	
	</c:forEach>
 </select>

	<table>

	
		
			<tr>
				<form:form action="mostrarRegistrarCuenta.html" method="post">
					<td><input type="hidden" name="idCliente" value="${clienteVO.id}"></td>
					<td><input type="submit" value="Registrar Nueva Cuenta" /></td>
				</form:form>
			</tr>
			<tr>
				<form:form action="mostrarDeshabilitarCuenta.html" method="post">
					<td><input type="hidden" value="${clienteVO.id}" name="idCliente"></td>
					<td><input type="submit" value="Deshabilitar Cuenta" /></td>
				</form:form>
			</tr>
			<tr>
				<form:form action="mostrarRegistrarConsumo.html" method="post">
					<td><input type="hidden" value="${cliente.id}" name="id"></td>
					<td><input type="submit" value="Registrar Consumo" /></td>
				</form:form>
			</tr>
			<tr>
				<form:form action="mostrarModificarConsumo.html" method="post">
					<td><input type="hidden" value="${cliente.id}" name="id"></td>
					<td><input type="submit" value="Modificar Consumo" /></td>
				</form:form>
			</tr>
			
	</table>

</body>
</html>
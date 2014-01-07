<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Opciones Del Cliente</title>
</head>
<body>



	<table>
		<c:forEach items="${clienteForm.clientes}" var="cliente"
			varStatus="status">
			<tr>
				<td><input type="hidden" value="${cliente.id}" name="id"></td>
			</tr>
			<tr>
				<td>Rut</td>
				<td><input name="rut" value="${cliente.rut}"
					readonly="readonly"></td>
			</tr>
			<tr>
				<td>Nombre</td>
				<td><input name="nombre" value="${cliente.nombre}"
					readonly="readonly"></td>
			</tr>
			<tr>
				<td>Apellido Paterno</td>
				<td><input name="apellidoPaterno"
					value="${cliente.apellidoPaterno}" readonly="readonly"></td>
			</tr>
			<tr>
				<td>Apellido Materno</td>
				<td><input name="apellidoMaterno"
					value="${cliente.apellidoMaterno}" readonly="readonly"></td>
			</tr>
			<tr>
				<td>Correo</td>
				<td><input name="correo" value="${cliente.correo}"
					readonly="readonly"></td>
			</tr>
			<tr>
				<td>Celular</td>
				<td><input name="celular" value="${cliente.celular}"
					readonly="readonly"></td>
			</tr>
			<tr>
				<td>Direccion</td>
				<td><input name="direccion" value="${cliente.direccion}"
					readonly="readonly"></td>
			</tr>
			<tr>
				<form:form action="mostrarModificarCliente.html" method="post">
					<td><input type="hidden" value="${cliente.id}" name="id"></td>
					<td><input type="submit" value="modificar" /></td>
				</form:form>
			</tr>
			<tr>
				<form:form action="mostrarCambioHistorico.html" method="post">
					<td><input type="hidden" value="${cliente.id}" name="id"></td>
					<td><input type="submit" value="Cambios Historicos" /></td>
				</form:form>
			</tr>
			<tr>
				<form:form action="mostrarOpcionesCuentas.html" method="post">
					<td><input type="hidden" value="${cliente.id}" name="id"></td>
					<td><input type="submit" value="Administrar Opciones de Cuentas" /></td>
				</form:form>
			</tr>
			<tr>
				<form:form action="mostrarReporteMorosidad.html" method="post">
					<td><input type="hidden" value="${cliente.id}" name="id"></td>
					<td><input type="submit" value="Ver reporte de morosidad" /></td>
				</form:form>
			</tr>
					</c:forEach>
	</table>


</body>
</html>
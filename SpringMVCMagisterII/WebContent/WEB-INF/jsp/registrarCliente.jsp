<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
<title>Registrar Administrador</title>
</head>
<body  BACKGROUND="http://asaphe.com/wp-content/uploads/2012/05/1305844286-blue-bokeh-wallpaper.jpg">
	<center>
	<h2>Formulario Registro de Clientes</h2>
	
	<form:form method="post" action="addCliente.html">

		<table>
			<tr>
				<td><form:label path="nombre"><spring:message code="label.nombre" />
					</form:label></td><td><form:input path="nombre" /> <form:errors></form:errors></td>
			</tr>
			
			<tr>
				<td><form:label path="apellido_paterno"><spring:message code="label.apellido_paterno" />
					</form:label></td><td><form:input path="apellido_paterno" /> <form:errors></form:errors></td>
			</tr>
			
			<tr>
				<td><form:label path="apellido_materno"><spring:message code="label.apellido_materno" />
					</form:label></td><td><form:input path="apellido_materno" /> <form:errors></form:errors></td>
			</tr>
			
			<tr>
				<td><form:label path="rut"><spring:message code="label.rut" />
					</form:label></td><td><form:input path="rut" /> <form:errors></form:errors></td>
			</tr>
			
			<tr>
				<td><form:label path="celular"><spring:message code="label.celular" />
					</form:label></td><td><form:input path="celular" /> <form:errors></form:errors></td>
			</tr>
			
			<tr>
				<td><form:label path="correo"><spring:message code="label.correo" />
					</form:label></td><td><form:input path="correo" /> <form:errors></form:errors></td>
			</tr>
			
			<tr>
				<td><form:label path="direccion"><spring:message code="label.direccion" />
					</form:label></td><td><form:input path="direccion" /> <form:errors></form:errors></td>
			</tr>
			

			<tr>
				<td colspan="2"><input type="submit" value="Registrar Cliente" />
				</td>
			</tr>
			
			
		</table>
	</form:form>
	
<form:form method="post" action="menu.html"><td colspan="2"><input type="submit" value="Volver"/></td>
</form:form>
	</center>
</body>
</html>
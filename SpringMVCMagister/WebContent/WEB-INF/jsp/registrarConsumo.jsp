<%@page import="org.springframework.web.bind.annotation.RequestParam"%>
<%@page import="java.util.GregorianCalendar"%>
<%@page import="java.util.Calendar"%>
<%@page import="spring3.controller.ConsumoController" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Registrar consumo a Cliente</title>
</head>
<body>
	<h2>Formulario Registro Consumo</h2>
	<form:form method="post" action="registrarConsumo.html">

		<table>
			<tr>
				<td>Cuenta Numero</td>
				
				<td><input type="text" name="numero" value="${cuentaVOs.id}" /></td>
			</tr>
			<tr>
				<td>Servicio</td>
				<td><input type="text" name="servicio"
					value="${cuentaVOs.servicioVO.tipoDeServicio}" /></td>
			</tr>


			<tr>
				<td>Cantidad Consumida</td>
				<td><input type="text" name="cantidadConsumida" />${cuentaVOs.servicioVO.unidadDeMedida}</td>

			</tr>
			<tr>
				<td>Fecha de Vencimiento</td>
				<td><select name="dia">
						<c:forEach begin="1" end="31" var="dia" varStatus="status">

							<option value="${dia}">${dia}</option>

						</c:forEach>
				</select> <select name="mes">
						<c:forEach begin="1" end="12" var="mes" varStatus="status">

							<option value="${mes}">${mes}</option>

						</c:forEach>
				</select> <select name="agno">
				
						<c:forEach items="<%=ConsumoController.mostrarAgnos()%>" var="agno" varStatus="status">

							<option value="${agno}">${agno}</option>

						</c:forEach>
				</select></td>
				
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="Registrar Consumo" />
				</td>
			</tr>

			

			
		</table>

	<input type="hidden" name="idCuenta" value="${cuentaVOs.id}" /> 
	</form:form>
</body>
</html>
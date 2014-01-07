<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
<title>Registrar Nuevo Administrador</title>
</head>
<body>
	
	<h2>Registro de Administrador</h2>
	
	<form:form method="post" action="registrarUsuario.html">

		<table>
			<tr> 	
        <td>Usuario</td>
 		<td><input name="usuario"></td>
    </tr>
			
			<tr> 	
        <td>Password</td>
 		<td><input type="password" name="clave"></td>
    </tr>

			<tr>
				<td colspan="2"><input type="submit" value="Registrar Usuario" />
				</td>
			</tr>
			
			
		</table>
	</form:form>
	
<form:form method="post" action="menu.html">
       <td colspan="2"><input type="submit" value="Back" /></td>
</form:form>
	
</body>
</html>
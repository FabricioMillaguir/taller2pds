<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html> 
    <head> 
        <title>Inicio Sesión</title> 
    </head> 
	        <form:form method="post" action="loguear.html">

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
				<td colspan="2"><input type="submit" value="Iniciar Sesión" />
				</td>
			</tr>	
		</table>
	</form:form>
  
    </body> 
</html> 
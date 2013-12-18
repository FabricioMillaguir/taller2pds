<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
    <title>Registro de Cliente</title>
</head>
<body>
<h2>Formulario Registro Cliente</h2>
<form:form method="post" action="addCliente.html">
 
    <table>
    <tr> 	
        <td>Rut</td>
 		<td><input name="rut"></td>
    </tr>
    <tr> 	
        <td>Nombre</td>
 		<td><input name="nombre"></td>
    </tr>
   <tr> 	
        <td>Apellido Paterno</td>
 		<td><input name="apellido_paterno"></td>
    </tr>
    <tr> 	
        <td>Apellido Materno</td>
 		<td><input name="apellido_materno"></td>
    </tr>
    <tr> 	
        <td>Correo</td>
 		<td><input name="correo"></td>
    </tr>
    <tr> 	
        <td>Celular</td>
 		<td><input name="celular"></td>
    </tr>
    <tr> 	
        <td>Direccion</td>
 		<td><input name="direccion"></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Add Cliente"/>
        </td>
    </tr>
</table>  
     
</form:form>
</body>
</html>
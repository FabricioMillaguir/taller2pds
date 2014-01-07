<%@page import="spring3.controller.CuentaController"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html>
<head>
<title>Cuentas</title>
</head>
<body>
<h2>Inicio</h2>
<form:form method="post" action="mostrarRegistrarUsuario.html">
        <td colspan="2">
            <input type="submit" value="Crear Nuevo Usuario"/>
        </td>
</form:form>

<form:form method="post" action="clientes.html">
        <td colspan="2">
            <input type="submit" value="Administrar Clientes"/>
        </td>
</form:form>

<form:form method="post" action="servicios.html">
        <td colspan="2">
            <input type="submit" value="Administrar Servicios"/>
        </td>
</form:form>



<form:form method="post" action="login.html">
        <td colspan="2">
            <input type="submit" value="            Salir                "/>
        </td>
</form:form>

</body>
</html>
<%@page import="spring3.controller.CuentaController"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html>
<head>
<title>Clientes</title>
</head>
<body>
<h2>Inicio</h2>
<form:form method="post" action="mostrarRegistrarCliente.html">
        <td colspan="2">
            <input type="submit" value="Crear Nuevo Cliente"/>
        </td>
</form:form>

<form:form method="post" action="buscarCliente.html">
        <td colspan="2">
            <input type="submit" value="Buscar Cliente"/>
        </td>
</form:form>



<form:form method="post" action="login.html">
        <td colspan="2">
            <input type="submit" value="            Salir                "/>
        </td>
</form:form>

</body>
</html>
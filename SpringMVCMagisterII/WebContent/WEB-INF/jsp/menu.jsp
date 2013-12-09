<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html>
<head>
<title>Cuentas</title>
</head>
<body>
<h2>Inicio Administrador</h2>
<form:form method="post" action="administracion.html">
        <td colspan="2">
            <input type="submit" value="       Administración de Sistema        "/>
        </td>
</form:form>

<form:form method="post" action="clientes.html">
        <td colspan="2">
            <input type="submit" value="              Gestión de Clientes             "/>
        </td>
</form:form>

<form:form method="post" action="cuentas.html">
        <td colspan="2">
            <input type="submit" value="             Gestión de Cuentas             "/>
        </td>
</form:form>


<form:form method="post" action="login.html">
        <td colspan="2">
            <input type="submit" value="            Salir                "/>
        </td>
</form:form>


</body>
</html>
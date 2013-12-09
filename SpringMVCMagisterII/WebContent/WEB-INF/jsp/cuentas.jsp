<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html>
<head>
<title>Menu MACROCUENTAS!</title>
</head>
<body>

<h2>Menu MacroCuentas!</h2>
<form:form method="post" action="registrarCuenta.html">
        <td colspan="2">
            <input type="submit" value="     Registrar Cuenta Ciente        "/>
        </td>
</form:form>

<form:form method="post" action="desactivarCuenta.html">
        <td colspan="2">
            <input type="submit" value="       Desactivar Cuenta Cliente      "/>
        </td>
</form:form>

<form:form method="post" action="registrarConsumo.html">
        <td colspan="2">
            <input type="submit" value="      Registrar Consumo de Cuenta       "/>
        </td>
</form:form>

<form:form method="post" action="modificarConsumo.html">
        <td colspan="2">
            <input type="submit" value="      Modificar Registro de Consumo     "/>
        </td>
</form:form>

<form:form method="post" action="pagoConsumo.html">
        <td colspan="2">
            <input type="submit" value="     Registrar Pago de Consumo       "/>
        </td>
</form:form>


<form:form method="post" action="morosidad.html">
        <td colspan="2">
            <input type="submit" value="     Ver Morosidad de Cuenta       "/>
        </td>
</form:form>



<form:form method="post" action="menu.html">
        <td colspan="2">
            <input type="submit" value="            Salir                "/>
        </td>
</form:form>


</body>
</html>
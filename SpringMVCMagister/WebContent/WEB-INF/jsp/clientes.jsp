<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html>
<head>
<title>Menu MACROCUENTAS!</title>
</head>
<body>

<h2>Menu gestion de clientes</h2>
<form:form method="post" action="agregarCliente.html">
        <td colspan="2">
            <input type="submit" value="       Registrar Clientes        "/>
        </td>
</form:form>

<form:form method="post" action="buscar.html">
        <td colspan="2">
            <input type="submit" value="          Buscar Clientes             "/>
        </td>
</form:form>

<form:form method="post" action="historico.html">
        <td colspan="2">
            <input type="submit" value="        Ver Historico de Clientes      "/>
        </td>
</form:form>


<form:form method="post" action="salir.html">
        <td colspan="2">
            <input type="submit" value="            Salir                "/>
        </td>
</form:form>


</body>
</html>
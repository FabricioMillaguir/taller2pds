<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html>
<head>
<title>Menu Administraci�n!</title>
</head>
<body>

<h2>Menu Administraci�n!</h2>

<form:form method="post" action="agregarAdmin.html">
        <td colspan="2">
            <input type="submit" value="         Registrar Administrdor          "/>
        </td>
</form:form>

<form:form method="post" action="montos.html">
        <td colspan="2">
            <input type="submit" value="        Administraci�n de montos           "/>
        </td>
</form:form>


<form:form method="post" action="menu.html">
        <td colspan="2">
            <input type="submit" value="            Salir                "/>
        </td>
</form:form>


</body>
</html>
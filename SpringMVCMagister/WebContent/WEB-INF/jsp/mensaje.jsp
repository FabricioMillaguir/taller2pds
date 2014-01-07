<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
	<title>Mensaje</title>
</head>
<body>
<h2 font color="white">${message}</h2>

<form:form method="post" action="menu.html">
        <td colspan="2">
            <input type="submit" value="       Volver al Menu       "/>
        </td>
</form:form>
</body>
</html>
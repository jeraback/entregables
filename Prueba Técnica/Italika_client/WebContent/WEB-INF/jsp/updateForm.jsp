<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
                 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ingrese los datos para actualizar el producto</title>
</head>
<body>

<form:form method="post" modelAttribute="moto">
<table>
<tr>
<td>ingrese el ID</td>
<td><form:input path="ID" type="number" /></td>
</tr>
<tr>
<td>sku</td>
<td><form:input path="SKU" type="text" /></td>
</tr>
<tr>
<td>fert</td>
<td><form:input path="FERT" type="text" /></td>
</tr>
<tr>
<td>modelo</td>
<td><form:input path="modelo" type="text" /></td>
</tr>
<tr>
<td>tipo</td>
<td><form:input path="tipo" type="text"/></td>
</tr>
<tr>
<td>Numero de serie</td>
<td><form:input path="numSerie" type="text"/></td>
</tr>
<tr>
<td>fecha</td>
<td><form:input path="fecha" type="text" value = "0000-00-00" maxlength="10" /></td>
</tr>
<tr>
<tr>
<td colspan="3"><input type="submit" value="Ingresar datos"/></td>
</tr>
</table>

</form:form>

</body>
</html>
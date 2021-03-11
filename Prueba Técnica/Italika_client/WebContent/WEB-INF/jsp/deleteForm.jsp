<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
                     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Ingrese el SKU del producto que desea eliminar</h2>
<form:form method="post" modelAttribute="moto">
<table>
<tr>
<td>sku</td>
<td><form:input path="SKU" type="text" /></td>
</tr>
<tr>
<td colspan="3"><input type="submit" /></td>
</tr>
</table>

</form:form>
</body>
</html>
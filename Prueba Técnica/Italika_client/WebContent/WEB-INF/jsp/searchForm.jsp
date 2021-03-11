<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
                 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search</title>
</head>
<body>

<h4>Ingrese los datos para buscar por SKU</h4>
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

<h4>Ingrese los datos para buscar por modelo</h4>
<form:form method="post" modelAttribute="moto">
<table>
<tr>
<td>modelo</td>
<td><form:input path="modelo" type="text" /></td>
</tr>
<tr>
<td colspan="3"><input type="submit" /></td>
</tr>
</table>

<table border="1">
<tr>
<th>ID</th>
<th>SKU</th>
<th>FERT</th>
<th>Modelo</th>
<th>Tipo</th>
<th>Numero de serie</th>
<th>fecha</th>
</tr>
<tr>
<th>${moto.ID}</th>
<td>${moto.SKU}</td>
<td>${moto.FERT}</td>
<td>${moto.modelo}</td>
<td>${moto.tipo}</td>
<td>${moto.numSerie}</td>
<td>${moto.fecha}</td>
</tr>

</table>

</form:form>


<a href="http://localhost:8081/Italika_client/">Menú principal</a><br/>

</body>
</html>
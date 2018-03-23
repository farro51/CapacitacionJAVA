<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "java.util.Date, co.com.bancolombia.modelo.Producto, java.util.List;" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<% Date fecha = new Date();
		String id = request.getParameter("id"); 
		List<Producto> productos = (List<Producto>)request.getAttribute("productos");%>
	<p>La fecha actual es: <% out.print(fecha); %></p>
	<p>El parametro enviado es: <% out.print(id); %></p>
	<p>El parametro enviado desde la servlet es: 
		<% out.print(request.getAttribute("titulo")); %></p>
		
	<table>
		<tr>
			<th>C�digo</th>
			<th>T�tulo</th>
			<th>Precio</th>
		</tr>
			<% for(Producto p: productos){ %>
		<tr>
				<td><% out.print(p.getCodigo()); %></td>
				<td><% out.print(p.getTitulo()); %></td>
				<td><% out.print(p.getPrecio()); %></td>
		</tr>
		<%} %>
	</table>
	
	<form action="/RentasWeb/ServletManual" method="post">
		<input type="text" id="codigo" name="codigo" value="<%= id %>"/>
		<input type="text" id="titulo" name="titulo"/>
		<input type="text" id="precio" name="precio"/>
		
		<input type="submit" value="Crear"/>
	</form>
</body>
</html>
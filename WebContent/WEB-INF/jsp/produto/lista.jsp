<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Produto</title>
</head>
<body>
	<h1>Produtos</h1>
	<table width="100%">
			<tr>
				<td>Nome</td>
				<td>Preco</td>
				<td>Descricao</td>
				<td>Inicio das Vendas</td>
				<td>Ação</td>
			</tr>
		<c:forEach var="produto" items="${produtoList}">
			<tr>
				<td>${produto.nome}</td>
				<td>${produto.preco}</td>
				<td>${produto.descricao}</td>
				<td><fmt:formatDate pattern="dd/MM/yyyy"
						value="${produto.dataInicioVenda.time}" /></td>
				<td>
				<a href="<c:url value="/produto/remove"/>?produto.id=${produto.id}">Remover</a>
				<a href="<c:url value="/produto/edita"/>?id=${produto.id}">Alterar</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<p><a href="formulario">Adicionar</a></p>

</body>
</html>
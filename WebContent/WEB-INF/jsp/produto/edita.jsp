<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="caelum"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript"
	src="<c:url value="jsp/js/jquery-1.9.0.js" />">
	
</script>
<script type="text/javascript"
	src="<c:url value="/js/jquery-ui-1.10.0.custom.js" />">
	
</script>
<script type="text/css"
	src="<c:url value="/css/smoothness/jquery-ui-1.10.0.custom.css" />">
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="<c:url value= "/produto/altera" />">
		<input type="hidden" name="produto.id" value="${produto.id}" /> Nome:
		<input name="produto.nome" value="${produto.nome}" /> <br>
		Descri��o: <input name="produto.descricao"
			value="${produto.descricao}" /><br> Pre�o: <input
			name="produto.preco" value="${produto.preco}" /> <br> Data de
		in�cio de venda:
		<input type="text" name="produto.dataInicioVenda"
			value="<fmt:formatDate pattern="dd/MM/yyyy"
						value="${produto.dataInicioVenda.time}" />" />
		<br> <input type="submit" />
	</form>
</body>
</html>
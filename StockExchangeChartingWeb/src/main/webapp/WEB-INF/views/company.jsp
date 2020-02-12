
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:url var="companyUrl" value="/company/save" />
<form:form action="${companyUrl }" modelAttribute="company">
	<table>
	<c:if test="${!empty company.companyname }">
				<tr>
					<td><form:label path="id">Id</form:label></td>
					<td><form:input path="id" readonly="true" disabled="true" /></td>
					<td><form:hidden path="id" /></td>
				</tr>
			</c:if>
		<tr>
			<td><form:label path="name">Name</form:label></td>
			<td><form:input path="name" /></td>
		</tr>
		<tr>
			<td><form:label path="turnover">TurnOver</form:label></td>
			<td><form:input path="turnover" /></td>
		</tr>
		<tr>
			<td><form:label path="ceo">CEO</form:label></td>
			<td><form:input path="ceo" /></td>
		</tr>
		<tr>
			<td><form:label path="board_of_directors">boardofdirectory</form:label></td>
			<td><form:input path="board_of_directors" /></td>
		</tr>
		<tr>
			<td><form:label path="listed_in_stock_exchanges">listedinstockexchanges</form:label></td>
			<td><form:input path="listed_in_stock_exchanges" /></td>
		</tr>
		<tr>
			<td><form:label path="sector">Sector</form:label></td>
			<td><form:input path="sector" /></td>
		</tr>
		<tr>
			<td><form:label path="brief">Brief</form:label></td>
			<td><form:input path="brief" /></td>
		</tr>
		<tr>
			<td><form:label path="stock_code">StockCode</form:label></td>
			<td><form:input path="stock_code" /></td>
		</tr>
		<tr>
			<td><form:label path="activated">Activated</form:label></td>
			<td><form:input path="activated" /></td>
		</tr>
		<!-- <tr>
		<td></td>
		<td><input type="submit" value="Register"></td>
		</tr> -->
		<tr>
		<td></td>
				<td><c:if test="${empty company.companyname }">
						<input type="submit" value="Register">
					</c:if> <c:if test="${!empty company.companyname }">
						<input type="submit" value="Update">
					</c:if></td>
			</tr>
	</table>
	</form:form>
	
	<br />
	<div>
	<table border="1">
	<tr>
	<th>id</th>
	<th>name</th>
	<th>turnover</th>
	<th>ceo</th>
	<th>board_of_directors</th>
	<th>listed_in_stock_exchanges</th>
	<th>sector</th>
	<th>brief</th>
	<th>stock_code</th>
	<th>activated</th>
	</tr>
	
	<c:forEach  var="company" items="${list }">
	<tr>
	<td>${company.id}</td>
	<td>${company.name }</td>
	<td>${company.turnover}</td>
	<td>${company.ceo}</td>
	<td>${company.board_of_directors }</td>
	<td>${company.listed_in_stock_exchanges }</td>
	<td>${company.sector }</td>
	<td>${company.brief }</td>
	<td>${company.stock_code}</td>
	<td>${company.activated }

	<td><a href="<c:url value='/remove/${company.id }' />">Remove</a>|
	<a href="<c:url value='/update/${company.id }' />">Update</a></td>
	
	</tr>
	
	</c:forEach>
	
	</table>
	</div>
</body>
</html>
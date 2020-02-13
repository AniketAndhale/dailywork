
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
	<c:url var="userUrl" value="/user/save" />
<form:form action="${userUrl }" modelAttribute="user">
	<table>
	<c:if test="${!empty user.username }">
				<tr>
					<td><form:label path="id">Id</form:label></td>
					<td><form:input path="id" readonly="true" disabled="true" /></td>
					<td><form:hidden path="id" /></td>
				</tr>
			</c:if>
		<tr>
			<td><form:label path="admin">Admin</form:label></td>
			<td><form:input path="admin" /></td>
		</tr>
		<tr>
			<td><form:label path="code">Code</form:label></td>
			<td><form:input path="code" /></td>
		</tr>
		<tr>
			<td><form:label path="confirmed">Confirmed</form:label></td>
			<td><form:input path="confirmed" /></td>
		</tr>
		<tr>
			<td><form:label path="email">Email</form:label></td>
			<td><form:input path="email" /></td>
		</tr>
		<tr>
			<td><form:label path="password">Password</form:label></td>
			<td><form:input path="password" /></td>
		</tr>
		<tr>
			<td><form:label path="phone">Phone</form:label></td>
			<td><form:input path="phone" /></td>
		</tr>
		<tr>
			<td><form:label path="username">Username1</form:label></td>
			<td><form:input path="username" /></td>
		</tr>
		
		<!-- <tr>
		<td></td>
		<td><input type="submit" value="Register"></td>
		</tr> -->
		<tr>
		<td></td>
				<td><c:if test="${empty user.username }">
						<input type="submit" value="Register">
					</c:if> <c:if test="${!empty user.username }">
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
	<th>username</th>
	<th>password</th>
	<th>admin</th>
	<th>email</th>
	<th>phone</th>
	<th>confirmed</th>
	<th>code</th>
	<th>Action</th>
	</tr>
	
	<c:forEach  var="user" items="${list }">
	<tr>
	<td>${user.id}</td>
	<td>${user.username }</td>
	<td>${user.password}</td>
	<td>${user.admin }</td>
	<td>${user.email }</td>
	<td>${user.phone }</td>
	<td>${user.confirmed }</td>
	<td>${user.code }</td>

	<td><a href="<c:url value='/remove/${user.id }' />">Remove</a>|
	<a href="<c:url value='/update/${user.id }' />">Update</a></td>
	
	</tr>
	
	</c:forEach>
	
	</table>
	</div>
</body>
</html>
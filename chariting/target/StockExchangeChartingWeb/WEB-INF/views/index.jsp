
<%-- <%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
<a href="user-home">User</a>
	
	
	<hr> 
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
	
	
	</tr>
	
	</c:forEach>
	
	</table>
</body>
</html> --%>

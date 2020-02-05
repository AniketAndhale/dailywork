 <%@ include file="header.jsp" %>

<%=getsum(3,4) %>
<%!
public static int getsum(int a,int b){
	return a+b;
}%>
</body>
</html>
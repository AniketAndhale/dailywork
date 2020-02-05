<%@ include file="header.jsp" %>
<%@ include file="object.html" %>
<jsp:useBean id="user" class="com.cts.training.bean.Log" scope="page">
</jsp:useBean>
<jsp:setProperty property="username" name="user" value="admin007"/>
<jsp:setProperty property="password" name="user" value="admin#007"/>
<hr>
User details are:<br />
username:<jsp:getProperty property="username" name="user"/>
password:<jsp:getProperty property="password" name="user"/>

</body>
</html>
 <%@ include file="header.jsp" %>

<c:out value="Hello world"/>
<br/>
<c:set var="name" value="aniket"/>
Name:<c:out value="${name}"/>


Loop:<br/>
<c:forEach var="i" begin="1" end="5" step="1">
<h2>${i }</h2>
</c:forEach>


<c:set var="income" scope="session" value="${4000*4}"/>  
<c:if test="${income > 8000}">  
   <p>My income is: <c:out value="${income}"/><p>  
</c:if>    

<c:set var="mark" scope="session" value="${40*2}"/>  
<p>Your mark is : <c:out value="${mark}"/></p>  
<c:choose>  
    <c:when test="${mark <= 80}">  
       mark is not good.  
    </c:when>     
    <c:when test="${mark > 80}">  
        mark is very good.  
    </c:when>  
    <c:otherwise>  
       mark is undetermined...  
    </c:otherwise>  
</c:choose>  


<c:import var="data" url="http://www.google.com"/>  
<c:out value="${data}"/>  




</body>
</html>
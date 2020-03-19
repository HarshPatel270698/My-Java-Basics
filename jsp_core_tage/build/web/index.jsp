<%-- 
    Document   : index
    Created on : Feb 26, 2018, 8:30:40 PM
    Author     : Harsh
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:out value="Hello This is my demo"></c:out>
        <c:set var="s" value="Good Night"></c:set><br/>
        <c:out value="${s}"></c:out>
        <c:forEach begin="1" end="10" var="i" step="1">
            <br/><c:out value="${i}"></c:out>
        </c:forEach>
        <c:set value="C-2,Alkapuri Soc.,Opp BharviPark,Nikol Gam,Ahmedabad." var="str"></c:set>
              
        
        <c:forTokens delims="," items="${str}" var="data">
                   Hello<br/><c:out value="${data}"></c:out>
        </c:forTokens>
        <c:import url="my.jsp"></c:import>
        
        <form method="post" action="data.jsp">
            <select name="fr">
                <option value="Mango">Mango</option>
                <option value="Orange">Orange</option>
                <option value="Apple">Apple</option>
            </select>
            <input type="submit" value="Select">
        </form>
    </body>
</html>

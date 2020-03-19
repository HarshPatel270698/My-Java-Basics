<%-- 
    Document   : data
    Created on : Feb 26, 2018, 8:42:10 PM
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
        <c:set value="${param.fr}" var="fr"></c:set>
        <c:if test="${fr=='Apple'}">
            U Select:- <c:out value="${fr}"></c:out>
    </c:if>
    
            
            <hr/>
        <c:choose>
            <c:when test="${fr=='Mango'}">
                 U Select:- <c:out value="${fr}"></c:out>
            </c:when>
            <c:otherwise>
                <br/>Your Choice is Wrong
                <c:redirect url="index.jsp"></c:redirect>
                
                
            </c:otherwise>
        </c:choose>
    </body>
</html>

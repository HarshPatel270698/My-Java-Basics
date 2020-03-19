<%-- 
    Document   : second
    Created on : Mar 8, 2018, 8:48:51 PM
    Author     : Harsh
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:set value="Hello How r u??" var="str"></c:set>
        Original String:- <c:out value="${str}"></c:out><br/>
        Lower Case:- <c:out value="${fn:toLowerCase(str)}"></c:out><br/>
        Upper Case:- <c:out value="${fn:toUpperCase(str)}"></c:out><br/>
        Length:- <c:out value="${fn:length(str)}"></c:out><br/>
        SubString:- <c:out value="${fn:substring(str,1,8)}"></c:out><br/>
        Replace:- <c:out value="${fn:replace(str,'Hello','Sanjay')}"></c:out><br/>
    </body>
</html>

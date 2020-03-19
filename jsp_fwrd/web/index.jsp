<%-- 
    Document   : index
    Created on : Feb 23, 2018, 7:55:01 PM
    Author     : Harsh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:forward page="second.jsp">
            <jsp:param name="key" value="Hello How r u??"></jsp:param>
        </jsp:forward>
        
    </body>
</html>

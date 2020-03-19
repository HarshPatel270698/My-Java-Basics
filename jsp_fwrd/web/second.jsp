<%-- 
    Document   : second
    Created on : Feb 23, 2018, 7:55:07 PM
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
        <h1>Wel Come to Second Page</h1>
        <%
            String str=null;
            str=request.getParameter("key").toString();
            out.println(str);
            %>
    </body>
</html>

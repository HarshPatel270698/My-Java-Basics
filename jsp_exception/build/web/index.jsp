<%-- 
    Document   : index
    Created on : Mar 8, 2018, 9:09:23 PM
    Author     : Harsh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            int n1=10,n2=0,ans;
            ans=n1/n2;
            out.println("Ans is:-"+ans);
            %>
    </body>
</html>

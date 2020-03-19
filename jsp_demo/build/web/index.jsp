<%-- 
    Document   : index
    Created on : Feb 21, 2018, 8:11:24 PM
    Author     : Harsh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Date" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            out.println("Hello");
            out.println("<h1 style=color:red;>How R u??</h1>");
            out.println("<img src=abc.jpg width=100 height=100><br/>");
            demo d=new demo(10, 2);
            out.println("Max is:-"+d.max()+"<br/>");
        %>
        <%= new Date()%>
        <%!
            class demo
            {
                int n1,n2;
                demo(int n1,int n2)
                {
                    this.n1=n1;
                    this.n2=n2;
                }
                int max()
                {
                    int ans=(n1>n2)?n1:n2;
                    return ans;
                }
            }
        %>
    </body>
</html>

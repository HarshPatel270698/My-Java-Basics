<%-- 
    Document   : second
    Created on : Feb 26, 2018, 8:57:43 PM
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
        <%
            int no;
            String name;
            no=Integer.parseInt(request.getParameter("t1"));
            name=request.getParameter("t2");
        %>
        <jsp:useBean id="myid" class="my.demo" scope="page">
            <jsp:setProperty name="myid" property="no" value="<%= no%>"></jsp:setProperty>
            <jsp:setProperty name="myid" property="name" value="<%= name%>"></jsp:setProperty>
            <br/>No is:- <jsp:getProperty name="myid" property="no"></jsp:getProperty>
            <br/>Name is:-<jsp:getProperty name="myid" property="name"></jsp:getProperty>
        
            <br/><h3>EL</h3>
            No:-${myid.no}
            <br/>Name is:- ${myid.name}
        </jsp:useBean>
    </body>
</html>

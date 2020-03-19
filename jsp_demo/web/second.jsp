<%-- 
    Document   : second
    Created on : Feb 21, 2018, 8:17:30 PM
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
        <form method="post" action="second.jsp">
            Enter String:-<input type="text" name="t1"><input type="submit" name="b1" value="Show">
        </form>
        <%
            String action=null,str=null;
            action=request.getParameter("b1");
            if(action!=null)
            {
                str=request.getParameter("t1");
                out.println(str);
            } 
        %>
    </body>
</html>

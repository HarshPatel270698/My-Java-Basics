<%-- 
    Document   : index
    Created on : Feb 26, 2018, 7:55:55 PM
    Author     : Harsh
--%>
<%@page import="java.io.PrintWriter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="post" action="index.jsp">
            <table border="1" cellpadding="5" cellspacing="5">
                <tr>
                    <th>Enter User Name</th>
                    <td><input type="text" name="t1"></td>
                </tr>
                <tr>
                    <th>Enter Password</th>
                    <td><input type="password" name="t2"></td>
                </tr>
                <tr>
                    <th></th>
                    <td><input type="submit" name="b1" value="Save"><input type="submit" name="b1" value="View"></td>
                </tr>
            </table>
        </form>
        <%
        String str=null,action=null;
        action=request.getParameter("b1");
        if(action!=null)
        {
            if(action.equals("Save"))
            {
                str=request.getParameter("t1");
                Cookie c=new Cookie("key", str);
                response.addCookie(c);// store at client side
                out.println("Saved into cookie");
            }
            if(action.equals("View"))
            {
                Cookie ck[]=request.getCookies();
                for(int i=0;i<ck.length;i++)
                {
                    out.println("Name is:- "+ck[i].getName()+"\tValue is:-"+ck[i].getValue().toString());
                }
            }
        }
            %>
    </body>
</html>

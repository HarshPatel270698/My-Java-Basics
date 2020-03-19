<%-- 
    Document   : multi
    Created on : Feb 21, 2018, 8:23:20 PM
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
        <form method="post" action="multi.jsp">
            <table cellpaddig="5" cellspacing="5" border="1">
                <tr>
                    <th>Enter N1</th>
                    <td><input type="number" name="t1"></td>
                </tr>
                <tr>
                    <th>Enter N2</th>
                    <td><input type="number" name="t2"></td>
                </tr>
                <tr>
                    <th></th>
                    <td><input type="submit" name="b1" value="Add"><input type="submit" name="b1" value="Sub"></td>
                </tr>
            </table>
        </form>
        <%
            String action=null;
            int n1,n2,ans;
            action=request.getParameter("b1");
            if(action!=null)
            {
                n1=Integer.parseInt(request.getParameter("t1"));
                n2=Integer.parseInt(request.getParameter("t2"));
                if(action.equals("Add"))
                {
                    ans=n1+n2;
                    out.println("Addition is:- "+ans);
                }
                if(action.equals("Sub"))
                {
                    ans=n1-n2;
                    out.println("sub is:- "+ans);
                }
            }
            %>
    </body>
</html>

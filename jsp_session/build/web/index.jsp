<%-- 
    Document   : index
    Created on : Feb 23, 2018, 7:59:51 PM
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
                    <td><input type="submit" name="b1" value="Save"><input type="submit" name="b1" value="View"><input type="submit" name="b1" value="Delete"></td>
                </tr>
            </table>
        </form>
        <%
            String action=null,uname=null,pass=null;
            action=request.getParameter("b1");
            if(action!=null)
            {
                if(action.equals("Save"))
                {
                    uname=request.getParameter("t1");
                    pass=request.getParameter("t2");
                    session.setAttribute("un",uname);
                    session.setAttribute("ps", pass);
                    out.println("Save into Session");
                }
                if(action.equals("View"))
                {
                    if(session.getAttribute("un")==null || session.getAttribute("ps")==null)
                    {
                        out.println("Session is Empty");
                    }
                    else
                    {
                        out.println("User Name:-"+session.getAttribute("un").toString());
                    out.println("Password:-"+session.getAttribute("ps").toString());
                    }
                }
                if(action.equals("Delete"))
                {
                    session.removeAttribute("un");
                    session.removeAttribute("ps");
                    out.println("Remove from Session");
                }
            }
           %>
    </body>
</html>

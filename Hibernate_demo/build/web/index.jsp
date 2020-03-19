<%-- 
    Document   : index
    Created on : Apr 2, 2018, 9:11:59 PM
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
     <form action="Add_Student_Data">
            <table cellpadding="5" cellspacing="5" border="1">
                <tr>
                    <th>Enter Name</th>
                    <td><input type="text" name="t1"></td>
                </tr>
                <tr>
                    <th></th>
                    <td><input type="submit" name="b1" value="Save"></td>
                </tr>
            </table>
        </form>
        <% 
            String rMessage=request.getParameter("message");
            if (rMessage==null)
                    rMessage="Data is Not Saved";
            else
                rMessage="Data is Save";
            
                out.println(rMessage); 
 
            %>
    </body>
</html>

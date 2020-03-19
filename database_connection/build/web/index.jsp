<%-- 
    Document   : index
    Created on : Feb 15, 2018, 8:58:26 PM
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
        <form method="post" action="demo">
            <table cellpadding="5" cellspacing="5" border="1">
                <tr>
                    <th>Enter No</th>
                    <td><input type="text" name="tno"></td>
                </tr>
                <tr>
                    <th>Enter Name</th> 
                    <td><input type="text" name="tname"></td>
                </tr>
                <tr>
                    <th></th>
                    <td><input type="submit" name="b1" value="Save"><input type="submit" name="b1" value="Delete"><input type="submit" name="b1" value="Update"><input type="submit" name="b1" value="View"></td>
                </tr>
            </table>
        </form>
    </body>
</html>

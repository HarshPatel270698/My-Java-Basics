<%-- 
    Document   : index
    Created on : Feb 23, 2018, 8:07:03 PM
    Author     : Harsh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
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
                    <th>Enter String</th>
                    <td><input type="text" name="t1"></td>
                </tr>
                
                <tr>
                    <th></th>
                    <td><input type="submit" name="b1" value="Save"><input type="submit" name="b1" value="View"></td>
                </tr>
            </table>
        </form>
         <%
             String name=null,action=null;
             Connection con=null;
             Statement st=null;
             ResultSet rs=null;
             Class.forName("com.mysql.jdbc.Driver");
             con=DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","");
             st=con.createStatement();
             action=request.getParameter("b1");
             if(action!=null)
             {
                 if(action.equals("Save"))
                 {
                     name=request.getParameter("t1");
                     int i=st.executeUpdate("insert into student(name)values('"+name+"')");
                     if(i>0)
                         out.println("Record is Save");
                     else
                         out.println("Not Saved");
                 }
                 if(action.equals("View"))
                 {
                     out.println("<br/>");
                       out.println("<br/>");
                         out.println("<br/>");
                     rs=st.executeQuery("select *from student");
                     out.println("<table cellpadding=5 cellspacing=5 border=1><tr><th>No</th><th>Name</th></tr>");
                     while(rs.next())
                     {
                         out.println("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td></tr>");
                     }
                     out.println("</table>");
                 }
             }
         %>
    </body>
</html>

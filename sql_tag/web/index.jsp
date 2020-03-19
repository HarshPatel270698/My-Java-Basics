<%-- 
    Document   : index
    Created on : Mar 8, 2018, 8:39:40 PM
    Author     : Harsh
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <sql:setDataSource var="DB"  user="root" password="" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost/mydb"></sql:setDataSource>
        <sql:query dataSource="${DB}" var="Rec">select *from student</sql:query>
    <table cellpadding="5" cellspacing="5" border="1">
        <tr>
            <th>No</th>
            <th>Name</th>
        </tr>
   
        <c:forEach var="row" items="${Rec.rows}">
        <tr>
            <td><c:out value="${row.id}"></c:out></td>
              <td><c:out value="${row.name}"></c:out></td>
        </tr>
    </c:forEach>
         </table>
    </body>
</html>

<%-- 
    Document   : xml_demo
    Created on : Mar 8, 2018, 8:56:18 PM
    Author     : Harsh
--%>

<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:import url="http://localhost:8080/sql_tag/Person.xml" var="stud"></c:import>
        <x:parse xml="${stud}" var="display"></x:parse>
        <hr/>
            1st Record<br/>
        Name:-<x:out select="$display/Person/student[1]/name"></x:out>
        Phone:-<x:out select="$display/Person/student[1]/phone"></x:out>
         <hr/>
        <hr/>
            1st Record<br/>
        Name:-<x:out select="$display/Person/student[2]/name"></x:out>
        Phone:-<x:out select="$display/Person/student[2]/phone"></x:out>
         <hr/>
         
    </body>
</html>

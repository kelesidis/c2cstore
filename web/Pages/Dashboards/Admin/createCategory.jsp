<%-- 
    Document   : createCategory
    Created on : Dec 19, 2014, 3:13:28 PM
    Author     : Denis
--%>
<%@ include file="/Pages/Dashboards/SuperUserDashboard.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <br>
        <br>
        <form action="SaveCategory" method="post">
            Category name:<input type="text" name="catName">
            <input type="submit" value="Create">
        </form>
    </body>
</html>

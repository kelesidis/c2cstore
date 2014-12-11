<%-- 
    Document   : LoggedIn
    Created on : Dec 10, 2014, 10:15:55 PM
    Author     : Chris
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p>Send items to your address, 
           or you wish them to delivered to another address?</p>
        <form action="CompleteOrderLogedIn" method="post"><input type="submit" value="To my address"></form>
        <form action="AnotherAddress" method="post"><input type="submit" value="To another address"></form>
    </body>
</html>

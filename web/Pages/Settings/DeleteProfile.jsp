<%-- 
    Document   : DeleteProfile
    Created on : Jan 9, 2015, 6:07:48 PM
    Author     : Chris
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="/Pages/Settings/Settings.jsp" %> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete Profile</title>
    </head>
    <body>
        <p>Are you sure you want to delete your profile?</p>
        <form action="DeleteProfileSure"><input type="submit" value="Yes" /></form>
        <form action="Settings"><input type="submit" value="No" /></form>
    </body>
</html>

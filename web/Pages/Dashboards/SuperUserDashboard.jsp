<%-- 
    Document   : ADMIN PANEL
    Created on : 12 Νοε 2014, 12:09:20 μμ
    Author     : Admin
--%>

<%@page import="hibernateModel.User"%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ADMINISTRATION PANEL</title>
    </head>
    <body style="background-color:#2EFE2E;">
        <div align="right">
    <%  
            User user=(User)request.getSession().getAttribute("user");  
            out.print("Welcome, "+user.getName());
             session.setAttribute("user", user);
            //String sessionUser= session.getAttribute(user);
    %>
    <br>
    <a href="${pageContext.request.contextPath}/Logout">Logout</a>
</div>
     
<h1 align="center">Custumer-to-custumer store!!!</h1>
<h1 align="center">ADMIN PANEL</h1>
       
      

      <h1>User managment</h1>
      <a href="${pageContext.request.contextPath}/ListUsers">List all users</a> <br>
      <a href="${pageContext.request.contextPath}/createUser">Create user</a>  <br>
      <h1>Moderator managment</h1>
      <a href="${pageContext.request.contextPath}/ListModerators">List all moderators</a>
      <h1>Category managment</h1>
      <a href="${pageContext.request.contextPath}/ListCat">List all categories</a> <br>
      <a href="${pageContext.request.contextPath}/CreateCategory">Create category</a>
      <h1>Order managment</h1>
      //TODO:see all orders
      <br>
    </body>
</html>



 
  
 

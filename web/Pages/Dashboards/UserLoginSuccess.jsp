<%@page import="hibernate_models.User"%>  
  
<p>You are successfully logged in!</p>  
<%  
User user=(User)request.getAttribute("bean");  
out.print("Welcome, "+user.getName());  
%> 
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@page import="hibernateModel.User"%>  
<%@page import="hibernateModel.Storeitems"%>
  

<%  
User user=(User)request.getAttribute("bean");  
out.print("Welcome, "+user.getName());  


%> 

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>c2c Store Home Page</title>
    </head>
    <body>
        <form action="Search">
            <br />
            Search by Item: <input type="text" name="search" /><input type="submit" value="search"/></form>&nbsp;&nbsp;&nbsp;&nbsp; 
            <form action="UserPanelController"><select name="choice">
                                                    <option>Menu</option>
                                                    <option value="store">Store</option>
                                                    <option value="contact">Contact</option>
                                                    <option value="settings">Settings</option>
                                                    <option value="logout">Logout</option>
                                               </select><input type="submit" value="go"/>
            </form>   
        <%-- Storeitems item = (Storeitems)request.getAttribute("item");
        out.print("The price is" + item.getDescription());--%>
    </body>
</html>
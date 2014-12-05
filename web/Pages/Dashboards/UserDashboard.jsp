<%@page import="java.util.List"%>
<%@page import="hibernateModel.User"%> 
<%@page import="hibernateModel.Storeitems"%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>USER CONTROL PANEL</title>
    </head>
    <body>
       <p>You are successfully logged in!</p><br />
       <%  
            User user=(User)request.getSession().getAttribute("user");//.getAttribute("bean");  
            out.print("Welcome, "+user.getName());
       %> 
       <br />
       <form action="Search" method="POST">
           Search by Item<input type="text" name="searchtext">
           <input type="submit" value="Go">
       </form>
       <br /><br/>
       <table>
           <tbody>
               <tr>
                   <td align="center"><form action="Store" method="post"><input type="submit" value="Manage Store"></form></td>
               </tr>
               <tr>
                   <td align="center"><form action="Contact" method="post"><input type="submit" value="Contact Us"></form></td>
               </tr>
               <tr>
                   <td align="center"><form action="Settings" method="post"><input type="submit" value="Settings"></form></td>
               </tr>
               <tr>
                   <td align="center"><form action="Logout" method="post"><input type="submit" value="Logout"></form></td>
               </tr>
           </tbody>
       </table>
        <br /><br/>
        <%  
            List<Storeitems> si = null;
            si=(List<Storeitems>)request.getSession().getAttribute("randomitems");
            out.print("Current Offers");
                for(int i = 0; i<si.size(); i++){
                    out.print("<tr>");
                        out.print("<td></td>");
                        out.print("<td>Price</td>");
                        out.print("<td>Description</td>");
                        out.print("<td>Quantity</td>");
                    out.print("<tr>");
                    out.print("<tr>");
                        out.print("<td>Item "+i+"</td>");
                        out.print("<td>"+si.get(i).getPrice()+"</td>");
                        out.print("<td>"+si.get(i).getDescription()+"</td>");
                        out.print("<td>"+si.get(i).getQuantity()+"</td>");
                    out.print("<tr>");
                    
                }
        %>
    </body>
</html>
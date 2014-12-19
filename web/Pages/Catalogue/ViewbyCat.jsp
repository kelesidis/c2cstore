<%-- 
    Document   : CreateStore
    Created on : 2 Δεκ 2014, 10:46:55 πμ
    Author     : Admin
--%>

<%@page import="hibernateModel.Categories"%>
<%@page import="java.util.List"%>
<%@page import="hibernateModel.Storeitems"%>
<%@page import="hibernateModel.Store"%>
<%@page import="hibernateModel.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create Store</title>
    </head>
    <body>
         <h1>

       </h1>
         <% 
             
           List<Categories> cats = (List<Categories>)request.getSession().getAttribute("categories");
           for(int i = 0 ; i<cats.size();i++){
           
               out.print("<form action=\"Showcat\" method=\"post\"><input type=\"hidden\" value="+cats.get(i).getId()+" name=\"catid\" /> <input type=\"submit\" value="+cats.get(i).getCategoriename()+"></form>");
           
           }
         
         %>
       <table style="border: 4px blue ridge">
            <%  
               List<Storeitems> si = null;
               si=(List<Storeitems>)request.getSession().getAttribute("catlistitems");//.getAttribute("bean");
               out.print("Item List : </br>");
               if(si!=null){
                    for(int i = 0; i<si.size();i++){

                        out.print("<tr style=\"border: 2px black ridge\">");

                         out.print("<td style=\"border:  2px black ridge\">ItemID : </td>");
                         out.print("<td style=\"border:  2px black ridge\">"+si.get(i).getId()+ "</td>");

                         out.print("<td style=\"border:  2px black ridge\">Description : </td>");
                         out.print("<td style=\"border:  2px black ridge\">"+si.get(i).getDescription()+ "</td>");

                         out.print("<td style=\"border:  2px black ridge\">Price : </td>");
                         out.print("<td style=\"border:  2px black ridge\">"+si.get(i).getPrice()+ " $</td>");

                         out.print("<td style=\"border:  2px black ridge\">Quantity : </td>");
                         out.print("<td style=\"border:  2px black ridge\">"+si.get(i).getQuantity()+ "</td>");
                         
                         out.print("<td style=\"border:  2px black ridge\">Categorie : </td>");
                         out.print("<td style=\"border:  2px black ridge\">"+si.get(i).getCategories().getCategoriename()+ "</td>");

                         out.print("<td style=\"border:  2px black ridge\">Quantity : </td>");
                         out.print("<td style=\"border:  2px black ridge\"><form action=\"Additem\" method=\"post\"><input type=\"text\" name=\"quantity\"></td>");
                         
                         out.print("<td style=\"border:  2px black ridge\"> <input type=\"hidden\" value="+si.get(i).getId()+" name=\"itemid\" /> <input type=\"submit\" value=\"Add\"></form></td>");
                         
                        out.print("</tr>");
                    }
               }
               

           %>
        </table>
        
        <form action="Cart" method="post"> <input type="submit" value="Cart"></form>
    </body>
</html>

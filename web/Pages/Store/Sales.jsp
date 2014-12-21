<%-- 
    Document   : Sales
    Created on : Dec 21, 2014, 11:47:32 PM
    Author     : a
--%>

<%@page import="java.util.List"%>
<%@page import="hibernateModel.Storeitems"%>
<%@page import="hibernateModel.Store"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%  
                Store store=(Store)request.getSession().getAttribute("store"); 
                out.print(store.getStorename());
                
                
        %>
        <h3>Sales of <%out.print(store.getStorename());%></h3>
        <table style="border: 4px blue ridge">
        <%
                List<Storeitems> si =(List<Storeitems>)request.getSession().getAttribute("itemssoldinthestore");
               out.print("Items Sold : </br>");
               if(si!=null){
                    for(int i = 0; i<si.size();i++){

                        out.print("<tr style=\"border: 4px blue ridge\">");

                         out.print("<td style=\"border: 4px blue ridge\">ItemID : </td>");
                         out.print("<td style=\"border: 4px green inset\">"+si.get(i).getId()+ "</td>");

                         out.print("<td style=\"border: 4px blue ridge\">Description : </td>");
                         out.print("<td style=\"border: 4px green inset\">"+si.get(i).getDescription()+ "</td>");

                         out.print("<td style=\"border: 4px blue ridge\">Price : </td>");
                         out.print("<td style=\"border: 4px green inset\">"+si.get(i).getPrice()+ " $</td>");
                         
                         out.print("<td style=\"border: 4px blue ridge\">Categorie : </td>");
                         out.print("<td style=\"border: 4px green inset\">"+si.get(i).getCategories().getCategoriename()+ "</td>");
                    
                        out.print("</tr>");
                    }
               }
        %> 
        </table>
    </body>
</html>

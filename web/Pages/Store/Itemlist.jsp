<%-- 
    Document   : CreateStore
    Created on : 2 Δεκ 2014, 10:46:55 πμ
    Author     : Admin
--%>

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
            <%  
               Store store=(Store)request.getSession().getAttribute("store");//.getAttribute("bean");  
               out.print(store.getStorename());

           %>
       </h1>
       <table style="border: 4px blue ridge">
            <%  
               List<Storeitems> si = null;
               si=(List<Storeitems>)request.getSession().getAttribute("items");//.getAttribute("bean");
               out.print("Item List : </br>");
               if(si!=null){
                    for(int i = 0; i<si.size();i++){

                        out.print("<tr style=\"border: 4px blue ridge\">");

                         out.print("<td style=\"border: 4px blue ridge\">ItemID : </td>");
                         out.print("<td style=\"border: 4px green inset\">"+si.get(i).getId()+ "</td>");

                         out.print("<td style=\"border: 4px blue ridge\">Description : </td>");
                         out.print("<td style=\"border: 4px green inset\">"+si.get(i).getDescription()+ "</td>");

                         out.print("<td style=\"border: 4px blue ridge\">Price : </td>");
                         out.print("<td style=\"border: 4px green inset\">"+si.get(i).getPrice()+ " $</td>");

                         out.print("<td style=\"border: 4px blue ridge\">Quantity : </td>");
                         out.print("<td style=\"border: 4px green inset\">"+si.get(i).getQuantity()+ "</td>");
                         
                         out.print("<td style=\"border: 4px blue ridge\">Categorie : </td>");
                         out.print("<td style=\"border: 4px green inset\">"+si.get(i).getCategories().getCategoriename()+ "</td>");
                         
                         out.print("<td style=\"border:  2px black ridge\"><form action=\"EditItem\" method=\"post\"><input type=\"hidden\" value="+i+" name=\"itemlistid\" /> <input type=\"submit\" value=\"Edit\"></form></td>");
                         
                        out.print("</tr>");
                    }
               }
               

           %>
           <tr>
               <td><form action="AddItemConf" method="post"> <input type="submit" value="Add item"></td>
               
           </tr>
        </table>
        
    </body>
</html>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="hibernateModel.Storeitems"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Items Found</title>
    </head>
    <body>
        <h1>Items Found:</h1>
        <table style="border: 4px blue ridge">
            <%  
                List<Storeitems> si = null;
                si=(List<Storeitems>)request.getSession().getAttribute("searchResultList");
                out.print("Item List : </br>");
                if(si!=null)
                {
                    for(int i = 0; i<si.size();i++)
                    {
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
                        out.print("<td style=\"border:  2px black ridge\"><form action=\"Additem\" method=\"post\"> <input type=\"hidden\" value="+si.get(i).getId()+" name=\"itemid\" /> <input type=\"submit\" value=\"Add\"></form></td>"); 
                        out.print("</tr>");
                    }
               }
            %>
        </table>
    </body>
</html>

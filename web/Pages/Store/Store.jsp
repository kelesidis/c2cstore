<%-- 
    Document   : Store
    Created on : Dec 4, 2014, 10:24:19 PM
    Author     : a
--%>

<%@page import="hibernateModel.Store"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Store</title>
    </head>
    <body>
        <h1>
            <%  
                Store store=(Store)request.getSession().getAttribute("store"); 
                out.print(store.getStorename());
            %>
        </h1>
        <table>    
            <tr>
                <form action="Items" method="post"> <td align="right">    <input type="submit" value="Items"> </form></td>  
            </tr>
            <tr>
                <form action="Sales" method="post"> <td align="right">    <input type="submit" value="Sales"> </form></td>  
            </tr>
        </table>
    </body>
</html>

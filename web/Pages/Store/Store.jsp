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
        <table>
            <form action="Items" method="post">
                <tr><%  
            Store store=(Store)request.getSession().getAttribute("store");//.getAttribute("bean");  
            out.print(store.getStorename());
            %></tr>
            <tr>
                <td align="right">    <input type="submit" value="Items"> </form></td>  
            </tr>
        </table>
    </body>
</html>

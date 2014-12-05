<%-- 
    Document   : AddItem
    Created on : 5 Δεκ 2014, 11:35:06 πμ
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table>
            <form action="AddItem" method="post">
            <tr>
                <td align="right">Item Description :</td>
                <td><input type="text" name="desc"></td>
            </tr>
            <tr>
                <td align="right">Item Category :</td>
                <td><input type="text" name="cat"></td>
            </tr>
            <tr>
                <td align="right">Quantity :</td>
                <td><input type="text" name="qua"></td>
            </tr>
            <tr>
                <td align="right">    <input type="submit" value="Add Item"> </form></td>  
            </tr>
        </table>
    </body>
</html>

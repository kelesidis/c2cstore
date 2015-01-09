<%-- 
    Document   : OrdersList
    Created on : Dec 17, 2014, 12:55:57 PM
    Author     : Chris
--%>

<%@page import="java.util.List"%>
<%@page import="hibernateModel.Orders"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ACS</title>
    </head>
    <body>
        <%
            List<Orders> order = null;
            order = (List<Orders>) request.getSession().getAttribute("order");
            out.print("<table border = '1'>");
            out.print("<tr>");
            out.print("<td>Order Code </td>");
            out.print("<td>User</td>");
            out.print("<td>Delivered</td>");
            out.print("</tr>");
            for (int i = 0; i < order.size(); i++) {
                out.print("<tr>");
                out.print("<td>" + order.get(i).getOrderCode() + "</td>");
                out.print("<td>" + order.get(i).getUserId() + "</td>");
                out.print("<td>" + order.get(i).isDelivered() + "</td>");
                out.print("</tr>");
            }
            out.print("</table>");
        %>
        <form action="CloseOrder" method="POST"><input type="submit" value="Close Order">
        </form>
        <form action="Back"><input type="submit" value="Home">
        </form>
    </body>
</html>

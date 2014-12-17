<%-- 
    Document   : Courier
    Created on : Dec 17, 2014, 12:28:38 PM
    Author     : Chris
--%>

<%@page import="hibernateModel.Orders"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ACS</title>
    </head>
    <body>
        <form action="SearchOrders" method="POST">
            Enter Order Code<input type="text" name="ordercode"><input type="submit" value="Search">
        </form>
        <%
            List<Orders> orders = null;
            orders = (List<Orders>) request.getSession().getAttribute("allOrders");
            out.print("<p>Orders List</p>");
            out.print("<table border = '1'>");
            out.print("<tr>");
            out.print("<td>Order Code </td>");
            out.print("<td>User</td>");
            out.print("<td>Delivered</td>");
            out.print("</tr>");
            for (int i = 0; i < orders.size(); i++) {
                out.print("<tr>");
                out.print("<td>" + orders.get(i).getOrderCode() + "</td>");
                out.print("<td>" + orders.get(i).getUserId() + "</td>");
                out.print("<td>" + orders.get(i).isDelivered() + "</td>");
                out.print("</tr>");
                out.print("<br />");
            }
            out.print("</table>");
        %>
    </body>
</html>
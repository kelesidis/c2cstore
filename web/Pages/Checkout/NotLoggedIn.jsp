<%-- 
    Document   : NotLoggedIn
    Created on : Dec 10, 2014, 10:06:25 PM
    Author     : Chris
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action ="CompleteOrderLoggedIn" method="post">
            <table>
                <tr>
                    <td>Name:</td>
                    <td><input type="text" name="name" required></td>
                </tr>
                <tr>
                    <td>Surname</td>
                    <td><input type="text" name="surname" required></td>
                </tr>
                <tr>
                    <td>Country:</td>
                    <td align="right"><input type="text" name="country" required></td>
                </tr>
                <tr>
                    <td>City:</td>
                    <td align="right"><input type="text" name="city" required></td>
                </tr>
                <tr>
                    <td>State:</td>
                    <td align="right"><input type="text" name="state" required></td>
                </tr>
                <tr>
                    <td>Address:</td>
                    <td align="right"><input type="text" name="address" required></td>
                </tr>
                <tr>
                    <td>Postal Code:</td>
                    <td align="right"><input type="text" name="postalcode" required></td>
                </tr>
                <tr>
                    <td>Phone:</td>
                    <td align="right"><input type="text" name="phone" required></td>
                </tr>
                <tr>
                    <td></td>
                    <td align="right"><input type="submit" value="Complete Order"></td>
                </tr>
            </table>
        </form>
    </body>
</html>

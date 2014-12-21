<%-- 
    Document   : passrecoverform
    Created on : 21 Νοε 2014, 2:20:14 μμ
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
            <form action="getUserForPassRec" method="post">
                <tr>
                    <td>Username : </td>
                    <td><input type="text" name="username"></td>
                </tr>
                
                
                <tr>
                    
                    <td align="right"><input type="submit" value="Recover Password" ></td>
                </tr>
            </form>
        </table>
    </body>
</html>

<%-- 
    Document   : passrecoverform
    Created on : 21 Νοε 2014, 2:20:14 μμ
    Author     : Admin
--%>

<%@page import="hibernateModel.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table>
            <form action="passwordRecoveryProccess" method="post">
           
                <tr>
                    <td>     
                        <% 
             
                             User ur = (User)request.getSession().getAttribute("userwhoforgotpass");
                             out.print(ur.getSecretQ());
                         %>
         
                    </td>
                </tr>
                <tr>
                    <td><input type="text" name="secretquestion"></td>
                </tr>
                
                <tr>
                    <td></td>
                    <td align="right"><input type="submit" value="Recover Password" ></td>
                </tr>
            </form>
        </table>
    </body>
</html>

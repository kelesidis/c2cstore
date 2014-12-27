<%-- 
    Document   : index
    Created on : Nov 8, 2014, 5:53:31 PM
    Author     : a
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
    </head>
    <body>
       <table>
            <form action="Index" method="post">
            <tr>
                <td align="right">NAME:</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td align="right">PASSWORD:</td>
                <td><input type="password" name="password"></td>
            </tr>
            <tr>
                <td align="right">    <input type="submit" value="login"> </form></td>
                <td> <form action="Register" method="post"> <input type="submit" value="Register"> </form> </td>
                <td> <form action="Catalogue" method="post"> <input type="submit" value="Catalogue"> </form> </td>
                <td> <form action="passrecover" method="post"> <input type="submit" value="Forgot Password?"> </form> </td>
            </tr>
        </table>
        <DIV ALIGN="CENTER">
            <FORM ACTION="Search" METHOD="POST">
                <TABLE>
                    <TR>
                        <TD><INPUT TYPE="TEXT" NAME="searchKey" PLACEHOLDER="3 Chars Minimum"/><INPUT TYPE="SUBMIT" VALUE="Search" NAME="searchBtn"/></TD>
                    </TR>
                </TABLE>
            </FORM>
        </DIV>
    </body>
    
    
</html>

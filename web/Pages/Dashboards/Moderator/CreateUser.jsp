
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MODERATOR</title>
    </head>
    <body>
        <h1><i>Create User</i></h1>
        
        <table>
            <form action="Save" method="post">
                <tr>
                    <td>Name:</td>
                    <td align="right"><input type="text" name="name" required></td>
                </tr>
                <tr>
                    <td>Surname:</td>
                    <td align="right"><input type="text" name="surname" required></td>
                </tr>
                <tr>
                    <td>User Name:</td>
                    <td align="right"><input type="text" name="username" placeholder="5-15 Characters" required></td>
                </tr>
                <tr>
                    <td>E-mail:</td>
                    <td align="right"><input type="email" name="email"  placeholder="Enter a valid email" required></td> 
                </tr>
                <tr>
                    <td>Password:</td>
                    <td align="right"><input type="password" name="password" required></td>
                </tr>
                <tr>
                    <td>Confirm Password:</td>
                    <td align="right"><input type="password" name="confirmpassword" required></td>
                </tr>
                
                <tr>
                    <td></td>
                    <td></td>
                </tr>
                <tr>
                    <td><label>Security Question</label></td>
                    <td align="right">
                        <select name="question">
                            <option value="What is the name of your pet?">What is the name of your pet?</option>
                            <option value="What is the name of your city birth">What is the name of your city birth</option>
                            <option value="What was your first car?">What was your first car?</option>
                            <option value="You love programming?">You love programming?</option>
                      </select>
                    </td>
                </tr>
                <tr>
                    <td>Answer:</td>
                    <td align="right"><input type="text" name="securityanswer" required></td>
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
                    <td align="right"><input type="submit" value="Create"></td>
                </tr>
            </form>
        </table>
    </body>
</html>

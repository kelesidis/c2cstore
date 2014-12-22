<%-- 
    Document   : ListUser
    Created on : Dec 12, 2014, 2:07:07 PM
    Author     : Denis
--%>

<%@page import="java.util.List"%>
<%@page import="hibernateModel.User"%>
<%@ include file="/Pages/Dashboards/SuperUserDashboard.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All registered users</title>
    </head>
    <body>
        <h3>List of all registered users:</h3>
  <table>
        <%  
               List<User> ul = (List<User>)request.getSession().getAttribute("adminUserList");
              
              // out.print(" List all users: </br>");
               
                out.print("<tr style=\"border: 2px black ridge\">");
                                    out.print("<td style=\"border:  2px black ridge\">UserID : </td>");
                                    out.print("<td style=\"border:  2px black ridge\">Name : </td>");
                                    out.print("<td style=\"border:  2px black ridge\">Surname : </td>");
                                    out.print("<td style=\"border:  2px black ridge\">Username : </td>");
                                    out.print("<td style=\"border:  2px black ridge\">City : </td>");
                                    out.print("<td style=\"border:  2px black ridge\">Role : </td>");
                                    out.print("<td style=\"border:  2px black ridge\">Email : </td>");
                                    out.print("<td style=\"border:  2px black ridge\">Phone : </td>");
                                     out.print("<td style=\"border:  2px black ridge\">Update : </td>");
                                    out.print("<td style=\"border:  2px black ridge\">Delete : </td>");
                            out.print("</tr>");
               if(ul!=null){
                    for(int i = 0; i<ul.size();i++){
                            

                         
                         out.print("<td style=\"border:  2px black ridge\">"+ul.get(i).getId()+ "</td>");

                         
                         out.print("<td style=\"border:  2px black ridge\">"+ul.get(i).getName()+ "</td>");

                         out.print("<td style=\"border:  2px black ridge\">"+ul.get(i).getLastname()+ " </td>");

                         out.print("<td style=\"border:  2px black ridge\">"+ul.get(i).getUsername()+ "</td>");
                         
                         out.print("<td style=\"border:  2px black ridge\">"+ul.get(i).getCity()+ "</td>");
                         
                         out.print("<td style=\"border:  2px black ridge\">"+ul.get(i).getRank()+ "</td>");
                         
                         out.print("<td style=\"border:  2px black ridge\">"+ul.get(i).getEmail()+ "</td>");
                         
                         out.print("<td style=\"border:  2px black ridge\">"+ul.get(i).getPhone()+ "</td>");
                         
                         
                         out.print("<td style=\"border:  2px black ridge\">");
                                out.print("<form action=\"userInfo\" method=\"post\">");
                                out.print(" <input type=\"hidden\" value="+ul.get(i).getId()+" name=\"userId\" /> <input type=\"submit\" value=\"Update\">");
                                out.print("</form>");
                         out.print( "</td>");
                         out.print("<td style=\"border:  2px black ridge\">");
                                out.print("<form action=\"DeleteUser\" method=\"post\">");
                                out.print(" <input type=\"hidden\" value="+ul.get(i).getId()+" name=\"userId\" /> <input type=\"submit\" value=\"Delete\">");
                                out.print("</form>");
                         out.print( "</td>");
                         out.print("</tr>");
                       
                        
                         
                    }
               }
               

           %>
        </table>
    </body>
</html>

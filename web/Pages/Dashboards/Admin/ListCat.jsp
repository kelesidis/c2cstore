<%-- 
    Document   : ListCat
    Created on : Dec 21, 2014, 2:05:47 AM
    Author     : Denis
--%>
<%@ include file="/Pages/Dashboards/SuperUserDashboard.jsp" %>
<%@page import="java.util.List"%>
<%@page import="hibernateModel.Categories"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List Categories</title>
    </head>
    <body>
        <h3>List category</h3>
        <table>
        <%  
               List<Categories> catList = (List<Categories>)request.getSession().getAttribute("catList");
              
             ;
               
                out.print("<tr style=\"border: 2px black ridge\">");
                                    
                                     out.print("<td style=\"border:  2px black ridge\">ID : </td>");
                                    out.print("<td style=\"border:  2px black ridge\">Category name  </td>");
                                    out.print("<td style=\"border:  2px black ridge\">Delete  </td>");
                            out.print("</tr>");
               if(catList!=null){
                    for(int i = 0; i<catList.size();i++){
                            

                         
                         out.print("<td style=\"border:  2px black ridge\">"+catList.get(i).getId()+ "</td>");

                         
                         out.print("<td style=\"border:  2px black ridge\">"+catList.get(i).getCategoriename()+ "</td>");

                         out.print("<td style=\"border:  2px black ridge\">");
                                out.print("<form action=\"DeleteCategory\" method=\"post\">");
                                out.print(" <input type=\"hidden\" value="+catList.get(i).getId()+" name=\"userId\" /> <input type=\"submit\" value=\"Delete\">");
                                out.print("</form>");
                         
                         out.print("</tr>");
                       
                        
                         
                    }
               }
               

           %>
        </table>
    </body>
</html>

<%@page import="hibernateModel.Categories"%>
<%@page import="java.util.List"%>
<%@page import="hibernateModel.Storeitems"%>
<%@page import="hibernateModel.Store"%>
<%@page import="hibernateModel.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create Store</title>
        <STYLE>
            
	
	/* 
	Max width before this PARTICULAR table gets nasty
	This query will take effect for any screen smaller than 760px
	and also iPads specifically.
	*/
	@media 
	only screen and (max-width: 760px),
	(min-device-width: 768px) and (max-device-width: 1024px)  {
	
		/* Force table to not be like tables anymore */
		table, thead, tbody, th, td, tr { 
			display: block;
                        
		}
		
		/* Hide table headers (but not display: none;, for accessibility) */
		thead tr { 
			position: absolute;
                        top: -9999px;
			left: -9999px;
		}
		
		tr { border: 1px solid #CC0000 ; 
                 width: auto;
                }
		
		td { 
			/* Behave  like a "row" */
			border:  chartreuse;
                         background-color: #f3f3f3;
			border-bottom: 1px solid #eee; 
			position: relative;
			padding-left: 50%; 
		}
		
		td:before { 
			/* Now like a table header */
			position: absolute;
			/* Top/left values mimic padding */
			top: 6px;
			left: 6px;
			width: 45%; 
			padding-right: 10px; 
			white-space: nowrap;
		}
		
		/*
		Label the data
		*/
		td:nth-of-type(1):before { content: "ItemID"; }
		td:nth-of-type(2):before { content: "Description:"; }
		td:nth-of-type(3):before { content: "Price:"; }
		td:nth-of-type(4):before { content: "Quantity:"; }
		td:nth-of-type(5):before { content: "Category:"; }
		td:nth-of-type(6):before { content: "Insert Quantity:"; }
                td:nth-of-type(7):before { content: "View Product:"; }
		
	}
	
	/* Smartphones (portrait and landscape) ----------- */
	@media only screen
	and (min-device-width : 320px)
	and (max-device-width : 480px) {
		body { 
			padding: 0; 
			margin: 0; 
			width: 320px; }
		}
	
	/* iPads (portrait and landscape) ----------- */
	@media only screen and (min-device-width: 768px) and (max-device-width: 1024px) {
		body { 
			width: 495px; 
		}
	}
	
        </STYLE>
    </head>
    <body>
         <h1>

       </h1>
         <% 
             
           List<Categories> cats = (List<Categories>)request.getSession().getAttribute("categories");
           out.print("<DIV ALIGN='CENTER'><TABLE>");
           for(int i = 0 ; i<cats.size();i++){
           out.print("<TR ALIGN='CENTER'><TD>");
               out.print("<form action=\"Showcat\" method=\"post\"><input type=\"hidden\" value="+cats.get(i).getId()+" name=\"catid\" /> <input type=\"submit\" value="+cats.get(i).getCategoriename()+"></form>");
           out.print("</TD></TR>");
           }
           out.print("</TABLE></DIV>");
         
         %>
         <DIV ALIGN='CENTER'>
       <table style="border: 4px blue ridge">
            <%  
               List<Storeitems> si = null;
               si=(List<Storeitems>)request.getSession().getAttribute("catalogueitemlist");//.getAttribute("bean");
               out.print("Item List : </br>");
                out.print("<thead>");
                        out.print("<tr>");
                                    
                                    out.print("<th>ItemID : </th>");
                                    out.print("<th>Description : </th>");
                                    out.print("<th>Price: </th>");
                                    out.print("<th>Quantity: </th>");
                                    out.print("<th>Category: </th>");
                                    out.print("<th>Quantity: </th>");
                                    out.print("<th></th>");
                        out.print("</tr>");
                  out.print("</thead>");
               if(si!=null){
                    for(int i = 0; i<si.size();i++){
                out.print("<tbody>");
                        out.print("<tr ALIGN='CENTER'>");

                         out.print("<td>"+si.get(i).getId()+ "</td>");

                         out.print("<td>"+si.get(i).getDescription()+ "</td>");

                         out.print("<td>"+si.get(i).getPrice()+ " $</td>");

                         out.print("<td>"+si.get(i).getQuantity()+ "</td>");
                         
                         out.print("<td>"+si.get(i).getCategories().getCategoriename()+ "</td>");

                         out.print("<td><form action=\"Additem\" method=\"post\"><input type=\"text\" name=\"quantity\" SIZE='2'><input type=\"hidden\" value="+si.get(i).getId()+" name=\"itemid\" /> <input type=\"submit\" value=\"Add\"></form></td>");
                         
                         //out.print("<td> </td>");
                         out.print("<td><form action=\"Viewitem\" method=\"post\"> <input type=\"hidden\" value="+si.get(i).getId()+" name=\"itemid\" /> <input type=\"submit\" value=\"View\"></form></td>");
                         
                        out.print("</tr>");
                    }
               }
             out.print("</tbody>");   

           %>
        </table>
         </DIV>
        <form action="Cart" method="post"> <input type="submit" value="Cart"></form>
    </body>
</html>

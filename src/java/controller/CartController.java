/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import hibernateDAO.CartDAO;
import hibernateDAO.CatalogueDAO;
import hibernateModel.Storeitems;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
@WebServlet(name = "CartController", urlPatterns = {"/Cart","/Additem"})
public class CartController extends HttpServlet {
protected void doPost(HttpServletRequest request, HttpServletResponse response)  
                throws ServletException, IOException {  
                    response.setContentType("text/html");  
                    PrintWriter out=response.getWriter();  
                    RequestDispatcher rd;
                    String URL = request.getServletPath();
                    
                    if(URL.equals("/Additem")){
                    
                        CartDAO itemDB = new CartDAO();
                        Storeitems item = itemDB.getItem(request.getParameter("itemid"));
                        List<Storeitems> cartlist = (List<Storeitems>)request.getSession().getAttribute("cartlist");
                        
                       
//                out.println("<!DOCTYPE html>");
//                out.println("<html>");
//                out.println("<head>");
//                out.println("<title>Servlet NewServlet</title>");            
//                out.println("</head>");
//                out.println("<body>");
//                out.println("<h1>Servlet NewServlet at " + item.getPrice() + "</h1>");
//                out.println("</body>");
//                out.println("</html>");
                        if(cartlist==null){
                            cartlist = new ArrayList<Storeitems>();
                        }
                        cartlist.add(item);
                        request.getSession().setAttribute("cartlist", cartlist);
                        rd=request.getRequestDispatcher("/Pages/Catalogue/Catalogue.jsp");
                        rd.forward(request, response);
//                        out.println("<!DOCTYPE html>");
//                        out.println("<html>");
//                        out.println("<head>");
//                        out.println("<title>Servlet NewServlet</title>");            
//                        out.println("</head>");
//                        out.println("<body>");
//                        out.println("<h1>Servlet NewServlet at " + item.getDescription() + "</h1>");
//                        out.println("</body>");
//                        out.println("</html>");
                    }
                    else if(URL.equals("/Cart")){
                    
                        rd=request.getRequestDispatcher("/Pages/Cart/Cart.jsp");
                        rd.forward(request, response);
                        
                    }
            }
}

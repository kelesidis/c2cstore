/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import hibernateDAO.StoreCheckDAO;
import hibernateModel.Store;
import hibernateModel.Storeitems;
import hibernateModel.User;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "Store", urlPatterns = {"/Store", "/CreateStore","/Items"})
public class StoreController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)  
                throws ServletException, IOException {  
            response.setContentType("text/html");  
            PrintWriter out=response.getWriter();  
              
            User ur = (User) request.getSession().getAttribute("user");
            String URL = request.getServletPath();
            
            if(URL.equals("/Store")){
            
                StoreCheckDAO SC = new StoreCheckDAO();
                RequestDispatcher rd;
                Store store = SC.checkForStore(ur);
                if(store !=null){
                    request.getSession().setAttribute("store", store);
                    rd=request.getRequestDispatcher("/Pages/Store/Store.jsp");
                    rd.forward(request, response);
                }
                else{
                
                    rd=request.getRequestDispatcher("/Pages/Store/CreateStore.jsp");
                    rd.forward(request, response);
                
                }
                
            }
            else if(URL.equals("/CreateStore")){
            
                StoreCheckDAO SC = new StoreCheckDAO();
                if(SC.checkForStoreName(request.getParameter("storename"))){
                    
                    RequestDispatcher rd;
                    rd=request.getRequestDispatcher("/Pages/Store/Storenameexist.jsp");
                    rd.forward(request, response);
                    
                }
                else{
                
                    
                    request.getSession().setAttribute("store", SC.createStore(request.getParameter("storename"), ur));
                    
                    RequestDispatcher rd;
                    rd=request.getRequestDispatcher("/Pages/Store/Store.jsp");
                    rd.forward(request, response);
                    
                }
            
            }
            else if(URL.equals("/Items")){
                
                StoreCheckDAO SC = new StoreCheckDAO();
                List<Storeitems> si = null;
                Storeitems item = new Storeitems();
                si=(List<Storeitems>)SC.getItems((Store)request.getSession().getAttribute("store"));
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet NewServlet</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Servlet NewServlet at " + si.get(1).getPrice() + "</h1>");
                out.println("</body>");
                out.println("</html>");
            
            }
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet NewServlet</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet NewServlet at " + ur.getPassword() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
            
 
        }  



}

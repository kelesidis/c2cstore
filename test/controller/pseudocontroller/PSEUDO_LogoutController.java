/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Chris
 */
@WebServlet(name = "LogoutController", urlPatterns = {"/Logout"})
public class PSEUDO_LogoutController extends HttpServlet {

    public int doPost(String userPath)  
                   throws ServletException, IOException {  
               //response.setContentType("text/html");  
               int toreturned = 0;
               
               if(userPath.equals("Logout")){
                   toreturned = 1;
    //             RequestDispatcher rd=request.getRequestDispatcher("/Pages/Logout/Logout.jsp");  
    //             rd.forward(request, response);
    //             HttpSession session = request.getSession(false);
    //             if (session != null) {
    //                session.invalidate();
    //             }
               }
               return toreturned;
    }
      
    @Override  
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)  
            throws ServletException, IOException {  
        doPost(req, resp);  
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import hibernateDAO.RegisterDAO;
import hibernateModel.Storeitems;
import hibernateModel.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.RegisterModel;

/**
 *
 * @author Chris
 */
@WebServlet(name = "UserPanelController", urlPatterns = {"/UserPanelController"})
public class UserPanelController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)  
                   throws ServletException, IOException {  
               response.setContentType("text/html");  
               
               String selected = request.getParameter("choice");
               if("store".equals(selected)){
                   RequestDispatcher rd=request.getRequestDispatcher("");  
                   rd.forward(request, response);
               }
               else if("contact".equals(selected)){
                   RequestDispatcher rd=request.getRequestDispatcher("");  
                   rd.forward(request, response);
               }
               else if("settings".equals(selected)){
                   RequestDispatcher rd=request.getRequestDispatcher("");  
                   rd.forward(request, response);
               }
               else{
                   RequestDispatcher rd=request.getRequestDispatcher("");  
                   rd.forward(request, response);
               }
               
    }
      
    @Override  
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)  
            throws ServletException, IOException {  
        doPost(req, resp);  
    }

}

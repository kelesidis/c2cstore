package controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//CONTROLLER REDIRECTING TO ABOUT JSP
@WebServlet(name = "aboutController", urlPatterns = {"/aboutFrm"})
public class aboutController extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)  
    throws IOException, ServletException
    {
        RequestDispatcher rd = request.getRequestDispatcher("/Pages/aboutForm/about.jsp"); //URL To Send
        rd.forward(request, response); //Forward Request
    }
    
    @Override  
    protected void doGet(HttpServletRequest req, HttpServletResponse res)  
    throws ServletException, IOException 
    {
        doPost(req, res);
    }
}

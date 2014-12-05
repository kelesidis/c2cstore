/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import hibernateDAO.CatalogueDAO;
import hibernateModel.Storeitems;
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
@WebServlet(name = "Catalogue", urlPatterns = {"/Catalogue"})
public class CatalogueController extends HttpServlet {

   protected void doPost(HttpServletRequest request, HttpServletResponse response)  
                throws ServletException, IOException {  
                    response.setContentType("text/html");  
                    PrintWriter out=response.getWriter();  
                    RequestDispatcher rd;
                    CatalogueDAO catalogue = new CatalogueDAO();
                    List<Storeitems> itemList = null;
                    itemList =(List<Storeitems>) catalogue.getItems();
                    request.getSession(true).setAttribute("catalogueitemlist", itemList);
                    rd=request.getRequestDispatcher("/Pages/Catalogue/Catalogue.jsp");  
                    rd.forward(request, response);
            }
 
             
  

}

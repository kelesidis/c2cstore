/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.CheckoutDAO;
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
@WebServlet(name = "CheckoutController", urlPatterns = {"/Checkout", "/CompleteOrderNotLoggedIn", "/AnotherAddress", "/CompleteOrderLogedIn"})
public class CheckoutController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");

        String userPath = request.getServletPath();

        HttpSession session = request.getSession(false);

        if (userPath.equals("/Checkout")) {
            if (session.getAttribute("user") == null) {
                // User is not logged in.  
                RequestDispatcher rd = request.getRequestDispatcher("/Pages/Checkout/NotLoggedIn.jsp");
                rd.forward(request, response);
            } else {
                // User IS logged in.  
                RequestDispatcher rd = request.getRequestDispatcher("/Pages/Checkout/LoggedIn.jsp");
                rd.forward(request, response);
            }
        } else if (userPath.equals("/AnotherAddress")) {
            RequestDispatcher rd = request.getRequestDispatcher("/Pages/Checkout/NotLoggedIn.jsp");
            rd.forward(request, response);
        } else if (userPath.endsWith("/CompleteOrderLoggedIn")) {
            //TODO: add to db the order
            
            RequestDispatcher rd = request.getRequestDispatcher("/Pages/Checkout/OrderComplete.jsp");
            rd.forward(request, response);
        } else if (userPath.equals("/CompleteOrderNotLoggedIn")) {
            RequestDispatcher rd = request.getRequestDispatcher("/Pages/Checkout/OrderComplete.jsp");
            rd.forward(request, response);

        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        doPost(req, resp);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.pseudocontroller;

import dao.CourierDAO;
import hibernateModel.Orders;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author Chris
 */
@WebServlet(name = "CourierController", urlPatterns = {"/SearchOrders", "/CloseOrder"})
public class PSEUDO_CourierController extends HttpServlet {

    public int doPost(String userPath)
            throws ServletException, IOException {
        //response.setContentType("text/html");

        int toreturned = 0;

//        CourierModel cm = new CourierModel();
//        CourierDAO cd = new CourierDAO();
        //String userPath = request.getServletPath();
        if (userPath.equals("/SearchOrders")) {
            toreturned = 1;
//            int ordercode = Integer.parseInt(request.getParameter("ordercode"));
//            request.getSession().setAttribute("orderNumber", ordercode);
//            List<Orders> order;
//            order = (List<Orders>) cd.getOrder(ordercode);
//            request.getSession().setAttribute("order", order);
//
//            RequestDispatcher rd = request.getRequestDispatcher("/Pages/ACS/OrderUpdate.jsp");
//            rd.forward(request, response);
        } else if (userPath.equals("/CloseOrder")) {
            toreturned = 2;
//            int ordercode = (int) request.getSession().getAttribute("orderNumber");
//            cd.updateOrder(ordercode, true);
//
//            List<Orders> orders = null;
//            orders = (List<Orders>) cd.retrieveOrders();
//            request.getSession().setAttribute("allOrders", orders);
//
//            RequestDispatcher rd = request.getRequestDispatcher("/Pages/ACS/Courier.jsp");
//            rd.forward(request, response);
        }
        return toreturned;

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        doPost(req, resp);
    }

}

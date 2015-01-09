/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.RegisterDAO;
import dao.SettingsDAO;
import dao.StoreCheckDAO;
import hibernateModel.Store;
import hibernateModel.Storeitems;
import hibernateModel.User;
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
@WebServlet(name = "Settings", urlPatterns = {"/Settings", "/EditProfile", "/DeleteProfile", "/SaveProfile"})
public class SettingsController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");

        String userPath = request.getServletPath();

        

        if (userPath.equals("/Settings")) {
            RequestDispatcher rd = request.getRequestDispatcher("/Pages/Settings/Settings.jsp");
            rd.forward(request, response);
        }
        else if(userPath.equals("/EditProfile")){
            RequestDispatcher rd = request.getRequestDispatcher("/Pages/Settings/EditProfile.jsp");
            rd.forward(request, response);
        }
        else if(userPath.equals("/SaveProfile")){
            User user = new User();
            
            user.setName(request.getParameter("name"));
            user.setLastname(request.getParameter("surname"));
            user.setUsername(request.getParameter("username"));
            user.setEmail(request.getParameter("email"));
            user.setPassword(request.getParameter("password"));
            user.setSecretQ(request.getParameter("question"));
            user.setSecretA(request.getParameter("securityanswer"));
            user.setCountry(request.getParameter("country"));
            user.setCity(request.getParameter("city"));
            user.setState(request.getParameter("state"));
            user.setAddress(request.getParameter("address"));
            user.setPostalCode(request.getParameter("postalcode"));
            user.setPhone(request.getParameter("phone"));
            user.setRank("user");
            
            SettingsDAO settingsDAO = new SettingsDAO();
            settingsDAO.updateUser(user);
            
            RequestDispatcher rd = request.getRequestDispatcher("/Pages/Dashboards/UserDashboard.jsp");
            rd.forward(request, response);
        }
        else if(userPath.equals("/DeleteProfile")){
            User user = (User) request.getSession().getAttribute("user");
            StoreCheckDAO storeCheckDAO = new StoreCheckDAO();
            SettingsDAO settingsDAO = new SettingsDAO();
            Store store = new Store();
            store = storeCheckDAO.checkForStore(user);
            int storeID = store.getId();
            List<Storeitems> items = null;
            items = (List<Storeitems>) settingsDAO.retrieveItems(storeID);
            for(int i=0;i<items.size();i++){
                int itemID = items.indexOf(i);
                settingsDAO.deleteItem(itemID);
            }
            settingsDAO.deleteStore(storeID);
            settingsDAO.deleteUserById(user.getId());
            
        }

}

@Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        doPost(req, resp);
    }

}

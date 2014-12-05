package controller;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.ModelMail;
//CONTROLLER SENDING THE MAIL
@WebServlet(name = "sendMailController", urlPatterns = {"/sendTheMail"})
public class sendMailController extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)  
    throws IOException, ServletException
    {
        RequestDispatcher rd = request.getRequestDispatcher("/Pages/aboutForm/about.jsp");
        try
        {
            String mailMessage = request.getParameter("mailMsg");
            ModelMail mMail = new ModelMail();
            sendMail sMail = new sendMail(mMail);
            sMail.setModelMsg(mailMessage);
            sMail.setModelSubj(request.getParameter("mailSubj"));
            sMail.sendMailTo("chrisnmr72@gmail.com");
        }
        catch (MessagingException ex)
        {
            Logger.getLogger(aboutController.class.getName()).log(Level.SEVERE, null, ex);
        }
        rd.forward(request, response);
    }
    
    @Override  
    protected void doGet(HttpServletRequest req, HttpServletResponse res)  
    throws ServletException, IOException 
    {
        doPost(req, res);
    }
}

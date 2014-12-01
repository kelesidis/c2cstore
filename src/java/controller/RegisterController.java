
package controller;



import hibernateDAO.RegisterDAO;
import hibernateModel.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import model.RegisterModel;

/**
 *
 * @author Chris
 */
@WebServlet(name = "RegisterControllerServlet", urlPatterns = {"/Register", "/RegisterValidate"})
public class RegisterController extends HttpServlet {
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)  
                   throws ServletException, IOException {  
               response.setContentType("text/html");  
               PrintWriter out=response.getWriter();  

               String userPath = request.getServletPath();

               if(userPath.equals("/Register")){ 
                   RequestDispatcher rd=request.getRequestDispatcher("/Pages/SignUp/Register.jsp");  
                   rd.forward(request, response);
               }
               else if(userPath.equals("/RegisterValidate")){

 
                   RegisterModel rm = new RegisterModel();

                   rm.setName(request.getParameter("name"));
                   rm.setSurname(request.getParameter("surname"));
                   rm.setUsername(request.getParameter("username"));
                   rm.setEmail(request.getParameter("email"));
                   rm.setPassword(request.getParameter("password"));
                   rm.setConfirmpassword(request.getParameter("confirmpassword"));
                   rm.setSequrityquestion(request.getParameter("question"));
                   rm.setSecurityanswer(request.getParameter("securityanswer"));
                   rm.setCountry(request.getParameter("country"));
                   rm.setCity(request.getParameter("city"));
                   rm.setState(request.getParameter("state"));
                   rm.setAddress(request.getParameter("address"));
                   rm.setPostalcode(request.getParameter("postalcode"));
                   rm.setPhone(request.getParameter("phone"));

                   rm.validateUsername();
                   rm.validateEmail();
                   rm.validatePassword();
                   
                   
                   
                   boolean status = rm.validate();
                   
                   if(status){
                       
                       User user = new User(rm.getName(), rm.getSurname(), rm.getUsername(), rm.getRank(), rm.getEmail(), rm.getSequrityquestion(), rm.getSecurityanswer(),
                                                        rm.getPassword(), rm.getCity(), rm.getCountry(), rm.getState(), rm.getAddress(), rm.getPostalcode(), rm.getPhone());
                       RegisterDAO userDAO = new RegisterDAO();
                       userDAO.addUser(user);
                       
                       request.setAttribute("bean",user);
                       RequestDispatcher rd = request.getRequestDispatcher("/Pages/Dashboards/UserLoginSuccess.jsp");
                       rd.forward(request, response);
                       
                   }
                   else {
                       if((((rm.isUsernameCheck()==false) && (rm.isEmailCheck()==true)) && (rm.isPasswordCheck()==true))){
                           RequestDispatcher rd=request.getRequestDispatcher("/Pages/SignUp/WrongUsername.jsp");  
                           rd.forward(request, response);
                        }
                       else if((((rm.isUsernameCheck()==false) && (rm.isEmailCheck()==false)) && (rm.isPasswordCheck()==true))){
                           RequestDispatcher rd=request.getRequestDispatcher("/Pages/SignUp/WrongUsernameAndEmail.jsp");  
                           rd.forward(request, response);
                       }
                       else if((((rm.isUsernameCheck()==false) && (rm.isEmailCheck()==false)) && (rm.isPasswordCheck()==false))){
                           RequestDispatcher rd=request.getRequestDispatcher("/Pages/SignUp/WrongUsernameAndEmailAndPass.jsp");  
                           rd.forward(request, response);
                       }
                       else if((((rm.isUsernameCheck()==true) && (rm.isEmailCheck()==false)) && (rm.isPasswordCheck()==true))){
                           RequestDispatcher rd=request.getRequestDispatcher("/Pages/SignUp/WrongEmail.jsp");  
                           rd.forward(request, response);
                       }
                       else if((((rm.isUsernameCheck()==true) && (rm.isEmailCheck()==false)) && (rm.isPasswordCheck()==false))){
                           RequestDispatcher rd=request.getRequestDispatcher("/Pages/SignUp/WrongEmailAndPass.jsp");  
                           rd.forward(request, response);
                       }
                       else if((((rm.isUsernameCheck()==true) && (rm.isEmailCheck()==true)) && (rm.isPasswordCheck()==false))){
                           RequestDispatcher rd=request.getRequestDispatcher("/Pages/SignUp/WrongPass.jsp");  
                           rd.forward(request, response);
                       }
                       else if((((rm.isUsernameCheck()==false) && (rm.isEmailCheck()==true)) && (rm.isPasswordCheck()==false))){
                           RequestDispatcher rd=request.getRequestDispatcher("/Pages/SignUp/WrongUsernameAndPass.jsp");  
                           rd.forward(request, response);
                       }
                    }
                }
    }
      
    @Override  
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)  
            throws ServletException, IOException {  
        doPost(req, resp);  
    }
}

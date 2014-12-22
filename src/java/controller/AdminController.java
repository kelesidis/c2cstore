package controller;
import dao.AdminDAO;
import dao.RegisterDAO;
import hibernateModel.User;
import hibernateModel.Categories;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.RegisterModel;

/**
 *
 * @author Denis
 */
@WebServlet(name = "AdminController", urlPatterns = {"/ListUsers","/ListCat","/createUser","/DeleteCategory",
                                                        "/CreateCategory","/SaveCategory", 
                                                      "/ListModerators", "/DeleteUser",
                                                      "/userInfo", "/Save","/Update"})
public class AdminController extends HttpServlet {

 @Override
 protected void doPost(HttpServletRequest request, HttpServletResponse response)  
                throws ServletException, IOException {  
                    response.setContentType("text/html");  
                    PrintWriter out=response.getWriter();  
                    RequestDispatcher rd;
                    String URL = request.getServletPath();
                    
     switch (URL) {
        /* 
         case "/Delete":
             rd=request.getRequestDispatcher("/Pages/Dashboards/Admin/DeleteUser.jsp");
             rd.forward(request, response);
             break;
         */
    //=================================CATEGORY MANAGMENT===================================     
        case "/ListCat":
            AdminDAO catDaoList= new AdminDAO();
              List<Categories> catList = (List<Categories>)catDaoList.getAllCategries();
             request.getSession().setAttribute("catList", catList);
             rd=request.getRequestDispatcher("/Pages/Dashboards/Admin/ListCat.jsp");
             rd.forward(request, response);
             break;
         case "/DeleteCategory":
              int userIDc = Integer.parseInt(request.getParameter("userId"));
              AdminDAO catDelDao= new AdminDAO();
              catDelDao.deleteCatById(userIDc);
             rd=request.getRequestDispatcher("/Pages/Dashboards/Admin/DeleteCat.jsp");
             rd.forward(request, response);
             break;
         case "/CreateCategory":
             rd=request.getRequestDispatcher("/Pages/Dashboards/Admin/createCategory.jsp");
             rd.forward(request, response);
             break;
       case "/SaveCategory":
            String catName=request.getParameter("catName");
            AdminDAO catDao=new AdminDAO();
             Categories cat=new Categories();
             cat.setCategoriename(catName);
             catDao.createCategory(cat);
             rd=request.getRequestDispatcher("/Pages/Dashboards/Admin/categorySuccess.jsp");
             rd.forward(request, response);
             break;   
    
     //=================================END OF CATEGORY MANAGMENT===================================          
                                                                        
    //=====================================USER MANAGMENT========================================
        
         case "/ListUsers":
              AdminDAO AD= new AdminDAO();
              List<User> adminUserList = (List<User>)AD.getAllUsers();
             request.getSession().setAttribute("adminUserList", adminUserList);
             rd=request.getRequestDispatcher("/Pages/Dashboards/Admin/ListUser.jsp");
             rd.forward(request, response);
              break;
         case "/DeleteUser":
             int userIdFromPost = Integer.parseInt(request.getParameter("userId"));
              AdminDAO admDao= new AdminDAO();
             admDao.deleteUserById(userIdFromPost);
             rd=request.getRequestDispatcher("/Pages/Dashboards/Admin/DeleteUser.jsp");
             rd.forward(request, response);
             break;
             //create user input page
         case "/createUser":
             rd=request.getRequestDispatcher("/Pages/Dashboards/Admin/createUser.jsp");
             rd.forward(request, response);
             break;
         case "/userInfo":
             String userID=request.getParameter("userId"); 
             AdminDAO AD1 = new AdminDAO();
             User userById = new User();
             userById=AD1.getUserById(userID);
             request.getSession().setAttribute("userById", userById);
             rd=request.getRequestDispatcher("/Pages/Dashboards/Admin/userupdate.jsp");
             rd.forward(request, response);
             break;
         case "/ListModerators":
             AdminDAO AD2= new AdminDAO();
             List<User> modList=(List<User>)AD2.getAllModerators();
             request.getSession().setAttribute("modList", modList);
             rd=request.getRequestDispatcher("/Pages/Dashboards/Admin/ListModerator.jsp");
             
             rd.forward(request, response);
             out.println("<h1>Servlet NewServlet yoo</h1>");
             break;
              case "/Save":
                RegisterModel rm = new RegisterModel();
                    rm.setName(request.getParameter("name"));
                    rm.setSurname(request.getParameter("surname"));
                    rm.setUsername(request.getParameter("username"));
                    rm.setEmail(request.getParameter("email"));
                    rm.setPassword(request.getParameter("password"));
                    rm.setConfirmpassword(request.getParameter("confirmpassword"));
                    rm.setRank(request.getParameter("rank")); 
                    rm.setSequrityquestion(request.getParameter("question"));
                    rm.setSecurityanswer(request.getParameter("securityanswer"));
                    rm.setCountry(request.getParameter("country"));
                    rm.setCity(request.getParameter("city"));
                    rm.setState(request.getParameter("state"));
                    rm.setAddress(request.getParameter("address"));
                    rm.setPostalcode(request.getParameter("postalcode"));
                    rm.setPhone(request.getParameter("phone"));
            
                 User user = new User( rm.getName(), 
                                       rm.getSurname(),
                                       rm.getUsername(),
                                       rm.getRank(), 
                                       rm.getEmail(), 
                                       rm.getSequrityquestion(), 
                                       rm.getSecurityanswer(),
                                       rm.getPassword(), 
                                       rm.getCity(), 
                                       rm.getCountry(),
                                       rm.getState(), 
                                       rm.getAddress(), 
                                       rm.getPostalcode(), 
                                       rm.getPhone());
                    RegisterDAO userDAO = new RegisterDAO();
                    userDAO.addUser(user);
                    rd=request.getRequestDispatcher("/Pages/Dashboards/Admin/updatedsuccess.jsp");
                    rd.forward(request, response);
             break;
       case "/Update":
             int userId= Integer.parseInt(request.getParameter("userId"));
            String name=request.getParameter("name");
            String surname=request.getParameter("surname");
            String usernme=request.getParameter("username");
            String email =request.getParameter("email");
            String pass= request.getParameter("password");
            String rank=request.getParameter("rank"); 
            String question=request.getParameter("question");
            String security=request.getParameter("securityanswer");
            String coutry=request.getParameter("country");
            String city=request.getParameter("city");
            String state=request.getParameter("state");
            String address=request.getParameter("address");
            String postcode=request.getParameter("postalcode");
            String phone=request.getParameter("phone");
           
            
                 User userU = new User();
                 
                 userU.setId(userId);
                 userU.setName(name);
                 userU.setLastname(surname);
                 userU.setUsername(usernme);
                 userU.setRank(rank);
                 userU.setEmail(email);
                 userU.setSecretQ(question);
                 userU.setSecretA(security);                 
                 userU.setPassword(pass);
                 userU.setCountry(coutry);
                 userU.setCity(city);
                 userU.setState(state);
                 userU.setAddress(address);
                 userU.setPostalCode(postcode);
                 userU.setPhone(phone);
                      AdminDAO AdmDao1=new AdminDAO();
                      AdmDao1.updateUser(userU);
              
             rd=request.getRequestDispatcher("/Pages/Dashboards/Admin/updatedsuccess.jsp");
             rd.forward(request, response);
             break;        
     }
 //=====================================END OF USER MANAGMENT========================================    
 }

 @Override  
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)  
            throws ServletException, IOException {  
        doPost(req, resp);  
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Login extends HttpServlet {
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession b = request.getSession();
        String Name = request.getParameter("Username");
        String Password = request.getParameter("Password");
        
        if(Validate.checkUser(Name, Password))
        {
            RequestDispatcher rs = request.getRequestDispatcher("Welcome.jsp");
            b.setAttribute("k1",Name);
            rs.forward(request, response);
        }
        else
        {
           RequestDispatcher rs = request.getRequestDispatcher("Incorrect.jsp");
           b.setAttribute("k1",Name);
           rs.include(request, response);
        }
    }  
}
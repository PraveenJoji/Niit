import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class Register extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession b = request.getSession();		
        
        String Firstname = request.getParameter("Firstname");
        String Lastname = request.getParameter("Lastname");
        String Rollno = request.getParameter("Rollno");
        String Email = request.getParameter("Email");
        String Password= request.getParameter("Password");
        try{
        
        //loading drivers for mysql
        Class.forName("org.apache.derby.jdbc.ClientDriver");

	//creating connection with the database 
          Connection  con=DriverManager.getConnection
                     ("jdbc:derby://localhost:1527/Niit","Akash","root");

        PreparedStatement ps=con.prepareStatement
                  ("insert into Student values(?,?,?,?,?)");

        ps.setString(1, Firstname);
        ps.setString(2, Lastname);
         ps.setString(3, Rollno);
        ps.setString(4, Email);
        ps.setString(5, Password);
        
        int i=ps.executeUpdate();
        
          if(i>0)
          {
            
            RequestDispatcher rs = request.getRequestDispatcher("Register.jsp");
            b.setAttribute("k1",Firstname);
              b.setAttribute("k2",Lastname);
                b.setAttribute("k3",Rollno);
                  b.setAttribute("k4",Email);
            rs.forward(request, response);
        
          }
          else
          {
              out.println("<h1>Sql Error: Updations not made</h1>");
          }
        
        }
        catch(Exception se)
        {
            se.printStackTrace();
        }
	
      }
  }

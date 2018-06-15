import java.sql.*;

public class Validate
 {
     public static boolean checkUser(String Name,String Password) 
     {
      boolean st =false;
      try{

	 //loading drivers for mysql
         Class.forName("org.apache.derby.jdbc.ClientDriver");

 	 //creating connection with the database 
         Connection con=DriverManager.getConnection
                        ("jdbc:derby://localhost:1527/Niit","Akash","root");
         PreparedStatement ps =con.prepareStatement
                             ("select * from Student where Firstname=? and Password=?");
         ps.setString(1, Name);
         ps.setString(2, Password);
         ResultSet rs =ps.executeQuery();
         st = rs.next();
        
      }catch(Exception e)
      {
          e.printStackTrace();
      }
         return st;                 
  }   
}
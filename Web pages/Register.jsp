
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Page</title>
    </head>
    <body>
        <h1>Thank you ${k1} for your Registeration<br>Have a nice Day :)</h1>
        <br><br><br>
    <center>
        <a href="Profile.jsp"><button type="button" class="b1"><b>View Profile</b></button></a>
    </center>
           <style>
        body
            {
                background-color:navy;
            }
         h1
        {
            color:white;
            font-size:50px;
            font-family:lucida calligraphy;
            font-weight:50px;
            text-align: center;
            text-shadow: 3px 2px 3px black;    
        }   
        .b1
         {
  display: inline-block;
  padding: 15px 25px;
  font-size: 15px;
  cursor: pointer;
  text-align: center;
  text-decoration: none;
  outline:none;
  color:Navy;
  background-color:White;
  border: none;
  border-radius: 10px;
}

.b1:hover
{
    background-color:blue;
    -webkit-transition-duration: 0.4s; /* Safari */
    transition-duration: 0.4s;
    cursor: pointer;
    color:black;
}

.b1:active
{
  background-color:steelblue;
  transform: translateY(4px);
}
        </style>
    </body>
</html>
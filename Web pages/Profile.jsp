<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile Page</title>
    </head>
    <body>
        <div id="div1">
    <center>
        <h1>Profile:</h1><br><br>
        <h3>First Name:${k1}</h3><br>
        <h3>Last Name:${k2}</h3><br>
        <h3>Rollno:${k3}</h3><br>
        <h3>Email:${k4}</h3>
    </center>
        </div>
    <style>
        body
        {
            background-color:navy;
        }
        h1
        {
            color:Black;
            font-size:50px;
            font-family:Monotype Corsiva;
            font-weight:50px;
            text-align: center;
            text-shadow: 3px 2px 3px black; 
        }
        h3
        {
            color:black;
            font-size:30px;
            font-family:Fantasy;
            font-weight:30px;
            text-align: center; 
        }
    </style>
    </body>
</html>

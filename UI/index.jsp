<%-- 
    Document   : index
    Created on : Oct 12, 2015, 10:28:04 PM
    Author     : limon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <form action="ControllerReg2" method="post">
           Name:<input type="text" name="uname"><br/>
           Password:<input type="password" name="upass"><br/>
           <input type="submit" value="Go">
           <input type="reset" value="Reset">
       </form>
        <a href="login.jsp">Login</a>|
         <a href="delete.jsp">Delete</a>
    </body>
</html>

<%-- 
    Document   : Login Document
    Created on : March 19, 2018 
    Author     : Binyam S Heyi
    Description:  A login form fo user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login page</title>
    </head>
    <body>
        <form action="ControllerLogin2" method="post">
            Name:<input type="text" name="uname"><br/>
            Password:<input type="password" name="upass"><br/>
            <input type="Submit" value="SUBMIT">
            
            
        </form>
    </body>
</html>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="/css/main.css" />
<title>Room Management System</title>
</head>
<body>
	<div id="wrapper">
		<form name="login-form" class="login-form" action="login"
			method="post">
			<div class="header">
				<h1>Login</h1>
				<span></span>
			</div>
			<div class="content">
				<input name="username" type="text" class="input username"
					placeholder="Username" />
				<div class="user-icon"></div>
				<input name="password" type="password" class="input password"
					placeholder="Password" />
				<div class="pass-icon"></div>
			</div>
			<div class="footer">
				<input type="submit" name="submit" value="Login" class="button" />
			</div>
		</form>
	</div>

	<div>
		<c:if test="${requestScope.errorMessage != null}">
			<span><c:out value="${requestScope.mensaje}"/></span>
		</c:if>
	</div>
</body>
</html>
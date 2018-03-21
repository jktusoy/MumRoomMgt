<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Room Management System</title>
<link rel="stylesheet" href='<c:url value="/etc/css/admin.css"/>'>
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">

<script type="text/javascript"
	src='https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js'></script>

<script src='<c:url value="/etc/js/director/director.js"/>'></script>

<script src='<c:url value="/etc/js/director/students.js"/>'></script>

<script src='<c:url value="/etc/js/director/report.js"/>'></script>

<script src="https://use.fontawesome.com/releases/v5.0.8/js/all.js"></script>



<link href="https://fonts.googleapis.com/css?family=Montserrat:300"
	rel="stylesheet">
</head>

<body>
	<div id="main">
		<div id="header">
			<img src="" />
		</div>
		<c:if test='${not empty sessionScope.userBean}'>
			<div id="header">
				Logged as <a href="#">${sessionScope.userBean.userName}</a>
				<c:if test='${sessionScope.userBean.buildingNumber ne 0}'>
					<span>for Building Number
						${sessionScope.userBean.buildingNumber}</span>
				</c:if>
			</div>
		</c:if>
		<div id="subheader">subheader FOR DIRECTOR</div>
		<div id="navigation" class="aside">

			<!-- My-->
			<div>
				<nav>
					<ul class="navigation">

						<li class="active"><i class="fas fa-user fa-fw"></i> <a
							id="nav_profile" href="#">Profile</a></li>

						<li class="active"><i class="fas fa-user fa-fw"></i> <a
							id="roomsList" href="#">Rooms List</a></li>

						<li class="active"><i class="fas fa-user fa-fw"></i> <a
							id="nav_student">Student List</a></li>

						<li><i class="fas  fa-inbox fa-fw"></i> <a id="nav_departure"
							href="#">Departure</a></li>
						<li><i class="fas  fa-check fa-fw"></i><a id="nav_report"
							href="#">Generate Report></a>
						<li class="active"><i class="fas fa-user fa-fw"></i> <a
							href="">LogOut</a></li>
					</ul>
				</nav>
			</div>


		</div>
		<div id="content">
		
			<div id="generalContent" style="display: none;">
				<%@include file="roomList.jsp"%>
			</div>
			
			<div id="profileContent" style="display: none;">
				<%@include file="studentProfile.jsp"%>
			</div>

			<div id="departureContent" style="display: none;">
				<%@include file="departureForm.jsp"%>
			</div>

			<div id="reportContent" style="display: none;">
				<%@include file="report.jsp"%>
			</div>
			
			<div id="studentContent" style="display: none;">
				<%@include file="students.jsp"%>
			</div>
			
		</div>
		<div id="footer">
			<p class="copyright">
				Copyright © 2010 to All rights reserved. This website is made in
				partial fulfillment <br /> for the course CS402-Web Programming.
			</p>
		</div>
	</div>
</body>

</html>
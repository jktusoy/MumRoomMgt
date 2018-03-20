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
<script defer
	src="https://use.fontawesome.com/releases/v5.0.8/js/all.js"></script>
<link href="https://fonts.googleapis.com/css?family=Montserrat:300"
	rel="stylesheet">
</head>

<body>
	<div id="main">
		<div id="header">
			<img src="" />
		</div>
		<div id="subheader">subheader FOR DIRECTOR</div>
		<div id="navigation" class="aside">


			<!-- My-->
			<div>
				<nav>
					<ul class="navigation">

						<li class="active"><i class="fas fa-user fa-fw"></i> <a
							href="">Profile</a></li>
						<li><i class="fas  fa-check fa-fw"></i>Manage Rooms

							<ul class="navigation">

								<li class="active"><i class="fas fa-user fa-fw"></i> <a
									href="">Rooms List</a></li>
								<li><i class="fas  fa-inbox fa-fw"></i> Change Room</li>
								<li><i class="fas  fa-check fa-fw"></i>Assign Room</li>
							</ul></li>
						<li><i class="fas  fa-inbox fa-fw"></i> Departure</li>
						<li><i class="fas  fa-check fa-fw"></i>Generate Report

							<ul class="navigation">

								<li class="active"><i class="fas fa-user fa-fw"></i> <a
									href="">Rooms Availability</a></li>
								<li><i class="fas  fa-inbox fa-fw"></i> Room Detail Per
									Student</li>
								<li><i class="fas  fa-check fa-fw"></i>Rooms Transfers</li>
							</ul></li>

					</ul>
				</nav>
			</div>


		</div>
		<div id="content">content</div>
		<div id="footer">
			<p class="copyright">
				Copyright � 2010 to Joseph Kelly Tusoy All rights reserved. This
				website is made in partial fulfillment <br /> for the course
				CS402-Web Programming.
			</p>
		</div>
	</div>
</body>

</html>
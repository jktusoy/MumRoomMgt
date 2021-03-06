<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- Student Profile form 
Author: Binyam Heyi
March 20,2018
FF, IA
 -->

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Arrival Form</title>
<link
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<link rel="stylesheet"
	href='<c:url value="/etc/css/studentProfile.css"/>' id="bootstrap-css">
<script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.3.1.min.js"></script>
</head>
<body>


	<div class="container">

		<h1 class="well">Arrival Form</h1>

		<div class="col-lg-12 well">
			<div class="row">
				<form>
					<div class="col-sm-12">

						<div class="row">
							<div class="col-sm-6 form-group">
								<label>First Name</label> <input type="text"
									placeholder="Enter First Name Here.." class="form-control">
							</div>
							<div class="col-sm-6 form-group">
								<label>Last Name</label> <input type="text"
									placeholder="Enter Last Name Here.." class="form-control">
							</div>
						</div>

						<div class="row">
							<div class="col-sm-4 form-group">
								<label>Building</label> <input type="text"
									placeholder="Building.." class="form-control">
							</div>
							<div class="col-sm-4 form-group">
								<label>Room Number</label> <input type="text"
									placeholder="Room Number.." class="form-control">
							</div>

						</div>
						<div class="row">

							<div class="col-sm-6 form-group">
								<label>Department</label> <input type="text"
									placeholder="Department.." class="form-control">
							</div>
						</div>
						<div class="form-group">
							<label>Phone Number</label> <input type="text"
								placeholder="Phone Number.." class="form-control">
						</div>
						<div class="form-group">
							<label>Email Address</label> <input type="text"
								placeholder="Email.." class="form-control">
						</div>
						<div class="row items">
							<h3 class="items">FURTURE ITEMS</h3>
							<div class="col-sm-4 form-group">
								<label>Bed Frames</label>
								<div class="form-check">
									<div>
										<input class="form-check-input" type="radio"
											name="exampleRadios" id="exampleRadios1" value="option1"
											checked> <label class="form-check-label"
											for="exampleRadios1"> Good </label>
									</div>
									<div class="form-check">
										<input class="form-check-input" type="radio"
											name="exampleRadios" id="exampleRadios2" value="option2">
										<label class="form-check-label" for="exampleRadios2">
											Bad </label>
									</div>
									<div class="form-check disabled">
										<input class="form-check-input" type="radio"
											name="exampleRadios" id="exampleRadios3" value="option3">
										<label class="form-check-label" for="exampleRadios3">
											Absent </label>
									</div>
								</div>

							</div>
							<div class="col-sm-4 form-group">
								<label>Mattress</label>
								<div class="form-check">
									<div>
										<input class="form-check-input" type="radio"
											name="exampleRadios1" id="exampleRadios1" value="option1"
											checked> <label class="form-check-label"
											for="exampleRadios"> Good </label>
									</div>
									<div class="form-check">
										<input class="form-check-input" type="radio"
											name="exampleRadios1" id="exampleRadios2" value="option2">
										<label class="form-check-label" for="exampleRadios">
											Bad </label>
									</div>
									<div class="form-check disabled">
										<input class="form-check-input" type="radio"
											name="exampleRadios1" id="exampleRadios3" value="option3">
										<label class="form-check-label" for="exampleRadios">
											Absent </label>
									</div>
								</div>

							</div>
							<div class="col-sm-4 form-group">
								<label>Book Shelf</label>
								<div class="form-check">
									<div>
										<input class="form-check-input" type="radio"
											name="exampleRadios2" id="exampleRadios1" value="option1"
											checked> <label class="form-check-label"
											for="exampleRadios"> Good </label>
									</div>
									<div class="form-check">
										<input class="form-check-input" type="radio"
											name="exampleRadios2" id="exampleRadios2" value="option2">
										<label class="form-check-label" for="exampleRadios">
											Bad </label>
									</div>
									<div class="form-check disabled">
										<input class="form-check-input" type="radio"
											name="exampleRadios2" id="exampleRadios3" value="option3">
										<label class="form-check-label" for="exampleRadios">
											Absent </label>
									</div>
								</div>

							</div>

						</div>
						<div class="row items">
							<h3 class="items">ROOM</h3>
							<div class="col-sm-4 form-group">
								<label>Windows</label>
								<div class="form-check">
									<div>
										<input class="form-check-input" type="radio"
											name="exampleRadios3" id="exampleRadios1" value="option1"
											checked> <label class="form-check-label"
											for="exampleRadios1"> Good </label>
									</div>
									<div class="form-check">
										<input class="form-check-input" type="radio"
											name="exampleRadios3" id="exampleRadios2" value="option2">
										<label class="form-check-label" for="exampleRadios2">
											Bad </label>
									</div>
									<div class="form-check disabled">
										<input class="form-check-input" type="radio"
											name="exampleRadios3" id="exampleRadios3" value="option3">
										<label class="form-check-label" for="exampleRadios3">
											Absent </label>
									</div>
								</div>

							</div>
							<div class="col-sm-4 form-group">
								<label>Blinds</label>
								<div class="form-check">
									<div>
										<input class="form-check-input" type="radio"
											name="exampleRadios4" id="exampleRadios1" value="option1"
											checked> <label class="form-check-label"
											for="exampleRadios"> Good </label>
									</div>
									<div class="form-check">
										<input class="form-check-input" type="radio"
											name="exampleRadios4" id="exampleRadios2" value="option2">
										<label class="form-check-label" for="exampleRadios">
											Bad </label>
									</div>
									<div class="form-check disabled">
										<input class="form-check-input" type="radio"
											name="exampleRadios4" id="exampleRadios3" value="option3">
										<label class="form-check-label" for="exampleRadios">
											Absent </label>
									</div>
								</div>

							</div>
							<div class="col-sm-4 form-group">
								<label>Floors</label>
								<div class="form-check">
									<div>
										<input class="form-check-input" type="radio"
											name="exampleRadios2" id="exampleRadios1" value="option1"
											checked> <label class="form-check-label"
											for="exampleRadios"> Carpet </label>
									</div>
									<div class="form-check">
										<input class="form-check-input" type="radio"
											name="exampleRadios2" id="exampleRadios2" value="option2">
										<label class="form-check-label" for="exampleRadios">
											Tile </label>
									</div>
									<div class="form-check disabled">
										<input class="form-check-input" type="radio"
											name="exampleRadios2" id="exampleRadios3" value="option3">
										<label class="form-check-label" for="exampleRadios">
											None </label>
									</div>
								</div>

							</div>

						</div>

						<strong>Move In Date: </strong> <input id="date" type="date">
						<br> <input type="checkbox" name="checkbox" value="check"
							id="agree" /> I have read and agree to the Terms and Conditions
						of the residence life. <br>
						<button type="button" class="btn btn-lg btn-info">Submit</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</html>
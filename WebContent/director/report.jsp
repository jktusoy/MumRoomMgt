<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    
    <link rel="stylesheet" href='<c:url value="/etc/css/report.css"/>' id="bootstrap-css">
    
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    
    <script src="http://code.jquery.com/jquery-2.1.1.min.js"></script>
    
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
    
    
    <title>Report Generation</title>

</head>
<body>
<div class="container">
	<div class="row">
	<div class="col-md-6">
        <!-- Nav tabs -->
        <div class="card">
            <ul class="nav nav-tabs" role="tablist">
                <li role="presentation" class="active">
                        <li class="dropdown">
                                
                                <a class="dropdown-toggle" data-toggle="dropdown" href="#">Room Status <span class="caret"></span></a>
                                <ul class="dropdown-menu">
                                  <li><a href="#home">Available</a></li>
                                  <li><a href="#home">Occupied</a></li>
                                  <li><a href="#home">On Maintainance</a></li>                        
                                </ul>
                        </li>     
                </a></li>
                <li role="presentation"><a href="#profile" aria-controls="profile" role="tab" data-toggle="tab">Facility Per Room</a></li>
                <li role="presentation"><a href="#messages" aria-controls="messages" role="tab" data-toggle="tab">Room Transfer</a></li>
                <li role="presentation"><a href="#settings" aria-controls="settings" role="tab" data-toggle="tab">Graphs</a></li>
            </ul>

 <!-- Tab panes -->
            <div class="tab-content">
                <div role="tabpanel" class="tab-pane active" id="home">Room Status</div>
                <div role="tabpanel" class="tab-pane" id="profile">Facility for Room</div>
                <div role="tabpanel" class="tab-pane" id="messages">Room Transfer</div>
                <div role="tabpanel" class="tab-pane" id="settings">Graphs</div>
            </div>

         </div>
    </div>
</div>

    
</div>
</body>
</html>
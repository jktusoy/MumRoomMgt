$(document).ready(function(){
	 
		$('#roomsList').click(function(){
			 console.log('I was clicked');
			 $('#generalContent').show();
		});
	 
    	$('#nav_profile').click(function() {
    		$('#profileContent').show();
    		$('#roomsContent').hide();
    		$('#departureContent').hide();
    		$('#reportContent').hide();  	 
    	
    	 
    		$.ajax({
    			url : 'http://localhost:8080/RoomMgtApp/student',
    			success : function(result) {
    				$("#sprof-firstname").val(result.name);
    				$("#sprof-lastname").val(result.lastName);
    				$("#sprof-email").val(result.email);
    				$("#sprof-phone").val(result.phone);
    				$("#sprof-bldgno").val("140");
    				$("#sprof-roomno").val("101");  	
    			}
    		});

    	});
    	
    
    	$('#nav_rooms').click(function() {
    		$('#profileContent').hide();
    		$('#roomsContent').show();
    		$('#departureContent').hide();
    		$('#reportContent').hide();  
    		$('#studentContent').hide();  	
    	});
    	
    	
    	

    	$('#nav_student').click(function() {
    		$('#profileContent').hide();
    		$('#roomsContent').hide();
    		$('#departureContent').hide();
    		$('#reportContent').hide();  	
    		$('#studentContent').show();  	
    	});
    	
    	
    	 
    	$('#nav_departure').click(function() {
    		$('#profileContent').hide();
    		$('#roomsContent').hide();
    		$('#departureContent').show();
    		$('#reportContent').hide();  	
    		$('#studentContent').hide();  	
    	});
    	
    	
    	$('#nav_report').click(function() {
    		$('#profileContent').hide();
    		$('#roomsContent').hide();
    		$('#departureContent').hide();
    		$('#reportContent').show();  
    		$('#studentContent').hide();  	
    	});
    

});
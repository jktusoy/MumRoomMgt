$(document).ready(function(){
	 

    $('#roomsList').click(function(){

    	 $('#generalContent').show();
    });
    
    
    
 
    	$('#nav_profile').click(function() {
    		$('#profileContent').show();
    		$('#requestContent').hide();
    		$('#arrivalContent').hide();
    	
    	 
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
    	
    
    

});
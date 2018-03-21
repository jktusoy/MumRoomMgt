/**
 * @version 1.0 18 March 2018
 * @author Joseph Kelly Tusoy
 */


$(document).ready(function(){  
	
	 		    
		$("#jqGridReport1").jqGrid(
				{
					url : "http://localhost:8080/RoomMgtApp/report",
					mtype: "POST",
					datatype : "json",
					height : 'auto',
					colNames : [ 'roomNumber', 'bldgNumber', 'roomStatus', 'occupiedBy', 'occupiedSince',
							'notes'],
					colModel : [ {
						name : 'roomNumber',
						index : 'roomNumber',
						hidden : true,
						key : true,
						search : false
					}, {
						name : 'bldgNumber',
						index : 'bldgNumber',
					}, {
						name : 'roomStatus',
						index : 'roomStatus',
					}, {
						name : 'occupiedBy',
						index : 'occupiedBy',
					}, {
						name : 'occupiedSince',
						index : 'occupiedSince',
					}, {
						name : 'notes',
						index : 'notes',
					} ],
					cmTemplate : {
						editable : true
					},
					multiselect : false,
					paging : true,
					loadonce : true,
					sortname : 'Last Name',
					rowList : [],
					pager : $("#page"),
					viewrecords : true,
					pgbuttons : true,
					pgtext : null,
					rowNum : 10,
					pager : "#jqGridPageReport1"
				});

		$('#jqGridReport1').navGrid('#jqGridPageReport1',
		// the buttons to appear on the toolbar of the grid
		{
			edit : true,
			add : true,
			del : true,
			search : false,
			refresh : false,
			view : false,
			position : "left",
			cloneToTop : false
		},
		// options for the Edit Dialog
		{
			editCaption : "The Edit Dialog",
			recreateForm : true,
			//checkOnUpdate : true,
			//checkOnSubmit : true,
			beforeSubmit : function(postdata, form, oper) {
				if (confirm('Are you sure you want to update this row?')) {
					// do something
					return [ true, '' ];
				} else {
					return [ false, 'You can not submit!' ];
				}
			},
			closeAfterEdit : true,
			errorTextFormat : function(data) {
				return 'Error: ' + data.responseText
			}
		},
		// options for the Add Dialog
		{
			closeAfterAdd : true,
			recreateForm : true,
			errorTextFormat : function(data) {
				return 'Error: ' + data.responseText
			}
		},
		// options for the Delete Dailog
		{
			errorTextFormat : function(data) {
				return 'Error: ' + data.responseText
			}

		});
    

});
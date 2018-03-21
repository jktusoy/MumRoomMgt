

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Reports</title>

<link href="../etc/css/report.css" type="text/css" rel="stylesheet"></link>

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.11.4/themes/redmond/jquery-ui.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/free-jqgrid/4.15.3/css/ui.jqgrid.min.css">
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/free-jqgrid/4.15.3/jquery.jqgrid.min.js"></script>

<script>
	//<![CDATA[
	$(function() {
		"use strict";

		$("#jqGrid").jqGrid(
				{
					url : "http://localhost:8080/RoomMgtApp/report",
					data : {"report type": "1"},
					mtype: "POST",
					datatype : "json",
					height : 'auto',
					colNames : [ 'id', 'lastName', 'name', 'email', 'phone',
							'sex', 'nationality' ],
					colModel : [ {
						name : 'Id',
						index : 'id',
						hidden : true,
						key : true,
						search : false
					}, {
						name : 'name',
						index : 'name',
					}, {
						name : 'lastName',
						index : 'lastName',
					}, {
						name : 'email',
						index : 'email',
					}, {
						name : 'phone',
						index : 'phone',
					}, {
						name : 'sex',
						index : 'sex',
					}, {
						name : 'nationality',
						index : 'nationality',
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
					pager : "#jqGridPager"
				});

		$('#jqGrid').navGrid('#jqGridPager',
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
</script>
</head>
</head>
<body>
	<table id="jqGrid"></table>
	<div id="jqGridPager"></div>
</body>
</html>






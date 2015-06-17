<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://javadomainobjects.org/tags/ember" prefix="ember"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Customer Relationship Management</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../favicon.ico">
<link rel="stylesheet" href="css/normalize.css">
<link rel="stylesheet" href="css/style.css">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">

</head>
<body role="document">
	<script type="text/x-handlebars">
		<%@ include file="template.jsp"%>		
	</script>

	<script type="text/x-handlebars" id="index">
		<%@ include file="customers/index.jsp"%>
	</script>

	<script type="text/x-handlebars" id="customers/create">
		<%@ include file="customers/create.jsp" %> 
	</script>
	
	<script type="text/x-handlebars" id="customers/edit">
		<%@ include file="customers/edit.jsp" %> 
	</script>


	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<script src="js/libs/handlebars-v2.0.0.js"></script>
	<script src="js/libs/ember-1.9.0.js"></script>
	<script src="js/libs/ember-data-1.0.0-beta.11.js"></script>
	<script src="http://builds.emberjs.com/release/ember.min.js"></script>
	<script src="js/app.js"></script>
	<script src="js/models.js"></script>
	<script src="js/controllers.js"></script>
	<script src="js/routes.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
	<!-- to activate the test runner, add the "?test" query string parameter -->
	<script src="tests/runner.js"></script>
</body>
</html>

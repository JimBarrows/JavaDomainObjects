<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<%@ page session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Contacts</title>
<link rel="stylesheet"
	href="<c:url value="/resources/blueprint/screen.css" />"
	type="text/css" media="screen, projection">
<link rel="stylesheet"
	href="<c:url value="/resources/blueprint/print.css" />" type="text/css"
	media="print">
<!--[if lt IE 8]>
			<link rel="stylesheet" href="<c:url value="/resources/blueprint/ie.css" />" type="text/css" media="screen, projection">
		<![endif]-->
<link rel="stylesheet" href="<c:url value="/resources/popup.css" />"
	type="text/css" media="screen, projection">
<script type="text/javascript"
	src="<c:url value="/resources/jquery-1.4.min.js" /> "></script>
<script type="text/javascript"
	src="<c:url value="/resources/json.min.js" /> "></script>

</head>
<body>
	<div class="container">
		<h1>Contacts</h1>
		<div class="actionButtons">
			<button name="createPerson">Create Person</button>
			<button name="createOrganization">Create
				Group/Company/Organization</button>
		</div>
		<div class="span-6 ">
			<h2>John Smith</h2>
			<div class="address">
				123 somewhere street <br />phoenix, az 85037
			</div>
			<div class="contactMechanism">
				<div class="phone">602-111-1234</div>
				<div class="emai">John@somewhere.com</div>
			</div>
		</div>
		<div class="span-6 ">
			<h2>John Smith</h2>
			<div class="address">
				123 somewhere street <br /> phoenix, az 85037
			</div>
			<div class="contactMechanism">
				<div class="phone">602-111-1234</div>
				<div class="emai">John@somewhere.com</div>
			</div>
		</div>
		<div class="span-6 ">
			<h2>John Smith</h2>
			<div class="address">
				123 somewhere street <br /> phoenix, az 85037
			</div>
			<div class="contactMechanism">
				<div class="phone">602-111-1234</div>
				<div class="emai">John@somewhere.com</div>
			</div>
		</div>
		<div class="span-6 last">
			<h2>John Smith</h2>
			<div class="address">
				123 somewhere street <br /> phoenix, az 85037
			</div>
			<div class="contactMechanism">
				<div class="phone">602-111-1234</div>
				<div class="emai">John@somewhere.com</div>
			</div>
		</div>
		<div class="span-6 ">
			<h2>John Smith</h2>
			<div class="address">
				123 somewhere street <br /> phoenix, az 85037
			</div>
			<div class="contactMechanism">
				<div class="phone">602-111-1234</div>
				<div class="emai">John@somewhere.com</div>
			</div>
		</div>
		<div class="span-6 ">
			<h2>John Smith</h2>
			<div class="address">
				123 somewhere street <br /> phoenix, az 85037
			</div>
			<div class="contactMechanism">
				<div class="phone">602-111-1234</div>
				<div class="emai">John@somewhere.com</div>
			</div>
		</div>
	</div>
</body>
</html>
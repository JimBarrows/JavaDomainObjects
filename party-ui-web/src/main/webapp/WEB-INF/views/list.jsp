<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<%@ page session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="layout" tagdir="/WEB-INF/tags"%>
<layout:mainLayout>
	<h1>Contacts</h1>
	<div class="actionButtons">
		<button name="createPerson">Create Person</button>
		<button name="createOrganization">Create Group</button>
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
</layout:mainLayout>

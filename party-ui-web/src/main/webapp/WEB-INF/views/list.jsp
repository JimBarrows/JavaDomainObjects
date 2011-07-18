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
	<h2>Page Number: ${pageNumber}</h2>

	<c:forEach items="${partyList }" var="party" varStatus="status">
		<c:choose>
			<c:when test="${ (status.count % numberOfColumns) eq 0 }">
				<c:set var="classes" value="span-6 last"/>
			</c:when>
			<c:otherwise>
				<c:set var="classes" value="span-6"/>
			</c:otherwise>
		</c:choose>
		<div class="${classes } ">
			<h2>
				<c:choose>
					<c:when test="${party.class.simpleName eq 'Person' }">
						${party.firstName} ${party.middleName } ${party.lastName }
					</c:when>
					<c:otherwise>
						${party.name }
					</c:otherwise>
				</c:choose>
			</h2>
			<div class="address">
				123 somewhere street <br />Phoenix, az 85037
			</div>
			<div class="contactMechanism">
				<div class="phone">602-111-1234</div>
				<div class="emai">John@somewhere.com</div>
			</div>
		</div>
	</c:forEach>

</layout:mainLayout>

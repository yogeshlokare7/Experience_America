<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<script type="text/javascript" src="${contextPath}/js/jquery-1.12.4.js"></script>
<title>Printer Add Dashbaord</title>
<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
<h3>Users List</h3>
<c:if test="${!empty users}">
	<table class="tg">
	<tr>
		<th width="80">Id</th>
		<th width="120">Name</th>
		<th width="120">Email</th>
		<th width="60">Edit</th>
		<th width="60">Delete</th>
	</tr>
	<c:forEach items="${users}" var="user">
		<tr>
			<td>${user.id}</td>
			<td>${user.firstName} ${user.lastName}</td>
			<td>${user.userEmail}</td>
			<td><a href="<c:url value='/update-user/${user.id}' />" >Edit</a></td>
			<td><a href="<c:url value='/delete-user/${user.id}' />" >Delete</a></td>
		</tr>
	</c:forEach>
	</table>
</c:if>
</tiles:putAttribute>
</tiles:insertDefinition>
<script src="${pageContext.request.contextPath}/resources/css/jquery/dist/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/css/bootstrap/dist/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/css/fastclick/lib/fastclick.js"></script>
<script src="${pageContext.request.contextPath}/resources/css/nprogress/nprogress.js"></script>
<script src="${pageContext.request.contextPath}/resources/css/build/js/custom.min.js"></script>
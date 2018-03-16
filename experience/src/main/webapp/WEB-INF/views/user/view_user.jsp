<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<title>Experience</title>
<!-- Datatables -->
<link href="${pageContext.request.contextPath}/resources/css/datatables.net-bs/css/dataTables.bootstrap.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/css/datatables.net-buttons-bs/css/buttons.bootstrap.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/css/datatables.net-fixedheader-bs/css/fixedHeader.bootstrap.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/css/datatables.net-responsive-bs/css/responsive.bootstrap.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/css/datatables.net-scroller-bs/css/scroller.bootstrap.min.css" rel="stylesheet">
<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<h3>Users List</h3>

		<div class="x_content">
			<table id="datatable" class="table table-striped table-bordered">
				<thead>
					<tr>
					<th></th>
					<th></th>
						<th>Id</th>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Email</th>
						<th>ContactNo</th>
						<!-- <th>UserRole</th> -->
						<th>User Role</th>
					<!-- 	<th>LastLogin</th> -->
						<!--   <th>AssignRoles</th> -->
					</tr>
				</thead>
				<c:forEach items="${users}" var="user">
					<tr>
					<td style="width: 1%"><img class="actionicons" src="${pageContext.request.contextPath}/resources/images/edit.png" data-toggle="tooltip" data-placement="right" title="Edit"/></td>
					<td style="width: 1%"><a onclick="return confirmAction('Delete')" href="${contextPath}/user/delete/${user.id}"><img class="actionicons" src="${pageContext.request.contextPath}/resources/images/delete-item.png" data-toggle="tooltip"  data-placement="right" title="Delete"/></a></td>
						<td>${user.id}</td>
						<td>${user.firstname}</td>
						<td>${user.lastname}</td>
						<td>${user.useremail}</td>
						<td>${user.contactNo}</td>
						<td>${user.assignroles}</td>
					<%-- 	<td>${user.userrole}</td> --%>
					<%--	<td>${user.userenabled}</td> --%>
						<%-- <td>${user.lastlogin}</td> --%>
						<%--  <td>${user.assignroles}</td> --%>
					</tr>
				</c:forEach>
				</tbody>
			</table>
			<div>
				<button type="button" class="btn btn-primary" data-toggle="modal" data-target=".bs-example-modal-lg">Create User</button>
			</div>
		</div>


		<!-- model form -->
		<div class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" aria-hidden="true">
			<div class="modal-dialog modal-lg">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">
							<span aria-hidden="true">�</span>
						</button>
						<h4 class="modal-title" id="myModalLabel">Create User</h4>
					</div>
					<div class="modal-body">
					<form method="POST" action="${contextPath}/user/save">
						<div class="row form-horizontal form-label-left">
							<div class="form-group">
								<label class="control-label col-md-2 col-sm-2 col-xs-12" for="firstname">First Name<span class="required">*</span></label>
								<div class="col-md-9 col-sm-10 col-xs-12">
									<input type="text" id="firstname" name="firstname" required="required" class="form-control col-md-7 col-xs-12" autofocus="true" placeholder="First Name" minlength="2" maxlength="30">
								</div>
							</div>
							<div class="form-group">
								<label class="control-label col-md-2 col-sm-2 col-xs-12" for="lastname">Last Name <span class="required">*</span></label>
								<div class="col-md-9 col-sm-10 col-xs-12">
									<input type="text" id="lastname" name="lastname" required="required" class="form-control col-md-7 col-xs-12" autofocus="true" placeholder="Last Name" minlength="2" maxlength="30">
								</div>
							</div>
							<div class="form-group">
								<label class="control-label col-md-2 col-sm-2 col-xs-12" for="Email">Email <span class="required">*</span></label>
								<div class="col-md-9 col-sm-10 col-xs-12">
									<input type="email" id="email" name="useremail" required="required" class="form-control col-md-7 col-xs-12" autofocus="true" placeholder="Email" minlength="2" maxlength="30">
								</div>
							</div>
							<div class="form-group">
								<label class="control-label col-md-2 col-sm-2 col-xs-12" for="ContactNo">Contact No<span class="required">*</span></label>
								<div class="col-md-9 col-sm-10 col-xs-12">
									<input type="tel" id="ContactNo" name="ContactNo" required="required" class="form-control col-md-7 col-xs-12" autofocus="true" placeholder="Contact No" minlength="2" maxlength="30">
								</div>
							</div>
							<div class="form-group">
								<label class="control-label col-md-2 col-sm-2 col-xs-12" for="assignroles">User Role<span class="required">*</span></label>
								<div class="col-md-9 col-sm-10 col-xs-12">
								 <select id="assignroles" class="form-control col-md-7 col-xs-12" required name="assignroles">
                            		<option value="">Choose..</option>
                           			 <option value="press">Student</option>
                            		<option value="net">Volunteer</option>
                            		<option value="mouth">3rd Party</option>
                          		</select>
								<!-- 	<input type="text" id="userrole" required="required" class="form-control col-md-7 col-xs-12"> -->
								</div>
							</div>
							</div>
							<div class="modal-footer">
                          			<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                          			<button type="submit" class="btn btn-primary">Save changes</button>
                    		</div>
                       </form>
					</div>
				</div>
			</div>
			<!--  -->
		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>
<script type="text/javascript">

</script>
<script src="${pageContext.request.contextPath}/resources/css/jquery/dist/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/css/bootstrap/dist/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/css/fastclick/lib/fastclick.js"></script>
<script src="${pageContext.request.contextPath}/resources/css/nprogress/nprogress.js"></script>
<script src="${pageContext.request.contextPath}/resources/css/build/js/custom.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/css/iCheck/icheck.min.js"></script>
<!-- Datatables -->
<script src="${pageContext.request.contextPath}/resources/css/datatables.net/js/jquery.dataTables.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/css/datatables.net-bs/js/dataTables.bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/css/datatables.net-buttons/js/dataTables.buttons.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/css/datatables.net-buttons-bs/js/buttons.bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/css/datatables.net-buttons/js/buttons.flash.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/css/datatables.net-buttons/js/buttons.html5.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/css/datatables.net-buttons/js/buttons.print.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/css/datatables.net-fixedheader/js/dataTables.fixedHeader.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/css/datatables.net-keytable/js/dataTables.keyTable.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/css/datatables.net-responsive/js/dataTables.responsive.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/css/datatables.net-responsive-bs/js/responsive.bootstrap.js"></script>
<script src="${pageContext.request.contextPath}/resources/css/datatables.net-scroller/js/dataTables.scroller.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/css/jszip/dist/jszip.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/css/pdfmake/build/pdfmake.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/css/pdfmake/build/vfs_fonts.js"></script>
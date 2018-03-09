<div class="navbar nav_title" style="border: 0;">
	<a href="index.html" class="site_title"><i class="fa fa-paw"></i> <span>Experience</span></a>
</div>
<div class="clearfix"></div>
<div class="profile clearfix">
	<div class="profile_pic">
		<img src="${pageContext.request.contextPath}/resources/images/img.jpg" alt="..." class="img-circle profile_img">
	</div>
	<div class="profile_info">
		<span>Welcome,</span>
		<h2>User</h2>
	</div>
</div>
<br />
<div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
	<div class="menu_section">
		<h3>General</h3>
		<ul class="nav side-menu">
			<li>
				<a><i class="fa fa-home"></i>Dash Board & Report<span class="fa fa-chevron-down"></span></a>
				<ul class="nav child_menu">
					<li><a href="${pageContext.request.contextPath}/dashboard">Dash Board</a></li>
					<li><a href="${pageContext.request.contextPath}/viewreport1">Report-1</a></li>
					<li><a href="${pageContext.request.contextPath}/viewreport2">Report-2</a></li>
				</ul>
			</li>
				
			<li>
				<a><i class="fa fa-edit"></i>User Management<span class="fa fa-chevron-down"></span></a>
				<ul class="nav child_menu">
					<li><a href="${pageContext.request.contextPath}/role/view">Role Management</a></li>
					<li><a href="${pageContext.request.contextPath}/permission/view">Permission Management</a></li>
					<li><a href="${pageContext.request.contextPath}/user/view">User Management</a></li>
				</ul>
			</li>
				
			<li>
				<a><i class="fa fa-edit"></i>Presenter Profile<span class="fa fa-chevron-down"></span></a>
				<ul class="nav child_menu">
					<li><a href="${pageContext.request.contextPath}/presenterprofile/view">Presenter</a></li>
					<li><a href="${pageContext.request.contextPath}/presenterevent/view">Presenter Events</a></li>
				</ul>
			</li>
			
			<li>
				<a><i class="fa fa-edit"></i>Candidate Management<span class="fa fa-chevron-down"></span></a>
				<ul class="nav child_menu">
					<li><a href="${pageContext.request.contextPath}/candidate/add">Candidate</a></li>
					<li><a href="${pageContext.request.contextPath}/candidate/add">Candidate Event</a></li>
				</ul>
			</li>
			
			<li>
				<a><i class="fa fa-edit"></i>Volunteer and Manager<span class="fa fa-chevron-down"></span></a>
				<ul class="nav child_menu">
					<li><a href="${pageContext.request.contextPath}/volunteermanager/view/volunteer">Volunteer</a></li>
					<li><a href="${pageContext.request.contextPath}/volunteermanager/view/manager">Manager</a></li>
				</ul>
			</li>
			
			
				
		</ul>
	</div>
</div>
<div class="sidebar-footer hidden-small">
	<a data-toggle="tooltip" data-placement="top" title="Settings"> <span class="glyphicon glyphicon-cog" aria-hidden="true"></span>
	</a> <a data-toggle="tooltip" data-placement="top" title="FullScreen"> <span class="glyphicon glyphicon-fullscreen" aria-hidden="true"></span>
	</a> <a data-toggle="tooltip" data-placement="top" title="Lock"> <span class="glyphicon glyphicon-eye-close" aria-hidden="true"></span>
	</a> <a data-toggle="tooltip" data-placement="top" title="Logout" href="login.html"> <span class="glyphicon glyphicon-off" aria-hidden="true"></span>
	</a>
</div>


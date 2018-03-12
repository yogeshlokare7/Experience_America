<!DOCTYPE HTML>
<html>
<head>
<title>Experience Login</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<link href="${pageContext.request.contextPath}/resources/login/style.css" rel="stylesheet" type="text/css" media="all" />
<script src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/easyResponsiveTabs.js" type="text/javascript"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$('#horizontalTab').easyResponsiveTabs({
			type : 'default', //Types: default, vertical, accordion           
			width : 'auto', //auto or any width like 600px
			fit : true
		// 100% fit in a container
		});

	});

	function myfun() {
		windows.location.assign("${pageContext.request.contextPath}/hello")
	}
</script>
</head>
<body>
	<div class="head">
		<div class="logo">
			<div class="logo-top">
				<h1>Experience</h1>
			</div>
			<div class="logo-bottom">
				<section class="sky-form">
					<label class="radio"> <input type="radio" name="radio" checked /><i></i>Admin Section
					</label> <label class="radio"> <input type="radio" name="radio" /><i></i>User Section
					</label> <label class="radio"> <input type="radio" name="radio" /><i></i>Marketplace Section
					</label>
				</section>
			</div>
		</div>
		<div class="login">
			<div class="sap_tabs">
				<div id="horizontalTab" style="display: block; width: 100%; margin: 0px;">
					<ul class="resp-tabs-list">
						<li class="resp-tab-item" aria-controls="tab_item-0" role="tab"><span>Sign In</span></li>
						<div class="clearfix"></div>
					</ul>
					<div class="resp-tabs-container">
						<div class="tab-1 resp-tab-content" aria-labelledby="tab_item-0">
							<div class="login-top">
								<form method="post" action="${pageContext.request.contextPath}/login">
									<input type="text" class="email" name="useremail" placeholder="Email Id / Username " required /> 
									<input type="password" class="password" name="userpwd" placeholder="Password" required />
									<div class="login-bottom login-bottom1">
										<div class="submit">
											<input type="submit" name="btnLogin" value="Login"/> 
											<input type="submit" name="btnLogin" value="Forgot Password"/>
										</div>
										<div class="clear"></div>
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="clear"></div>
	</div>
	<div class="account">
		<ul>
			<!-- <li><p>Don't have an <a href="#">account?</a></p></li> -->
			<li><p>
					Forgot <a href="${pageContext.request.contextPath}/reset">password?</a>
				</p></li>
			<div class="clear"></div>
		</ul>
	</div>
	<div class="footer">
		<p>Experience</p>
	</div>
</body>
</html>

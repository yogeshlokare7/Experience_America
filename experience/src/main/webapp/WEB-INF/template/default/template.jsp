<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Experience America</title>
<link href="${pageContext.request.contextPath}/resources/css/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/css/font-awesome/css/font-awesome.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/css/nprogress/nprogress.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/css/build/css/custom.min.css" rel="stylesheet">
</head>
<body class="nav-md">
	<div class="container body">
		<div class="main_container">
			<div class="col-md-3 left_col">
          		<div class="left_col scroll-view">
					<tiles:insertAttribute name="menu" />
				</div>
			</div>
			<!-- top navigation -->
        	<div class="top_nav">
          		<div class="nav_menu">
            		<nav>
						<tiles:insertAttribute name="header" />
					</nav>
				</div>
			</div>
			<div class="right_col" role="main">
				<tiles:insertAttribute name="body"/>
			</div>
			<tiles:insertAttribute name="footer"/>
		</div>
	</div>
</body>
</html>
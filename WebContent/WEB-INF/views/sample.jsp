<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Profile</title>

<!-- Website logo icon -->
<link rel="icon" href="${pageContext.request.contextPath}/resources/images/site-logo.png" type="image/gif" sizes="16x16">

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="<c:url value='/resources/css/bootstrap.3.3.7.min.css'/>">

<!-- Google font -->
<link href="https://fonts.googleapis.com/css?family=Share" rel="stylesheet">

<!-- Font awesome -->
<link rel="stylesheet" href="<c:url value='/resources/css/font-awesome.min.css'/>">

<!-- iHover -->
<link rel="stylesheet" href="<c:url value='/resources/css/custom/global.css'/>">

</head>
<body>
	<div class="panel-heading">
		<nav class="navbar navbar-inverse navbar-fixed-top">
			<div class="container-fluid">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
					<a class="navbar-brand aq-brand-head" href="${pageContext.request.contextPath}/welcome"><span class="fa fa-gear fa-spin aq-login-spin"></span> Authoring Tool</a>
				</div>
				<div class="collapse navbar-collapse" id="myNavbar">
					<ul class="nav navbar-nav">
					</ul>
					<ul class="nav navbar-nav navbar-right">
						<li><a href="#"><span class="fa fa-user-circle fa-1x" aria-hidden="true"></span> <sec:authentication property="principal.nameOfUser"/> </a></li>
						<li><a href="${pageContext.request.contextPath}/logout"><span class="fa fa-power-off fa-1x" aria-hidden="true"></span> Logout</a></li>
					</ul>
				</div>
			</div>
		</nav>
	</div>
	
	<div class="panel-body">	
	</div>
	
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- Viewport Meta Tag -->
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>User Login</title>

<!-- Website logo icon -->
<link rel="icon" href="${pageContext.request.contextPath}/resources/images/site-logo.png" type="image/gif" sizes="16x16">

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="<c:url value='/resources/css/bootstrap.3.3.7.min.css'/>">

<!-- Google font -->
<link href="https://fonts.googleapis.com/css?family=Share" rel="stylesheet">

<!-- Font awesome -->
<link rel="stylesheet" href="<c:url value='/resources/css/font-awesome.min.css'/>">

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
					<a class="navbar-brand aq-brand-head" href="${pageContext.request.contextPath}/home"><span class="fa fa-gear fa-spin aq-login-spin"></span> Authoring Tool</a>
				</div>
				<div class="collapse navbar-collapse" id="myNavbar">
					<ul class="nav navbar-nav">
						<li><a href="${pageContext.request.contextPath}/home">Home</a></li>
					</ul>
					<ul class="nav navbar-nav navbar-right">
						<li class="active"><a href="${pageContext.request.contextPath}/login"><span class="fa fa-sign-in fa-1x" aria-hidden="true"></span> Login</a></li>
						<li><a href="${pageContext.request.contextPath}/register/user"><span class="fa fa-user-circle fa-1x" aria-hidden="true"></span> Sign Up</a></li>
					</ul>
				</div>
			</div>
		</nav>
	</div>

	<div class="panel-body">	
		<div class="container">
			<c:set value="login/processLogin" var="loginProcessingUrl"/>
			<s:form action="${ loginProcessingUrl }" id="userLoginForm">
				<div class="row">
					<div class="col-sm-12">
						<div class="row">
							<div class="col-sm-12">
								<h4 class="aq-error">
									<c:if test="${not empty serverMessage}">
										${serverMessage}
									</c:if>
								</h4>
							</div>
						</div>
					</div>
				</div>
				
				<div class="row">
					<div class="col-sm-12">
						<div class="row">
							<div class="col-sm-4"></div>
							<div class="col-sm-4">
								<div class="form-group">
									<label>Username : </label>
									<input type="text" class="form-control" name="userId" id="userId" oninput="changeEmptyFieldStatus(this);">
								</div>
							</div>
							<div class="col-sm-4"></div>
						</div>
					</div>
				</div>
				
				<div class="row">
					<div class="col-sm-12">
						<div class="row">
							<div class="col-sm-4"></div>
							<div class="col-sm-4">
								<div class="form-group">
									<label>Password : </label>
									<input type="password" class="form-control" name="password" id="password" oninput="changeEmptyFieldStatus(this);">
								</div>
							</div>
							<div class="col-sm-4"></div>
						</div>
					</div>
				</div>
				
				<div class="row">
					<div class="col-sm-12">
						<div class="row">
							<div class="col-sm-4"></div>
							<div class="col-sm-4">
								<div class="form-group">
									<button type="submit" id="loginBtn" class="btn btn-primary btn-block aq-login">Login</button>		
								</div>
							</div>
							<div class="col-sm-4"></div>
						</div>
					</div>
				</div>
				
			</s:form>
		</div>
	</div>

<!-- jQuery library -->
<script src="<c:url value='/resources/js/jquery-3.2.1.min.js'/>"></script>

<!-- Tether -->
<script src="<c:url value='/resources/js/tether.min.js'/>"></script>

<!-- Bootstrap JS -->
<script src="<c:url value='/resources/js/bootstrap.3.3.7.min.js'/>"></script>

<script src="<c:url value='/resources/js/custom/global.js'/>"></script>
<script src="<c:url value='/resources/js/custom/user-login.js'/>"></script>

</body>
</html>
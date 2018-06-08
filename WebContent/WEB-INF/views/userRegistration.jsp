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
<noscript>
	<meta http-equiv="refresh" content="0; URL=${requestScope['javax.servlet.forward.query_string']}?noScript=1" />
</noscript>
<title>User Registration</title>

<!-- Website logo icon -->
<link rel="icon" href="${pageContext.request.contextPath}/resources/images/site-logo.png" type="image/gif" sizes="16x16">

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="<c:url value='/resources/css/bootstrap.3.3.7.min.css'/>">

<!-- Google font -->
<link href="https://fonts.googleapis.com/css?family=Share" rel="stylesheet">

<!-- Font awesome -->
<link rel="stylesheet" href="<c:url value='/resources/css/font-awesome.min.css'/>">

<link rel="stylesheet" href="<c:url value='/resources/css/custom/global.css'/>">
<link rel="stylesheet" href="<c:url value='/resources/css/custom/user-registration.css'/>">

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
						<li><a href="${pageContext.request.contextPath}/login"><span class="fa fa-sign-in fa-1x" aria-hidden="true"></span> Login</a></li>
						<li class="active"><a href="${pageContext.request.contextPath}/register/user"><span class="fa fa-user-circle fa-1x" aria-hidden="true"></span> Sign Up</a></li>
					</ul>
				</div>
			</div>
		</nav>
	</div>
	
	<div class="panel-body">
		<div class="container">
			<c:set value="register/user" var="userRegistrationUrl"/>
			<s:form action="${ userRegistrationUrl }" method="post" modelAttribute="registrationModel" id="userRegistrationForm">
				
				<div class="row">
					<div class="col-sm-12">
						<div class="row">
							<div class="col-sm-6">
								<div class="form-group">
									<s:label path="firstName" for="userFirstName">First Name : </s:label>
									<s:input path="firstName" type="text" cssClass="form-control" id="userFirstName" oninput="changeEmptyFieldStatus(this);"/>
								</div>
							</div>
							<div class="col-sm-6">
								<div class="form-group">
									<s:label path="lastName" for="userLastName">Last Name : </s:label>
									<s:input path="lastName" type="text" cssClass="form-control" id="userLastName" oninput="changeEmptyFieldStatus(this);"/>
								</div>
							</div>
						</div>
					</div>
				</div>
				
				<div class="row">
					<div class="col-sm-12">
						<div class="row">
							<div class="col-sm-12">
								<div class="form-group">
									<s:label path="userCredential.userId" for="userId">User Name : </s:label>
									<s:input path="userCredential.userId" type="text" cssClass="form-control" id="userId" aria-describedby="userIdStatus" oninput="changeEmptyFieldStatus(this);"/>
									<small id="userIdStatus" class="text-muted aq-error"></small>
								</div>
							</div>
						</div>
					</div>
				</div>
				
				<div class="row">
					<div class="col-sm-12">
						<div class="row">
							<div class="col-sm-6">
								<div class="form-group">
									<s:label path="userCredential.password" for="userPassword">Password : </s:label>
									<s:password path="userCredential.password" cssClass="form-control" id="userPassword" name="matchPassword" aria-describedby="passwordHelpInline" oninput="changeEmptyFieldStatus(this);"/>
									<small id="passwordHelpInline" class="text-muted"></small>
								</div>
							</div>
							<div class="col-sm-6">
								<div class="form-group">
									<label for="userConfirmPassword">Confirm Password : </label>
									<input type="password" class="form-control" id="userConfirmPassword" name="matchPassword" oninput="changeEmptyFieldStatus(this);">
								</div>
							</div>
						</div>
					</div>
				</div>
				
				<button type="submit" class="btn btn-default aq-signup">Sign Up</button>
				
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
<script src="<c:url value='/resources/js/custom/user-registration.js'/>"></script>

</body>
</html>
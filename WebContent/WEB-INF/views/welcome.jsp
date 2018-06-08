<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Viewport Meta Tag -->
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<noscript>
	<meta http-equiv="refresh" content="0; URL=${requestScope['javax.servlet.forward.query_string']}?noScript=1" />
</noscript>
<title>Welcome</title>

<!-- Website logo icon -->
<link rel="icon" href="${pageContext.request.contextPath}/resources/images/site-logo.png" type="image/gif" sizes="16x16">

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="<c:url value='/resources/css/bootstrap.3.3.7.min.css'/>">

<!-- Google font -->
<link href="https://fonts.googleapis.com/css?family=Share" rel="stylesheet">

<!-- Font awesome -->
<link rel="stylesheet" href="<c:url value='/resources/css/font-awesome.min.css'/>">

<!-- iHover -->
<link rel="stylesheet" href="<c:url value='/resources/css/ihover.min.css'/>">

<link rel="stylesheet" href="<c:url value='/resources/css/custom/global.css'/>">
<link rel="stylesheet" href="<c:url value='/resources/css/custom/home.css'/>">

</head>
<body class="loading">
	<div class="loading-gear" style="background: rgba(255, 255, 255, .8) url('${pageContext.request.contextPath}/resources/images/loader-gear.svg') 50% 50% no-repeat;"></div>
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
						<!-- <li class="active"><a href="#">Home</a></li>
						<li><a href="#">Page 1</a></li>
						<li><a href="#">Page 2</a></li>
						<li><a href="#">Page 3</a></li> -->
					</ul>
					<ul class="nav navbar-nav navbar-right">
						<li><a href="${pageContext.request.contextPath}/user/profile/view"><span class="fa fa-user-circle fa-1x" aria-hidden="true"></span> <sec:authentication property="principal.nameOfUser"/> </a></li>
						<li><a href="${pageContext.request.contextPath}/logout"><span class="fa fa-power-off fa-1x" aria-hidden="true"></span> Logout</a></li>
					</ul>
				</div>
			</div>
		</nav>
	</div>

	<div class="panel-body">	
		<div class="container-fluid">
			<div class="row">
				<div class="col-sm-12"><h1 align="center" class="aq-content-title">Welcome <sec:authentication property="principal.nameOfUser"/></h1></div>
				<div class="col-sm-12"><h1 align="center" class="aq-content-title">Create Your Questions!</h1></div>
			</div>
			<br>
			
			<div class="row row-grid">
				<div class="col-sm-3" align="center">
					<div class="ih-item circle effect5">
						<a href="${pageContext.request.contextPath}/question/multipleChoice">
			    			<div class="img" style="background-color: #734F96;">
			    				<i class="fa fa-check-square fa-5x aq-question-icon" aria-hidden="true"></i>
			    			</div>
			    			<div class="info">
			      				<div class="info-back">
						        	<h3>Multiple Choice Question</h3>
			      				</div>
			    			</div>
			    		</a>
			    	</div>
				</div>
				
				<div class="col-sm-3" align="center">
					<div class="ih-item circle effect5">
						<a href="${pageContext.request.contextPath}/question/fillInTheBlanks">
					    	<div class="img" style="background-color: #FCF75E;">
					    		<i class="fa fa-ellipsis-h fa-5x aq-question-icon" aria-hidden="true"></i>
					    	</div>
					    	<div class="info">
						      	<div class="info-back">
						        	<h3>Fill In The Blanks Question</h3>
						      	</div>
							</div>
					    </a>
					</div>
				</div>
				
				<div class="col-sm-3" align="center">
					<div class="ih-item circle effect5">
						<a href="${pageContext.request.contextPath}/question/trueAndFalse">
					    	<div class="img" style="background-color: #8DB600;">
					    		<i class="fa fa-dot-circle-o fa-5x aq-question-icon" aria-hidden="true"></i>
					    	</div>
					    	<div class="info">
						      	<div class="info-back">
						        	<h3>True And False Question</h3>
						      	</div>
							</div>
					    </a>
					</div>
				</div>
				
				<div class="col-sm-3" align="center">
					<div class="ih-item circle effect5">
						<a href="${pageContext.request.contextPath}/question/matchThePair">
					    	<div class="img" style="background-color: #FF6600;">
								<i class="fa fa-exchange fa-5x aq-question-icon" aria-hidden="true"></i>
					    	</div>
					    	<div class="info">
						      	<div class="info-back">
						        	<h3>Match The Pair Question</h3>
						      	</div>
							</div>
					    </a>
					</div>
				</div>
			</div>
		</div>
	</div>

<!-- jQuery library -->
<script src="<c:url value='/resources/js/jquery-3.2.1.min.js'/>"></script>

<!-- Tether -->
<script src="<c:url value='/resources/js/tether.min.js'/>"></script>

<!-- Bootstrap JS -->
<script src="<c:url value='/resources/js/bootstrap.3.3.7.min.js'/>"></script>

<!-- Custom JS -->
<script src="<c:url value='/resources/js/custom/global.js'/>"></script>
</body>
</html>
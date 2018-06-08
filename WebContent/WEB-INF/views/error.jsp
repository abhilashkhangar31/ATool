<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Authoring Tool</title>

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

<style type="text/css">
body {padding-top:50px;}

.box {
    border-radius: 3px;
    box-shadow: 0 2px 5px 0 rgba(0, 0, 0, 0.16), 0 2px 10px 0 rgba(0, 0, 0, 0.12);
    padding: 10px 25px;
    text-align: right;
    display: block;
    margin-top: 60px;
}
.box-icon {
    background-color: #000000;
    border-radius: 50%;
    display: table;
    height: 100px;
    margin: 0 auto;
    width: 100px;
    margin-top: -61px;
}
.box-icon span {
    color: #FF6600;
    display: table-cell;
    text-align: center;
    vertical-align: middle;
}
.info h4 {
    font-size: 26px;
    letter-spacing: 2px;
}
.info > p {
    color: #717171;
    font-size: 16px;
    padding-top: 1px;
    text-align: justify;
}
.info > a {
    background-color: #000000;
    border-radius: 2px;
    box-shadow: 0 2px 5px 0 rgba(0, 0, 0, 0.16), 0 2px 10px 0 rgba(0, 0, 0, 0.12);
    color: #fff;
    transition: all 0.5s ease 0s;
}
.info > a:hover {
    background-color: #FF6600;
    box-shadow: 0 2px 3px 0 rgba(0, 0, 0, 0.16), 0 2px 5px 0 rgba(0, 0, 0, 0.12);
    color: #fff;
    transition: all 0.5s ease 0s;
}
</style>

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
		<div class="container">
		    <div class="row">
		    	<div class="col-sm-3"></div>
		        <div class="col-sm-6">
		            <div class="box">
		                <div class="box-icon">
		                    <span class="fa fa-4x fa-gear fa-spin"></span>
		                </div>
		                <div class="info">
		                    <h4 class="text-center">${ sresponse }</h4>
		                </div>
		            </div>
		        </div>
		        <div class="col-sm-3"></div>
			</div>
		</div>	
	</div>
	
</body>
</html>
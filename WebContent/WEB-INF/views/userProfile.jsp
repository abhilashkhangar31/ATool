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

<style type="text/css">
.info-head {
	background-color: #000000;
	color: white;
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
						<li><a href="${pageContext.request.contextPath}/user/profile/view"><span class="fa fa-user-circle fa-1x" aria-hidden="true"></span> <sec:authentication property="principal.nameOfUser"/> </a></li>
						<li><a href="${pageContext.request.contextPath}/logout"><span class="fa fa-power-off fa-1x" aria-hidden="true"></span> Logout</a></li>
					</ul>
				</div>
			</div>
		</nav>
	</div>

	<div class="panel-body">
		<div class="container">
			<div class="row">
				<div class="col-sm-3">
					<div class="row">
						<img title="Profile Photo"
							class="img-responsive mx-auto d-block"
							src="${pageContext.request.contextPath}/resources/images/myphoto.jpg">
					</div>
					<div class="row top-buffer">
						<ul class="list-group">
							<li class="list-group-item text-muted info-head">Profile</li>
							<li class="list-group-item text-right"><span
								class="pull-left"><strong>Real name</strong></span> <sec:authentication property="principal.nameOfUser"/></li>
							<li class="list-group-item text-right"><span
								class="pull-left"><strong>Joined</strong></span> 2.13.2014</li>
							<li class="list-group-item text-right"><span
								class="pull-left"><strong>Last seen</strong></span> Yesterday</li>
						</ul>
	
						<ul class="list-group">
							<li class="list-group-item text-muted info-head">Activity <i
								class="fa fa-dashboard fa-1x"></i></li>
							<li class="list-group-item text-right"><span
								class="pull-left"><strong>Shares</strong></span> 125</li>
							<li class="list-group-item text-right"><span
								class="pull-left"><strong>Likes</strong></span> 13</li>
							<li class="list-group-item text-right"><span
								class="pull-left"><strong>Posts</strong></span> 37</li>
							<li class="list-group-item text-right"><span
								class="pull-left"><strong>Followers</strong></span> 78</li>
						</ul>
	
					</div>
				</div>
				<!--/col-3-->
				
				<div class="col-sm-9">

					<div class="tab-content">
						<div class="tab-pane active" id="home">
							<h4>Recent Activity</h4>

							<div class="table-responsive">
								<table class="table table-hover">

									<tbody>
										<tr>
											<td><i class="pull-right fa fa-edit"></i> Today, 1:00 -
												Jeff Manzi liked your post.</td>
										</tr>
										<tr>
											<td><i class="pull-right fa fa-edit"></i> Today, 12:23 -
												Mark Friendo liked and shared your post.</td>
										</tr>
										<tr>
											<td><i class="pull-right fa fa-edit"></i> Today, 12:20 -
												You posted a new blog entry title "Why social media is".</td>
										</tr>
										<tr>
											<td><i class="pull-right fa fa-edit"></i> Yesterday -
												Karen P. liked your post.</td>
										</tr>
										<tr>
											<td><i class="pull-right fa fa-edit"></i> 2 Days Ago -
												Philip W. liked your post.</td>
										</tr>
										<tr>
											<td><i class="pull-right fa fa-edit"></i> 2 Days Ago -
												Jeff Manzi liked your post.</td>
										</tr>
									</tbody>
								</table>
							</div>

						</div>

					</div>
					<!--/tab-pane-->
				</div>
				<!--/tab-content-->

			</div>
			<!--/col-9-->
		</div>
		<!--/row-->
	</div>

</body>
</html>
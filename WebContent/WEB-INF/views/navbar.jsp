<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
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
				<ul class="nav navbar-nav aq-question-list">
					<li id="mcqTab"><a href="${pageContext.request.contextPath}/question/multipleChoice">Multiple Choice</a></li>
					<li id="fbTab"><a href="${pageContext.request.contextPath}/question/fillInTheBlanks">Fill In the Blanks</a></li>
					<li id="tfTab"><a href="${pageContext.request.contextPath}/question/trueAndFalse">True And False</a></li>
					<li id="mtpTab"><a href="${pageContext.request.contextPath}/question/matchThePair">Match The Pair</a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#"><span class="fa fa-user-circle fa-1x" aria-hidden="true"></span> <sec:authentication property="principal.nameOfUser"/></a></li>
					<li><a href="${pageContext.request.contextPath}/logout"><span class="fa fa-power-off fa-1x" aria-hidden="true"></span> Logout</a></li>
				</ul>
			</div>
		</div>
	</nav>
</div>
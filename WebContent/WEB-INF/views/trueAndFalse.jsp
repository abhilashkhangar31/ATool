<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- Viewport Meta Tag -->
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<noscript>
	<meta http-equiv="refresh" content="0; URL=${requestScope['javax.servlet.forward.query_string']}?noScript=1" />
</noscript>
<title>True And False</title>

<!-- Website logo icon -->
<link rel="icon" href="${pageContext.request.contextPath}/resources/images/site-logo.png" type="image/gif" sizes="16x16">

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="<c:url value='/resources/css/bootstrap.3.3.7.min.css'/>">

<!-- Bootstrap select CSS -->
<link rel="stylesheet" href="<c:url value='/resources/css/bootstrap-select.min.css'/>">

<!-- Bootstrap tagsinput CSS -->
<link rel="stylesheet" href="<c:url value='/resources/css/bootstrap-tagsinput.css'/>">

<!-- Google font -->
<link href="https://fonts.googleapis.com/css?family=Share" rel="stylesheet">

<!-- Font awesome -->
<link rel="stylesheet" href="<c:url value='/resources/css/font-awesome.min.css'/>">

<!-- Quill RTE CSS -->
<link rel="stylesheet" href="<c:url value='/resources/css/quill.snow.css'/>">

<!-- Custom CSS -->
<link rel="stylesheet" href="<c:url value='/resources/css/custom/global.css'/>">
<link rel="stylesheet" href="<c:url value='/resources/css/custom/true-and-false.css'/>">

</head>
<body class="loading">
	<div class="loading-gear" style="background: rgba(255, 255, 255, .8) url('${pageContext.request.contextPath}/resources/images/loader-gear.svg') 50% 50% no-repeat;"></div>
	
	<!-- Navbar -->	
	<jsp:include page="navbar.jsp"></jsp:include>

	<div class="panel-body">	
		<div class="container-fluid">		
			<form action="">
				<div class="row">
					<div class="col-sm-8">
						<div class="aq-panel-head panel-heading" align="center"><span class="glyphicon glyphicon-question-sign"></span> Add Question</div>
						<br>
						
						<!-- Question Statement -->
						<div class="row">
							<div class="col-sm-12">
								<div class="form-group">
									<label class="aq-component-label">Question : </label>
									<i class="fa fa-info-circle helpIcon" data-placement="right" data-toggle="tooltip" title="Enter a Question Statement"></i>
									<div class="data-insert-panel" id="tfQuestionStatement"></div>
								</div>
							</div>
						</div>
						
						<!-- Answer Choice Label (True/False or Yes/No) -->
						<div class="row">
							<div class="col-sm-12">
								<div class="form-group">
									<label class="aq-component-label">Answer Choices : </label>
									<i class="fa fa-info-circle helpIcon" data-placement="right" data-toggle="tooltip" title="Select a Type of Answer Choice (True/False or Yes/No)."></i>
									<div class="row">
										<div class="col-sm-6">
											<select id="tfOrYnSelect" class="form-control selectpicker show-tick tfChoiceType" data-header="Select Choice Type">
												<option selected="selected" data-icon="fa fa-check-square-o">True - False</option>
												<option data-icon="fa fa-thumbs-up">Yes - No</option>
											</select>
										</div>
									</div>
								</div>
							</div>
						</div>
						
						<!-- Answer Choices -->
						<div class="row">
							<div class="col-sm-12">
								<div class="form-group funkyradio">
									<div class="funkyradio-info">
										<div class="row">
											<div class="col-sm-6">
												<input type="radio" value="True" name="tfOrYn" id="trueOrYes" />
												<label id="trueOrYesLabel" for="trueOrYes">True</label>
											</div>
											<div class="col-sm-6">
												<input type="radio" value="False" name="tfOrYn" id="falseOrNo" />
												<label id="falseOrNoLabel" for="falseOrNo">False</label>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
						
					</div>
					
					<!-- Meta Information -->	
					<jsp:include page="metaInformation.jsp"></jsp:include>
					
					<!-- <div class="col-sm-4 aq-panel-right">
						<div class="aq-panel-head panel-heading" align="center"><span class="glyphicon glyphicon-question-sign"></span> Add Meta Info</div>
						<br>
					
						Tags
						<div class="row">
							<div class="col-sm-12">
								<div class="form-group">
									<label class="aq-component-label">Tags : </label>
									<i class="fa fa-info-circle helpIcon" data-placement="right" data-toggle="tooltip" title="Tell Question is Related to Which Area (Example - Java, Physics)."></i>
									<div class="input-group">
										<span class="input-group-addon"><i class="glyphicon glyphicon-tags"></i></span>
										<input type="text" class="form-control" data-role="tagsinput">
									</div>
								</div>
							</div>
						</div>
						
						Difficulty Level
						<div class="row">
							<div class="col-sm-12">
								<div class="form-group">
									<label class="aq-component-label">Level : </label>
									<i class="fa fa-info-circle helpIcon" data-placement="right" data-toggle="tooltip" title="Select Difficulty Level of Question."></i>
									<select class="form-control selectpicker show-tick" multiple title="Select Level">
										<option data-icon="glyphicon glyphicon-education">Knowledge</option>
										<option data-icon="glyphicon glyphicon-th-large">Comprehension</option>
										<option data-icon="glyphicon glyphicon-cog">Application</option>
										<option data-icon="glyphicon glyphicon-filter">Analysis</option>
										<option data-icon="glyphicon glyphicon-wrench">Synthesis</option>
										<option data-icon="glyphicon glyphicon-signal">Evaluation</option>
									</select>
								</div>
							</div>
						</div>
						
						Time to Solve
						<div class="row">
							<div class="col-sm-12">
								<div class="form-group">
									<label class="aq-component-label">Time To Solve : </label>
									<i class="fa fa-info-circle helpIcon" data-placement="right" data-toggle="tooltip" title="Provide Minimum Time to Solve This Question."></i>
									<div class="input-group">
										<span class="input-group-addon"><i class="glyphicon glyphicon-time"></i></span>
										<input type="number" min="0" max="60" maxlength="2" class="form-control" placeholder="Min"/>
										<span class="input-group-addon">:</span>
										<input type="number" min="0" max="60" maxlength="2" class="form-control" placeholder="Sec"/>
									</div>
								</div>
							</div>
						</div>
						
						Answer Explanation
						<div class="row">
							<div class="col-sm-12">
								<div class="form-group">
									<label class="aq-component-label">Answer Explanation : </label>
									<i class="fa fa-info-circle helpIcon" data-placement="right" data-toggle="tooltip" title="Explantion, How Answer is Correct."></i>
									<textarea class="form-control" id="answerExplanation"></textarea>
								</div>
							</div>
						</div>
						
						<div class="row">
							<div class="col-sm-12">
								<div class="form-group" align="center">
									<button type="button" class="btn btn-primary aq-form-btn">Add</button>
									<button type="button" class="btn btn-primary aq-form-btn">Cancel</button>
								</div>
							</div>
						</div>
					</div> -->
					
				</div>
			</form>
		</div>
	</div>
	
<!-- jQuery library -->
<script src="<c:url value='/resources/js/jquery-3.2.1.min.js'/>"></script>

<!-- Tether JS -->
<script src="<c:url value='/resources/js/tether.min.js'/>"></script>

<!-- Bootstrap JS -->
<script src="<c:url value='/resources/js/bootstrap.3.3.7.min.js'/>"></script>

<!-- Bootstrap select JS -->
<script src="<c:url value='/resources/js/bootstrap-select.min.js'/>"></script>

<!-- Bootstrap tagsinput JS -->
<script src="<c:url value='/resources/js/bootstrap-tagsinput.min.js'/>"></script>

<!-- Quill RTE JS -->
<script src="<c:url value='/resources/js/quill.js'/>"></script>

<!-- Custom JS -->
<script src="<c:url value='/resources/js/custom/global.js'/>"></script>
<script src="<c:url value='/resources/js/custom/quill-setup.js'/>"></script>
<script src="<c:url value='/resources/js/custom/true-false.js'/>"></script>

<script type="text/javascript">
	ActiveTab( '#tfTab' );
</script>

</body>
</html>
<div class="col-sm-4 aq-panel-right">
	<div class="aq-panel-head panel-heading" align="center"><span class="glyphicon glyphicon-question-sign"></span> Add Meta Info</div>
	<br>
	
	<!-- Tags -->
	<div class="row">
		<div class="col-sm-12">
			<div class="form-group">
				<label class="aq-component-label"><span class="mandatory-fields">*</span> Tags : </label>
				<i class="fa fa-info-circle helpIcon" data-placement="right" data-toggle="tooltip" title="Tell Question is Related to Which Area (Example - Java, Physics)."></i>
				<div class="input-group">
					<span class="input-group-addon"><i class="glyphicon glyphicon-tags"></i></span>
					<input type="text" class="form-control meta-tags">
				</div>
			</div>
		</div>
	</div>
	
	<!-- Difficulty Level -->
	<div class="row">
		<div class="col-sm-12">
			<div class="form-group">
				<label class="aq-component-label"><span class="mandatory-fields">*</span> Level : </label>
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
	
	<!-- Time to Solve -->
	<div class="row">
		<div class="col-sm-12">
			<div class="form-group">
				<label class="aq-component-label"><span class="mandatory-fields">*</span> Time To Solve : </label>
				<i class="fa fa-info-circle helpIcon" data-placement="right" data-toggle="tooltip" title="Provide Minimum Time to Solve This Question."></i>
				<div class="input-group">
					<span class="input-group-addon"><i class="glyphicon glyphicon-time"></i></span>
					<input type="number" min="00" max="60" maxlength="2" class="form-control aq-time-to-solve" id="minutes" placeholder="Min"/>
					<span class="input-group-addon">:</span>
					<input type="number" min="00" max="60" maxlength="2" class="form-control aq-time-to-solve" id="seconds" placeholder="Sec"/>
				</div>
			</div>
		</div>
	</div>
	
	<!-- Answer Explanation -->
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
</div>
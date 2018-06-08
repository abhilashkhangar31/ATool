/**
 * jQuery
 */
var deSettings = {'max_choices' : 10};
$(document).ready(function() {
	
	$('#addElement').click(function() {
		var existing_choices =  $('.data-insert-panel').length;
		if(existing_choices < deSettings.max_choices) {
			var newChoice = '<div class="col-sm-6"><div class="data-insert-panel" id="answerChoices_3"></div></div>';
			
			var quill = new Quill('#answerChoices_3', {
				theme: 'snow',
				placeholder: 'Click here to insert a Question Statement...',
				modules: {
					toolbar: quillSettings.questionStatementOptions
				}
			});
			
			$('#answerChoiceContainer').append(newChoice);
		}
	});
});
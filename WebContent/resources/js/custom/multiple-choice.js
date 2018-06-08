/**
 * jQuery
 */
var mcqSettings = {};
$(document).ready(function() {
	
	var quill = new Quill('#mcqQuestionStatement', {
		theme: 'snow',
		placeholder: 'Click here to insert a Question Statement...',
		modules: {
			toolbar: quillSettings.questionStatementOptions
		}
	});
	
	var quill = new Quill('#anserChoice_1', {
		theme: 'snow',
		placeholder: 'Click here to insert a Answer Choice...',
		modules: {
			toolbar: quillSettings.answerChoiceOptions
		}
	});

	var quill = new Quill('#anserChoice_2', {
		theme: 'snow',
		placeholder: 'Click here to insert a Answer Choice...',
		modules: {
			toolbar: quillSettings.answerChoiceOptions
		}
	});
});
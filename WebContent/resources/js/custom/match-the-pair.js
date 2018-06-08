/**
 * jQuery
 */
var mtpSettings = {};
$(document).ready(function() {
	
	var quill = new Quill('#mtpQuestionStatement', {
		theme: 'snow',
		placeholder: 'Click here to insert a Question Statement...',
		modules: {
			toolbar: quillSettings.questionStatementOptions
		}
	});
	
	var quill = new Quill('#mtpAnswerChoice_1', {
		theme: 'snow',
		placeholder: 'Click here to insert a Answer Choice...',
		modules: {
			toolbar: quillSettings.answerChoiceOptions
		}
	});

	var quill = new Quill('#mtpAnswerChoice_2', {
		theme: 'snow',
		placeholder: 'Click here to insert a Answer Choice...',
		modules: {
			toolbar: quillSettings.answerChoiceOptions
		}
	});
});
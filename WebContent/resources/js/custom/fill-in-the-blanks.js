/**
 * jQuery
 */
$(document).ready(function() {

	var quill = new Quill('#fbQuestionStatement', {
		theme: 'snow',
		placeholder: 'Click here to insert a Question Statement...',
		modules: {
			toolbar: quillSettings.questionStatementOptions
		}
	});
});
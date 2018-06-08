/**
 * jQuery
 */
$(function() {

	var tf_form_elements = {
			tfSelect: {
				TRUE: 'True',
				FALSE: 'False',
				YES: 'Yes',
				NO:'No'
			}
	}
	
	var quill = new Quill('#tfQuestionStatement', {
		theme: 'snow',
		placeholder: 'Click here to insert a Question Statement...',
		modules: {
			toolbar: quillSettings.questionStatementOptions
		}
	});
	
	$( '#tfOrYnSelect' ).on( 'change', function() {
		var firstRadioValue = $( '#trueOrYes' ).val() === tf_form_elements.tfSelect.TRUE ? 
													   	  tf_form_elements.tfSelect.YES : tf_form_elements.tfSelect.TRUE;
		
		var secondRadioValue = $( '#falseOrNo' ).val() === tf_form_elements.tfSelect.FALSE ? 
				   										   tf_form_elements.tfSelect.NO : tf_form_elements.tfSelect.FALSE;
		
		var firstLabel = firstRadioValue; var secondLabel = secondRadioValue;
		
		ModifyElementProperty( '#trueOrYes', { value: firstRadioValue } );
		ModifyElementProperty( '#falseOrNo', { value: secondRadioValue } );
		
		$( '#trueOrYesLabel' ).text( firstLabel );
		$( '#falseOrNoLabel' ).text( secondLabel );
	} );
});
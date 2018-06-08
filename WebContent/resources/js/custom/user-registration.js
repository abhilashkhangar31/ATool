
/**
 * User registration settings are provided by this array, 
 * also helps to overcome conflicts as used as name space. 
 */
var urSettings = {'min_pwd_size' : 8, 'pwdStatusWeak' : 'unmatch', 'pwdStatusWeak' : 'weak', 'pwdStatusGood' : 'good'};

// Fields to validate at the time of form submission.
urSettings.fieldsToValidate = ['#userFirstName', '#userLastName', '#userId', '#userPassword', '#userConfirmPassword'];

// Field's data to validate at the time of form submission.
urSettings.fieldsDataToValidate = ['#userId'];

/**
 * jQuery
 */
$(document).ready(function() {
	
	urSettings.responseMessages = {};
	
	/**
	 * Get response messages from server as a JSON format.
	 */
	$.getJSON('resources/json/response-messages.json', function(response) {
		urSettings.responseMessages = response;
	});
	
	/**
	 * 
	 */
	$('#userId').focusout(function() {
		var enteredUserId = $(this).val().trim();
		if (enteredUserId != '') {
			urSettings.isUserIdTaken(enteredUserId);
		}
	}).focusin(function() {
		$('#userIdStatus').empty();
		$('#userId').removeClass('aq-invalid');
	});
	
	/**
	 * jQuery-AJAX call to check whether user id taken or not.
	 */
	urSettings.isUserIdTaken = function(enteredUserId) {
		$.get("getUserIdStatus", {userId : enteredUserId}, function(status) {
			if (status) {
				$('#userIdStatus').text(urSettings.responseMessages.USER_ID_TAKEN);
				$('#userId').addClass('aq-invalid');
			} else {
				$('#userIdStatus').empty();
				$('#userId').removeClass('aq-invalid');
			}
		});
	}
	
	/**
	 * User registration form validation.
	 */
	$('#userRegistrationForm').submit(function() {
		return globalSettings.validateEmptyFields(urSettings.fieldsToValidate) && globalSettings.validateFieldData(urSettings.fieldsDataToValidate);
	});
	
});
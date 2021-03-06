/**
 * 
 */
var ulSettings = {'REDIRECT_URL' : 'home', '_cryptokey' : '' };

//Fields to validate at the time of form submission.
ulSettings.fieldsToValidate = ['#userId', '#password'];

/**
 * jQuery
 */
$(document).ready(function() {
	
	ulSettings.responseMessages = {};
	
	/**
	 * Get response messages from server as a JSON format.
	 */
	$.getJSON('json/response-messages.json', function(response) {
		ulSettings.responseMessages = response;
	});
	
	/**
	 * 
	 */
	$('#userLoginForm').submit(function() {
		if( globalSettings.validateEmptyFields(ulSettings.fieldsToValidate) ) {
			var passwordInput = $('#password');
			ulSettings._cryptokey = $( "meta[name='_cryptokey']" ).attr("content");
			var encryptedPassword = globalSettings.DoEncryption( passwordInput.val(), ulSettings._cryptokey )
			passwordInput.val(encryptedPassword);
			return true;
		}
		return false;
	});
	
	/**
	 * User registration form validation.
	 */
	/*$('#loginBtn').click(function(e) {
		if(globalSettings.validateEmptyFields(ulSettings.fieldsToValidate)) {
			ulSettings.authenticateUser($('#userId').val(), $('#password').val());
		} else {
			e.preventDefault();
		}
	});*/
	
	/**
	 * 
	 */
	/*ulSettings.authenticateUser = function(userId, password) {
		$.post("authenticateUser", {userId : userId, password: password}, function(status) {
			if (status) {
				window.location = ulSettings.REDIRECT_URL+'?userId='+userId;
			} else {
				alert(ulSettings.responseMessages.INVALID_CREDENTIAL);
			}
		});
	}*/
	
});

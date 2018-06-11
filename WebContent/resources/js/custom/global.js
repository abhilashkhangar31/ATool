
var globalSettings = {};

/**
 * Javascript
 */

// Removes loader after page is successfully loaded
window.addEventListener('load', function load() {
	window.removeEventListener('load', load, false);
	document.body.classList.remove('loading');
}, false);

// Active tab of current question type
ActiveTab = function( tab ) { $( tab ).addClass( 'active' ); }

/**
 * jQuery
 */
$(function() {

	/**
	 * Validate whether all required field are provided or not
	 * and return their status.
	 */
	globalSettings.validateEmptyFields = function(fieldsToValidate) {
		var isNotEmpty = true;
		$.each(fieldsToValidate, function(key, field) {
			if ($(field).val().trim() == '') {
				isNotEmpty = false;
				$(field).addClass('aq-empty');
			}
		});
		return isNotEmpty;
	}
	
	/**
	 * 
	 */
	globalSettings.validateFieldData = function(fieldsDataToValidate) {
		var isValidData = true;
		$.each(fieldsDataToValidate, function(key, field) {
			if ($(field).hasClass('aq-invalid')) {
				isValidData = false;
			}
		});
		return isValidData;
	}
	
	/**
	 * Remove empty field flag (red border) on successful validation.
	 */
	changeEmptyFieldStatus = function( targetEntity ) {
		if( $( targetEntity ).hasClass( 'aq-empty' ) ) {
			$( targetEntity ).removeClass( 'aq-empty' );
		}
	}
	
	ModifyElementProperty = function( element, properties ) {
		$( element ).attr( properties );
	}
	
	globalSettings.DoEncryption = function( param, key ) {
		var encrypted = CryptoJS.AES.encrypt(param, key);
		return encrypted.toString();
	}
});


var miSettings = {}
var colorClasses = ['label label-primary', 'label label-danger label-important', 'label label-success', 'label label-default', 'label label-warning'];

/**
 * jQuery
 */
$(document).ready(function() {
	
	/**
	 * Initialize and add random colors to meta tags.
	 */
	$('.meta-tags').tagsinput({
		tagClass: function (tags) {
			return colorClasses[Math.floor(Math.random() * colorClasses.length)];
		}
	});
});
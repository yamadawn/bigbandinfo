$(function() {

	$('.railwayName').click(function() {
		if ($(this).next().hasClass('areaOpen')) {
			$(this).nextAll().removeClass('areaOpen')
			$(this).nextAll().addClass('areaClose')
		} else {
			$(this).nextAll().removeClass('areaClose')
			$(this).nextAll().addClass('areaOpen')
		}
	});
});

$(function(){
   $('a[href^=#]').click(function() {
    var headerH = $('header').height();
    if(!$(this).hasClass('noSmooth')){
      var speed = 1000;
      var href= $(this).attr("href");
      var target = $(href == "#" || href == "" ? 'html' : href);
      var ww = $(window).width();
      var position = target.offset().top;
      $('body,html').animate({scrollTop:position}, speed, 'easeOutCubic');
      return false;
    }
   });
});
$(window).on('load', function() {
  var url = $(location).attr('href');
  if(url.indexOf("?id=") != -1){
    var id = url.split("?id=");
    var $target = $('#' + id[id.length - 1]);
    if($target.length){
      var pos = $target.offset().top - $("header").height();
      $("html, body").animate({scrollTop:pos}, 0, 'easeOutCubic');
    }
  }
});
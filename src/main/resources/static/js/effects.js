$(function(){
  //スマホメニュー作成
  var $head = $( 'header' );
  /*$('<p class="menu"><span class="top"></span><span class="middle"></span><span class="bottom"></span></p>').appendTo($head);
  $('<div class="sp-menu"></div>').appendTo($head);*/
  $('<div class="search-btn-sp"></div>').appendTo('header .favarit');
  //var spMenu = $head.find('.sp-menu');
  //$head.find("nav").clone(true).appendTo(spMenu);
  var $S_btn = jQuery('.search-btn-sp');
  //var $nav = jQuery('header .sp-menu');
  $S_btn.click(function(){
    $head.toggleClass('search-active');
    $('body').toggleClass('fixed');
  });
  $('.toggle-button').click(function(){
    $head.removeClass('search-active');
    $('body').removeClass('fixed');
  });
  //sp メニュ-
  var slideout = new Slideout({
      'panel': document.getElementById('panel'),
      'menu': document.getElementById('menu'),
      'padding': 180,
      'tolerance': 70
  });

  // Toggle button
  document.querySelector('.toggle-button').addEventListener('click', function() {
    slideout.toggle();
    $('html, body').toggleClass('sp-fixed');

  });
    $('.drawer').on('drawer.opened', function(){
      $('#panel').click(function(){
        $('#panel').drawer('close');
      });
      
    });
});
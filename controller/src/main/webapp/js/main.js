/**
 * Created by Lilly_94 on 21.10.2015.
 */
$(document).ready(function() {
    var SectionHeight=$(window).height()-$("header").height()-100;
    $(".welcome").height(SectionHeight);
    $(window).resize(function(){
        $(".welcome").height(SectionHeight);
    });
    $('.login-link').magnificPopup({
        type:'inline',
        midClick: true // Allow opening popup on middle mouse click. Always set it to true if you don't provide alternative source in href.
    });


});

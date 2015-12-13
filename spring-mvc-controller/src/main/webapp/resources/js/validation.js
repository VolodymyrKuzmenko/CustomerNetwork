$("form").submit(function(){
   console.log ("Start");
   var valueX = $("#password").val();
   var valueY = $("#password_confirm").val();
   if (valueX != valueY) {
        $(".passf").text('Passwords do not match!');
        $(".passf").css("color", "red");
        console.log ("false");       
        return false;   
   }                    
});

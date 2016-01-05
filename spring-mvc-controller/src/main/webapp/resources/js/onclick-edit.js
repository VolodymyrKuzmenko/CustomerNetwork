autosize(document.querySelectorAll('textarea'));
$(document).ready(function(){
    $('.update_data').on('click',function(){
        var input = $('#'+ $(this).attr('data-target'));
        input.attr('disabled',false).focus().focusEnd();
        $('#update_button').fadeIn('fast').one('click',function(){
            var key = input.attr('id');
            $.ajax ({
                type: "POST",
                url: "/some.php",
                data: key + '=' + input.val(), 
                success: function(data){
                    $(".alert-success").fadeIn(700);
                    setTimeout(function(){
                    $(".alert-success").fadeOut(700);
                    },2000);
                },
                error: function(){
                    $(".alert-errors").fadeIn(1000);
                }
            });

            input.attr('disabled',true);
            $('#update_button').fadeOut('fast');
            $('#cancel_button').fadeOut('fast');
        });
        $('#cancel_button').fadeIn('fast').one('click',function(){
            $('#update_button').fadeOut('fast');
            $('#cancel_button').fadeOut('fast');
        });
    });

    $.fn.setCursorPosition = function(position){
    if(this.length == 0) return this;
    return $(this).setSelection(position, position);
    }

    $.fn.setSelection = function(selectionStart, selectionEnd) {
    if(this.length == 0) return this;
    input = this[0];

    if (input.createTextRange) {
        var range = input.createTextRange();
        range.collapse(true);
        range.moveEnd('character', selectionEnd);
        range.moveStart('character', selectionStart);
        range.select();
    } else if (input.setSelectionRange) {
        input.focus();
        input.setSelectionRange(selectionStart, selectionEnd);
    }

    return this;
    }

    $.fn.focusEnd = function(){
    this.setCursorPosition(this.val().length);
            return this;
    }

});
/**
 * Created by Vova on 12/10/2015.
 */

autosize(document.querySelectorAll('textarea'));


function enableTextarea(element) {
    current_input = document.getElementById('description');
    current_input.disabled = false;
    current_input.focus();
    current_input.setSelectionRange(current_input.value.length, current_input.value.length);
    update_button = document.getElementById('update_button');
    update_button.style.display = (update_button.style.display == 'inline-block') ? '' : 'inline-block'
    cancel_button = document.getElementById('cancel_button');
    cancel_button.style.display = (cancel_button.style.display == 'inline-block') ? '' : 'inline-block'

}

function disableTextarea(element) {
    current_input = document.getElementById('description');
    current_input.disabled = true;
    update_button = document.getElementById('update_button');
    update_button.style.display = 'none';
    cancel_button = document.getElementById('cancel_button');
    cancel_button.style.display = 'none';
}

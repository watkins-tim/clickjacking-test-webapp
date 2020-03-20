$(document).ready(function() {
  $('body').on('click','#clickButton', function(){
    $('#jacked-iframe').attr('src', $("#clickjack-url").val());
  });

});

$(document).ready(function() {
    $('#btn-underline-modal').click(function() {
      var text = $('#underline-text').val();
      document.execCommand('underline', false, text);
      $('#myModal').modal('hide');
    });
  });
  
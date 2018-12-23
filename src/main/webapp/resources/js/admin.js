$(document).ready(function() {

    function showAlert(message,type){

        var alertElement = "#" + type + "-alert";
        var alertMessageElement = "#" +  type + "_message";

        $(alertMessageElement).html(message);
       $(alertElement).fadeTo(10000, 500).slideUp(500, function() {
                           $(alertElement).slideUp(500);
                       });
    }

    $('.deleteUser').bind('click', function(event) {
        var userEmail = this.id.replace("delete_", "");
        var rowToBeDelete = $(this).parent().parent();
        $.ajax({
            type: "POST",
            url: "deleteUser",
            data: {"userEmail" :  userEmail},
            success: function(response) {

                if(response.success){
                    showAlert("Successfully Delete account with email : " + userEmail,"success");
                    rowToBeDelete.remove()
                } else {
                    showAlert("Error Deleting account with email : " + userEmail , "warning");
                }
            },
            error: function() {
                showAlert("Error Deleting account with email : " + userEmail , "warning");
            }
        })
    });

});
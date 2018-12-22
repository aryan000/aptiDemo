$('#attempt_login').submit(function(event) {
            event.preventDefault();
            $.ajax({
                type: "POST",
                url: "login",
                data: $(this).serialize(),
                success: function(response) {
                    alert("success" + response);
                      $("#warn-alert").fadeTo(10000, 500).slideUp(500, function(){
                        $("#warn-alert").slideUp(500);
                         });
                },
                error: function() {
                    alert("failure");
                }
            })
        });

        $('#attempt_signUp').submit(function(event) {
                    event.preventDefault();
                    $.ajax({
                        type: "POST",
                        url: "signUp",
                        data: $(this).serialize(),
                        success: function(response) {
                             alert("success resposne");
                              $("#warn-alert").fadeTo(10000, 500).slideUp(500, function(){
                                $("#warn-alert").slideUp(500);
                                 });
                        },
                        error: function() {
                            $("#warn-alert").fadeTo(10000, 500).slideUp(500, function(){
                              $("#warn-alert").slideUp(500);
                               });
                        }
                    })
                });

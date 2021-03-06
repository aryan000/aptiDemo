<html>

<head>
    <title>Login to AptiQ</title>
    <!-- Custom Theme files -->
    <link href="/resources/css/login-style.css" rel="stylesheet" type="text/css" media="all" />
    <link href="/resources/css/bootstrap.min.css" rel="stylesheet" type="text/css" media="all" />

    <style>
      body {
        background-color: #16214d !important;
      }
    </style>

    <!-- Custom Theme files -->
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="Welcome to AptiQ. Know your knowledge quotient. Just Sign in and take the test to know your IQ." />
    <!--script-->
    <script src="/resources/js/jquery.min.js"></script>
    <script src="/resources/js/easyResponsiveTabs.js" type="text/javascript"></script>
    <script src="/resources/js/bootstrap.min.js" type="text/javascript"></script>
    <script type="text/javascript">
    $(document).ready(function() {
        $('#horizontalTab').easyResponsiveTabs({
            type: 'default', //Types: default, vertical, accordion
            width: 'auto', //auto or any width like 600px
            fit: true // 100% fit in a container
        });

            });
    </script>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
</head>

<body>
     <c:if test = "${not empty showWarningMessage}">
         <div class="container-fluid">
           <div class="row justify-content-md-center">
             <div class="col-sm-6 mt-5">
                 <div class="alert alert-warning alert-dismissible fade show" role="alert">
                   <strong>Warning!</strong> ${warn_message}
                   <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                     <span aria-hidden="true">&times;</span>
                   </button>
                 </div>
             </div>
           </div>
         </div>
     </c:if>
    <div class="head">
        <div class="logo">
            <div class="logo-top">
                <h1>Login To APTIQ</h1>
            </div>
            <div class="logo-bottom">
                <section class="sky-form">
                    <label class="radio"><input type="radio" name="radio" checked=""><i></i>Test Your IQ</label>
                    <label class="radio"><input type="radio" name="radio"><i></i>Participate in Contexts</label>
                    <label class="radio"><input type="radio" name="radio"><i></i>Evaluate Yourself</label>
                </section>
            </div>
        </div>
        <div class="login">
            <div class="sap_tabs">
                <div id="horizontalTab" style="display: block; width: 100%; margin: 0px;">
                    <ul class="resp-tabs-list">
                        <li class="resp-tab-item" aria-controls="tab_item-0" role="tab"><span>Login</span></li>
                        <li class="resp-tab-item" aria-controls="tab_item-1" role="tab"><label>/</label><span>Sign up</span></li>
                        <div class="clearfix"></div>
                    </ul>
                    <div class="resp-tabs-container">
                        <div class="tab-1 resp-tab-content" aria-labelledby="tab_item-0">
                            <div class="login-top">
                                <form id="attempt_login" action="login" method="post">
                                    <input type="text" class="email" placeholder="Email" name="userEmail" required="" />
                                    <input type="password" class="password" placeholder="Password"  name="password" required="" />
                                <div class="login-bottom login-bottom1">
                                    <div class="submit">
                                        <input type="submit" value="LOGIN" />
                                    </div>
                                    <ul>
                                        <li>
                                            <p>Or login with</p>
                                        </li>
                                        <li><a href="#"><span class="fb"></span></a></li>
                                        <li><a href="#"><span class="twit"></span></a></li>
                                        <li><a href="#"><span class="google"></span></a></li>
                                    </ul>
                                    <div class="clear"></div>
                                </div>
                                </form>
                            </div>
                        </div>
                        <div class="tab-1 resp-tab-content" aria-labelledby="tab_item-1">
                            <div class="login-top">
                                <form id="attempt_signUp" action="signUp" method="post">
                                    <input type="text" class="name active" name="username" placeholder="Your Name" required="" />
                                    <input type="text" class="email" name="userEmail" placeholder="Email" required="" />
                                    <input type="password" class="password" name="password" placeholder="Password" required="" />
                                     <input type="text" class="text" placeholder="First Name"  name="firstName" required="" />
                                     <input type="text" class="text" placeholder="Last Name"  name="lastName" required="" />
                                <div class="login-bottom">
                                    <div class="submit">
                                        <input type="submit" value="SIGN UP" />
                                    </div>
                                    <ul>
                                        <li>
                                            <p>Or Sign Up with</p>
                                        </li>
                                        <li><a href="#"><span class="fb"></span></a></li>
                                        <li><a href="#"><span class="twit"></span></a></li>
                                        <li><a href="#"><span class="google"></span></a></li>
                                    </ul>
                                    <div class="clear"></div>
                                </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="clear"></div>
    </div>
    <div class="account">
        <ul>
            <li>
                <p>Don't have an <a href="#">account?</a></p>
            </li>
            <li> <span>/</span> </li>
            <li>
                <p>Forgot <a href="#">password?</a></p>
            </li>

        </ul>
    </div>
</body>

</html>
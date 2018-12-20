<!DOCTYPE HTML>
<html>

<head>
    <title>Responsive Static Login Form HTML5 Template | DesignMaz</title>
    <!-- Custom Theme files -->
    <link href="/resources/css/login-style.css" rel="stylesheet" type="text/css" media="all" />
    <!-- Custom Theme files -->
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="Welcome to AptiQ. Know your knowledge quotient. Just Sign in and take the test to know your IQ." />
    <!--script-->
    <script src="/resources/js/jquery.min.js"></script>
    <script src="/resources/js/easyResponsiveTabs.js" type="text/javascript"></script>
    <script type="text/javascript">
    $(document).ready(function() {
        $('#horizontalTab').easyResponsiveTabs({
            type: 'default', //Types: default, vertical, accordion
            width: 'auto', //auto or any width like 600px
            fit: true // 100% fit in a container
        });
    });
    </script>
</head>

<body>
    <div class="head">
        <div class="logo">
            <div class="logo-top">
                <h1>Login To APTIQ</h1>
            </div>
            <div class="logo-bottom">
                <section class="sky-form">
                    <label class="radio"><input type="radio" name="radio" checked=""><i></i>Ut mattis mattis bibendum</label>
                    <label class="radio"><input type="radio" name="radio"><i></i>Nullam rutrum sagittis interdum</label>
                    <label class="radio"><input type="radio" name="radio"><i></i>Nam cursus eros sed elit</label>
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
                                <form action="login" method="post">
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
                                <form action="signUp" method="post">
                                    <input type="text" class="name active" name="username" placeholder="Your Name" required="" />
                                    <input type="text" class="email" name="userEmail" placeholder="Email" required="" />
                                    <input type="password" class="password" name="password" placeholder="Password" required="" />

                                <div class="login-bottom">
                                    <div class="submit">
                                        <input type="submit" value="SIGN UP" />
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
            </li><span>/</span>
            <li>
                <p>Forgot <a href="#">password?</a></p>
            </li>
            <div class="clear"></div>
        </ul>
    </div>
    <div style="text-align:center; margin-top:10px;">
        <ins class="adsbygoogle" style="display:block" data-ad-client="ca-pub-8011246932591811" data-ad-slot="9844648019" data-ad-format="auto"></ins>
    </div>
</body>

</html>
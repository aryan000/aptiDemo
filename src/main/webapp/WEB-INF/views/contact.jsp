<!doctype html>
<!-- Website template by freewebsitetemplates.com -->
<html>

<%@ include file="/WEB-INF/views/navbar.jsp"%>

<body>
	<div id="page">
		<div id="header">
			<div>
				<a href="index" class="logo"><img src="/resources/images/logo.png" alt=""></a>
				<ul id="navigation">
					<li>
						<a href="index">Home</a>
					</li>
					<li>
						<a href="about">About</a>
					</li>
					<li class="menu">
						<a href="projects">Projects</a>
						<ul class="primary">
							<li>
								<a href="proj1">proj 1</a>
							</li>
						</ul>
					</li>
					<li class="menu">
						<a href="blog">Blog</a>
						<ul class="secondary">
							<li>
								<a href="singlepost">Single post</a>
							</li>
						</ul>
					</li>
					<li class="selected">
						<a href="contact">Contact</a>
					</li>
				</ul>
			</div>
		</div>
		<div id="body">
			<div class="header">
				<div class="contact">
					<h1>Contact</h1>
					<h2>DO NOT HESITATE TO CONTACT US</h2>
					<form action="index">
						<input type="text" name="Name" value="Name" onblur="this.value=!this.value?'Name':this.value;" onfocus="this.select()" onclick="this.value='';">
						<input type="text" name="Email Address" value="Email Address" onblur="this.value=!this.value?'Email Address':this.value;" onfocus="this.select()" onclick="this.value='';">
						<input type="text" name="Subject" value="Subject" onblur="this.value=!this.value?'Subject':this.value;" onfocus="this.select()" onclick="this.value='';">
						<textarea name="message" cols="50" rows="7">Message</textarea>
						<input type="submit" value="Send" id="submit">
					</form>
				</div>
			</div>
		</div>
		<div id="footer">
			<div class="connect">
				<div>
					<h1>FOLLOW OUR  MISSIONS ON</h1>
					<div>
						<a href="http://freewebsitetemplates.com/go/facebook/" class="facebook">facebook</a>
						<a href="http://freewebsitetemplates.com/go/twitter/" class="twitter">twitter</a>
						<a href="http://freewebsitetemplates.com/go/googleplus/" class="googleplus">googleplus</a>
						<a href="http://pinterest.com/fwtemplates/" class="pinterest">pinterest</a>
					</div>
				</div>
			</div>
			<div class="footnote">
				<div>
					<p>&copy; 2023 BY SPACE PROSPECTION | ALL RIGHTS RESERVED</p>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
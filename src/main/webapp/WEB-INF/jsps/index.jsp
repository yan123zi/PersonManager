<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
<title>网站首页</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Custom Theme files -->
<link href="${pageContext.servletContext.contextPath }/assets/shouye/css/bootstrap.css" type="text/css" rel="stylesheet" media="all">
<link href="${pageContext.servletContext.contextPath }/assets/shouye/css/style.css" type="text/css" rel="stylesheet" media="all">  
<link href="${pageContext.servletContext.contextPath }/assets/shouye/css/font-awesome.css" rel="stylesheet">		<!-- font-awesome icons -->
<!-- //Custom Theme files --> 
<!-- js -->
<script src="${pageContext.servletContext.contextPath }/assets/shouye/js/jquery-2.2.3.min.js"></script>  
<!-- //js -->
<!-- web-fonts -->  
<link href="http://fonts.googleapis.com/css?family=Josefin+Sans:300,400,600,700" rel="stylesheet">
<link href="http://fonts.googleapis.com/css?family=Roboto" rel="stylesheet">
<!-- //web-fonts -->
</head>

<body id="page-top" data-spy="scroll" data-target=".navbar-fixed-top">  
	<!-- banner -->
	<div id="home" class="w3ls-banner"> 

		<!-- banner-text -->
		<div class="slider">
			<div class="callbacks_container">
				<ul class="rslides callbacks callbacks1" id="slider4">
					<li>
						<div class="w3layouts-banner-top">

							<div class="container">
								<div class="agileits-banner-info">
									<h3>GS科技  <span>我们开创未来</span></h3>
												<p> GS科技公司 由业务、战略、技术咨询顾问和行业专家组成。 
													凭借全球技术和人才网络，丰富的行业经验和敏锐的行业洞察，可以帮助企业利
													用认知/人工智能（AI）、区块链，物联网，云计算等先进技术进行数字化重塑。 
													 </p>
									<div class="agileits_w3layouts_more menu__item">
				<a href="${pageContext.servletContext.contextPath }/applyPage" class="menu__link" >加入我们</a>
			</div>
								</div>	
							</div>
						</div>
					</li>
					<li>
						<div class="w3layouts-banner-top w3layouts-banner-top1">
							<div class="container">
								<div class="agileits-banner-info">
									<h3>GS科技  <span>我们开创未来</span></h3>
												<p> GS科技公司 由业务、战略、技术咨询顾问和行业专家组成。 
													凭借全球技术和人才网络，丰富的行业经验和敏锐的行业洞察，可以帮助企业利
													用认知/人工智能（AI）、区块链，物联网，云计算等先进技术进行数字化重塑。 
													 </p>
									<div class="agileits_w3layouts_more menu__item">
				<a href="${pageContext.servletContext.contextPath }/applyPage" class="menu__link" >加入我们</a>
			</div>
								</div>	
							</div>
						</div>
					</li>
					<li>
						<div class="w3layouts-banner-top w3layouts-banner-top2">
							<div class="container">
								<div class="agileits-banner-info">
									<h3>GS科技  <span>我们开创未来</span></h3>
												<p> GS科技公司 由业务、战略、技术咨询顾问和行业专家组成。 
													凭借全球技术和人才网络，丰富的行业经验和敏锐的行业洞察，可以帮助企业利
													用认知/人工智能（AI）、区块链，物联网，云计算等先进技术进行数字化重塑。 
													 </p>
									<div class="agileits_w3layouts_more menu__item">
				<a href="${pageContext.servletContext.contextPath }/applyPage" class="menu__link" >加入我们</a>
			</div>
								</div>	
								
							</div>
						</div>
					</li>
				</ul>
			</div>
			<div class="clearfix"> </div>
			
			<!--banner Slider starts Here-->
		</div>
		 
 
	</div>	
	<!-- //banner --> 
			<!-- header -->
		<div class="header-w3layouts"> 
			<!-- Navigation -->
			<nav class="navbar navbar-default navbar-fixed-top">
				<div class="container">
					<div class="navbar-header page-scroll">
						<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
							<span class="sr-only">Gs Technology</span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
						</button>
						<h1><a class="navbar-brand" href="${pageContext.servletContext.contextPath }/index">Gs </a></h1>
					</div> 
					<!-- Collect the nav links, forms, and other content for toggling -->
					<div class="collapse navbar-collapse navbar-ex1-collapse">
						<ul class="nav navbar-nav navbar-right">
							<!-- Hidden li included to remove active class from about link when scrolled up past about section -->
							<li class="hidden"><a class="page-scroll" href="#page-top"></a>	</li>
							<li><a class="hvr-sweep-to-right" a href="#" data-toggle="modal" data-target="#myModal">员工登录</a></li>
							<!--<li><a class="hvr-sweep-to-right" href="about.html">About</a></li>
							<li><a class="hvr-sweep-to-right" href="events.html">Events</a></li>
							<li class="dropdown">
									<a href="#" class="dropdown-toggle hvr-sweep-to-right" data-hover="Pages" data-toggle="dropdown">Pages <b class="caret"></b></a>
									<ul class="dropdown-menu">
										<li><a class="hvr-sweep-to-right" href="icons.html">Icons</a></li>
										<li><a class="hvr-sweep-to-right" href="typography.html">Short Codes</a></li>
									</ul>
							  </li>
							<li><a class="hvr-sweep-to-right" href="gallery.html">Gallery</a></li>-->
							<li><a class="hvr-sweep-to-right" href="${pageContext.servletContext.contextPath }/applyPage">加入我们</a></li>
						</ul>
					</div>
					<!-- /.navbar-collapse -->
				</div>
				<!-- /.container -->
			</nav>  
		</div>	
	
	<!-- showcase_w3layouts -->	
	<div class="showcase_w3layouts">
		<div class="container">
		<h3 class="heading-agileinfo">Welcome<span>每一个员工都是我们的未来</span></h3>
			<div class="our_agile-info">
			<div class="showcase">
				<div class="thumbnail thumbnail--awesome">
					<div class="thumbnail__overlay">
						
					</div>
				</div>
				<div class="desc">
				
					<h4>Birthday</h4>
					<p>Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut l
					</p>
				</div>
			</div>
			
			<div class="showcase showcase--inverted">
				<div class="desc">
					
					<h4>Wedding</h4>
					<p>Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut l
					</p>
				</div>
				<div class="thumbnail thumbnail--awesome1">
					<div class="thumbnail__overlay">
						
					</div>
				</div>
			</div>
			<div class="showcase">
				<div class="thumbnail thumbnail--awesome2">
					<div class="thumbnail__overlay">
						
					</div>
				</div>
				<div class="desc">
				
					<h4>Sangeet</h4>
					<p>Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut l
					</p>
				</div>
			</div>
			<div class="showcase showcase--inverted">
				<div class="desc">
					
					<h4>Catering</h4>
					<p>Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut l
					</p>
				</div>
				<div class="thumbnail thumbnail--awesome3">
					<div class="thumbnail__overlay">
					
					</div>
				</div>
			</div>
			<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<!--<div class="tlinks">Collect from <a href="http://www.cssmoban.com/" >建站模板</a></div>-->
<!-- //showcase_w3layouts -->	



<!-- footer-top -->	
	<div class="footer-top">
		<div class="container">
			<div class="col-md-3 foot-left">
				<h3>关于我们</h3>
			
				<p>60%的价格产出100%的品质！，用精湛的技术为客户提供最优质的服务。
					我们始终坚持：专注于技术服务、专注于产品创新。</p>
			</div>
			<div class="col-md-3 foot-left">
					<h3>联系方式</h3>
					<p>如果您有建议或者合作相关事宜，以下是我们的联系方式。</p>
				
						<div class="contact-btm">
							<span class="glyphicon glyphicon-map-marker" aria-hidden="true"></span>
							<p>江西, 萍乡, 萍乡学院</p>
						</div>
						<div class="contact-btm">
							<span class="glyphicon glyphicon-earphone" aria-hidden="true"></span>
							<p>+86 18279425670</p>
						<div class="contact-btm">
						</div>
							<span class="fa fa-envelope-o" aria-hidden="true"></span>
							<p><a href="mailto:example@email.com">Gstechnology@163.com</a></p>
						</div>
						<div class="clearfix"></div>

			</div>
			<div class="col-md-3 foot-left">
				<h3>公司活动</h3>
				<ul>
					<li><a href="#" data-toggle="modal" data-target="#myModal"><img src="${pageContext.servletContext.contextPath }/assets/shouye/images/g1.jpg" alt="" class="img-responsive"></a></li>
					<li><a href="#" data-toggle="modal" data-target="#myModal"><img src="${pageContext.servletContext.contextPath }/assets/shouye/images/g2.jpg" alt="" class="img-responsive"></a></li>
					<li><a href="#" data-toggle="modal" data-target="#myModal"><img src="${pageContext.servletContext.contextPath }/assets/shouye/images/g3.jpg" alt="" class="img-responsive"></a></li>
					<li><a href="#" data-toggle="modal" data-target="#myModal"><img src="${pageContext.servletContext.contextPath }/assets/shouye/images/g4.jpg" alt="" class="img-responsive"></a></li>
				</ul>
				<div class="clearfix"></div>
			</div>
			<div class="col-md-3 foot-left">
			<h3>反馈</h3>
			<p>如果你有什么疑问或者版权相关问题，可以跟我们反馈。 </p>
			<form action="#" method="post">	
					<input type="email" Name="Enter Your Email" placeholder="您的邮箱" required="">
				<input type="submit" value="提交">
			</form>
			</div>
				<div class="clearfix"></div>
		</div>
	</div>
<!-- /footer-top -->							

<!-- bootstrap-modal-pop-up -->
	<div class="modal video-modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModal">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					员工登录
					<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>						
				</div>
			<form method="post" id="emp" action="${pageContext.servletContext.contextPath }/employee/login" >
			<div id="lodin1" class="L_s">
				<p><input type="text" name="eName" placeholder="账号"></p>
				<p><input type="password" name="ePassword" placeholder="密码"></p>
				<p><input type="checkbox">记住密码 </p>
				<p>
					<button id="login">登录</button>
					<button id="cancel" name="close" data-dismiss="modal" aria-label="Close">取消</button>
				</p>
			</div>
			</form>
		</div>
	</div>
<!-- //bootstrap-modal-pop-up --> 
<a href="#" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>

<script src="${pageContext.servletContext.contextPath }/assets/shouye/js/jquery-2.2.3.min.js"></script> 
	
<!-- skills -->
			<script type="text/javascript">
				$(function(){
					if("${msg}"!=null&&"${msg}"!=""){
						alert("${msg}");
					}
					$("#login").click(function(){
						$("#emp").submit();
					});
				});
			</script>
						<script src="${pageContext.servletContext.contextPath }/assets/shouye/js/responsiveslides.min.js"></script>
			<script>
						// You can also use "$(window).load(function() {"
						$(function () {
						  // Slideshow 4
						  $("#slider4").responsiveSlides({
							auto: true,
							pager:true,
							nav:false,
							speed: 500,
							namespace: "callbacks",
							before: function () {
							  $('.events').append("<li>before event fired.</li>");
							},
							after: function () {
							  $('.events').append("<li>after event fired.</li>");
							}
						  });
					
						});
			</script>
			
			<script>
								// You can also use "$(window).load(function() {"
								$(function () {
								  // Slideshow 4
								  $("#slider3").responsiveSlides({
									auto: true,
									pager:false,
									nav:true,
									speed: 500,
									namespace: "callbacks",
									before: function () {
									  $('.events').append("<li>before event fired.</li>");
									},
									after: function () {
									  $('.events').append("<li>after event fired.</li>");
									}
								  });
							
								});
							 </script>

<!-- start-smoth-scrolling -->
<!-- OnScroll-Number-Increase-JavaScript -->
	<script type="text/javascript" src="${pageContext.servletContext.contextPath }/assets/shouye/js/numscroller-1.0.js"></script>
<!-- //OnScroll-Number-Increase-JavaScript -->
<!--flexiselDemo1 -->
 <script type="text/javascript">
							$(window).load(function() {
								$("#flexiselDemo1").flexisel({
									visibleItems: 2,
									animationSpeed: 1000,
									autoPlay: true,
									autoPlaySpeed: 3000,    		
									pauseOnHover: true,
									enableResponsiveBreakpoints: true,
									responsiveBreakpoints: { 
										portrait: { 
											changePoint:480,
											visibleItems: 1
										}, 
										landscape: { 
											changePoint:640,
											visibleItems: 1
										},
										tablet: { 
											changePoint:991,
											visibleItems: 1
										}
									}
								});
								
							});
			</script>
			<script type="text/javascript" src="${pageContext.servletContext.contextPath }/assets/shouye/js/jquery.flexisel.js"></script>
<!--//flexiselDemo1 -->

<script type="text/javascript" src="${pageContext.servletContext.contextPath }/assets/shouye/js/move-top.js"></script>
<script type="text/javascript" src="${pageContext.servletContext.contextPath }/assets/shouye/js/easing.js"></script>
<script type="text/javascript">
	jQuery(document).ready(function($) {
		$(".scroll").click(function(event){		
			event.preventDefault();
			$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
		});
	});
</script>
<!-- start-smoth-scrolling -->
	<script src="${pageContext.servletContext.contextPath }/assets/shouye/js/bootstrap.js"></script>
<!-- //for bootstrap working -->
<!-- here stars scrolling icon -->
	<script type="text/javascript">
		$(document).ready(function() {
			/*
				var defaults = {
				containerID: 'toTop', // fading element id
				containerHoverID: 'toTopHover', // fading element hover id
				scrollSpeed: 1200,
				easingType: 'linear' 
				};
			*/
								
			$().UItoTop({ easingType: 'easeOutQuart' });
								
			});
	</script>
	<style>
		input[type=text],input[type=password]{
			width: 300px;
			height: 40px;
			border-radius: 6px;
			outline: none;
			border: 1px #E5E5E5 solid;
			text-indent: 10px;
			
		}
		
		
		#login,#cancel{
			width: 150px;
			height: 40px;
			border-radius: 6px;
			border: 0;
			background-color:#4490f7;
			text-align: center;
			line-height: 40px;
			padding: 0px;
		}
		/*#login label{
			margin: auto;
			line-height: 40px;
		}*/
		.L_s{
			line-height: 57px;
			text-align: center;
		}
		
	</style>
<!-- //here ends scrolling icon -->
</body>
</html>
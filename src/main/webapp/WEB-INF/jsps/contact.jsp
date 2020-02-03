<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
<title>应聘页面</title>
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
	<div class="w3ls-banner-1"> 
		<!-- banner-text --> 
	
	<!-- //banner --> 
			<!-- header -->
		<div class="header-w3layouts"> 
			<!-- Navigation -->
			<nav class="navbar navbar-default navbar-fixed-top">
				<div class="container">
					<div class="navbar-header page-scroll">
						<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
							<span class="sr-only">Join Us</span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
						</button>
						<h1><a class="navbar-brand" href="index.html">Join Us</a></h1>
					</div> 
					<!-- Collect the nav links, forms, and other content for toggling -->
					<div class="collapse navbar-collapse navbar-ex1-collapse">
						<ul class="nav navbar-nav navbar-right">
							<!-- Hidden li included to remove active class from about link when scrolled up past about section -->
							<li class="hidden"><a class="page-scroll" href="#page-top"></a>	</li>
					
							<li><a class="hvr-sweep-to-right" href="${pageContext.servletContext.contextPath }/applyPage">加入我们</a></li>
						</ul>
					</div>
					<!-- /.navbar-collapse -->
				</div>
				<!-- /.container -->
			</nav>  
		</div>	
		<!-- //header -->
	</div>	
<!-- contact -->	
	<div class="w3ls_address_mail_footer_grids">
	<div class="container">
	<h2 class="heading-agileinfo">简历填写<span>给自己一个机会，成就一个属于你的未来</span></h2>
		
		<div class="col-md-6 contact-form">
				<h4 class="white-w3ls">加入我们</h4>
				<form id="apply" action="#" method="post" enctype="multipart/form-data">
					<div class="styled-input agile-styled-input-top">
						<input type="text" name="apName" required maxlength="11" onkeyup="value=value.replace(/[^\a-\z\A-\Z\u4E00-\u9FA5]/g,'')">
						<label>名字</label>
						<span></span>
					</div>
					<div class="styled-input">
					<label>性别</label>
					<br><br>
						<select name="apGender" class="form-control">
							<option value="男">男</option>
							<option value="女">女</option>
						</select>
						<span></span>
					</div>
					<div class="styled-input">
						<input type="text" name="apAge" required onKeyUp="value=value.replace(/\D/g,'')" onafterpaste="value=value.replace(/\D/g,'')" maxlength="2">
						<label>年龄</label>
						<span></span>
					</div>
					<div class="styled-input">
						<input type="text" name="apPhone" required onKeyUp="value=value.replace(/\D/g,'')" onafterpaste="value=value.replace(/\D/g,'')" maxlength="11">
						<label>电话</label>
						<span></span>
					</div>
					<div class="styled-input">
						<label>学历</label>
						<br><br>
						<select class="form-control" name="apEdu">
							<option value="专科">专科</option>
							<option value="本科">本科</option>
							<option value="硕士研究生">硕士研究生</option>
							<option value="博士研究生">博士研究生</option>
						</select>
						<span></span>
					</div>
					<div class="styled-input">
						<input type="text" name="apNumber" required onKeyUp="value=value.replace(/\D/g,'')" onafterpaste="value=value.replace(/\D/g,'')" maxlength="18">
						<label>身份证号</label>
						<span></span>
					</div>
					<div class="styled-input">
						<label>应聘部门</label>
						<br><br>
						<select class="form-control" id="department" name="dName">
							<!-- <option>产品部门</option> -->
						</select>
						<span></span>
					</div>
					<div class="styled-input">
						<label>应聘职位</label>
						<br><br>
						<select class="form-control" id="position" name="pPosition">
							<!-- <option>产品经理</option> -->
						</select>
						<span></span>
					</div>
					<div class="styled-input">
						<label>简历上传</label>
						<br><br>
						<input type="file" name="file" required>
						<span></span>
					</div>
					
					<br />
					<br />
					<div id="sm" class="smw">
						<label>工作经历简述</label>
					</div>
					<div class="styled-input2">
						<textarea name="apExp" required maxlength="300"></textarea>
						<span></span>
					</div>	 
					<input type="submit" id="commit" value="提交">
				</form>
			</div>
			<div class="col-md-6 contactright">
				<h3>公司地址</h3>
				<div class="w3ls_footer_grid_left">
					<div class="wthree_footer_grid_left">
						<i class="fa fa-map-marker" aria-hidden="true"></i>
					</div>
					<p>江西 - 萍乡   萍乡学院<span>New York City 90210.</span></p>
				</div>
				<div class="w3ls_footer_grid_left">
					<div class="wthree_footer_grid_left">
						<i class="fa fa-phone" aria-hidden="true"></i>
					</div>
					<p>+(000) 123 4565 32 <span>+(010) 123 4565 35</span></p>
				</div>
				<div class="w3ls_footer_grid_left">
					<div class="wthree_footer_grid_left">
						<i class="fa fa-envelope-o" aria-hidden="true"></i>
					</div>
					<p><a href="mailto:info@example.com">info@example1.com</a> 
						<span><a href="mailto:info@example.com">info@example2.com</a></span></p>
				</div>
			</div>
			<div class="clearfix"> </div>
	</div>
</div>
<!-- //contact -->	
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
					
				</div>
				<form method="get" id="emp" action="${pageContext.servletContext.contextPath }/employee/login" >
			<div id="lodin1" class="L_s">
				<p><input type="text" name="eName" placeholder="账号"></p>
				<p><input type="password" name="ePassword" placeholder="密码"></p>
				<p><input type="checkbox">记住密码</p>
				<p>
					<button id="login">登录</button>
					<button id="cancel" name="close" onclick="window.close();">取消</button>
				</p>
			</div>
			</form>
		</div>
		</div>
	</div>
<!-- //bootstrap-modal-pop-up --> 
<a href="#" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>

<script type="text/javascript">
	$(function(){
		$.ajax({
			url:"${pageContext.servletContext.contextPath }/recruit/allDepartment",
			type:"get",
			success:function(res){
				var departments=res.extend.departments;
				for(var k=0;k<departments.length;k++){
					$("#department").append("<option value="+departments[k].dName+">"+departments[k].dName+"</option>")
				}
				
				var positions=departments[0].positions;
				for(var i=0;i<positions.length;i++){
					$("#position").append("<option value="+positions[i].pName+">"+positions[i].pName+"</option>");
				}
			}
		});
		$("#department").change(function(){
			$.ajax({
				url:"${pageContext.servletContext.contextPath }/recruit/department/"+$(this).val(),
				type:"get",
				success:function(res){
					$("#position").empty();
					var positions=res.extend.department.positions;
					for(var i=0;i<positions.length;i++){
						$("#position").append("<option value="+positions[i].pName+">"+positions[i].pName+"</option>");
					}
				}
			});
		});
		$("#commit").click(function () {
                var sendUrl="${pageContext.servletContext.contextPath }/recruit/commit";
                var formData=new FormData(document.getElementById("apply"));
           	   $.ajax({
                      url:sendUrl,
                      data:formData,
                      type:"post",
                      contentType:false,
                      processData:false,
                      success:function (res) {
                          alert(res.msg);
                          if(res.msg=="提交个人信息成功!请等待消息!"){
			                  $("#apply")[0].reset();
                          }
                      }
                  });
                  return false;
        });
	});
</script>

<script src="${pageContext.servletContext.contextPath }/assets/js/jquery-2.2.3.min.js"></script> 
	
<!-- skills -->
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

	<script src="${pageContext.servletContext.contextPath }/assets/shouye/js/bootstrap.js"></script>

	<script type="text/javascript">
		$(document).ready(function() {
							
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
		
		.L_s{
			line-height: 57px;
			text-align: center;
		}
		
		.smw{
			color: white;
		}
		
	</style>
	

</body>
</html>
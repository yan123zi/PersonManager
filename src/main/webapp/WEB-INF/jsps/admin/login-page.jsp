<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8" />
    <link rel="apple-touch-icon" sizes="76x76" href="${pageContext.servletContext.contextPath }/assets/img/apple-icon.png">
    <!--<link rel="icon" type="image/png" href="assets/img/favicon.png">-->
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <title>登录界面</title>
    <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />
    <link href="${pageContext.servletContext.contextPath }/assets/css/bootstrap.min.css" rel="stylesheet" />
    <link href="${pageContext.servletContext.contextPath }/assets/css/now-ui-kit.css?v=1.1.0" rel="stylesheet" />
    <!-- CSS Just for demo purpose, don't include it in your project -->
    <link href="${pageContext.servletContext.contextPath }/assets/css/demo.css" rel="stylesheet" />
    <script src="${pageContext.servletContext.contextPath }/assets/js/jquery-3.3.1.min.js" type="text/javascript"></script>
    <script src="https://use.fontawesome.com/ab5ac4015d.js"></script>
    <!-- Canonical SEO -->
    <link rel="canonical" href="" />
    <!--  Social tags      -->
    <meta name="keywords" content="">
    <meta name="description" content="">
</head>
<body class="login-page sidebar-collapse">
    <!-- Navbar -->
    <nav class="navbar navbar-expand-lg bg-primary fixed-top navbar-transparent " color-on-scroll="400">
        <div class="container">
            <div class="dropdown button-dropdown">
            </div>
       
        </div>
    </nav>
    <div class="page-header" filter-color="orange">
        <div class="page-header-image" style="background-image:url(${pageContext.servletContext.contextPath }/assets/img/login.jpg)"></div>
        <div class="container">
            <div class="col-md-4 content-center">
                <div class="card card-login card-plain">
                    <form class="form" method="post" action="${pageContext.servletContext.contextPath }/admin/login" id="loginForm">
                        <div class="header header-primary text-center">
                            <div class="logo-container">
                                <img src="${pageContext.servletContext.contextPath }/assets/img/now-logo4.png" alt="">
                            </div>
                        </div>
                        <div class="content">
                            <div class="input-group form-group-no-border input-lg">
                                <span class="input-group-addon">
                                    <i class="fa fa-user" aria-hidden="true" style="margin-right: 5px"></i>
                                </span>
                                <input type="text" class="form-control" id="name" name="aUsername" required="required" value="${admin.aUsername }" placeholder="管理员账号">
                            </div>
                            <div class="input-group form-group-no-border input-lg">
                                <span class="input-group-addon">
                                    <i class="fa fa-key" aria-hidden="true" style="margin-right: 5px"></i>
                                </span>
                                <input type="password" placeholder="密码" id="password" name="aPassword" required="required" value="${admin.aPassword }" class="form-control" />
                            </div>
                            
                            
                            <div class="input-group form-group-no-border input-lg">
                            	<span class="input-group-addon">
                                    <i class="fa fa-key" aria-hidden="true" style="margin-right: 5px"></i>
                                </span>
                            	<input type="text" id="code" class="form-control" name="code" required="required" placeholder="填写验证码">
					     		 <img id="validateCode" style="border-radius: 0 10% 10% 0;" class="authCodeImg" src="${pageContext.servletContext.contextPath }/getCode?time=<%=new Date() %>"
					     		 	title="看不清可单击图片刷新" onclick="this.src='${pageContext.servletContext.contextPath }/getCode?time='+new Date().getTime();">
                            </div>
                            
                            <!-- <div class="form-check form-check-radio form-check-inline" style="float: right;">
							  <label class="form-check-label">
							    <input class="form-check-input" type="radio" name="inlineRadioOptions" id="admin" value="option1" checked="checked">管理员
							    <span class="form-check-sign"></span>
							  </label>
							</div> -->
							<!-- <div class="form-check form-check-radio form-check-inline" style="float: right;padding-right: 10px">
							  <label class="form-check-label">
							    <input class="form-check-input" type="radio" name="inlineRadioOptions" id="emp" value="option2">员工
							    <span class="form-check-sign"></span>
							  </label>
							</div> -->
							
                        </div>
                        <div  class="footer text-center">
                            <input type="submit" id="login" class="btn btn-primary btn-round btn-lg btn-block" value="登录"/>
                        </div>
                       
                        <div class="pull-right">
                            <h5>
                                <a href="#pablo" class="link">需要帮助</a>
                            </h5>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <footer class="footer">
            <div class="container">
                <div class="copyright">
                    &copy;
                    <script>
                        document.write(new Date().getFullYear())
                    </script>Designed by groupfour  Creative人力资源管理系统
                </div>
            </div>
        </footer>
    </div>

	<!-- Modal -->
	<div class="modal fade" id="alert" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title" id="msg">${msg }</h4>
	      </div>
	      <div class="modal-body">
	        
	      </div>
	    </div>
	  </div>
	</div>
	</div>
</body>
<!-- javascript代码 -->
<script type="text/javascript">
	$(function(){
		if($("#msg").text().length>0&&$("#msg").text()!=""){
			$("#alert").modal("show");
		}
		/* $("#admin").click(function(){
			$("#role").val("1");
			$("#name").attr("name","aUsername");
			$("#password").attr("name","aPassword");
		});
		$("#emp").click(function(){
			$("#role").val("2");
			$("#name").attr("name","eName");
			$("#password").attr("name","ePassword");
		}); */
	});
</script>
<!--   Core JS Files   -->

<script src="${pageContext.servletContext.contextPath }/assets/js/core/popper.min.js" type="text/javascript"></script>
<script src="${pageContext.servletContext.contextPath }/assets/js/core/bootstrap.min.js" type="text/javascript"></script>
<!--  Plugin for Switches, full documentation here: http://www.jque.re/plugins/version3/bootstrap.switch/ -->
<script src="${pageContext.servletContext.contextPath }/assets/js/plugins/bootstrap-switch.js"></script>
<!--  Plugin for the Sliders, full documentation here: http://refreshless.com/nouislider/ -->
<script src="${pageContext.servletContext.contextPath }/assets/js/plugins/nouislider.min.js" type="text/javascript"></script>
<!--  Plugin for the DatePicker, full documentation here: https://github.com/uxsolutions/bootstrap-datepicker -->
<script src="${pageContext.servletContext.contextPath }/assets/js/plugins/bootstrap-datepicker.js" type="text/javascript"></script>
<!-- Share Library etc -->
<script src="${pageContext.servletContext.contextPath }/assets/js/plugins/jquery.sharrre.js" type="text/javascript"></script>
<!-- Control Center for Now Ui Kit: parallax effects, scripts for the example pages etc -->
<script src="${pageContext.servletContext.contextPath }/assets/js/now-ui-kit.js?v=1.1.0" type="text/javascript"></script>

</html>
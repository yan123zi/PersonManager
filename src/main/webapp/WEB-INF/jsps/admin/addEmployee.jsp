<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="en">

    <head>
    	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    
    	
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>添加员工信息</title>
        <link rel="shortcut icon" href="http://placehold.it/64.png/000/fff">
        <link rel="apple-touch-icon" sizes="144x144" href="http://placehold.it/144.png/000/fff">
        <link rel="apple-touch-icon" sizes="114x114" href="http://placehold.it/114.png/000/fff">
        <link rel="apple-touch-icon" sizes="72x72" href="http://placehold.it/72.png/000/fff">
        <link rel="apple-touch-icon" sizes="57x57" href="http://placehold.it/57.png/000/fff">
        <script type="text/javascript" src="${pageContext.servletContext.contextPath }/assets/js/jquery-3.3.1.min.js"></script>
        <link href="${pageContext.servletContext.contextPath }/assets/css/lib/font-awesome.min.css" rel="stylesheet">
        <link href="${pageContext.servletContext.contextPath }/assets/css/lib/themify-icons.css" rel="stylesheet">
        <link href="${pageContext.servletContext.contextPath }/assets/css/lib/owl.carousel.min.css" rel="stylesheet" />
        <link href="${pageContext.servletContext.contextPath }/assets/css/lib/owl.theme.default.min.css" rel="stylesheet" />
        <link href="${pageContext.servletContext.contextPath }/assets/css/lib/weather-icons.css" rel="stylesheet" />
        <link href="${pageContext.servletContext.contextPath }/assets/css/lib/menubar/sidebar.css" rel="stylesheet">
        <link href="${pageContext.servletContext.contextPath }/assets/css/lib/bootstrap.min.css" rel="stylesheet">
        <link href="${pageContext.servletContext.contextPath }/assets/css/lib/helper.css" rel="stylesheet">
        <link href="${pageContext.servletContext.contextPath }/assets/css/style.css" rel="stylesheet">
        <script language="javascript" type="text/javascript"  src="${pageContext.servletContext.contextPath }/assets/js/lib/datepicker/WdatePicker.js"></script>
    </head>

    <body>

		<jsp:include page="component/navigation.jsp"></jsp:include>
        <jsp:include page="component/header.jsp"></jsp:include>

        <div class="content-wrap">
            <div class="main">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-lg-8 p-r-0 title-margin-right">
                            <div class="page-header">
                                <div class="page-title">
                                    <h1>你好，<span>欢迎进入人力资源管理系统</span></h1>
                                </div>
                            </div>
                        </div>
                    </div>
                       </div>
                       <div class="row">
                        <div class="col-lg-12">
                            <div class="card">
                                <div class="card-title">
                                    <h4>员工信息表</h4>
                                    
                                </div>
                                <div class="card-body">
                                    <div class="basic-elements">
                                        <form id="employee" method="post" action="${pageContext.servletContext.contextPath }/adminEmployee/addEmployee">
                                            <div class="row">
                                                <div class="col-lg-4">
                                                    <div class="form-group">
                                                        <label>员工姓名</label>
                                                        <input id="example-email" class="form-control" required="required" type="text" placeholder="员工姓名" name="eName" maxlength="11" onkeyup="value=value.replace(/[^\a-\z\A-\Z\u4E00-\u9FA5]/g,'')">
                                                    </div>
                                                    <div class="form-group">
                                                        <label>性别</label>
                                                        <select class="form-control" name="eGender">
															<option value="男">男</option>
															<option value="女">女</option>
														</select>
                                                    </div>
                                                    <div class="form-group">
                                                        <label>年龄</label>
                                                        <input class="form-control" type="text" required="required" name="eAge" value="" placeholder="请填入你的年龄" onKeyUp="value=value.replace(/\D/g,'')" onafterpaste="value=value.replace(/\D/g,'')" maxlength="2">
                                                    </div>
                                                    <div class="form-group">
                                                        <label>手机号码</label>
                                                        <input class="form-control" type="text" required="required" name="ePhone" placeholder="请输入手机号码" onKeyUp="value=value.replace(/\D/g,'')" onafterpaste="value=value.replace(/\D/g,'')" maxlength="11">
                                                    </div>
                                                    
                                                   
                                                </div>
                                                <div class="col-lg-4">
                                                    <div class="form-group">
                                                        <label>员工登录密码</label>
                                                        <input type="hidden" name="ePassword" value="123456"/>
                                                        <input class="form-control" type="text" value="123456" disabled>
                                                    </div>
                                                    <div class="form-group">
                                                        <label>邮箱地址</label>
                                                        <input id="example-email" class="form-control" required="required" type="email"  placeholder="email" name="eEmail">
                                                    </div>
                                                     <div class="form-group">
                                                    	<label>身份证号</label>
                                                        <input class="form-control" type="text" required="required" name="eNumber" placeholder="请输入身份证号" onKeyUp="value=value.replace(/\D/g,'')" onafterpaste="value=value.replace(/\D/g,'')" maxlength="18">
                                                    </div>
                                                    <div class="form-group">
                                                        <label>政治面貌</label>
                                                        <select class="form-control" name="ePolitical">
															<option value="群众">群众</option>
															<option value="共青团员">共青团员</option>
															<option value="预备党员">预备党员</option>
															<option value="中共党员">中共党员</option>
														</select>
                                                    </div>
                                                   <div class="form-group">
                                                        <label>出生日期</label><br />
                                        				<input name="eBorn" type="text"  required="required"  class="Wdate form-control" onfocus="WdatePicker()">
                                                    </div>
                                                </div>
                                                 <div class="col-lg-4">
                                                    	<label>地址</label><br />
  														<div data-toggle="distpicker">
						  									<select name="pro" data-province="---- 选择省 ----"></select>
						  									<select name="city" data-city="---- 选择市 ----"></select>
						  									<select name="area" data-district="---- 选择区 ----"></select>
														</div>
                                                     <div class="form-group">
                                                        <label>学历</label>
                                                        <select class="form-control" name="eEdu">
															<option value="中专">中专</option>
															<option value="大专">大专</option>
															<option value="本科">本科</option>
															<option value="硕士">硕士</option>
															<option value="博士">博士</option>
														</select>
                                                    </div>
                                                    <div class="form-group">
                                                        <label>所属部门</label>
                                                        <select class="form-control" id="department" name="dName">
															<!-- <option>产品部门</option> -->
														</select>
                                                    </div>
                                                   <div class="form-group">
                                                        <label>所属职位</label>
                                                        <select class="form-control" id="position" name="pPosition">
															<!-- <option>产品经理</option> -->
														</select>
                                                    </div>
                                                     <div class="form-group">
                                                        <label>入职时间</label><br />
                                                        <input name="eBegin" type="text"  required="required"  class="Wdate form-control" onfocus="WdatePicker()">
                                                    </div>
												   <div style="text-align: right;">
														<input type="submit" class="btn btn-primary btn-rounded m-b-10 m-l-5" value="提交信息"></input>
												   </div>
                                                </div>
                                            </div>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                       
                       
                        <div class="row">
                            <div class="col-lg-12">
                                <div class="footer">
                                    <p>2019 © Admin Board. - <a href="#"></a> / More Templates <a href="#" target="" title="">人力资源管理系统</a> - Collect from zijiangTeam</a></p>
                                    
                                </div>
                            </div>
                        </div>
                    </section>
                </div> 
            </div>
        </div>
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
    		$("#employee").submit(function(){
    			console.log($("#employee").serialize());
    		});
        });
        </script>
        <!-- nano scroller -->
        <!-- sidebar -->
		<!-- jquery vendor -->
        <script src="${pageContext.servletContext.contextPath }/assets/js/lib/jquery.nanoscroller.min.js"></script>
        <!-- nano scroller -->
        <script src="${pageContext.servletContext.contextPath }/assets/js/lib/menubar/sidebar.js"></script>
        <script src="${pageContext.servletContext.contextPath }/assets/js/lib/preloader/pace.min.js"></script>
        <!-- sidebar -->
		<script src="${pageContext.servletContext.contextPath }/assets/js/lib/bootstrap.min.js"></script>
        <script src="${pageContext.servletContext.contextPath }/assets/js/scripts.js"></script>
        <script src="${pageContext.servletContext.contextPath }/assets/js/lib/bootstrap.min.js"></script>
        <script src="${pageContext.servletContext.contextPath }/assets/js/scripts.js"></script>
        <script src="${pageContext.servletContext.contextPath }/assets/js/lib/bootstrap.min.js"></script>
        <script src="${pageContext.servletContext.contextPath }/assets/js/scripts.js"></script>
        <!-- scripit init-->
    
     <!-- 引用地址三级联动插件-->
    		<script src="${pageContext.servletContext.contextPath }/assets/js/lib/dist/distpicker.data.js"></script>
		<script src="${pageContext.servletContext.contextPath }/assets/js/lib/dist/distpicker.js"></script>
		<script src="${pageContext.servletContext.contextPath }/assets/js/lib/dist/main.js"></script>
		<!-- 引用日期插件-->
		
    </body>

</html>
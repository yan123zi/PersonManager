<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>员工个人信息</title>

    <!-- ================= Favicon ================== -->
    <!-- Standard -->
    <link rel="shortcut icon" href="http://placehold.it/64.png/000/fff">
    <!-- Retina iPad Touch Icon-->
    <link rel="apple-touch-icon" sizes="144x144" href="http://placehold.it/144.png/000/fff">
    <!-- Retina iPhone Touch Icon-->
    <link rel="apple-touch-icon" sizes="114x114" href="http://placehold.it/114.png/000/fff">
    <!-- Standard iPad Touch Icon-->
    <link rel="apple-touch-icon" sizes="72x72" href="http://placehold.it/72.png/000/fff">
    <!-- Standard iPhone Touch Icon-->
    <link rel="apple-touch-icon" sizes="57x57" href="http://placehold.it/57.png/000/fff">


    <!-- Common -->
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/font-awesome.min.css" rel="stylesheet">
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/themify-icons.css" rel="stylesheet">
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/menubar/sidebar.css" rel="stylesheet">
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/helper.css" rel="stylesheet">
    <link href="${pageContext.servletContext.contextPath }/assets/css/style.css" rel="stylesheet">
    <script type="text/javascript" src="${pageContext.servletContext.contextPath }/assets/js/jquery-3.3.1.min.js"></script>
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
          <!-- /# column -->
        
        <section id="main-content">
          <div class="row">
            <div class="col-lg-12">
              <div class="card">
                <div class="card-body">
                  <div class="user-profile">
                    <div class="row">
                      <div class="col-lg-4">
                        <div class="user-photo m-b-30">
                        <c:if test="${employee.eImage==null }">
                        	<img class="img-fluid" src="${pageContext.servletContext.contextPath }/assets/images/user-profile.jpg" alt="" />
                        </c:if>
                          <img class="img-fluid" src="${employee.eImage }" alt="" />
                        </div>
                        <div class="user-work">
                          <h4>工作</h4>
                          <div class="work-content">
                            <h3>员工编号</h3>
                            <p>${employee.eId }</p>
                            <h3>所属部门</h3>
                            <select id="department" style="margin-bottom: 16px;" class="form-control" id="department" name="dName">
							</select>
                            <%-- <input style="border: white;color: #868e96;margin-bottom: 16px;" value="${employee.position.department.dName }"/> --%>
                            <h3>所属职位</h3>
                            <select id="position" style="margin-bottom: 16px;" class="form-control" id="position" name="pPosition">
							</select>
                            <%-- <input style="border: white;color: #868e96;margin-bottom: 16px;" value="${employee.position.pName }"/> --%>
                          </div>
                          <div class="work-content">
                            <h3>工作情况</h3>
                            <p></p>
                            <div class="job-content">
                              <span class="contact-title">是否在职：</span>
                              <span class="job-option">在职</span>
                            </div>
                            <div class="job-content">
                              <span class="contact-title">入职时间：</span>
                              <span class="job-date"><fmt:formatDate type="date"  value="${employee.eBegin}" /></span>
                            </div>
                            <div class="job-content">
                              <span class="contact-title">是否公司人才：</span>
                              <span class="job-date">
                              	<c:if test="${employee.eIftalent==1}">
                              		是
                              	</c:if>
                              		否
                              </span>
                            </div>
                           
                          </div>
                        </div>
                        <div class="user-skill">
                          <h4>技能</h4>
                          <form>
                          <ul>
                            <li>
                              java
                            </li>
                            <li>
                           C/C++
                            </li>
                            <li>
                              	网页设计
                            </li>
                            <li>
                              	数据库
                            </li>
                          </ul>
                          </form>
                        </div>
                      </div>
                      <div class="col-lg-8">
                        <div class="user-profile-name">${employee.eName }</div>
                        <div class="user-Location">
                          <i class="ti-location-pin"></i>深圳市松岗街道新岗东路51号佳德福工业园5栋</div>
                        <div class="user-job-title">${employee.position.pName }</div>
                        <div class="ratings">
                          <h4>评级</h4>
                          <div class="rating-star">
                            <span>8.9</span>
                            <i class="ti-star color-primary"></i>
                            <i class="ti-star color-primary"></i>
                            <i class="ti-star color-primary"></i>
                            <i class="ti-star color-primary"></i>
                            <i class="ti-star color-dey"></i>
                          </div>
                        </div>
                        <div class="user-send-message">
                          <button class="btn btn-primary btn-addon"  data-toggle="modal" data-target="#mailSend" type="button">
                            <i class="ti-email"></i>发送邮件</button>
                            <button class="btn btn-primary btn-addon" data-toggle="modal" data-target="#password" type="button">
                            <i class="ti-user"></i>重设密码</button>
                        </div>
                        <!-- Email Send -->
						<div class="modal fade" id="mailSend" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
						  <div class="modal-dialog" role="document">
						    <div class="modal-content">
						      <div class="modal-header">
						        <h4 class="modal-title" id="myModalLabel">邮件信息发送</h4>
						        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
						      </div>
						      <div class="modal-body">
						      	<form id="EmailMessage" method="post" action="#">
						      	<input type="hidden" name="recipient" value="${employee.eEmail }">
								  <div class="form-group">
								    <label for="exampleInputEmail1">信息标题</label>
								    <input type="text" name="title" class="form-control" id="exampleInputEmail1" placeholder="Email Title">
								  </div>
								  <div class="form-group">
								  	<label for="eMessage">邮件内容</label>
								  	<textarea name="content" id="eMessage" style="width: 440px;height: 200px" placeholder="Email Content"></textarea>
								  </div>
								</form>
						      </div>
						      <div class="modal-footer">
						        <button type="button" id="messageSend" class="btn btn-primary">Send Email</button>
						        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
						      </div>
						    </div>
						  </div>
						</div>
						<!-- Password Update -->
						<div class="modal fade" id="password" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
						  <div class="modal-dialog" role="document">
						    <div class="modal-content">
						      <div class="modal-header">
						        <h4 class="modal-title" id="myModalLabel">设置该员工的新密码</h4>
						        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
						      </div>
						      <div class="modal-body">
						      	<form:form id="NewPassword" method="put" action="#">
						      	<input type="hidden" name="eId" value="${employee.eId }">
								  <div class="form-group">
								    <label for="newPassword">输入新的密码</label>
								    <input type="password" name="title" class="form-control" id="newPassword" placeholder="new password">
								  </div>
								  <div class="form-group">
								    <label for="newPassword2">再次输入新的密码</label>
								    <input type="password" name="newPassword" class="form-control" id="newPassword2" placeholder="new password">
								  </div>
								</form:form>
						      </div>
						      <div class="modal-footer">
						        <button type="button" id="passwordUpdate" class="btn btn-primary">Update</button>
						        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
						      </div>
						    </div>
						  </div>
						</div>
                        <div class="custom-tab user-profile-tab">
                          <ul class="nav nav-tabs" role="tablist">
                            <li role="presentation" class="active">
                              <a href="#1" aria-controls="1" role="tab" data-toggle="tab">相关</a>
                            </li>
                          </ul>
                          <div class="tab-content">
                            <div role="tabpanel" class="tab-pane active" id="1">
                              <div class="contact-information">
                                <h4>联系方式</h4>
                                <div class="phone-content">
                                  <span class="contact-title">电话：</span>
                                  <span class="phone-number">${employee.ePhone }</span>
                                </div>
                                <div class="email-content">
                                  <span class="contact-title">邮箱：</span>
                                  <span class="contact-email">${employee.eEmail }</span>
                                </div>
                                <div class="skype-content">
                                  <span class="contact-title">学历：</span>
                                  <select class="form-control" id="eEdu">
										<option value="中专">中专</option>
										<option value="大专">大专</option>
										<option value="本科">本科</option>
										<option value="硕士">硕士</option>
										<option value="博士">博士</option>
									</select>
                                </div>
                              </div>
                              <div class="basic-information">
                                <h4>基本信息</h4>
                                <div class="birthday-content">
                                  <span class="contact-title">身份证号：</span>
                                  <span class="birth-date">${employee.eNumber }</span>
                                </div>
                                <div class="birthday-content">
                                  <span class="contact-title">生日：</span>
                                  <span class="birth-date"><fmt:formatDate type="date"  value="${employee.eBorn }" /></span>
                                </div>
                                <div class="birthday-content">
                                  <span class="contact-title">年龄：</span>
                                  <span class="age-date">${employee.eAge }</span>
                                </div>
                                <div class="gender-content">
                                  <span class="contact-title">性别：</span>
                                  <span class="gender">${employee.eGender }</span>
                                </div>
                                <div class="address-content">
                                  <span class="contact-title">籍贯：</span>
                                  <span class="mail-address">${employee.eAddress }</span>
                                </div>
                                <div class="address-content">
                                  <span class="contact-title">政治面貌：</span>
                                  <!-- <span class="mail-address"></span> -->
                                  <%-- <input class="form-control mail-address" style="" value="${employee.ePolitical }"/> --%>
                                  <select id="political" class="form-control" name="ePolitical">
                                  	<option value="群众">群众</option>
                                  	<option value="共青团员">共青团员</option>
                                  	<option value="预备党员">预备党员</option>
                                  	<option value="中共党员">中共党员</option>
                                  </select>
                                </div>
                                <div class="address-content">
                                	<button id="update" class="btn btn-primary" style="float: right;margin-top: 50px">修改</button>
                                </div>
                              </div>
                            </div>
                          </div>
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
          <form:form action="${pageContext.servletContext.contextPath }/adminEmployee/updateEmp" method="put" id="upEmp">
          	<input type="hidden" name="eId" value="${employee.eId }"/>
          	<input type="hidden" id="dName" name="position.department.dName" value=""/>
          	<input type="hidden" id="pName" name="position.pName" value=""/>
          	<input type="hidden" id="ePolitical" name="ePolitical" value=""/>
          	<input type="hidden" id="edu" name="eEdu"/>
          </form:form>
          <!-- /# row -->
          
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
			$("#empList").addClass("active");
			$("#people").addClass("open");
			if("${msg}"!=""&&"${msg}"!=null){
    			alert("${msg}")
    		}
			var dName="${employee.position.department.dName }";
			var position="${employee.position.pName }";
			var political="${employee.ePolitical}";
			var edu="${employee.eEdu}";
			var arr=$("#political option");
			for(var i=0;i<arr.length;i++){
				if(political==$(arr[i]).val()){
					$("#political").val(political);
				}else{
					$("#political option[value='群众']").attr("selected");
				}
			}
			
			$("#eEdu").val(edu);
			$.ajax({
				url:"${pageContext.servletContext.contextPath }/recruit/allDepartment",
				type:"get",
				success:function(res){
					var departments=res.extend.departments;
					if(dName!=""&&position!=""){
						for(var k=0;k<departments.length;k++){
							$("#department").append("<option value="+departments[k].dName+">"+departments[k].dName+"</option>")
							if(departments[k].dName==dName){
								var positions=departments[k].positions;
								for(var i=0;i<positions.length;i++){
									$("#position").append("<option value="+positions[i].pName+">"+positions[i].pName+"</option>");
								}
							}
						}
						$("#department").val(dName);
						$("#position").val(position);
					}else{
						for(var k=0;k<departments.length;k++){
							$("#department").append("<option value="+departments[k].dName+">"+departments[k].dName+"</option>")
						}
						
						var positions=departments[0].positions;
						for(var i=0;i<positions.length;i++){
							$("#position").append("<option value="+positions[i].pName+">"+positions[i].pName+"</option>");
						}
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
			
			
			$("#update").click(function(){
				$("#dName").val($("#department option:selected").val());
				$("#pName").val($("#position option:selected").val());
				$("#ePolitical").val($("#political option:selected").val());
				$("#edu").val($("#eEdu option:selected").val());
				$("#upEmp").submit();
			});
			
			
			$("#messageSend").click(function(){
				$.ajax({
					url:"${pageContext.servletContext.contextPath }/adminEmployee/emailSend",
					type:"post",
					data:$("#EmailMessage").serialize(),
					success:function(res){
						$("#exampleInputEmail1").val("");
						$("#eMessage").val("");
						alert(res.msg);
					}
				});
			});
			$("#passwordUpdate").click(function(){
				var newPassword=$("#newPassword").val();
				var newPassword2=$("#newPassword2").val();
				if(newPassword==newPassword2){
					$.ajax({
						url:"${pageContext.servletContext.contextPath }/adminEmployee/updatePassword",
						type:"post",
						data:$("#NewPassword").serialize(),
						success:function(res){
							$("#newPassword").val("");
							$("#newPassword2").val("");
							alert(res.msg);
						}
					});
				}else{
					alert("两次密码输入不正确!请确认后再提交!");
				}
			});
		});
	</script>






    <!-- Common -->
    <script src="${pageContext.servletContext.contextPath }/assets/js/lib/jquery.min.js"></script>
    <script src="${pageContext.servletContext.contextPath }/assets/js/lib/jquery.nanoscroller.min.js"></script>
    <script src="${pageContext.servletContext.contextPath }/assets/js/lib/menubar/sidebar.js"></script>
    <script src="${pageContext.servletContext.contextPath }/assets/js/lib/preloader/pace.min.js"></script>
    <script src="${pageContext.servletContext.contextPath }/assets/js/lib/bootstrap.min.js"></script>
    <script src="${pageContext.servletContext.contextPath }/assets/js/scripts.js"></script>




</body>

</html>
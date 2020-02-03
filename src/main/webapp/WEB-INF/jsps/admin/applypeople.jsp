<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>应聘者信息</title>

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

    <!-- Toastr -->
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/toastr/toastr.min.css" rel="stylesheet">
    <!-- Sweet Alert -->
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/sweetalert/sweetalert.css" rel="stylesheet">
    <!-- Range Slider -->
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/rangSlider/ion.rangeSlider.css" rel="stylesheet">
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/rangSlider/ion.rangeSlider.skinFlat.css" rel="stylesheet">
    <!-- Bar Rating -->
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/barRating/barRating.css" rel="stylesheet">
    <!-- Nestable -->
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/nestable/nestable.css" rel="stylesheet">
    <!-- JsGrid -->
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/jsgrid/jsgrid-theme.min.css" rel="stylesheet" />
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/jsgrid/jsgrid.min.css" type="text/css" rel="stylesheet" />
    <!-- Weather Icon -->
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/weather-icons.css" rel="stylesheet" />
    <!-- Owl Carousel -->
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/owl.carousel.min.css" rel="stylesheet" />
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/owl.theme.default.min.css" rel="stylesheet" />
    <!-- Select2 -->
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/select2/select2.min.css" rel="stylesheet">

    <!-- Common -->
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/font-awesome.min.css" rel="stylesheet">
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/themify-icons.css" rel="stylesheet">
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/menubar/sidebar.css" rel="stylesheet">
    <script type="text/javascript" src="${pageContext.servletContext.contextPath }/assets/js/jquery-3.3.1.min.js"></script>
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/bootstrap.min.css" rel="stylesheet">
    <script src="${pageContext.servletContext.contextPath }/assets/js/lib/bootstrap.min.js"></script>
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/helper.css" rel="stylesheet">
    <link href="${pageContext.servletContext.contextPath }/assets/css/style.css" rel="stylesheet">
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
                <h1>你好,
                  <span>欢迎进入应聘者信息详情界面</span>
                </h1>
              </div>
            </div>
          </div>
          <!-- /# column -->
          <div class="col-lg-4 p-l-0 title-margin-left">
            <div class="page-header">
              <div class="page-title">
                <ol class="breadcrumb">
                  <li class="breadcrumb-item">
                    <!--<a href="#">Dashboard</a>-->
                    <c:if test="${detail.iSche==0 }">
                     <button type="button" data-toggle="modal" data-target="#interviewMsg" class="btn btn-warning btn-flat btn-addon m-b-10 m-l-5"><i class="ti-user"></i>通知面试</button>
                     </c:if>
                     <!-- Modal -->
					<div class="modal fade" id="interviewMsg" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
					  <div class="modal-dialog" role="document">
					    <div class="modal-content">
					      <div class="modal-header">
					        <h4 class="modal-title" id="myModalLabel">面试信息发送</h4>
					        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
					      </div>
					      <div class="modal-body">
					      	<form id="interviewMessage" method="post" action="#">
					      	<input type="hidden" name="ap_Id" value="${detail.apId }">
							  <div class="form-group">
							    <label for="exampleInputEmail1">指定面试人</label>
							    <input type="text" name="iMan" id="iMan"  class="form-control" id="exampleInputEmail1" placeholder="interviewer name">
							  </div>
							  <div class="form-group">
							    <label for="exampleInputPassword1">面试人电话</label>
							    <input type="text" name="iPhone" id="iPhone" class="form-control" id="exampleInputPassword1" placeholder="interviewer phone">
							  </div>
							  <div class="form-group">
							  	<textarea name="iMessage" id="iMessage" style="width: 440px;height: 200px">Congratulations on your approval. We will interview you on Dec. 4. In the third floor of GS Science and Technology Conference Room, please be there on time.interviewer：严子江，interviewer phone:15779933526
							  	</textarea>
							  </div>
							</form>
					      </div>
					      <div class="modal-footer">
					        <button type="button" id="messageSend" class="btn btn-primary">Send Message</button>
					        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					      </div>
					    </div>
					  </div>
					</div>
					 <!-- Modal -->
					<div class="modal fade" id="turnDownModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
					  <div class="modal-dialog" role="document">
					    <div class="modal-content">
					      <div class="modal-header">
					        <h4 class="modal-title" id="myModalLabel">驳回信息发送</h4>
					        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
					      </div>
					      <div class="modal-body">
					      	<form:form id="turnDownMessage" method="delete" action="${pageContext.servletContext.contextPath }/adminRecruit/refuse">
					      	<input type="hidden" name="apId" value="${detail.apId }">
							  <div class="form-group">
							  	<textarea name="message" id="message" style="width: 440px;height: 200px">Sorry, after our review of your resume, you are not the talent our company needs. Thank you for your support! Thank you!
							  	</textarea>
							  </div>
							</form:form> 
					      </div>
					      <div class="modal-footer">
					        <button type="button" id="messageSend2" class="btn btn-primary">Send Message</button>
					        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					      </div>
					    </div>
					  </div>
					</div>
                  </li>
                  <c:if test="${detail.iSche==0 }">
                 <button type="button" id="turnDown" data-toggle="modal" data-target="#turnDownModal" class="btn btn-danger btn-flat btn-addon m-b-10 m-l-5"><i class="ti-settings"></i>驳回</button>
                </c:if>
                </ol>
              </div>
            </div>
          </div>
          <!-- /# column -->
        </div>
          
          
           <section id="main-content">
          <div class="row">
            <div class="col-lg-12">
              <div class="card">
                <div class="card-body">
                  <div class="user-profile">
                    <div class="row">
                      <div class="col-lg-4">
                       
                        <div class="user-work">
                          <h4>工作经历</h4>
                          <div class="a">
                              ${detail.apExp }
                          </div>
                          
                        </div>
                      </div>
                      <div class="col-lg-8">
                       
                        <div class="custom-tab user-profile-tab">
                          <ul class="nav nav-tabs" role="tablist">
                            <li role="presentation" class="active">
                              <a href="#1" aria-controls="1" role="tab" data-toggle="tab"><h4>个人信息</h4></a>
                            </li>
                          </ul>
                          <div class="tab-content">
                            <div role="tabpanel" class="tab-pane active" id="1">
                              <div class="contact-information">
                                <h4>详情</h4>
                                 <div class="address-content">
                                  <span class="contact-title">姓名：</span>
                                  <span class="mail-address">${detail.apName }</span>
                                </div>
                                <div class="gender-content">
                                  <span class="contact-title">性别：</span>
                                  <span class="gender">${detail.apGender }</span></div>
                                  <div class="address-content">
                                  <span class="contact-title">年龄：</span>
                                  <span class="mail-address">${detail.apAge }</span>
                                </div>
                                <div class="address-content">
                                  <span class="contact-title">学历：</span>
                                  <span class="mail-address">${detail.apEdu }</span>
                                </div>
                                <div class="phone-content">
                                  <span class="contact-title">手机号</span>
                                  <span class="phone-number">${detail.apPhone }</span>
                                </div>
                               	<div class="number-content">
                                  <span class="contact-title">身份证号</span>
                                  <span class="phone-number">${detail.apNumber }</span>
                                </div>
                                <div class="email-content">
                                  <span class="contact-title">应聘部门:</span>
                                  <span class="contact-email">${detail.dName }</span>
                                </div>
                                <div class="website-content">
                                  <span class="contact-title">应聘职位:</span>
                                  <span class="contact-website">${detail.pPosition }</span>
                                </div>
                               <div class="website-content">
                                  <span class="contact-title">简历查看:</span>
                                  <span><a><button id="download" type="button" class="btn btn-primary m-b-10 m-l-5">下载</button></a></span>
                                </div>
                                <form id="filedown" method="get" action="${pageContext.servletContext.contextPath }/adminRecruit/download">
									<input type="hidden" name="filePath" value="${detail.apResume }"/>
								</form>
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


<style>
	.a{
		width: 350px;
		height: 500px;
		border: 1px solid#607D8B;
	
	}
</style>

<script type="text/javascript">
	$(function(){
		if("${msg}"!=""&&"${msg}"!=null){
			alert("${msg}")
		}
		$("#appMes").addClass("active");
		$("#recu").addClass("open");
		$("#download").click(function(){
			$("#filedown").submit();
		});
		/* 
			发送面试信息
		*/
		$("#messageSend").click(function(){
			if($("#iMan").val().length==0||$("#iPhone").val().length==0||$("#iMessage").val().length==0){
				alert("请将内容填写完整!");
			}else{
				$.ajax({
					url:"${pageContext.servletContext.contextPath }/adminRecruit/sendInterview",
					type:"post",
					data:$("#interviewMessage").serialize(),
					success:function(res){
						alert(res.msg);
					}
				});
			}
		});
		/* 
			拒绝该应聘信息
		*/
		$("#messageSend2").click(function(){
			if($("#message").val().length==0){
				alert("请将内容填写完整!");
			}else{
				$("#turnDownMessage").submit();
			}
		});
	});
</script>
    <!-- Common -->
    <script src="${pageContext.servletContext.contextPath }/assets/js/lib/jquery.min.js"></script>
    <script src="${pageContext.servletContext.contextPath }/assets/js/lib/jquery.nanoscroller.min.js"></script>
    <script src="${pageContext.servletContext.contextPath }/assets/js/lib/menubar/sidebar.js"></script>
    <script src="${pageContext.servletContext.contextPath }/assets/js/lib/preloader/pace.min.js"></script>
    <script src="${pageContext.servletContext.contextPath }/assets/js/scripts.js"></script>
    <!--  Knob -->
    <script src="${pageContext.servletContext.contextPath }/assets/js/lib/knob/jquery.knob.min.js "></script>
    <script src="${pageContext.servletContext.contextPath }/assets/js/lib/knob/knob.init.js "></script>
</body>
</html>
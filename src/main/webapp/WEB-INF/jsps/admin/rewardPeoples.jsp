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
        <title>奖惩信息</title>
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
                                <h1>你好, <span>欢迎来到人力资源管理系统</span></h1>
                            </div>
                        </div>
                    </div>
                    <!-- /# column -->
                    <div class="col-lg-4 p-l-0 title-margin-left">
                        <div class="page-header">
                            <div class="page-title">
                                <ol class="breadcrumb">
                                   <!-- <li class="breadcrumb-item"><a href="agreementInfo.html"<button type="button" class="btn btn-primary btn-flat btn-addon btn-lg m-b-10 m-l-5"><i class="ti-user"></i>录入合同信息</button></a></li>-->
                                  
                                </ol>
                            </div>
                        </div>
                    </div>
                    <!-- /# column -->
                </div>
                                       
                       <section id="main-content">
                    <div class="row">
                        <div class="col-lg-10">
                        	<div class="card">
                                <div class="card-title">
                                    <h4>奖惩信息总览表</h4>
                                    
                                </div>
                                <div class="card-body">
                                    
                                            <c:choose>
                                            	<c:when test="${pageInfo.list.size()!=0 }">
                                            	<div class="table-responsive">
		                                        <table class="table table-bordered">
		                                            <thead>
		                                                <tr>
		                                                    <th>员工编号</th>
		                                                    <th>员工姓名</th>
		                                                    <th>奖励金额</th>
		                                                    <th>奖励原因</th>
		                                                    <th>奖励日期</th>
		                                                     <th>处罚金额</th>
		                                                    <th>处罚原因</th>
		                                                    <th>处罚日期</th>
		                                                    <th>奖惩日期</th>
		                                                </tr>
		                                            </thead>
                                            		<tbody>
			                                            <c:forEach items="${pageInfo.list }" var="reward">
			                                                <tr>
			                                                    <td>${reward.eId.eId }</td>
			                                                    <td>${reward.eId.eName }</td>
			                                                    <td>
			                                                    	${reward.reReward }
			                                                    </td>
			                                                    <td style="text-align: center;">
			                                                    	<c:if test="${reward.reRereson!=null }">
			                                                    	<button class="btn btn-primary re" data-toggle="modal" data-target="#rem" mes="${reward.reRereson }">查看</button>
			                                                    	</c:if>
			                                                    </td>
			                                                    <td>
			                                                    	<fmt:formatDate value="${reward.reRedate }"/>
			                                                    </td>
			                                                    <td>
			                                                    	${reward.rePunish }
			                                                    </td>
			                                                    <td style="text-align: center;">
			                                                    	<c:if test="${reward.rePureson!=null }">
			                                                    	<button class="btn btn-primary pu" data-toggle="modal" data-target="#pum" mes="${reward.rePureson }">查看</button>
			                                                    	</c:if>
			                                                    </td>
			                                                    <td>
			                                                    	<fmt:formatDate value="${reward.rePudate }"/>
			                                                    </td>
			                                                    <td>
			                                                    	<fmt:formatDate value="${reward.reDate }"/>
			                                                    </td>
			                                                </tr>
			                                            </c:forEach>
                                            		</tbody>
                                            		 </table>
                                    			</div>
                                            	</c:when>
                                            	<c:otherwise>
                                            		<h3 style="text-align: center;">该员工暂无奖惩信息</h3>
                                            	</c:otherwise>
                                            </c:choose>
                                </div>
                            </div>
                        </div>
                        <!-- 奖励原由内容 -->
                        <div class="modal fade" id="rem" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
						  <div class="modal-dialog" role="document">
						    <div class="modal-content">
						      <div class="modal-header">
						        <h4 class="modal-title" id="myModalLabel">奖励原由</h4>
						        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
						      </div>
						      <div class="modal-body">
								  <div class="form-group">
								  	<p id="reTxt" class="lead"><b></b></p>
								  </div>
						      </div>
						      <div class="modal-footer">
						        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
						      </div>
						    </div>
						  </div>
						</div>
						<!-- 处罚原由内容 -->
                        <div class="modal fade" id="pum" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
						  <div class="modal-dialog" role="document">
						    <div class="modal-content">
						      <div class="modal-header">
						        <h4 class="modal-title" id="myModalLabel">处罚原由</h4>
						        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
						      </div>
						      <div class="modal-body">
								  <div class="form-group">
								  	<p id="puTxt" class="lead"><b></b></p>
								  </div>
						      </div>
						      <div class="modal-footer">
						        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
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
        		$("#attenManage").addClass("active");
				$("#atten").addClass("open");
        		$(".re").click(function(){
        			$("#reTxt b").text($(this).attr("mes"));
        		});
				$(".pu").click(function(){
					$("#puTxt b").text($(this).attr("mes"));
        		});
        	});
        </script>
        <!-- jquery vendor -->
        <script src="${pageContext.servletContext.contextPath }/assets/js/lib/jquery.nanoscroller.min.js"></script>
        <!-- nano scroller -->
        <script src="${pageContext.servletContext.contextPath }/assets/js/lib/menubar/sidebar.js"></script>
        <script src="${pageContext.servletContext.contextPath }/assets/js/lib/preloader/pace.min.js"></script>
        <!-- sidebar -->

        <script src="${pageContext.servletContext.contextPath }/assets/js/lib/bootstrap.min.js"></script>
        <script src="${pageContext.servletContext.contextPath }/assets/js/scripts.js"></script>
        <!-- bootstrap -->
        <script src="${pageContext.servletContext.contextPath }/assets/js/lib/weather/jquery.simpleWeather.min.js"></script>
        <script src="${pageContext.servletContext.contextPath }/assets/js/lib/weather/weather-init.js"></script>
        <script src="${pageContext.servletContext.contextPath }/assets/js/lib/circle-progress/circle-progress.min.js"></script>
        <script src="${pageContext.servletContext.contextPath }/assets/js/lib/circle-progress/circle-progress-init.js"></script>
        <script src="${pageContext.servletContext.contextPath }/assets/js/lib/sparklinechart/jquery.sparkline.min.js"></script>
        <script src="${pageContext.servletContext.contextPath }/assets/js/lib/sparklinechart/sparkline.init.js"></script>
        <script src="${pageContext.servletContext.contextPath }/assets/js/lib/owl-carousel/owl.carousel.min.js"></script>
        <script src="${pageContext.servletContext.contextPath }/assets/js/lib/owl-carousel/owl.carousel-init.js"></script>
        <!-- scripit init-->
    </body>

</html>
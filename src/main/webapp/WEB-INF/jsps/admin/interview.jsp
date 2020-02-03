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

    <title>面试信息库</title>

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
	<script type="text/javascript" src="${pageContext.servletContext.contextPath }/assets/js/jquery-3.3.1.min.js"></script>
    <!-- Styles -->
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/font-awesome.min.css" rel="stylesheet">
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/themify-icons.css" rel="stylesheet">
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/datatable/dataTables.bootstrap.min.css" rel="stylesheet" />
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/datatable/buttons.bootstrap.min.css" rel="stylesheet" />
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/menubar/sidebar.css" rel="stylesheet">
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/helper.css" rel="stylesheet">
    <link href="${pageContext.servletContext.contextPath }/assets/css/style.css" rel="stylesheet">
</head>

<body>

       <jsp:include page="component/navigation.jsp"></jsp:include>
       <jsp:include page="component/header.jsp"></jsp:include>
        <!-- /# sidebar -->


    <div class="content-wrap">
            <div class="main">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-lg-12 p-r-0 title-margin-right">
                            <div class="page-header">
                                <div class="page-title">
                                    <h1>你好，<span>欢迎进入人力资源管理系统</span></h1>
                                </div>
                            </div>
                        </div>
                    </div>
                      </div>
                <section id="main-content">
                    <div class="row">
                        <div class="col-lg-12" style="padding-left: 30px">
                            <div class="card">
                                <div class="card-title">
                                    <h4>面试者信息</h4>
                                    
                                </div>
                                <div class="bootstrap-data-table-panel">
                                    <div class="table-responsive">
                                        <table id="row-select" class="display table table-borderd table-hover">
                                            <thead>
                                                <tr>
                                                    <th>姓名</th>
                                                    <th>性别</th>
                                                    <th>年龄</th>
                                                    <th>学历</th>
                                                   <th>手机号</th>
                                                    <th>应聘部门</th>  
                                                     <th>应聘职位</th>
                                                     <th>面试官</th>
                                                     <th>面试官电话</th>
                                                     <th>面试状态</th>
                                                    <th>操作</th>
                                                </tr>
                                            </thead>

                                            <tbody>
	                                            <c:forEach items="${interviews }" var="interview">
	                                                <tr>
	                                                    <td>${interview.apId.apName }</td>
	                                                    <td>${interview.apId.apGender }</td>
	                                                    <td>${interview.apId.apAge }</td>
	                                                    <td>${interview.apId.apEdu }</td>
	                                                   <td>${interview.apId.apPhone }</td>
	                                                    <td>${interview.apId.dName }</td>
	                                                    <td>${interview.apId.pPosition }</td>
	                                                    <td>${interview.iMan }</td>
	                                                    <td>${interview.iPhone }</td>
	                                                    <td>
	                                                    	<c:if test="${interview.apId.iSche==1 }">
	                                                    		面试中
	                                                    	</c:if>
	                                                    	<c:if test="${interview.apId.iSche==2 }">
	                                                    		面试结束
	                                                    	</c:if>
	                                                    	<c:if test="${interview.apId.iSche==3 }">
	                                                    		面试合格
	                                                    	</c:if>
	                                                    	<c:if test="${interview.apId.iSche==4 }">
	                                                    		面试不合格
	                                                    	</c:if>
	                                                    	<c:if test="${interview.apId.iSche==5 }">
	                                                    		合同已录入
	                                                    	</c:if>
	                                                    </td>
	                                                    <td>
	                                                    	<c:if test="${interview.apId.iSche==1 }">
	                                                    		<button over="${interview.iId }" type="button" class="btn btn-success btn-rounded m-b-10 m-l-5 overInterview">结束面试</button>
	                                                    	</c:if>
	                                                    	<c:if test="${interview.apId.iSche==2 }">
	                                                    		<button pass="${interview.iId }" type="button" data-toggle="modal" data-target="#p" class="btn btn-success btn-rounded m-b-10 m-l-5 passInterview">面试通过</button>
																<button fail="${interview.iId }" type="button" data-toggle="modal" data-target="#f" class="btn btn-danger btn-rounded m-b-10 m-l-5 failInterview">面试驳回</button>
	                                                    	</c:if>
	                                                    	<c:if test="${interview.apId.iSche==4||interview.apId.iSche==5 }">
	                                                    		<button delete="${interview.iId }" type="button" data-toggle="modal" data-target="#d" class="btn btn-danger btn-rounded m-b-10 m-l-5 deleteInterview">删除该面试信息</button>
	                                                    	</c:if>
	                                                    	<c:if test="${interview.apId.iSche==3}">
	                                                    		<button delete="${interview.iId }" type="button" data-toggle="modal" data-target="#d" class="btn btn-danger btn-rounded m-b-10 m-l-5 deleteInterview">删除该面试信息</button>
	                                                    		<button toContract="${interview.apId.apId }" type="button" class="btn btn-primary btn-rounded m-b-10 m-l-5 toContract">填写合同信息</button>
	                                                    	</c:if>
	                                                    </td>
	                                                </tr>
	                                            </c:forEach>
                                            </tbody>
                                            <tfoot>
                                                <tr>
                                                	
                                                     <th>姓名</th>
                                                    <th>性别</th>
                                                    <th>年龄</th>
                                                    <th>学历</th>
                                                   <th>手机号</th>
                                                    <th>应聘部门</th> 
                                                     <th>应聘职位</th>
                                                     <th>面试官</th>
                                                     <th>面试官电话</th>
                                                     <th>面试状态</th>
                                                </tr>
                                            </tfoot>
                                        </table>
                                    </div>
                                </div>
                            </div>
                            <!-- /# card -->
                        </div>
                        <!-- /# column -->
                        <!-- 结束面试 -->
                        <form:form id="over" method="put" action="${pageContext.servletContext.contextPath }/adminInterview/overInterview">
                        	<input type="hidden" name="iId" value="1"/>
                        </form:form>
                        <!-- 填写合同信息 -->
                        <form:form id="toContract" method="get" action="${pageContext.servletContext.contextPath }/adminInterview/contractPage">
                        	<input type="hidden" name="apId" value=""/>
                        </form:form>
                        <!-- 删除面试信息 -->
                        <div class="modal fade" id="d" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
						  <div class="modal-dialog" role="document">
						    <div class="modal-content">
						      <div class="modal-header">
						        <h4 class="modal-title" id="myModalLabel">是否删除该面试信息?</h4>
						        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
						      </div>
						      <div class="modal-body">
						      	<form:form id="delete" method="delete" action="${pageContext.servletContext.contextPath }/adminInterview/deleteInterview">
						      		<input type="hidden" name="iId" value="1">
								</form:form>
						      </div>
						      <div class="modal-footer">
						        <button type="button" id="dSend" class="btn btn-warning">Determine</button>
						        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
						      </div>
						    </div>
						  </div>
						</div>
                        <!-- 通过面试 -->
                        <div class="modal fade" id="p" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
						  <div class="modal-dialog" role="document">
						    <div class="modal-content">
						      <div class="modal-header">
						        <h4 class="modal-title" id="myModalLabel">面试合格信息发送</h4>
						        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
						      </div>
						      <div class="modal-body">
						      	<form:form id="pass" method="post" action="${pageContext.servletContext.contextPath }/adminInterview/passInterview">
						      		<input type="hidden" name="iId" value="1">
								  <div class="form-group">
								  	<textarea name="message" id="message" style="width: 440px;height: 200px">Congratulations on your passing our interview! Please report on the 4th floor of GS Information Technology Company on June 20.
								  	</textarea>
								  </div>
								</form:form>
						      </div>
						      <div class="modal-footer">
						        <button type="button" id="pSend" class="btn btn-primary">Send Message</button>
						        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
						      </div>
						    </div>
						  </div>
						</div>
                        <!-- 面试不通过 -->
                        <div class="modal fade" id="f" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
						  <div class="modal-dialog" role="document">
						    <div class="modal-content">
						      <div class="modal-header">
						        <h4 class="modal-title" id="myModalLabel">面试不合格信息发送</h4>
						        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
						      </div>
						      <div class="modal-body">
						      	<form:form id="fail" method="put" action="${pageContext.servletContext.contextPath }/adminInterview/failInterview">
						      		<input type="hidden" name="iId" value="1">
								  <div class="form-group">
								  	<textarea name="message" id="message" style="width: 440px;height: 200px">Unfortunately! Because you are not qualified in some respects and failed our interview, thank you for your support!
								  	</textarea>
								  </div>
								</form:form>
						      </div>
						      <div class="modal-footer">
						        <button type="button" id="fSend" class="btn btn-primary">Send Message</button>
						        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
						      </div>
						    </div>
						  </div>
						</div>
                    </div>
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
        

	<!-- js代码 -->
    <script type="text/javascript">
    	$(function(){
    		if("${msg}"!=""&&"${msg}"!=null){
    			alert("${msg}")
    		}
    		/**
    		  *	面试结束
 			**/
    		$(".overInterview").click(function(){
    			$("#over input:eq(1)").val($(this).attr("over"));
    			$("#over").submit();
    		});
    		/**
			  *	面试通过
			**/
			$(".passInterview").click(function(){
				$("#pass input:eq(0)").val($(this).attr("pass"));
			});
			$("#pSend").click(function(){
				$("#pass").submit();
			});
			/**
			  *	面试不合格
			**/
			$(".failInterview").click(function(){
				$("#fail input:eq(1)").val($(this).attr("fail"));
			});
			$("#fSend").click(function(){
				$("#fail").submit();
			});
			/**
			  *	面试信息删除
			**/
			$(".deleteInterview").click(function(){
				$("#delete input:eq(1)").val($(this).attr("delete"));
			});
			$("#dSend").click(function(){
				$("#delete").submit();
			});
			/*
			   填写合同信息
			*/		
			$(".toContract").click(function(){
				$("#toContract input:eq(0)").val($(this).attr("toContract"));
				$("#toContract").submit();
			});
			
    	});
    </script>
    <!-- jquery vendor -->
    <script src="${pageContext.servletContext.contextPath }/assets/js/lib/jquery.min.js"></script>
    <script src="${pageContext.servletContext.contextPath }/assets/js/lib/jquery.nanoscroller.min.js"></script>
    <!-- nano scroller -->
    <script src="${pageContext.servletContext.contextPath }/assets/js/lib/menubar/sidebar.js"></script>
    <script src="${pageContext.servletContext.contextPath }/assets/js/lib/preloader/pace.min.js"></script>
    <!-- sidebar -->
    
    <!-- bootstrap -->

    <script src="${pageContext.servletContext.contextPath }/assets/js/lib/bootstrap.min.js"></script><script src="${pageContext.servletContext.contextPath }/assets/js/scripts.js"></script>
    <!-- scripit init-->
    <script src="${pageContext.servletContext.contextPath }/assets/js/lib/data-table/datatables.min.js"></script>
    <script src="${pageContext.servletContext.contextPath }/assets/js/lib/data-table/dataTables.bootstrap.min.js"></script>
    <script src="${pageContext.servletContext.contextPath }/assets/js/lib/data-table/dataTables.buttons.min.js"></script>
    <script src="${pageContext.servletContext.contextPath }/assets/js/lib/data-table/buttons.bootstrap.min.js"></script>
    <script src="${pageContext.servletContext.contextPath }/assets/js/lib/data-table/jszip.min.js"></script>
    <script src="${pageContext.servletContext.contextPath }/assets/js/lib/data-table/pdfmake.min.js"></script>
    <script src="${pageContext.servletContext.contextPath }/assets/js/lib/data-table/vfs_fonts.js"></script>
    <script src="${pageContext.servletContext.contextPath }/assets/js/lib/data-table/buttons.html5.min.js"></script>
    <script src="${pageContext.servletContext.contextPath }/assets/js/lib/data-table/buttons.print.min.js"></script>
    <script src="${pageContext.servletContext.contextPath }/assets/js/lib/data-table/buttons.colVis.min.js"></script>
    <script src="${pageContext.servletContext.contextPath }/assets/js/lib/data-table/datatables-init.js"></script>
</body>

</html>
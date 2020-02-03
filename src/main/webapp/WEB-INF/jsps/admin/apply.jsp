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

    <title>应聘信息列表</title>

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

    <!-- Styles -->
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/font-awesome.min.css" rel="stylesheet">
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/themify-icons.css" rel="stylesheet">
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/data-table/dataTables.bootstrap.min.css" rel="stylesheet" />
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/data-table/buttons.bootstrap.min.css" rel="stylesheet" />
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/menubar/sidebar.css" rel="stylesheet">
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/helper.css" rel="stylesheet">
    <link href="${pageContext.servletContext.contextPath }/assets/css/style.css" rel="stylesheet">
    <script type="text/javascript" src="${pageContext.servletContext.contextPath }/assets/js/jquery-3.3.1.min.js"></script>
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
                        <div class="" style="width: 1300px;padding-left: 50px">
                            <div class="card" >
                                <div class="card-title">
                                    <h4>应聘者信息</h4>
                                    
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
                                                     <th>面试状态</th>
                                                    <th>操作</th>
                                                </tr>
                                            </thead>

                                            <tbody id="tbody">
                                            <c:forEach items="${applyList }" var="apply">
                                                <tr>
                                                    <td>${apply.apName }</td>
                                                    <td>${apply.apGender }</td>
                                                    <td>${apply.apAge }</td>
                                                    <td>${apply.apEdu }</td>
                                                   <td>${apply.apPhone }</td>
                                                    <td>${apply.dName }</td>
                                                    <td>${apply.pPosition }</td>
                                                    <td>
                                                    	<c:if test="${apply.iSche==0 }">
                                                    		未被面试
                                                    	</c:if>
                                                    	<c:if test="${apply.iSche==1 }">
                                                    		面试中
                                                    	</c:if>
                                                    	<c:if test="${apply.iSche==2 }">
                                                    		面试完成
                                                    	</c:if>
                                                    	<c:if test="${apply.iSche==3 }">
                                                    		面试合格
                                                    	</c:if>
                                                    	<c:if test="${apply.iSche==4 }">
                                                    		面试不合格
                                                    	</c:if>
                                                    	<c:if test="${apply.iSche==5 }">
                                                    		合同信息已录入
                                                    	</c:if>
                                                    </td>
                                                    <td><a href="${pageContext.servletContext.contextPath }/adminRecruit/applyDetail/${apply.apId}"><button type="button" class="btn btn-success btn-rounded m-b-10 m-l-5">查看</button></a>
                                                    <button type="button" apId="${apply.apId }" data-toggle="modal" data-target="#delete" class="btn btn-danger btn-rounded m-b-10 m-l-5 deleteApply">删除</button>
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
                                                     <th>面试状态</th>
                                                </tr>
                                            </tfoot>
                                        </table>
                                    </div>
                                </div>
                            </div>
                            <!-- /# card -->
                            <div class="modal fade" id="delete" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
							  <div class="modal-dialog" role="document">
							    <div class="modal-content">
							      <div class="modal-header">
							        <h4 class="modal-title" id="myModalLabel">是否删除该应聘信息?</h4>
							        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
							      </div>
							      <div class="modal-body">
							      	<form:form id="deleteApply" action="${pageContext.servletContext.contextPath }/adminRecruit/deleteApplyById" method="delete">
							      		<input type="hidden" id="inputVal" name="apId"/>
									</form:form>
							      </div>
							      <div class="modal-footer">
							        <button type="button" id="dSend" class="btn btn-warning">Determine</button>
							        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
							      </div>
							    </div>
							  </div>
							</div>
                        </div>
                        <!-- /# column -->
                    </div>
                    <!-- /# row -->
					<a href="${pageContext.servletContext.contextPath }/adminRecruit/allApplyMessage" style="display: none;" id="allApplys"></a>
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
        		if("${msg}"!=""&&"${msg}"!=null){
        			alert("${msg}")
        		}
        		$(".deleteApply").click(function(){
        			$("#inputVal").val($(this).attr("apId"));
        		});
        		$("#dSend").click(function(){
        			$("#deleteApply").submit();	
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
    <%-- <script src="${pageContext.servletContext.contextPath }/assets/js/lib/data-table/dataTables.bootstrap.min.js"></script> --%>
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
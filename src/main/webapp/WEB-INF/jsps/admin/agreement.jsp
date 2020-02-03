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
        <title>合同信息</title>
        <link rel="shortcut icon" href="http://placehold.it/64.png/000/fff">
        <link rel="apple-touch-icon" sizes="144x144" href="http://placehold.it/144.png/000/fff">
        <link rel="apple-touch-icon" sizes="114x114" href="http://placehold.it/114.png/000/fff">
        <link rel="apple-touch-icon" sizes="72x72" href="http://placehold.it/72.png/000/fff">
        <link rel="apple-touch-icon" sizes="57x57" href="http://placehold.it/57.png/000/fff">
        <script type="text/javascript" src="${pageContext.servletContext.contextPath }/assets/js/jquery-3.3.1.min.js"></script>
        <link href="${pageContext.servletContext.contextPath }/assets/css/lib/font-awesome.min.css" rel="stylesheet">
        <link href="${pageContext.servletContext.contextPath }/assets/css/lib/themify-icons.css" rel="stylesheet">
        <link href="${pageContext.servletContext.contextPath }/assets/css/lib/owl.carousel.min.css" rel="stylesheet" />
        <link href="${pageContext.servletContext.contextPath }/assets/css/lib/bootstrap.min.css" rel="stylesheet">
        <link href="${pageContext.servletContext.contextPath }/assets/css/lib/owl.theme.default.min.css" rel="stylesheet" />
        <link href="${pageContext.servletContext.contextPath }/assets/css/lib/weather-icons.css" rel="stylesheet" />
        <link href="${pageContext.servletContext.contextPath }/assets/css/lib/menubar/sidebar.css" rel="stylesheet">
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
                                    <li class="breadcrumb-item">
                                    <a href="${pageContext.request.contextPath }/adminContract/editorPage">
                                    <button type="button" class="btn btn-primary btn-flat btn-addon btn-lg m-b-10 m-l-5">
                                    <i class="ti-user"></i>录入合同信息</button>
                                    </a></li>
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
                                    <h4>合同信息总览表</h4>
                                    
                                </div>
                                <div class="card-body">
                                    <div class="table-responsive">
                                        <table class="table table-bordered">
                                            <thead>
                                                <tr>
                                                    <th>员工编号</th>
                                                    <th>员工姓名</th>
                                                    <th>所属部门</th>
                                                    <th>所任职位</th>
                                                    <th>操作</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                            <c:forEach items="${pageInfo.list }" var="contract">
                                            	<tr>
                                            		<td>${contract.eId.eId }</td>
                                            		<td>${contract.eId.eName }</td>
                                            		<td>${contract.eId.position.department.dName }</td>
                                            		<td>${contract.eId.position.pName }</td>
                                            		<td><a href="${pageContext.request.contextPath }/adminContract/contractDetail/${contract.cId}"><button type="button" class="btn btn-link m-b-10 m-l-5">查看合同详情</button></td>
                                            	</tr>
                                            </c:forEach>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                                
                            </div>
                            <div style="margin-top: 20px;float: right;font-size: 20px;">
	                            <nav aria-label="Page navigation">
								  <ul id="page" class="pagination">				
								  	<li style="text-align: center;"><a href="${pageContext.request.contextPath }/adminContract/allContract">首页</a></li>
								    <li style="text-align: center;">
								    	<c:if test="${pageInfo.hasPreviousPage }">
									      <a href="${pageContext.request.contextPath }/adminContract/allContract?pn=${pageInfo.pageNum-1}" aria-label="Previous">
									        <span aria-hidden="true">&laquo;</span>
									      </a>
									    </c:if>
								    </li>
								    <c:forEach var="i" begin="1" end="${pageInfo.pages }">
									    <c:if test="${i==pageInfo.pageNum }">
									    	<li class="active" style="background-color: #111;text-align: center;color: white;"><a href="#">${i }</a></li>
									    </c:if>
									    <c:if test="${i!=pageInfo.pageNum }">
									    	<li style="text-align: center;"><a href="${pageContext.request.contextPath }/adminContract/allContract?pn=${i }">${i }</a></li>
									    </c:if>
								    </c:forEach>
								    <li style="text-align: center;">
								    	<c:if test="${pageInfo.hasNextPage }">
									      <a href="${pageContext.request.contextPath }/adminContract/allContract?pn=${pageInfo.pageNum+1}" aria-label="Next">
									        <span aria-hidden="true">&raquo;</span>
									      </a>
									    </c:if>
								    </li>
								    
								    <li style="text-align: center;"><a href="${pageContext.request.contextPath }/adminContract/allContract?pn=${pageInfo.pages}">末页</a></li>
								  </ul>
								</nav>	
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
        		$("#page li").css({
        			width:"40px"
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


        <script src="${pageContext.servletContext.contextPath }/assets/js/lib/circle-progress/circle-progress.min.js"></script>
        <script src="${pageContext.servletContext.contextPath }/assets/js/lib/circle-progress/circle-progress-init.js"></script>
        <script src="${pageContext.servletContext.contextPath }/assets/js/lib/sparklinechart/jquery.sparkline.min.js"></script>
        <script src="${pageContext.servletContext.contextPath }/assets/js/lib/sparklinechart/sparkline.init.js"></script>
        <script src="${pageContext.servletContext.contextPath }/assets/js/lib/owl-carousel/owl.carousel.min.js"></script>
        <script src="${pageContext.servletContext.contextPath }/assets/js/lib/owl-carousel/owl.carousel-init.js"></script>
        <!-- scripit init-->
    </body>

</html>
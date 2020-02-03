<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>招聘信息</title>
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
    <script type="text/javascript" src="${pageContext.servletContext.contextPath }/assets/js/jquery-3.3.1.min.js"></script>
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/font-awesome.min.css" rel="stylesheet">
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/themify-icons.css" rel="stylesheet">
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/data-table/buttons.bootstrap.min.css" rel="stylesheet" />
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/menubar/sidebar.css" rel="stylesheet">
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/helper.css" rel="stylesheet">
    <link href="${pageContext.servletContext.contextPath }/assets/css/style.css" rel="stylesheet">
    <script type="text/javascript" src="${pageContext.servletContext.contextPath }/assets/js/lib/bootstrap.min.js"></script>
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
	                                    <a href="${pageContext.request.contextPath }/adminRecruit/recruitPage">
		                                    <button type="button" class="btn btn-primary btn-flat btn-addon m-b-10 m-l-5">
		                                    <i class="ti-plus"></i>发布招聘信息</button>
	                                    </a>
                                    </li>
                                </ol>
                            </div>
                        </div>
                    </div>
                    <!-- /# column -->
                </div>
                       
<section id="main-content">
                    <div class="row">
                        <div class="" style="width: 1341px;margin-left: 50px">
                        	<div class="card">
   								<div class="card-body">
                                    <div class="table-responsive">
                                        <table class="table table-hover ">
                                            <thead>
                                                <tr>
                                                    <th>招聘标题</th>
                                                    <th>招聘部门</th>
                                                    <th>招聘职位</th>
                                                    <th>招聘人数</th>
                                                    <th>学历要求</th>
                                                    <th>经验要求 </th>
                                                    <th>月基本工资</th>
                                                    <th>发布时间</th>
                                                    <th>操作</th>
                                                </tr>
                                            </thead>
                                            <tbody>
	                                            <c:forEach items="${pageInfo.list }" var="recruit">
	                                                <tr>
	                                                    <th>${recruit.rTitle }</th>
	                                                    <td>${recruit.dName }</td>
	                                                    <td>${recruit.pPosition }</td>
	                                                    <td>${recruit.rNumber }</td>
	                                                    <td>${recruit.rEdu }</td>
	                                                    <td>${recruit.rExp }</td>
	                                                    <td>${recruit.rSalary }</td>
	                                                    <td>
	                                                    	<fmt:formatDate type="date" value="${recruit.rTime }"/>
	                                                    </td>
	                                                    <td>
	                                                    	 <a href="${pageContext.request.contextPath }/adminRecruit/recruitDetail/${recruit.rId }"><button type="button" class="btn btn-success btn-outline btn-rounded m-b-10 m-l-5">重新编辑</button></a>
	                                                    	 <button type="button" del="${recruit.rId }" data-toggle="modal" data-target="#d" class="btn btn-danger btn-outline btn-rounded m-b-10 m-l-5 delete">删除</button>
	                                                    </td>
	                                                </tr>
	                                             </c:forEach>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                            <!-- 删除招聘信息 -->
                        <div class="modal fade" id="d" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
						  <div class="modal-dialog" role="document">
						    <div class="modal-content">
						      <div class="modal-header">
						        <h4 class="modal-title" id="myModalLabel">是否删除该招聘信息?</h4>
						        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
						      </div>
						      <div class="modal-body">
						      	<form:form id="delete" method="delete" action="${pageContext.servletContext.contextPath }/adminRecruit/deleteRecruit">
						      		<input type="hidden" name="rId" value="1">
								</form:form>
						      </div>
						      <div class="modal-footer">
						        <button type="button" id="dSend" class="btn btn-warning">Determine</button>
						        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
						      </div>
						    </div>
						  </div>
						</div>
                            <div style="margin-top: 20px;float: right;font-size: 20px;">
	                            <nav aria-label="Page navigation">
								  <ul id="page" class="pagination">				
								  	<li style="text-align: center;"><a href="${pageContext.request.contextPath }/adminRecruit/allRecruitMessage">首页</a></li>
								    <li style="text-align: center;">
								    	<c:if test="${pageInfo.hasPreviousPage }">
									      <a href="${pageContext.request.contextPath }/adminRecruit/allRecruitMessage?pn=${pageInfo.pageNum-1}" aria-label="Previous">
									        <span aria-hidden="true">&laquo;</span>
									      </a>
									    </c:if>
								    </li>
								    <c:forEach var="i" begin="1" end="${pageInfo.pages }">
									    <c:if test="${i==pageInfo.pageNum }">
									    	<li class="active" style="background-color: #111;text-align: center;color: white;"><a href="#">${i }</a></li>
									    </c:if>
									    <c:if test="${i!=pageInfo.pageNum }">
									    	<li style="text-align: center;"><a href="${pageContext.request.contextPath }/adminRecruit/allRecruitMessage?pn=${i }">${i }</a></li>
									    </c:if>
								    </c:forEach>
								    <li style="text-align: center;">
								    	<c:if test="${pageInfo.hasNextPage }">
									      <a href="${pageContext.request.contextPath }/adminRecruit/allRecruitMessage?pn=${pageInfo.pageNum+1}" aria-label="Next">
									        <span aria-hidden="true">&raquo;</span>
									      </a>
									    </c:if>
								    </li>
								    
								    <li style="text-align: center;"><a href="${pageContext.request.contextPath }/adminRecruit/allRecruitMessage?pn=${pageInfo.pages}">末页</a></li>
								  </ul>
								</nav>	
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




  <div id="search">
    <button type="button" class="close">×</button>
    <form>
      <input type="search" value="" placeholder="type keyword(s) here" />
      <button type="submit" class="btn btn-primary">Search</button>
    </form>
  </div>
  <script type="text/javascript">
  $(function(){
	  if("${msg}"!=""&&"${msg}"!=null){
			alert("${msg}")
		}
		$("#page li").css({
			width:"40px"
		});
		$(".delete").click(function(){
			$("#delete input:eq(1)").val($(this).attr("del"));
		});
		$("#dSend").click(function(){
			$("#delete").submit();
		});
	});
  </script>
  <!-- jquery vendor -->
  <script src="${pageContext.servletContext.contextPath }/assets/js/lib/jquery.min.js"></script>
  <script src="${pageContext.servletContext.contextPath }/assets/js/lib/jquery.nanoscroller.min.js"></script>
  <script src="${pageContext.servletContext.contextPath }/assets/js/lib/menubar/sidebar.js"></script>
  <script src="${pageContext.servletContext.contextPath }/assets/js/lib/preloader/pace.min.js"></script>
  <script src="${pageContext.servletContext.contextPath }/assets/js/scripts.js"></script>




</body>

</html>
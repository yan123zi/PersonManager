<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>员工基本信息</title>
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
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/data-table/buttons.bootstrap.min.css" rel="stylesheet" />
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
                                    <h1>你好，<span>欢迎进入人力资源管理系统</span></h1>
                                </div>
                            </div>
                        </div>
                        <!-- /# column -->
                    <div class="col-lg-4 p-l-0 title-margin-left">
                        <div class="page-header">
                            <div class="page-title">
                                <ol class="breadcrumb">
                                    <li class="breadcrumb-item">
                                    <a href="${pageContext.request.contextPath }/adminEmployee/addEmployeePage">
                                    <button type="button" class="btn btn-primary btn-flat btn-addon btn-lg m-b-10 m-l-5">
                                    <i class="ti-user"></i>手动添加员工信息</button>
                                    </a></li>
                                </ol>
                            </div>
                        </div>
                    </div>
                    </div>
                       </div>
                    <!-- /# column -->
                </div>
                <!-- /# row -->
                <section id="main-content">
                    <div class="row">
                        <div class="col-lg-12">
                            <div class="card">
                                <div class="bootstrap-data-table-panel">
                                    <div class="table-responsive">
                                        <table id="bootstrap-data-table-export" class="table table-striped table-bordered">
                                            <thead>
                                                <tr>
                                                    <th>姓名</th>
                                                    <th>性别</th>
                                                    <th>部门</th>
                                                    <th>职位</th>
                                                    <th>操作</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                            <c:forEach items="${employeeList }" var="employee">
                                            	<tr>
                                                    <td>${employee.eName }</td>
                                                    <td>${employee.eGender }</td>
                                                    <td>${employee.position.department.dName }</td>
                                                    <td>${employee.position.pName }</td>
													<td>
														<a href="${pageContext.servletContext.contextPath }/adminEmployee/employeeDetail/${employee.eId}"><span class="jsgrid-button jsgrid-edit-button ti-pencil" type="button" title="查看"></span></a>
													</td>
                                                </tr>
                                            </c:forEach>
                                            </tbody>
                                        </table>
                                    </div>
                                </div> 
                            </div>
                            <!-- /# card -->
                        </div>
                        <!-- /# column -->
                    </div>
                </section>
            </div>
        </div>
    </div>







    
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
    <script src="${pageContext.servletContext.contextPath }/assets/js/lib/data-table/buttons.dataTables.min.js"></script>
    <script src="${pageContext.servletContext.contextPath }/assets/js/lib/data-table/dataTables.buttons.min.js"></script>
    <script src="${pageContext.servletContext.contextPath }/assets/js/lib/data-table/buttons.flash.min.js"></script>
    <script src="${pageContext.servletContext.contextPath }/assets/js/lib/data-table/jszip.min.js"></script>
    <script src="${pageContext.servletContext.contextPath }/assets/js/lib/data-table/pdfmake.min.js"></script>
    <script src="${pageContext.servletContext.contextPath }/assets/js/lib/data-table/vfs_fonts.js"></script>
    <script src="${pageContext.servletContext.contextPath }/assets/js/lib/data-table/buttons.html5.min.js"></script>
    <script src="${pageContext.servletContext.contextPath }/assets/js/lib/data-table/buttons.print.min.js"></script>
    <script src="${pageContext.servletContext.contextPath }/assets/js/lib/data-table/datatables-init.js"></script>
</body>
</html>
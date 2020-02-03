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

    <title>考勤信息</title>

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
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/datatable/dataTables.bootstrap.min.css" rel="stylesheet" />
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/datatable/buttons.bootstrap.min.css" rel="stylesheet" />
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/menubar/sidebar.css" rel="stylesheet">
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/helper.css" rel="stylesheet">
    <link href="${pageContext.servletContext.contextPath }/assets/css/style.css" rel="stylesheet">
</head>

<body style='overflow:auto ! important;'>

        
        <!-- /# sidebar -->
		<jsp:include page="component/navigation.jsp"></jsp:include>
    	<jsp:include page="component/header.jsp"></jsp:include>
		
    <div class="content-wrap">
        <div class="main">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-8 p-r-0 title-margin-right">
                        <div class="page-header">
                            <div class="page-title">
                                <h1>Hello, <span>Welcome Here</span></h1>
                            </div>
                        </div>
                    </div>
                    <!-- /# column -->
                    <div class="col-lg-4 p-l-0 title-margin-left">
                        <div class="page-header">
                            <div class="page-title">
                                <ol class="breadcrumb">
                                    <li class="breadcrumb-item"><a href="#">Dashboard</a></li>
                                    <li class="breadcrumb-item active">Table-Row-Select</li>
                                </ol>
                            </div>
                        </div>
                    </div>
                    <!-- /# column -->
                </div>
                <!-- /# row -->
                <section id="main-content">
                    <div class="row">
                        <div class="col-lg-10" style="margin-left: 50px">
                            <div class="card">
                                <div class="card-title">
                                    <h4>员工列表</h4>
                                </div>
                                <div class="bootstrap-data-table-panel">
                                    <div class="table-responsive">
                                        <table id="row-select" class="display table table-borderd table-hover col-lg-10">
                                            <thead>
                                                <tr >
                                                    <th style="width: 300px;">员工编号</th>
                                                    <th style="width: 300px;">姓名</th>
                                                    <th style="width: 300px;">性别</th>
                                                    <th style="width: 300px;">所在部门</th>
                                                    <th style="width: 300px;">所任职位</th>
                                                    <th style="width: 300px;">操作</th>
                                                </tr>
                                            </thead>

                                            <tbody>
                                            <c:forEach items="${employeeList }" var="employee">
                                                <tr>
                                                    <td>${employee.eId }</td>
                                                    <td>${employee.eName }</td>
                                                    <td>${employee.eGender }</td>
                                                    <td>${employee.position.department.dName }</td>
                                                    <td>${employee.position.pName }</td>
                                                    <td>
                                                    	<a href="${pageContext.servletContext.contextPath }/adminAttenRew/empAttens/${employee.eId}"><button type="button" class="btn btn-primary btn-outline m-b-10 m-l-5">考勤信息</button></a>
                                                    	<a href="${pageContext.servletContext.contextPath }/adminAttenRew/empRew/${employee.eId}"><button type="button" class="btn btn-primary btn-outline m-b-10 m-l-5">奖惩信息</button></a>
                                                    </td>
                                                </tr>
                                            </c:forEach>
                                            </tbody>
                                            <tfoot>
                                                <tr >
                                                    <th>员工编号</th>
                                                    <th>姓名</th>
                                                    <th>性别</th>
                                                    <th>部门</th>
                                                    <th>职位</th>
                                                </tr>
                                            </tfoot>
                                        </table>
                                    </div>
                                </div>
                            </div>
                            <!-- /# card -->
                        </div>
                        <!-- /# column -->
                    </div>
                    <!-- /# row -->

                    
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
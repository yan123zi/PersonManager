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

    <title>薪酬管理</title>

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
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/vector-map/jqvmap.min.css" rel="stylesheet">
    <!--Themes Jquery Bar Rating-->
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/font-awesome.min.css" rel="stylesheet">
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/themify-icons.css" rel="stylesheet">
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/menubar/sidebar.css" rel="stylesheet">
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/bootstrap.min.css" rel="stylesheet">
	
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/helper.css" rel="stylesheet">
    <link href="${pageContext.servletContext.contextPath }/assets/css/style.css" rel="stylesheet">
    
    
    
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
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/jsgrid/jsgrid-theme.min.css" rel="stylesheet" />
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/jsgrid/jsgrid.min.css" type="text/css" rel="stylesheet" />
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
					<div class="col-md-8">
						<h4>薪酬信息</h4>
					</div>
					<div class="col-md-4">
						<nav class="float-right">
							<ol class="breadcrumb">
								<li class="breadcrumb-item"><a href="#">主页</a></li>
								<li class="breadcrumb-item active" aria-current="page"><a href="#">清空</li>
							</ol>
						</nav>
					</div>
				</div>
                
                
                <div id="main-content">
                    <div class="row">
                        <div class="col-lg-12">
                            <div class="card">
                                <div class="jsgrid-table-panel">
                                    <div id="jsGrid"></div>
                                </div>
                            </div>
                            <!-- /# card -->
                        </div>
                        <!-- /# column -->
                    </div>
                    <!-- /# row -->

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
    </div>



    
    <!-- jquery vendor -->
    <script src="${pageContext.servletContext.contextPath }/assets/js/lib/jquery.min.js"></script>
    <script src="${pageContext.servletContext.contextPath }/assets/js/lib/jquery.nanoscroller.min.js"></script>
    <!-- nano scroller -->
    <script src="${pageContext.servletContext.contextPath }/assets/js/lib/menubar/sidebar.js"></script>
    <script src="${pageContext.servletContext.contextPath }/assets/js/lib/preloader/pace.min.js"></script>
    <!-- sidebar -->
    <!-- scripit init-->
    <script src="${pageContext.servletContext.contextPath }/assets/js/lib/bootstrap.min.js"></script><script src="${pageContext.servletContext.contextPath }/assets/js/scripts.js"></script>
    
    <!-- bootstrap -->


    <!-- scripit init-->
    
    
    <!-- JS Grid Scripts Start-->
    <%-- <script src="${pageContext.servletContext.contextPath }/assets/js/lib/jsgrid/db.js"></script> --%>
    <script src="${pageContext.servletContext.contextPath }/assets/js/lib/jsgrid/jsgrid.core.js"></script>
    <script src="${pageContext.servletContext.contextPath }/assets/js/lib/jsgrid/jsgrid.load-indicator.js"></script>
    <script src="${pageContext.servletContext.contextPath }/assets/js/lib/jsgrid/jsgrid.load-strategies.js"></script>
    <script src="${pageContext.servletContext.contextPath }/assets/js/lib/jsgrid/jsgrid.sort-strategies.js"></script>
    <script src="${pageContext.servletContext.contextPath }/assets/js/lib/jsgrid/jsgrid.field.js"></script>
    <script src="${pageContext.servletContext.contextPath }/assets/js/lib/jsgrid/fields/jsgrid.field.text.js"></script>
    <script src="${pageContext.servletContext.contextPath }/assets/js/lib/jsgrid/fields/jsgrid.field.number.js"></script>
    <script src="${pageContext.servletContext.contextPath }/assets/js/lib/jsgrid/fields/jsgrid.field.select.js"></script>
    <script src="${pageContext.servletContext.contextPath }/assets/js/lib/jsgrid/fields/jsgrid.field.checkbox.js"></script>
    <script src="${pageContext.servletContext.contextPath }/assets/js/lib/jsgrid/fields/jsgrid.field.control.js"></script>
    <script src="${pageContext.servletContext.contextPath }/assets/js/lib/jsgrid/jsgrid-init.js"></script>
    <!-- JS Grid Scripts End-->

    <script src="${pageContext.servletContext.contextPath }/assets/js/lib/bootstrap.min.js"></script>
    <script src="${pageContext.servletContext.contextPath }/assets/js/scripts.js"></script>
    <!-- scripit init-->
</body>

</html>
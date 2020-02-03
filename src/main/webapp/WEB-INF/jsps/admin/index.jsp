<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Focus Admin: Creative Admin Dashboard</title>
        <link rel="shortcut icon" href="${pageContext.servletContext.contextPath }/http://placehold.it/64.png/000/fff">
        <link rel="apple-touch-icon" sizes="144x144" href="http://placehold.it/144.png/000/fff">
        <link rel="apple-touch-icon" sizes="114x114" href="http://placehold.it/114.png/000/fff">
        <link rel="apple-touch-icon" sizes="72x72" href="http://placehold.it/72.png/000/fff">
        <link rel="apple-touch-icon" sizes="57x57" href="http://placehold.it/57.png/000/fff">
        <link href="${pageContext.servletContext.contextPath }/assets/css/lib/calendar2/pignose.calendar.min.css" rel="stylesheet">
        <link href="${pageContext.servletContext.contextPath }/assets/css/lib/chartist/chartist.min.css" rel="stylesheet">
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
                                    <h1>你好，<span>欢迎进入人力资源管理系统</span></h1>
                                </div>
                            </div>
                        </div>
                    </div>
                       </div>
                        <div class="row">
                            <div class="col-lg-12">
                                <div class="footer">
                                    <p>2019 © Admin Board. - <a href="${pageContext.servletContext.contextPath }/#"></a> / More Templates <a href="#" target="" title="">人力资源管理系统</a> - Collect from zijiangTeam</a></p>
                                    
                                </div>
                            </div>
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

        <script src="${pageContext.servletContext.contextPath }/assets/js/lib/bootstrap.min.js"></script><script src="${pageContext.servletContext.contextPath }/assets/js/scripts.js"></script>
        <!-- bootstrap -->

        <script src="${pageContext.servletContext.contextPath }/assets/js/lib/calendar-2/moment.latest.min.js"></script>
        <script src="${pageContext.servletContext.contextPath }/assets/js/lib/calendar-2/pignose.calendar.min.js"></script>
        <script src="${pageContext.servletContext.contextPath }/assets/js/lib/calendar-2/pignose.init.js"></script>


        <script src="${pageContext.servletContext.contextPath }/assets/js/lib/weather/jquery.simpleWeather.min.js"></script>
        <script src="${pageContext.servletContext.contextPath }/assets/js/lib/weather/weather-init.js"></script>
        <script src="${pageContext.servletContext.contextPath }/assets/js/lib/circle-progress/circle-progress.min.js"></script>
        <script src="${pageContext.servletContext.contextPath }/assets/js/lib/circle-progress/circle-progress-init.js"></script>
        <script src="${pageContext.servletContext.contextPath }/assets/js/lib/chartist/chartist.min.js"></script>
        <script src="${pageContext.servletContext.contextPath }/assets/js/lib/sparklinechart/jquery.sparkline.min.js"></script>
        <script src="${pageContext.servletContext.contextPath }/assets/js/lib/sparklinechart/sparkline.init.js"></script>
        <script src="${pageContext.servletContext.contextPath }/assets/js/lib/owl-carousel/owl.carousel.min.js"></script>
        <script src="${pageContext.servletContext.contextPath }/assets/js/lib/owl-carousel/owl.carousel-init.js"></script>
        <!-- scripit init-->
    <script src="${pageContext.servletContext.contextPath }/assets/js/dashboard2.js"></script>
    </body>

</html>
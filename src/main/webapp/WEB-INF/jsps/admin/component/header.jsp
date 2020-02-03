<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 头部部分 -->
	<div class="header">
        <div class="container-fluid">
            <div class="row">
                <div class="col-lg-12">
                    <div class="float-left">
                        <div class="hamburger sidebar-toggle">
                            <span class="line"></span>
                            <span class="line"></span>
                            <span class="line"></span>
                        </div>
                    </div>
                    <div class="float-right">
                        <div class="dropdown dib">
                            <div class="header-icon" data-toggle="dropdown">
                                <i class="ti-bell"></i>
                                <div class="drop-down dropdown-menu dropdown-menu-right">
                                    <div class="dropdown-content-heading">
                                        <span class="text-left">通知</span>
                                    </div>
                                    <div class="dropdown-content-body">
                                        <ul>
                                            <li>
                                                <a href="${pageContext.servletContext.contextPath }/#">
                                                    <img class="pull-left m-r-10 avatar-img" src="${pageContext.servletContext.contextPath }/assets/images/avatar/3.jpg" alt="" />
                                                    <div class="notification-content">
                                                        <small class="notification-timestamp pull-right">02:34 PM</small>
                                                        <div class="notification-heading">龚仕俊</div>
                                                        <div class="notification-text">今天5个人加入了</div>
                                                    </div>
                                                </a>
                                            </li>
                                          
                                            <li class="text-center">
                                                <a href="${pageContext.servletContext.contextPath }/#" class="more-link">查看所有</a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="dropdown dib">
                            <div class="header-icon" data-toggle="dropdown">
                                <i class="ti-email"></i>
                                <div class="drop-down dropdown-menu dropdown-menu-right">
                                    <div class="dropdown-content-heading">
                                        <span class="text-left">1条新信息</span>
                                        <a href="${pageContext.servletContext.contextPath }/email.html">
                                            <i class="ti-pencil-alt pull-right"></i>
                                        </a>
                                    </div>
                                    <div class="dropdown-content-body">
                                        <ul>
                                            <li class="notification-unread">
                                                <a href="${pageContext.servletContext.contextPath }/#">
                                                    <img class="pull-left m-r-10 avatar-img" src="${pageContext.servletContext.contextPath }/assets/images/avatar/1.jpg" alt="" />
                                                    <div class="notification-content">
                                                        <small class="notification-timestamp pull-right">02:34 PM</small>
                                                        <div class="notification-heading">龚仕俊</div>
                                                        <div class="notification-text">你好，我在这</div>
                                                    </div>
                                                </a>
                                            </li>
                                            
                                            <li class="text-center">
                                                <a href="${pageContext.servletContext.contextPath }/#" class="more-link">查看所有</a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="dropdown dib">
                            <div class="header-icon" data-toggle="dropdown">
                                <span class="user-avatar">${sessionScope.admin.aUsername }
                                    <i class="ti-angle-down f-s-10"></i>
                                </span>
                                <div class="drop-down dropdown-profile dropdown-menu dropdown-menu-right">
                                    <div class="dropdown-content-heading">
                                        <span class="text-left">你好</span>
                                        <p class="trial-day">欢迎</p>
                                    </div>
                                    <div class="dropdown-content-body">
                                        <ul>
                                        
                                            <li style="cursor: pointer;">
                                                <a onclick="window.location = '${pageContext.servletContext.contextPath }/admin/logout'">
                                                    <i class="ti-power-off"></i>
                                                    <span>退出</span>
                                                </a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
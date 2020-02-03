<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 左导航栏 -->
	<div class="sidebar sidebar-hide-to-small sidebar-shrink sidebar-gestures">
            <div class="nano">
                <div class="nano-content">
                    <ul>
                        <div class="logo"><a href="${pageContext.servletContext.contextPath }/index.html"><span>人力资源管理系统</span></a></div>
                        
                        <li class="label">功能汇总</li>
                        <li id="people"><a class="sidebar-sub-toggle"><i class="ti-user"></i>人事管理<span class="sidebar-collapse-icon ti-angle-down"></span></a>
                            <ul>
                                <li id="empList"><a href="${pageContext.servletContext.contextPath }/adminEmployee/allEmployee"><i class="ti-target"></i>员工列表</a></li>
                                <li id="contact"><a href="${pageContext.servletContext.contextPath }/adminContract/allContract"><i class="ti-target"></i>合同信息</a></li>
                                <li id="peoChan"><a href="${pageContext.servletContext.contextPath }/adminPerson/peopleChangePage"><i class="ti-target"></i>人事变动</a></li>
                                <li id="peoTalent"><a href="${pageContext.servletContext.contextPath }/adminPerson/talentPage"><i class="ti-target"></i>企业人才库</a></li>
                            </ul>
                        </li>
                        
                        <!--<li><a href="${pageContext.servletContext.contextPath }/app-email.html"><i class="ti-email"></i> Email</a></li>
                        <li><a href="${pageContext.servletContext.contextPath }/app-profile.html"><i class="ti-user"></i> Profile</a></li>-->
                        
                        <li id="recu"><a class="sidebar-sub-toggle"><i class="ti-layout-grid4-alt"></i>招聘管理<span class="sidebar-collapse-icon ti-angle-down"></span></a>
                            <ul>
                                <li id="recuMes"><a href="${pageContext.servletContext.contextPath }/adminRecruit/allRecruitMessage"><i class="ti-target"></i>招聘信息</a></li>

                                <li id="appMes"><a href="${pageContext.servletContext.contextPath }/adminRecruit/allApplyMessage"><i class="ti-target"></i>应聘信息</a></li>
                                
                               <li id="interMes"><a href="${pageContext.servletContext.contextPath }/adminInterview/allInterviews"><i class="ti-target"></i>面试信息</a></li>
                            </ul>
                        </li>
                        <li id="train"><a class="sidebar-sub-toggle"><i class="ti-heart"></i>培训管理<span class="sidebar-collapse-icon ti-angle-down"></span></a>
                            <ul>
                                <li id="trainPlan"><a href="${pageContext.servletContext.contextPath }/adminTrain/allTraining"><i class="ti-target"></i>培训信息管理</a></li>
                            </ul>
                        </li>
                        <li id="atten"><a class="sidebar-sub-toggle"><i class="ti-map"></i>考勤管理<span class="sidebar-collapse-icon ti-angle-down"></span></a>
                            <ul>
                                <li id="attenManage"><a href="${pageContext.servletContext.contextPath }/adminAttenRew/allEmpPage"><i class="ti-target"></i>考勤奖惩管理</a></li>
                            </ul>
                        </li>
                      
                        <li id="salary"><a class="sidebar-sub-toggle"><i class="ti-files"></i>薪酬管理<span class="sidebar-collapse-icon ti-angle-down"></span></a>
                            <ul>
                                <li id="salMes"><a href="${pageContext.servletContext.contextPath }/adminSalary/empSalary"><i class="ti-target"></i>薪酬信息</a></li>
                            
                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
</body>
</html>
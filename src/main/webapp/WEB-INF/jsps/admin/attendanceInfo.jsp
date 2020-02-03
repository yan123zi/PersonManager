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

    <title>考勤详情</title>

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
    <script type="text/javascript" src="${pageContext.servletContext.contextPath }/assets/js/jquery-3.3.1.min.js"></script>
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/font-awesome.min.css" rel="stylesheet">
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/themify-icons.css" rel="stylesheet">
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/menubar/sidebar.css" rel="stylesheet">
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/helper.css" rel="stylesheet">
    <link href="${pageContext.servletContext.contextPath }/assets/css/style.css" rel="stylesheet">
</head>

<body>

        
        <!-- /# sidebar -->
	<jsp:include page="component/navigation.jsp"></jsp:include>
    <jsp:include page="component/header.jsp"></jsp:include>
    ${pageInfo.list==null }
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
                    <div class="col-lg-3 p-l-0 title-margin-left" >
                        <div class="page-header">
                            <div class="page-title">
                                <ol class="breadcrumb">
                                <c:if test="${pageInfo.list.size()!=0 }">
                                    <li><button class="btn btn-primary" data-toggle="modal" data-target="#re">进行奖励</button></li>
                                    &nbsp;&nbsp;&nbsp;
                                    <li><button class="btn btn-danger" data-toggle="modal" data-target="#pu">进行处罚</button></li>
                                </c:if>
                                </ol>
                            </div>
                        </div>
                    </div>
                    <!-- 奖励信息 -->
					<div class="modal fade" id="re" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
					  <div class="modal-dialog" role="document">
					    <div class="modal-content">
					      <div class="modal-header">
					        <h4 class="modal-title" id="myModalLabel">奖励信息编辑</h4>
					        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
					      </div>
					      <div class="modal-body">
					      	<form id="reMessage" method="post" action="#">
					      	<c:if test="${pageInfo.list.size()!=0 }">
					      	<input type="hidden" name="eId.eId" id="eId" value="${pageInfo.list.get(0).eId.eId }">
					      	</c:if>
							  <div class="form-group">
							    <label for="exampleInputPassword1">奖励金额</label>
							    <input type="number" name="reReward" id="reReward" class="form-control" id="exampleInputPassword1">
							  </div>
							  <br>
							  <div class="form-group">
							  	<textarea name="reRereson" class="form-control" id="reRereson" style="width: 440px;height: 200px" placeholder="奖励原由"></textarea>
							  </div>
							</form>
					      </div>
					      <div class="modal-footer">
					        <button type="button" id="reMessageSend" class="btn btn-primary">determined</button>
					        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					      </div>
					    </div>
					  </div>
					</div>
					<!-- 处罚信息 -->
					<div class="modal fade" id="pu" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
					  <div class="modal-dialog" role="document">
					    <div class="modal-content">
					      <div class="modal-header">
					        <h4 class="modal-title" id="myModalLabel">处罚信息编辑</h4>
					        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
					      </div>
					      <div class="modal-body">
					      	<form id="puMessage" method="post" action="#">
					      	<c:if test="${pageInfo.list.size()!=0 }">
					      	<input type="hidden" name="eId.eId" value="${pageInfo.list.get(0).eId.eId }">
					      	</c:if>
							  <div class="form-group">
							    <label for="exampleInputPassword1">处罚金额</label>
							    <input type="number" name="rePunish" id="rePunish" class="form-control" id="exampleInputPassword1">
							  </div>
							  <br>
							  <div class="form-group">
							  	<textarea name="rePureson" class="form-control" id="rePureson" style="width: 440px;height: 200px" placeholder="处罚原由"></textarea>
							  </div>
							</form>
					      </div>
					      <div class="modal-footer">
					        <button type="button" id="puMessageSend" class="btn btn-primary">Send Message</button>
					        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					      </div>
					    </div>
					  </div>
					</div>
                    <!-- /# column -->
                </div>
                
                <!--第一个logo -->
                <section id="main-content">
                    <div class="row">
                        <div class="col-lg-10" style="text-align: center;">
                            <div class="col-lg-12">
                    <div id="invoice" class="effect2 m-t-20" >
                        <div id="invoice-top">
                            <div class="clientlogo"></div>
                            <div class="invoice-info">
                                <h4>
                                <c:choose>
                                	<c:when test="${pageInfo.list.size()!=0 }">
                                		${pageInfo.list.get(0).eId.eName }
                                	</c:when>
                                	<c:otherwise>
                                		该员工暂无考勤信息
                                	</c:otherwise>
                                </c:choose>
                                </h4>
                                <c:if test="${pageInfo.list.size()!=0 }">
                                	<p>${pageInfo.list.get(0).eId.position.pName }<br></p>
                                </c:if>
                            </div>
                            <!--End Info-->
                            <div class="title">
                                <h5>考勤详情</h5>
                                <p>分类方式：时间顺序<br>
                                </p>
                            </div>
                            <!--End Title-->
                        </div>
                        <c:if test="${pageInfo.list.size()!=0 }">
                        <div style="position: relative;height: 25px">
                        	<div style="float: right;margin-right: 30px">迟到次数:<span id="later">5</span>次&nbsp;&nbsp;&nbsp;早退次数:<span id="out">5</span>次&nbsp;&nbsp;&nbsp;请假次数:<span id="leave">5</span>次</div>
                        </div>
                        </c:if>
                        <!--End InvoiceTop-->



						<!--第二个logo -->
                        <!--<div id="invoice-mid">

                            <div class="clientlogo"></div>
                            <div class="invoice-info">
                                <h2>Client Name</h2>
                                <p>mariam@gmail.com<br> 555-555-5555
                                    <br>
                            </div>

                            <div id="project">
                                <h2>Project Description</h2>
                                <p>Proin cursus, dui non tincidunt elementum, tortor ex feugiat enim, at elementum enim quam vel purus. Curabitur semper malesuada urna ut suscipit.</p>
                            </div>

                        </div>-->
                        <!--End Invoice Mid-->
                        <c:choose>
                        <c:when test="${pageInfo.list.size()!=0 }">
                        <div class="col-lg-12">
                                <div class="card">
                                    <!--<div class="card-title pr">
                                        <h4>All Exam Result</h4>

                                    </div>-->
                                    <div class="card-body">
                                        <div class="table-respon/sive">
                                            <table class="table student-data-table m-t-20" >
                                                <thead>
                                                    <tr>
                                                        <th>日期</th>
                                                        <th>上班打卡时间</th>
                                                        <th>下班打卡时间</th>
                                                        <th>考勤情况</th>
                                                        <th>请假病假</th>
                                                    </tr>
                                                </thead>
                                                <tbody>
                                                <c:forEach items="${pageInfo.list }" var="attendance">
                                                    <tr>
                                                        <td>
                                                        	<fmt:formatDate type="date" value="${attendance.atDate }"/>
                                                        </td>
                                                        <td>
                                                           <fmt:formatDate type="both" dateStyle="long" timeStyle="long" value="${attendance.atSw }"/>
                                                        </td>
                                                        <td>
                                                            <fmt:formatDate type="both" dateStyle="long" timeStyle="long" value="${attendance.atEw }"/>
                                                        </td>
                                                        <td>
                                                           	<c:if test="${attendance.atStatus==0 }">
                                                           		迟到
                                                           	</c:if>
                                                           	<c:if test="${attendance.atStatus==1 }">
                                                           		早退
                                                           	</c:if>
                                                           	<c:if test="${attendance.atStatus==2 }">
                                                           		请假
                                                           	</c:if>
                                                           	<c:if test="${attendance.atStatus==3 }">
                                                           		迟到，早退
                                                           	</c:if>
                                                           	<c:if test="${attendance.atStatus==4 }">
                                                           		全勤
                                                           	</c:if>
                                                        </td>
                                                        <td>
                                                        	<c:choose>
                                                        		<c:when test="${attendance.atDesc!=null }">
                                                        			<a href="#"><button mes="${attendance.atDesc }" data-toggle="modal" data-target="#alt" class="btn btn-primary see">查看</button></a>
                                                        		</c:when>
                                                        		<c:otherwise>
                                                        			无
                                                        		</c:otherwise>
                                                        	</c:choose>
                                                        </td>
                                                    </tr>
                                                </c:forEach>
                                                </tbody>
                                            </table>
                                        </div>
                                    </div>
                                </div>
                                <div style="margin-top: 50px;float: right;font-size: 20px;">
	                            <nav aria-label="Page navigation">
								  <ul id="page" class="pagination">				
								  	<li style="text-align: center;"><a href="${pageContext.request.contextPath }/adminAttenRew/empAttens/${pageInfo.list.get(0).eId.eId}">首页</a></li>
								    <li style="text-align: center;">
								    	<c:if test="${pageInfo.hasPreviousPage }">
									      <a href="${pageContext.request.contextPath }/adminAttenRew/empAttens/${pageInfo.list.get(0).eId.eId}?pn=${pageInfo.pageNum-1}" aria-label="Previous">
									        <span aria-hidden="true">&laquo;</span>
									      </a>
									    </c:if>
								    </li>
								    <c:forEach var="i" begin="1" end="${pageInfo.pages }">
									    <c:if test="${i==pageInfo.pageNum }">
									    	<li class="active" style="background-color: #111;text-align: center;color: white;"><a href="#">${i }</a></li>
									    </c:if>
									    <c:if test="${i!=pageInfo.pageNum }">
									    	<li style="text-align: center;"><a href="${pageContext.request.contextPath }/adminAttenRew/empAttens/${pageInfo.list.get(0).eId.eId}?pn=${i }">${i }</a></li>
									    </c:if>
								    </c:forEach>
								    <li style="text-align: center;">
								    	<c:if test="${pageInfo.hasNextPage }">
									      <a href="${pageContext.request.contextPath }/adminAttenRew/empAttens/${pageInfo.list.get(0).eId.eId}?pn=${pageInfo.pageNum+1}" aria-label="Next">
									        <span aria-hidden="true">&raquo;</span>
									      </a>
									    </c:if>
								    </li>
								    
								    <li style="text-align: center;"><a href="${pageContext.request.contextPath }/adminAttenRew/empAttens/${pageInfo.list.get(0).eId.eId}?pn=${pageInfo.pages}">末页</a></li>
								  </ul>
								</nav>	
                       		 </div>
                            </div>
                            </c:when>
                            <c:otherwise>
                            	<h3>该员工暂无考勤信息!</h3>
                            </c:otherwise>
                            </c:choose>
                            <!-- 请假内容 -->
                        <div class="modal fade" id="alt" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
						  <div class="modal-dialog" role="document">
						    <div class="modal-content">
						      <div class="modal-header">
						        <h4 class="modal-title" id="myModalLabel">请假原由</h4>
						        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
						      </div>
						      <div class="modal-body">
						      	
								  <div class="form-group">
								  	<p id="txt" class="lead"><b></b></p>
								  </div>
								
						      </div>
						      <div class="modal-footer">
						        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
						      </div>
						    </div>
						  </div>
						</div>
                        <!--End InvoiceBot-->
                    </div>
                    <!--End Invoice-->
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



    <script type="text/javascript">
        	$(function(){
        		$("#page li").css({
        			width:"40px"
        		});
        		$(".see").click(function(){
        			$("#txt b").text($(this).attr("mes"));
        		});
        		$("#attenManage").addClass("active");
				$("#atten").addClass("open");
        		$("#reMessageSend").click(function(){
        			$.ajax({
        				url:"${pageContext.servletContext.contextPath }/adminAttenRew/addReOrPu",
        				type:"post",
        				data:$("#reMessage").serialize(),
        				success:function(res){
        					$("#reReward").val("");
        					$("#reRereson").val("");
        					alert(res.msg);
        				}
        			});
        		});
        		$("#puMessageSend").click(function(){
        			$.ajax({
        				url:"${pageContext.servletContext.contextPath }/adminAttenRew/addReOrPu",
        				type:"post",
        				data:$("#puMessage").serialize(),
        				success:function(res){
        					$("#rePunish").val("");
        					$("#rePureson").val("");
        					alert(res.msg);
        				}
        			});
        		});
        		if(${pageInfo.list.size()!=0 }){
        			if($("#eId").val()!=null){
        			 $.ajax({
        				url:"${pageContext.servletContext.contextPath }/adminAttenRew/attenStatus?eId="+$("#eId").val(),
        				type:"get",
        				success:function(res){
        					console.log(res);
        					console.log(res.later);
        					$("#later").text(res.later);
        					$("#out").text(res.out);
        					$("#leave").text(res.leave);
        				}
        			}); 
        			}
        		} 
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
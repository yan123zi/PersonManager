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
        <title>人力资源管理系统</title>
        <link rel="shortcut icon" href="http://placehold.it/64.png/000/fff">
        <link rel="apple-touch-icon" sizes="144x144" href="http://placehold.it/144.png/000/fff">
        <link rel="apple-touch-icon" sizes="114x114" href="http://placehold.it/114.png/000/fff">
        <link rel="apple-touch-icon" sizes="72x72" href="http://placehold.it/72.png/000/fff">
        <link rel="apple-touch-icon" sizes="57x57" href="http://placehold.it/57.png/000/fff">
        <link href="${pageContext.servletContext.contextPath }/assets/css/lib/font-awesome.min.css" rel="stylesheet">
        <link href="${pageContext.servletContext.contextPath }/assets/css/lib/themify-icons.css" rel="stylesheet">
        <link href="${pageContext.servletContext.contextPath }/assets/css/lib/owl.carousel.min.css" rel="stylesheet" />
        <link href="${pageContext.servletContext.contextPath }/assets/css/lib/owl.theme.default.min.css" rel="stylesheet" />
        <link href="${pageContext.servletContext.contextPath }/assets/css/lib/weather-icons.css" rel="stylesheet" />
        <link href="${pageContext.servletContext.contextPath }/assets/css/lib/menubar/sidebar.css" rel="stylesheet">
        <link href="${pageContext.servletContext.contextPath }/assets/css/lib/bootstrap.min.css" rel="stylesheet">
        <link href="${pageContext.servletContext.contextPath }/assets/css/lib/helper.css" rel="stylesheet">
        <link href="${pageContext.servletContext.contextPath }/assets/css/style.css" rel="stylesheet">
        <script type="text/javascript" src="${pageContext.servletContext.contextPath }/assets/js/jquery-3.3.1.min.js"></script>
        <link rel="stylesheet" href="${pageContext.servletContext.contextPath }/assets/js/wangEditor.min.css" />
	<script src="${pageContext.servletContext.contextPath }/assets/js/wangEditor.min.js"></script>
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
                                    
                                  
                                </ol>
                            </div>
                        </div>
                    </div>
                    <!-- /# column -->
                </div>
                       
                        <div class="row">
                        <div class="" style="width: 1200px;margin-left: 50px">
                            <div class="card">
                               
							<div class="basic-information" style="padding-left: 100px;">
                                <h2 style="text-align:center;margin-bottom: 50px">GS科技新员工入职合同</h2>
                                <form:form method="post" action="${pageContext.servletContext.contextPath }/adminContract/addContract">
                                <div class="birthday-content">
                                  <span class="contact-title">甲方名称：</span>
                                  <c:choose>
                                  	<c:when test="${contract!=null }">
                                  		 ${contract.cAname }
                                  	</c:when>
                                  	<c:otherwise>
                                  		 <input type="text"  value="" name="cAname" placeholder="GS科技公司" style="border: white;width: 250px" required="required"/>
                                  	</c:otherwise>
                                  </c:choose>
                                </div>
                                <div class="birthday-content">
                                  <span class="contact-title">甲方地址：</span>
                                  <c:choose>
                                  	<c:when test="${contract!=null }">
                                  		 ${contract.cAaddress }
                                  	</c:when>
                                  	<c:otherwise>
                                  		 <input type="text"  value="" name="cAaddress" placeholder="深圳市松岗街道新岗东路51号佳德福工业园5栋" style="border: white;width: 300px" required="required"/>
                                  	</c:otherwise>
                                  </c:choose>
                                </div>
                                <div class="birthday-content">
                                  <span class="contact-title">乙方名称：</span>
                                  <c:choose>
                                  	<c:when test="${apply!=null }">
                                  		 <input type="text"  value="${apply.apName }" name="cBname" placeholder="龚仕俊" style="border: white;width: 250px" required="required"/>
                                  	</c:when>
                                  	<c:when test="${contract!=null }">
                                  		${contract.cBname }
                                  	</c:when>
                                  	<c:otherwise>
                                  		 <input type="text"  value="" name="cBname" placeholder="龚仕俊" style="border: white;width: 250px" required="required"/>
                                  	</c:otherwise>
                                  </c:choose>
                                </div>
                                <div class="gender-content">
                                  <span class="contact-title">乙方地址：</span>
                                  <c:choose>
                                  	<c:when test="${contract!=null }">
                                  		 ${contract.cBaddress }
                                  	</c:when>
                                  	<c:otherwise>
                                  		 <input type="text"  value="" name="cBaddress" placeholder="萍乡学院" style="border: white;width: 300px" required="required"/>
                                  	</c:otherwise>
                                  </c:choose>
                                </div>
                                 <div class="gender-content">
                                  <span class="contact-title">乙方身份证号：</span>
                                  <c:choose>
                                  	<c:when test="${apply!=null }">
                                  		 <input type="text"  value="${apply.apNumber }" name="cBnumber" placeholder="362330199612092010" style="border: white;width: 250px" required="required"/>
                                  	</c:when>
                                  	<c:when test="${contract!=null }">
                                  		${contract.cBnumber }
                                  	</c:when>
                                  	<c:otherwise>
                                  		 <input type="text"  value="" name="cBnumber" placeholder="362330199612092010" style="border: white;width: 250px" required="required"/>
                                  	</c:otherwise>
                                  </c:choose>
                                </div>
                                 <div class="gender-content">
                                  <span class="contact-title">甲方任命乙方为：</span>
                                  <c:choose>
                                  	<c:when test="${apply!=null }">
                                  		 <input type="text"  value="${apply.pPosition }" name="cBposition" placeholder="java开发工程师" style="border: white;width: 250px" required="required"/>
                                  	</c:when>
                                  	<c:when test="${contract!=null }">
                                  		${contract.cBposition }
                                  	</c:when>
                                  	<c:otherwise>
                                  		<input type="text"  value="" name="cBposition" placeholder="java开发工程师" style="border: white;width: 250px" required="required"/>
                                  	</c:otherwise>
                                  </c:choose>
                                </div>
                                 <div class="birthday-content">
                                  <span class="contact-title">合同内容：</span><br />
                                  <c:choose>
                                  	<c:when test="${contract!=null }">
                                  		 <div style="margin-bottom: 50px;border: 1px solid;padding: 10px">${contract.cContent }</div>
                                  	</c:when>
                                  	<c:otherwise>
                                  	<input type="hidden" id="content" name="cContent" value=""/>
                                  	<div id="editor">
                                  		<p>甲乙双方于*年*月日*签订为期*年的劳动合同，现甲乙双方同意解除劳动合同关系。经双方协商一致，签订本协议如下：</p>
                                  		<p>1、 自*年*月*日起，解除双方签订的劳动合同，双方的权利义务随之终止;<br>
                                  		2、 乙方工资结算至离职之日，支付时间为甲方正常发放工资时间。乙方奖金为元，差旅费、交通费、手机费等费用合计*元，以上费用均需扣除所得税，甲方同意在乙方办理完工作移交手续后三日内一次性支付给乙方。
                                  		<br>3、 甲方同意向乙方支付经济补偿金共计人民币*元。(税前)甲方同意在乙方办理完工作移交手续后三日内一次性支付给乙方。
                                  		<br>4、 甲方为乙方缴纳基本养老保险金、基本医疗保险金、失业保险金、工伤保险金、生育保险金、住房公积金至*年*月*日止。
                                  		<br>5、 甲方根据相关劳动法规和规定，向乙方提供劳动合同解除的证明并办理相关退工手续;
                                  		<br>6、 乙方应当于本协议签订后3日内妥善办理所有工作移交手续，离职后不得作出有损公司名誉或利益之行为。
                                  		<br>7、 乙方应为所掌握的甲方之任何商业秘密(包括本协议内容)进行保密，不得泄露给任何第三方，否则应向甲方支付违约金*元。
                                  		<br>8、 甲乙双方之间无任何竞业限制协议，合同解除后，乙方无需履行任何竞业限制义务。
                                  		<br>9、 本协议是解决双方之间劳动争议的所有安排和规定，双方之间不再存在其他任何劳动争议。
                                  		<br>此协议书一式三份，各份具有同等的法律效力，甲乙双方各持一份，另一份留存乙方本人档案。自双方签署之日起成立并生效</p>
                                  	</div>
                                  		 <!-- <textarea name="cContent" rows="15" cols="130" style="border-radius: 5px;" required="required">甲乙双方于*年*月日*签订为期*年的劳动合同，现甲乙双方同意解除劳动合同关系。经双方协商一致，签订本协议如下：
1、 自*年*月*日起，解除双方签订的劳动合同，双方的权利义务随之终止;
2、 乙方工资结算至离职之日，支付时间为甲方正常发放工资时间。乙方奖金为元，差旅费、交通费、手机费等费用合计*元，以上费用均需扣除所得税，甲方同意在乙方办理完工作移交手续后三日内一次性支付给乙方。
3、 甲方同意向乙方支付经济补偿金共计人民币*元。(税前)甲方同意在乙方办理完工作移交手续后三日内一次性支付给乙方。
4、 甲方为乙方缴纳基本养老保险金、基本医疗保险金、失业保险金、工伤保险金、生育保险金、住房公积金至*年*月*日止。
5、 甲方根据相关劳动法规和规定，向乙方提供劳动合同解除的证明并办理相关退工手续;
6、 乙方应当于本协议签订后3日内妥善办理所有工作移交手续，离职后不得作出有损公司名誉或利益之行为。
7、 乙方应为所掌握的甲方之任何商业秘密(包括本协议内容)进行保密，不得泄露给任何第三方，否则应向甲方支付违约金*元。
8、 甲乙双方之间无任何竞业限制协议，合同解除后，乙方无需履行任何竞业限制义务。
9、 本协议是解决双方之间劳动争议的所有安排和规定，双方之间不再存在其他任何劳动争议。
此协议书一式三份，各份具有同等的法律效力，甲乙双方各持一份，另一份留存乙方本人档案。自双方签署之日起成立并生效。
</textarea> -->
                                  	</c:otherwise>
                                  </c:choose>
                                  
                                </div>
                                <c:if test="${contract==null }">
                                 <li class="breadcrumb-item" style="float: right;margin-right: 130px;margin-top: 20px"><a href="#"><input type="submit" class="btn btn-primary btn-rounded m-b-10 m-l-5" value="提交信息"></input></a></li>
                                 </c:if>
                              </form:form>
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
       <script type="text/javascript">
       	$(function(){
       		$("#contact").addClass("active");
			$("#people").addClass("open");
       	});
       </script>
        <script type="text/javascript">
        var E = window.wangEditor;
		var editor = new E('#editor');
	 	// 自定义菜单配置
	    editor.customConfig.menus = [
	        'head',  // 标题
	        'bold',  // 粗体
	        'fontSize',  // 字号
	        'fontName',  // 字体
	        'italic',  // 斜体
	        'underline',  // 下划线
	        'strikeThrough',  // 删除线
	        'foreColor',  // 文字颜色
	        'link',  // 插入链接
	        'list',  // 列表
	        'justify',  // 对齐方式
	        'quote',  // 引用
	        'emoticon',  // 表情
	        'table',  // 表格
	        'code',  // 插入代码
	        'undo',  // 撤销
	        'redo'  // 重复
	    ];
		editor.create();
        	$(function(){
        		if("${msg}"!=""&&"${msg}"!=null){
        			alert("${msg}")
        		}
        		$("#btn1").bind("click",function(){
        			alert(editor.txt.html());
        		});
        		$("input[type='submit']").click(function(){
        			$("#content").val(editor.txt.html());
        		});
        	});
        	
        </script>
        <!-- jquery vendor -->
        <script src="${pageContext.servletContext.contextPath }/assets/js/lib/jquery.nanoscroller.min.js"></script>
        <!-- nano scroller -->
        <script src="${pageContext.servletContext.contextPath }/assets/js/lib/menubar/sidebar.js"></script>
        <script src="${pageContext.servletContext.contextPath }/assets/js/lib/preloader/pace.min.js"></script>
        <!-- sidebar -->

        <script src="${pageContext.servletContext.contextPath }/assets/js/lib/bootstrap.min.js"></script><script src="${pageContext.servletContext.contextPath }/assets/js/scripts.js"></script>
        <!-- bootstrap -->



        <!-- scripit init-->
    </body>

</html>
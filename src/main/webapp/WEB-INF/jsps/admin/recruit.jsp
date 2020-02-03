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
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/font-awesome.min.css" rel="stylesheet">
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/themify-icons.css" rel="stylesheet">
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/data-table/buttons.bootstrap.min.css" rel="stylesheet" />
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/menubar/sidebar.css" rel="stylesheet">
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.servletContext.contextPath }/assets/css/lib/helper.css" rel="stylesheet">
    <link href="${pageContext.servletContext.contextPath }/assets/css/style.css" rel="stylesheet">
    <script type="text/javascript" src="${pageContext.servletContext.contextPath }/assets/js/jquery-3.3.1.min.js"></script>
    <link rel="stylesheet" href="${pageContext.servletContext.contextPath }/assets/js/wangEditor.min.css" />
	<script src="${pageContext.servletContext.contextPath }/assets/js/wangEditor.min.js"></script>
	<script type="text/javascript" src="${pageContext.servletContext.contextPath }/assets/js/jquery.validate.min.js"></script>
	<script type="text/javascript" src="${pageContext.servletContext.contextPath }/assets/js/messages_zh.min.js"></script>
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

  <div class="content-wrap">
    <div class="main">
      <div class="container-fluid">
        <div class="row">
          <div class="col-lg-8 p-r-0 title-margin-right">
            <div class="page-header">
              <div class="page-title">
                <h1>
                 		招聘信息编辑
                </h1>
              </div>
            </div>
          </div>
          <!-- /# column -->
          <!-- <div class="col-lg-4 p-l-0 title-margin-left">
            <div class="page-header">
              <div class="page-title">
                <ol class="breadcrumb">
                  <li class="breadcrumb-item">
                    <a href="#"></a>
                  </li>
                  <li class="breadcrumb-item active"></li>
                </ol>
              </div>
            </div>
          </div> -->
          <!-- /# column -->
        </div>
        
         <fieldset>
		  	<div class="container" style="margin-left: 20px">
		  	<form:form class="form-inline" method="post" id="recruitMessage" action="${pageContext.servletContext.contextPath }/adminRecruit/releaseRecruitMessage">
		  		<div class="form-group" style="margin-right: 100px;float: left;margin-bottom: 30px">
		  			<label for="rTitle">招聘标题:&nbsp;</label>
		  			<c:choose>
                     	<c:when test="${recruitment!=null }">
                     		 <input id="rTitle" class="form-control" type="text" name="rTitle" placeholder="招聘标题" value="${recruitment.rTitle }" maxlength="18">
                     	</c:when>
                     	<c:otherwise>
                     		 <input id="rTitle" class="form-control" type="text" name="rTitle" placeholder="招聘标题" value="" maxlength="18">
                     	</c:otherwise>
                     </c:choose>
		  		</div>
		  		<div class="form-group" style="margin-right: 100px;float: left;margin-bottom: 30px">
		  			<label for="rNumber">招聘人数:&nbsp;</label>
		  			<c:choose>
                     	<c:when test="${recruitment!=null }">
                     		 <input id="rNumber" class="form-control" type="number" name="rNumber" placeholder="招聘人数" oninput="if(value.length>3)value=value.slice(0,3)" value="${recruitment.rNumber }" >
                     	</c:when>
                     	<c:otherwise>
                     		 <input id="rNumber" class="form-control" type="number" name="rNumber" placeholder="招聘人数" oninput="if(value.length>3)value=value.slice(0,3)" value="" >
                     	</c:otherwise>
                     </c:choose>
		  		</div>
		  		<div class="form-group" style="margin-right: 100px;float: left;margin-bottom: 30px">
		  			<label for="rEdu">学历要求:&nbsp;</label>
		  			<c:choose>
                     	<c:when test="${recruitment!=null }">
                     		 <input id="rEdu" class="form-control" type="text" name="rEdu" placeholder="学历要求" value="${recruitment.rEdu }" maxlength="7">
                     	</c:when>
                     	<c:otherwise>
                     		 <input id="rEdu" class="form-control" type="text" name="rEdu" placeholder="学历要求" value="" maxlength="7">
                     	</c:otherwise>
                     </c:choose>
		  		</div>
		  		<div class="form-group" style="margin-right: 200px;float: left;margin-bottom: 30px">
		  			<label for="rExp">经验要求:&nbsp;</label>
		  			<c:choose>
                     	<c:when test="${recruitment!=null }">
                     		 <input id="rExp" class="form-control" type="text" name="rExp" placeholder="经验要求" value="${recruitment.rExp }" maxlength="10">
                     	</c:when>
                     	<c:otherwise>
                     		 <input id="rExp" class="form-control" type="text" name="rExp" placeholder="经验要求" value="" maxlength="10">
                     	</c:otherwise>
                     </c:choose>
		  		</div>
		  		<div class="form-group" style="margin-right: 196px;float: left;margin-bottom: 30px">
		  			<label for="department">招聘部门:&nbsp;</label>
		  			<select class="form-control" id="department" name="dName">
					</select>
		  		</div>
		  		<div class="form-group" style="margin-right: 200px;float: left;margin-bottom: 30px">
		  			<label for="position">招聘职位:&nbsp;</label>
		  			<select class="form-control" id="position" name="pPosition">
					</select>
		  		</div>
		  		<div class="form-group" style="margin-right: 100px;float: left;margin-bottom: 30px">
		  			<label for="rSalary">月基本工资:&nbsp;</label>
		  			<c:choose>
                     	<c:when test="${recruitment!=null }">
                     		 <input id="rSalary" class="form-control" type="number" name="rSalary" placeholder="月基本工资" oninput="if(value.length>6)value=value.slice(0,6)"  value="${recruitment.rSalary }">
                     	</c:when>
                     	<c:otherwise>
                     		 <input id="rSalary" class="form-control" type="number" name="rSalary" placeholder="月基本工资" oninput="if(value.length>6)value=value.slice(0,6)"  value="">
                     	</c:otherwise>
                     </c:choose>
		  		</div>
		  		<input type="hidden" name="rContent" id="rContent"/>
			  </form:form>
			</div>
	  	
	  </fieldset>
	  
        <!-- /# row -->
        <section id="main-content">
          <div class="row">
            <div class="col-lg-12">
              <div class="card">
                <div class="card-title">
                  <h4>职位详细描述</h4>
                </div>
                <div class="">
                  <div id="editor"><c:if test="${recruitment!=null }">${recruitment.rContent }</c:if></div>
                  <br />
                  <button id="release" type="submit" class="btn btn-primary" style="margin-left: 94%;" value="提交">提交</button>
                </div>
              </div>
              <!-- /# card -->
            </div>
            <!-- /# column -->

          
          </div>
          

          <div class="row">
            <div class="col-lg-12">
              <!--<div class="footer">
                <p>2018 © Admin Board. - <a href="#">example.com</a> / More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></p>
              </div>-->
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
  <!-- jquery vendor -->
  <script src="${pageContext.servletContext.contextPath }/assets/js/lib/jquery.nanoscroller.min.js"></script>
  <script src="${pageContext.servletContext.contextPath }/assets/js/lib/menubar/sidebar.js"></script>
  <script src="${pageContext.servletContext.contextPath }/assets/js/lib/preloader/pace.min.js"></script>
  <script src="${pageContext.servletContext.contextPath }/assets/js/scripts.js"></script>


 <%--  <!--  flot-chart js -->
  <script src="${pageContext.servletContext.contextPath }/assets/js/lib/flot-chart/excanvas.min.js"></script>
  <script src="${pageContext.servletContext.contextPath }/assets/js/lib/flot-chart/jquery.flot.js"></script>
  <script src="${pageContext.servletContext.contextPath }/assets/js/lib/flot-chart/jquery.flot.pie.js"></script>
  <script src="${pageContext.servletContext.contextPath }/assets/js/lib/flot-chart/jquery.flot.time.js"></script>
  <script src="${pageContext.servletContext.contextPath }/assets/js/lib/flot-chart/jquery.flot.stack.js"></script>
  <script src="${pageContext.servletContext.contextPath }/assets/js/lib/flot-chart/jquery.flot.resize.js"></script>
  <script src="${pageContext.servletContext.contextPath }/assets/js/lib/flot-chart/jquery.flot.crosshair.js"></script>
  <script src="${pageContext.servletContext.contextPath }/assets/js/lib/flot-chart/curvedLines.js"></script>
  <script src="${pageContext.servletContext.contextPath }/assets/js/lib/flot-chart/flot-tooltip/jquery.flot.tooltip.min.js"></script>
  <script src="${pageContext.servletContext.contextPath }/assets/js/lib/flot-chart/flot-chart-init.js"></script> --%>


</body>
	<script>
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
				function validateForm(){
					return $("#recruitMessage").validate({
						rules:{
							rTitle:{
								required:true,
								maxlength:18
							},
							rNumber:{
								required:true,
								maxlength:4
							},
							rEdu:{
								required:true,
								maxlength:7
							},
							rExp:{
								required:true,
								maxlength:10
							},
							rSalary:{
								required:true,
								maxlength:6
							}
						},
						messages:{
							rTitle:{
								required:"招聘标题不能为空",
								maxlength:"招聘标题不能超过18个字"
							},
							rNumber:{
								required:"招聘人数不能为空",
								maxlength:"招聘人数不能超过1000"
							},
							rEdu:{
								required:"学历要求不能为空",
								maxlength:"学历要求不能超过7个字"
							},
							rExp:{
								required:"招聘标题不能为空",
								maxlength:"工作经验要求不能超过10个字"
							},
							rSalary:{
								required:"月基本工资不能为0",
								maxlength:"月工资不能超过100万"
							}
						}
					});
			}
				$(validateForm());
		</script>
		<script type="text/javascript">
			$(function(){
				$("#recuMes").addClass("active");
				$("#recu").addClass("open");
				var dName="${recruitment.dName}";
				var position="${recruitment.pPosition}";
				if("${msg}"!=""&&"${msg}"!=null){
					alert("${msg}")
				}
				$("#applyMessage").addClass("active");
				$("#applyMessage a").addClass("active");
				$("#recruit").addClass("open");
				$.ajax({
					url:"${pageContext.servletContext.contextPath }/recruit/allDepartment",
					type:"get",
					success:function(res){
						var departments=res.extend.departments;
						if(dName!=""&&position!=""){
							for(var k=0;k<departments.length;k++){
								$("#department").append("<option value="+departments[k].dName+">"+departments[k].dName+"</option>")
								if(departments[k].dName==dName){
									var positions=departments[k].positions;
									for(var i=0;i<positions.length;i++){
										$("#position").append("<option value="+positions[i].pName+">"+positions[i].pName+"</option>");
									}
								}
							}
							$("#department").val(dName);
							$("#position").val(position);
						}else{
							for(var k=0;k<departments.length;k++){
								$("#department").append("<option value="+departments[k].dName+">"+departments[k].dName+"</option>")
							}
							
							var positions=departments[0].positions;
							for(var i=0;i<positions.length;i++){
								$("#position").append("<option value="+positions[i].pName+">"+positions[i].pName+"</option>");
							}
						}
					}
				});
				
				
				$("#department").change(function(){
					$.ajax({
						url:"${pageContext.servletContext.contextPath }/recruit/department/"+$(this).val(),
						type:"get",
						success:function(res){
							$("#position").empty();
							var positions=res.extend.department.positions;
							for(var i=0;i<positions.length;i++){
								$("#position").append("<option value="+positions[i].pName+">"+positions[i].pName+"</option>");
							}
						}
					});
				});
			
				$("#release").click(function(){
					/* $("#recruitMessage").submit(); */
					if(editor.txt.text()==""||editor.txt.text()==null){
						alert("职位描述不能为空!");
					}else{
						$("#rContent").val(editor.txt.html());
						if(validateForm().form()){
							$("#recruitMessage").submit();
						}
					}
				});
				
			});		
		</script>
</html>
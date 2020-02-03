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

    <title>培训信息</title>
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
                 		培训信息编辑
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
		  	<form:form class="form-inline" method="post" id="trainMessage" action="${pageContext.servletContext.contextPath }/adminTrain/trainInfoAdd">
		  		<div class="form-group" style="margin-right: 100px;float: left;margin-bottom: 30px">
		  			<label for="rTitle">培训主题:&nbsp;</label>
		  			<c:choose>
                     	<c:when test="${training!=null }">
                     		 <input class="form-control" type="text" name="tPlan" placeholder="培训主题" value="${training.tPlan }" maxlength="25">
                     	</c:when>
                     	<c:otherwise>
                     		 <input class="form-control" type="text" name="tPlan" placeholder="培训主题" value="" maxlength="25">
                     	</c:otherwise>
                     </c:choose>
		  		</div>
		  		<div class="form-group" style="margin-right: 100px;float: left;margin-bottom: 30px">
		  			<label for="rNumber">培训信息发布人:&nbsp;</label>
		  			<c:choose>
                     	<c:when test="${training!=null }">
                     		 <input class="form-control" type="text" name="tMan" placeholder="信息发布人"  value="${training.tMan }" maxlength="6">
                     	</c:when>
                     	<c:otherwise>
                     		 <input class="form-control" type="text" name="tMan" placeholder="信息发布人"  value="" maxlength="6">
                     	</c:otherwise>
                     </c:choose>
		  		</div>
		  		<div class="form-group" style="margin-right: 196px;float: left;margin-bottom: 30px">
		  			<label for="department">培训部门:&nbsp;</label>
		  			<select class="form-control" id="department" name="dName">
					</select>
		  		</div>
		  		<div class="form-group" style="margin-right: 200px;float: left;margin-bottom: 30px">
		  			<label for="position">培训职位:&nbsp;</label>
		  			<select class="form-control" id="position" name="pPosition">
					</select>
		  		</div>
		  		<input type="hidden" name="tDesc" id="rContent"/>
			  </form:form>
			</div>
	  	
	  </fieldset>
	  
        <!-- /# row -->
        <section id="main-content">
          <div class="row">
            <div class="col-lg-12">
              <div class="card">
                <div class="card-title">
                  <h4>培训信息详细描述</h4>
                </div>
                <div class="">
                  <div id="editor"><c:if test="${training!=null }">${training.tDesc }</c:if></div>
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
					return $("#trainMessage").validate({
						rules:{
							tPlan:{
								required:true,
								maxlength:25
							},
							tMan:{
								required:true,
								maxlength:6
							}
						},
						messages:{
							tPlan:{
								required:"培训主题不能为空",
								maxlength:"培训主题不能超过18个字"
							},
							tMan:{
								required:"信息发布人不能为空",
								maxlength:"信息发布人长度不能超过6位"
							}
						}
					});
			}
				$(validateForm());
		</script>
		<script type="text/javascript">
			$(function(){
				var dName="${training.dName}";
				var position="${training.pPosition}";
				if("${msg}"!=""&&"${msg}"!=null){
					alert("${msg}")
				}
				$("#trainPlan").addClass("active");
				$("#train").addClass("open");
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
					/* $("#trainMessage").submit(); */
					if(editor.txt.text()==""||editor.txt.text()==null){
						alert("培训详细不能为空!");
					}else{
						$("#rContent").val(editor.txt.html());
						if(validateForm().form()){
							$("#trainMessage").submit();
						}
					}
				});
				
			});		
		</script>
</html>
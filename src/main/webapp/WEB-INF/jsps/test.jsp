<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.servletContext.contextPath }/assets/js/wangEditor.min.css"/>
<script src="${pageContext.servletContext.contextPath }/assets/js/wangEditor.min.js"></script>
<script type="text/javascript" src="${pageContext.servletContext.contextPath }/assets/js/jquery-3.3.1.min.js"></script>
<link rel="stylesheet" href="${pageContext.servletContext.contextPath }/assets/js/dataTables.bootstrap.min.css"/>
<script type="text/javascript" src="${pageContext.servletContext.contextPath }/assets/js/dataTables.bootstrap.min.js"></script>
</head>
<body>
	<form action="">
		<input id="content" type="text">
		<div id="editor">
			<p>欢迎使用富文本编辑器</p>
		</div>
		<button id="btnSubmit">提交</button>
	</form>
	<div>
		<button id="btn1">测试1</button>
		<button id="btn2">测试2</button>
	</div>
	<div>
		<a href="http://localhost:8080/PersonManagement/static/upload/resumeUpload/项目工作总结5-29.xlsx">f</a>
		<form id="filedown" method="get" action="${pageContext.servletContext.contextPath }/adminRecruit/download">
			<input type="hidden" name="filePath" value="C:\Users\子江\Desktop\指导书\组04-《人力资源管理系统》指导书.docx"/>
		</form>
	</div>
	<button id="download">下载</button>
	<!--第二步：添加如下 HTML 代码-->
<table id="table_id_example" class="display">
    <thead>
        <tr>
            <th>Column 1</th>
            <th>Column 2</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>Row 1 Data 1</td>
            <td>Row 1 Data 2</td>
        </tr>
        <tr>
            <td>Row 2 Data 1</td>
            <td>Row 2 Data 2</td>
        </tr>
    </tbody>
</table>
 
 
 

</body>
<script>
$(function(){
	$('#table_id_example').DataTable();
	var E=window.wangEditor;
	var editor=new E("#editor");
	
	editor.customConfig.uploadImgServer = "${pageContext.servletContext.contextPath }/upload";
	editor.customConfig.uploadFileName = "editorFile";
	editor.create();
	$("#btnSubmit").bind("click",function(){
		var content=editor.txt.html();
		$("#content").val(content);
		return false;
	});
	$("#btn1").bind("click",function(){
		alert(editor.txt.html());
	});
	$("#btn2").bind("click",function(){
		alert(editor.txt.text());
	})
	$("#download").click(function(){
		$("#filedown").submit();
	});
})
	
</script>
</html>
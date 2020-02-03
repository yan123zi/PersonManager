<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>${msg }</h3>
	<b><span id="layer">3</span>秒后，将会跳转至首页。</b><br>
	<a href="${pageContext.servletContext.contextPath }/index">如长时间未跳转，请点击此处!</a>
	<%
		//转向语句
		response.setHeader("Refresh", "3;URL=/PersonManagement/index");
	%>
</body>
<script type="text/javascript">
var time = 4;

function returnUrlByTime() {

	window.setTimeout('returnUrlByTime()', 1000);

	time = time - 1;

	document.getElementById("layer").innerHTML = time;
}
</script>
</html>
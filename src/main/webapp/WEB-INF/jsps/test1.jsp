<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.servletContext.contextPath }/assets/js/jquery-3.3.1.min.js"></script>
<link rel="stylesheet" href="${pageContext.servletContext.contextPath }/assets/layui/css/layui.css"/>
<script type="text/javascript" src="${pageContext.servletContext.contextPath }/assets/layui/layui.js"></script>
<link rel="stylesheet" href="${pageContext.servletContext.contextPath }/assets/uikit-2.25.0/css/uikit.min.css" />
<script src="${pageContext.servletContext.contextPath }/assets/uikit-2.25.0/js/uikit.min.js"></script>
</head>
<body>
	<div id="demo"></div>
	<div id="demo2"></div>
	<div id="demo3"></div>
	<button data-method="setTop" class="layui-btn" >多窗口模式，层叠置顶</button>
	<!-- 触发模态对话框的锚 -->
<a href="#my-id" data-uk-modal>...</a>

<!-- 触发模态对话框的按钮 -->
<button class="uk-button" data-uk-modal="{target:'#my-id',center:true}">...</button>

<!-- 模态对话框 -->
<div id="my-id" class="uk-modal">
    <div class="uk-modal-dialog">
        <div class="uk-modal-header">请假信息编辑<hr></div>
        <div >
        	<textarea></textarea>
        </div>
        <div class="uk-modal-footer">...</div>
    </div>
</div>
</body>
<script type="text/javascript">
layui.use('layer', function(){
	var $ = layui.jquery, layer = layui.layer;
	//触发事件
	  var active = {
	    setTop: function(){
	      var that = this; 
	      //多窗口模式，层叠置顶
	      layer.open({
	        type: 2 //此处以iframe举例
	        ,title: '当你选择该窗体时，即会在最顶端'
	        ,area: ['390px', '260px']
	        ,shade: 0
	        ,maxmin: true
	        ,content: '<input>'
	        ,btn: ['继续弹出', '全部关闭'] //只是为了演示
	        ,yes: function(){
	          $(that).click(); 
	        }
	        ,btn2: function(){
	          layer.closeAll();
	        }
	        
	        ,zIndex: layer.zIndex //重点1
	        ,success: function(layero){
	          layer.setTop(layero); //重点2
	        }
	      });
	    }
	}
	  $('.layui-btn').on('click', function(){
		    var othis = $(this), method = othis.data('method');
		    active[method] ? active[method].call(this, othis) : '';
		  });
});               
</script>
<script type="text/javascript">
layui.use('table', function(){
	  var table = layui.table;
	  
	  //第一个实例
	  table.render({
	    elem: '#demo'
	    ,height: 312
	    ,defaultToolbar:['filter', 'print']
	    ,url: '${pageContext.servletContext.contextPath }/employee/trainForEmp/17' //数据接口
	    ,page: true //开启分页
	    ,cols: [[ //表头
	      {field: 'tId', title: '培训编号', width:100, sort: true, fixed: 'left'}
	      ,{field: 'tDate', title: '发布时间', width:80,templet:'<div>{{ layui.util.toDateString(d.tDate, "yyyy-MM-dd") }}</div>'}
	      ,{field: 'tPlan', title: '培训计划', width:100, sort: true}
	      ,{field: 'dName', title: '培训部门', width:100} 
	      ,{field: 'pPosition', title: '培训职位', width: 177}
	      ,{field: 'tMan', title: '培训信息发布人', width: 150, sort: true}
	    ]]
	  });
	});
</script>
<script type="text/javascript">
layui.use('table', function(){
	  var table = layui.table;
	  
	  //第一个实例
	  table.render({
	    elem: '#demo2'
	    ,height: 312
	    ,defaultToolbar:['filter', 'print']
	    ,url: '${pageContext.servletContext.contextPath }/employee/attenForEmp/17' //数据接口
	    ,page: true //开启分页
	    ,cols: [[ //表头
	      {field: 'atDate', title: '日期', width:100, sort: true, fixed: 'left',templet:'<div>{{ layui.util.toDateString(d.atDate, "yyyy-MM-dd") }}</div>'}
	      ,{field: 'atSw', title: '上班时间', width:80,templet:'<div>{{ layui.util.toDateString(d.atSw, "yyyy-MM-dd HH:mm:ss") }}</div>'}
	      ,{field: 'atEw', title: '下班时间', width:100, sort: true,templet:'<div>{{ layui.util.toDateString(d.atEw, "yyyy-MM-dd HH:mm:ss") }}</div>'}
	      ,{field: 'atStatus', title: '考勤情况', width:100,templet:'<div></div>'} 
	      ,{field: 'atDesc', title: '请假情况', width: 177}
	    ]]
	  });
	});
</script>
<script type="text/javascript">
layui.use('table', function(){
	  var table = layui.table;
	  
	  //第一个实例
	  table.render({
	    elem: '#demo3'
	    ,height: 312
	    ,defaultToolbar:['filter', 'print']
	    ,url: '${pageContext.servletContext.contextPath }/employee/attenForEmp/17' //数据接口
	    ,page: true //开启分页
	    ,cols: [[ //表头
	      {field: 'atDate', title: '日期', width:100, sort: true, fixed: 'left',templet:'<div>{{ layui.util.toDateString(d.atDate, "yyyy-MM-dd") }}</div>'}
	      ,{field: 'atSw', title: '上班时间', width:80,templet:'<div>{{ layui.util.toDateString(d.atSw, "yyyy-MM-dd HH:mm:ss") }}</div>'}
	      ,{field: 'atEw', title: '下班时间', width:100, sort: true,templet:'<div>{{ layui.util.toDateString(d.atEw, "yyyy-MM-dd HH:mm:ss") }}</div>'}
	      ,{field: 'atStatus', title: '考勤情况', width:100,templet:'<div></div>'} 
	      ,{field: 'atDesc', title: '请假情况', width: 177}
	    ]]
	  });
	});
</script>
</html>
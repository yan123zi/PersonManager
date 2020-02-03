<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="description" content="人力资源管理系统" />
		<title>人力资源管理系统</title>
		<script type="text/javascript" src="${pageContext.servletContext.contextPath }/assets/js/jquery-3.3.1.min.js"></script>
		<link type="text/css" rel="stylesheet" href="${pageContext.servletContext.contextPath }/assets/style/css/css.css" />
		<link type="text/css" rel="stylesheet" href="${pageContext.servletContext.contextPath }/assets/layui/css/layui.css">
		<script src="${pageContext.servletContext.contextPath }/assets/laydate/laydate.js"></script>
		<script src="${pageContext.servletContext.contextPath }/assets/layui/layui.js" charset="utf-8"></script>
		<link rel="stylesheet" href="//cdn.bootcss.com/uikit/2.25.0/css/uikit.min.css" />
		<script src="//cdn.bootcss.com/uikit/2.25.0/js/uikit.min.js"></script>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
		<%-- <link rel="stylesheet" href="${pageContext.servletContext.contextPath }/assets/uikit-2.25.0/css/uikit.min.css" />
<script src="${pageContext.servletContext.contextPath }/assets/uikit-2.25.0/js/uikit.min.js"></script> --%>
	</head>

	<body>

		<div class="header">
			<div class="top"> <img class="logo" src="${pageContext.servletContext.contextPath }/assets/style/images/logo.jpg" />

			</div>
		</div>
		<div class="container1">
			<div class="leftbar">
				<div class="lm01"> 
				<div style="width: 199px;height: 199px;position: relative;overflow: hidden;">
					<img id="tx" src="${sessionScope.employee.eImage }" style="position: absolute;"/>
				</div>
					<div class="pepdet">
						<p class="pepname">${sessionScope.employee.eName }</p>
						<p>${sessionScope.employee.position.department.dName }</p>
						<p>${sessionScope.employee.position.pName }</p>
					</div>
					<div class="clear" style="width: 200px;height: 40px">
						<label for="f" class="btn btn-default" style="cursor: pointer;padding: 5px;border: 1px solid #C8C7C7;border-radius: 30px;color: cray;float: left;"><span class="glyphicon glyphicon-upload"></span>上传头像</label>
						<form id="form1">
							<input type="hidden" name="eId" value="${sessionScope.employee.eId }"/>
							<input id="f" type="file" name="eImage" onchange="sc(this)" style="display: none;"/> 
						</form>
						<a href="${pageContext.servletContext.contextPath }/employee/empExit"><button class="btn btn-default" style="float: left;border-radius: 30px;">退出<span class="glyphicon glyphicon-log-out"></span></button></a>
					</div>
				</div>
				<div class="lm02">
					<div class="title"><img class="icon" src="${pageContext.servletContext.contextPath }/assets/style/images/dataicon.jpg" />
						<p>日历</p>
					</div>
					<div class="detail">
						<span id="testView"></span>
						<div id="test2"></div>
					</div>
				</div>
				<div class="lm03">
					<div class="title"><img style="padding-right:5px;" class="icon" src="${pageContext.servletContext.contextPath }/assets/style/images/weaicon.jpg" />
						<p>天气</p>
					</div>
					<div class="detail"> <img class="" src="${pageContext.servletContext.contextPath }/assets/style/images/kj_02.jpg" /> </div>
				</div>
			</div>

			<div class="adtip">
				<div class="tip">
					<p class="goom">早上好，${sessionScope.employee.eName }！</p>
					<p>您目前有<span>15</span>条待办，<span>1</span>条考勤异常，<span>2</span>条通知！</p>
				</div>
				<div style="text-align: right; margin-top: 10px;">
					<button id="sw" type="button" class="layui-btn layui-btn-radius layui-btn-warm">上班打卡</button>
					<button id="ew" type="button" class="layui-btn layui-btn-radius layui-btn-warm">下班打卡</button>
					<button id="desc" type="button" class="layui-btn layui-btn-radius layui-btn-danger" data-uk-modal="{target:'#my-id',center:true}">请假</button>
					<!-- 模态对话框 -->
					<div id="my-id" class="uk-modal">
					    <div class="uk-modal-dialog" style="border-radius: 1%;">
					        <div class="uk-modal-header"><p style="float: left;">请假信息编辑</p><hr></div>
					        <div style="height: 100px">
					        	<textarea name="atDesc" id="atDesc" style="float: left;width: 560px;height: 100px" class="form-control"></textarea>
					        </div>
					        <div class="uk-modal-footer">
					        	<button id="leave" class="layui-btn layui-btn-radius layui-btn-warm">提交</button>
					        	<button class="layui-btn layui-btn-radius layui-btn-danger uk-modal-close" >关闭</button>
					        </div>
					    </div>
					</div>
				</div>
			</div>
			<div class="rig_link">
				<%-- <ul>
					<li >
						<a><img src="${pageContext.servletContext.contextPath }/assets/style/images/img_01.jpg" alt="" title=""></a>
					</li>
					<li>
						<a><img src="${pageContext.servletContext.contexFtPath }/assets/style/images/img_02.jpg" alt="" title=""></a>
					</li>
					<li>
						<a><img src="${pageContext.servletContext.contextPath }/assets/style/images/img_03.jpg" alt="" title=""></a>
					</li>
					<li>
						<a><img src="${pageContext.servletContext.contextPath }/assets/style/images/img_04.jpg" alt="" title=""></a>
					</li>
				</ul> --%>
			</div>
			<div class="mainbody" style="margin-left: 222px">
				<div class="currmenu">
					<!--<ul class="rig_nav">
						<li class="rig_seleli">
							<a>当前</a><span> x </span></li>
						<li>
							<a>个人中心</a>
						</li>
						<li>
							<a>绩效管理</a>
						</li>
						<li>
							<a>绩效计划制定</a>
						</li>
					</ul>-->
				</div>
				<div class="rig_lm03" style="padding-left: 0px;">
					<div class="title"><img src="${pageContext.servletContext.contextPath }/assets/style/images/listicon.jpg" class="icon" ${pageContext.servletContext.contextPath }/assets/style="padding-top:13px;">
						<p>员工事项</p>
					</div>
					<div class="detail">
						<div class="inner03">
							<div id="tabCot_product" class="zhutitab">
								<div class="tabContainer">
									<ul class="tabHead" id="tabCot_product-li-currentBtn-" style="padding-left: 0px;">
										<li class="currentBtn">
											<a href="javascript:void(0)" title="培训信息" rel="1">培训信息</a></li>
										<li>
											<a href="javascript:void(0)" title="考勤信息" rel="2">考勤信息</a></li>
										<li>
											<a href="javascript:void(0)" title="个人信息" rel="3">个人信息</a></li>
											<li>
											<a href="javascript:void(0)" title="个人信息" rel="4">奖惩信息</a></li>
									</ul>
									<div class="clear"></div>
								</div>
								<div id="tabCot_product_1" class="tabCot">
									<table id="trains" class="tabindex" width="100%" border="0" cellpadding="0" cellspacing="0">
										
									</table>
								</div>

								<div id="tabCot_product_2" class="tabCot" style="display: none;">
									<table id="attens" class="tabindex" width="100%" border="0" cellpadding="0" cellspacing="0">
									</table>
								</div>
								<div id="tabCot_product_4" class="tabCot" style="display: none;">
									<table id="rews" class="tabindex" width="100%" border="0" cellpadding="0" cellspacing="0">
									</table>
								</div>
								<div id="tabCot_product_3" class="tabCot" style="float:left;display: none;width: 1617px;height: 513px;margin-left: 10px;" >
									<form id="empInfo">
										<table style="border-collapse:separate; border-spacing:0px 30px;">
											<tr>
												<td>员工编号：</td>
												<td width="300px">
													<input type="hidden" name="_method" value="put"/>
													<input type="hidden" name="eId" style="width: 218px" class="form-control"  value="${sessionScope.employee.eId }" id="eId">
													<input type="text" class="form-control" readonly style="width: 218px" value="${sessionScope.employee.eId }">
												</td>
												<td>姓名：</td>
												<td><input class="form-control" id="eName" maxlength="10" value="${sessionScope.employee.eName }" name="eName"  onkeyup="value=value.replace(/[^\a-\z\A-\Z\u4E00-\u9FA5]/g,'')" onpaste="value=value.replace(/[^\a-\z\A-\Z\u4E00-\u9FA5]/g,'')" oncontextmenu = "value=value.replace(/[^\a-\z\A-\Z\u4E00-\u9FA5]/g,'')"/></td>
											</tr>
											<tr>
												<td>性别：</td>
												<td>
													<select name="eGender" style="width: 218px" class="form-control">
													<c:if test="${sessionScope.employee.eGender=='男' }">
														<option value="男" selected="selected">男</option>
														<option value="女">女</option>
													</c:if>
													<c:if test="${sessionScope.employee.eGender=='女' }">
														<option value="男">男</option>
														<option value="女" selected="selected">女</option>
													</c:if>
													</select>
													<!-- <input type="radio" name="eGender" value="男"/>男&nbsp;&nbsp;
													<input type="radio" name="eGender" value="女"/>女 -->
												</td>
												<td>
													年龄：
												</td>
												<td>
													<input style="width: 218px" id="eAge" name="eAge" value="${sessionScope.employee.eAge }" class="form-control"  onKeyUp="value=value.replace(/[^\d|chun]/g,'')" maxlength="2"/>
												</td>
											</tr>
											<tr>
												<td>出生日期：</td>
												<td>
													<%-- <input type="text" name="eBorn" id="eBorn" style="width: 218px" lay-verify="date" value='<fmt:formatDate type="date" value="${sessionScope.employee.eBorn }"/>' placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input"> --%>
													<input type="text" name="eBorn" id="eBorn" style="width: 218px" lay-verify="date" value="<fmt:formatDate type="date" value="${sessionScope.employee.eBorn }"/>" placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input">
												</td>
												<td>入职时间：</td>
												<td>
													<input type="text" class="form-control" style="width: 218px" readonly value='<fmt:formatDate type="date" value="${sessionScope.employee.eBegin }"/>' placeholder="15779933526">
												</td>
											</tr>
											<tr>
												<td>
													电话号码：
												</td>
												<td>
													<input style="width: 218px" id="ePhone" name="ePhone" value="${sessionScope.employee.ePhone }" onKeyUp="value=value.replace(/[^\d|chun]/g,'')" class="form-control" maxlength="11"/>
												</td>
											</tr>
											<tr>
												<td>
													学历：
												</td>
												<td>
													<input type="text" class="form-control" style="width: 218px" readonly value="${sessionScope.employee.eEdu }" placeholder="本科">
												</td>
											</tr>
											<tr>
												<td>
													身份证号：
												</td>
												<td>
													<input type="text" id="eNumber" class="form-control" name="eNumber" onkeyup="value=value.replace(/[^\w\/]/ig,'')" style="width: 218px" value="${sessionScope.employee.eNumber }" placeholder="362330199812062071" maxlength="18">
												</td>
												<td>
													邮箱：
												</td>
												<td>
													<input type="email" id="eEmail" class="form-control" onkeyup="^[a-z0-9]+([._\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$" name="eEmail" style="width: 218px" value="${sessionScope.employee.eEmail }" placeholder="673343330@qq.com" maxlength="20">
												</td>
											</tr>
											<tr>
												<td>
													地址：
												</td>
												<td>
													<input type="text" id="eAddress" class="form-control" name="eAddress" style="width: 218px" value="${sessionScope.employee.eAddress }" placeholder="北京市北京市市辖区东城区" onkeyup="value=value.replace(/[^\a-\z\A-\Z\u4E00-\u9FA5]/g,'')" onpaste="value=value.replace(/[^\a-\z\A-\Z\u4E00-\u9FA5]/g,'')" oncontextmenu = "value=value.replace(/[^\a-\z\A-\Z\u4E00-\u9FA5]/g,'')">
												</td>
											</tr>
											<tr>
												<td>
													政治面貌：
												</td>
												<td>
													<input type="text" class="form-control"   style="width: 218px" readonly value="${sessionScope.employee.ePolitical }" placeholder="无">
												</td>
											</tr>
											<tr>
												<td>
													
												</td>
												<td></td>
												<td></td>
												<td style="text-align: right;">
													<button id="empSubmit" class="btn btn-default btn-primary">修改信息</button>&nbsp;&nbsp;
													<button id="model" class="btn btn-default btn-warning" data-uk-modal="{target:'#my-id1',center:true}">重设密码</button>
													
												</td>
											</tr>
										</table>
									</form>
								</div>
								<!-- 模态对话框 -->
								<div id="my-id1" class="uk-modal">
								    <div class="uk-modal-dialog" style="border-radius: 1%;">
								        <div class="uk-modal-header"><p style="float: left;">设置新密码</p><hr></div>
								        <div style="height: 100px">
								        <form:form id="pwdUp" method="put">
								        	<input type="hidden" name="eId" value="${sessionScope.employee.eId}"/>
								        	<label for="newPassword" style="float: left;">新的密码：</label>
								        	<input id="ePassword" name="ePassword" type="password" class="form-control" onkeyup="value=value.replace(/[^\w\.\/]/ig,'')" maxlength="12"/>
								        </form:form>
								        </div>
								        <div class="uk-modal-footer">
								        	<button id="sub" class="layui-btn layui-btn-radius layui-btn-warm" style="margin-left: 400px">提交</button>
								        	<button class="layui-btn layui-btn-radius layui-btn-danger uk-modal-close" style=" ">关闭</button>
								        </div>
								    </div>
								</div>
			<div class="footer"></div>
			<script language="JavaScript" type="text/javascript" src="${pageContext.servletContext.contextPath }/assets/style/js/tab.js"></script>
			<script type="text/javascript">
			function sc(){
			    var animateimg = $("#f").val(); //获取上传的图片名 带//
			    var imgarr=animateimg.split('\\'); //分割
			    var myimg=imgarr[imgarr.length-1]; //去掉 // 获取图片名
			    var houzui = myimg.lastIndexOf('.'); //获取 . 出现的位置
			    var ext = myimg.substring(houzui, myimg.length).toUpperCase();  //切割 . 获取文件后缀
			    
			    var file = $('#f').get(0).files[0]; //获取上传的文件
			    var fileSize = file.size;           //获取上传的文件大小
			    var maxSize = 1048576;              //最大1MB
			    if(ext !='.PNG' && ext !='.GIF' && ext !='.JPG' && ext !='.JPEG' && ext !='.BMP'){
			        alert('文件类型错误,请上传图片类型');
			        return false;
			    }else if(parseInt(fileSize) >= parseInt(maxSize)){
			        alert('上传的文件不能超过1MB');
			        return false;
			    }else{  
			        var data = new FormData($('#form1')[0]); 
			        $.ajax({  
			            url: "${pageContext.servletContext.contextPath }/employee/uploadImg", 
			            type: 'POST',  
			            data: data,  
			            dataType: 'JSON',  
			            cache: false,  
			            processData: false,  
			            contentType: false  
			        }).done(function(ret){  
			            $("#tx").attr("src",ret.msg);
			        });  
			        return false;
			       }  
			    }
			</script>
			<script>
				layui.use(['form', 'layedit', 'laydate'], function() {
					var form = layui.form,
						layer = layui.layer,
						layedit = layui.layedit,
						laydate = layui.laydate;

					//日期
					laydate.render({
						elem: '#date'
					});
					laydate.render({
						elem: '#date1'
					});

					//创建一个编辑器
					var editIndex = layedit.build('LAY_demo_editor');

					//自定义验证规则
					form.verify({
						title: function(value) {
							if(value.length < 5) {
								return '标题至少得5个字符啊';
							}
						},
						pass: [
							/^[\S]{6,12}$/, '密码必须6到12位，且不能出现空格'
						],
						content: function(value) {
							layedit.sync(editIndex);
						}
					});

					//监听指定开关
					form.on('switch(switchTest)', function(data) {
						layer.msg('开关checked：' + (this.checked ? 'true' : 'false'), {
							offset: '6px'
						});
						layer.tips('温馨提示：请注意开关状态的文字可以随意定义，而不仅仅是ON|OFF', data.othis)
					});

					//监听提交
					form.on('submit(demo1)', function(data) {
						layer.alert(JSON.stringify(data.field), {
							title: '最终的提交信息'
						})
						return false;
					});

					//表单初始赋值
					form.val('example', {
						"username": "贤心" // "name": "value"
							,
						"password": "123456",
						"interest": 1,
						"like[write]": true //复选框选中状态
							,
						"close": true //开关状态
							,
						"sex": "女",
						"desc": "我爱 layui"
					})

				});
			</script>
			<script>
				laydate.render({
					elem: '#test2',
					position: 'static',
					btns: [],
				/* 	show:true, */
				    change: function(value, date) { //监听日期被切换
						lay('#testView').html(value);
					} 
				});
				layui.use('laydate', function(){
					  var laydate = layui.laydate;
					  
					  //执行一个laydate实例
					  laydate.render({
					    elem: '#eBorn' //指定元素
					  });
					});
			</script>
			
	</body>
<script type="text/javascript">
layui.use('table', function(){
	  var table = layui.table;
	  
	  //第一个实例
	  table.render({
	    elem: '#trains'
	    ,height: 490
	    ,defaultToolbar:['filter', 'print']
	    ,url: '${pageContext.servletContext.contextPath }/employee/trainForEmp/${sessionScope.employee.eId}' //数据接口
	    ,page: true //开启分页
	    ,cols: [[ //表头
	      {field: 'tDate', title: '发布时间', width:170,templet:'<div>{{ layui.util.toDateString(d.tDate, "yyyy-MM-dd") }}</div>',sort: true}
	      ,{field: 'tPlan', title: '培训计划', width:700}
	      ,{field: 'dName', title: '培训部门', width:200,sort: true} 
	      ,{field: 'pPosition', title: '培训职位', width: 200,sort: true}
	      ,{field: 'tMan', title: '培训信息发布人', sort: true}
	    ]]
	  });
	});
layui.use('table', function(){
	  var table = layui.table;
	  
	  //第一个实例
	  table.render({
	    elem: '#attens'
	    ,height: 490
	    ,defaultToolbar:['filter', 'print']
	    ,url: '${pageContext.servletContext.contextPath }/employee/attenForEmp/${sessionScope.employee.eId}' //数据接口
	    ,page: true //开启分页
	    ,cols: [[ //表头
	      {field: 'atDate', title: '日期', width:150, sort: true, fixed: 'left',templet:'<div>{{ layui.util.toDateString(d.atDate, "yyyy-MM-dd") }}</div>'}
	      ,{field: 'atSw', title: '上班时间', width:200,templet:'<div>{{ layui.util.toDateString(d.atSw, "yyyy-MM-dd HH:mm:ss") }}</div>'}
	      ,{field: 'atEw', title: '下班时间', width:200, sort: true,templet:'<div>{{ layui.util.toDateString(d.atEw, "yyyy-MM-dd HH:mm:ss") }}</div>'}
	      ,{field: 'atStatus', title: '考勤情况', width:100,templet:'#status'} 
	      ,{field: 'atDesc', title: '请假情况'}
	    ]]
	  });
	});
layui.use('table', function(){
	  var table = layui.table;
	  
	  //第一个实例
	  table.render({
	    elem: '#rews'
	    ,height: 490
	    ,defaultToolbar:['filter', 'print']
	    ,url: '${pageContext.servletContext.contextPath }/employee/rewForEmp/${sessionScope.employee.eId}' //数据接口
	    ,page: true //开启分页
	    ,cols: [[ //表头
	      {field: 'reReward', title: '奖励金额', width:100, sort: true, fixed: 'left'}
	      ,{field: 'reRedate', title: '奖励日期', width:150,templet:'<div>{{ layui.util.toDateString(d.reRedate, "yyyy-MM-dd") }}</div>'}
	      ,{field: 'reRereson', title: '奖励原因', width:450, sort: true}
	      ,{field: 'rePunish', title: '处罚金额', width:100} 
	      ,{field: 'rePudate', title: '处罚日期',width:150,templet:'<div>{{ layui.util.toDateString(d.atEw, "yyyy-MM-dd") }}</div>'}
	      ,{field: 'rePureson',title:'处罚原因',width:450}
	      ,{field: 'reDate',title:'奖惩日期',templet:'<div>{{ layui.util.toDateString(d.atEw, "yyyy-MM-dd") }}</div>'}
	    ]]
	  });
	});	
</script>
<script type="text/javascript" id="status">
{{# if (d.atStatus=== 0) { }}
迟到
{{# } else if(d.atStatus=== 1) { }}
早退
{{# } else if(d.atStatus=== 2) { }}
请假
{{# } else if(d.atStatus=== 3) { }}
迟到,早退
{{# } else if(d.atStatus=== 4) { }}
全勤
{{# } }} 
</script>
<script type="text/javascript">
	$(function(){
		$("#layui-laydate1").css({width:"200px"});
		$(".layui-laydate-main").css({width:"200px"});
		$("#sw").click(function(){
			$.ajax({
				url:"${pageContext.servletContext.contextPath }/employee/empPunch/${sessionScope.employee.eId}/0",
				type:"get",
				success:function(res){
					alert(res.msg);
				}
			});
		});
		$("#ew").click(function(){
			$.ajax({
				url:"${pageContext.servletContext.contextPath }/employee/empPunch/${sessionScope.employee.eId}/1",
				type:"get",
				success:function(res){
					alert(res.msg);
				}
			});
		});
		$("#leave").click(function(){
			$.ajax({
				url:"${pageContext.servletContext.contextPath }/employee/empPunch/${sessionScope.employee.eId}/2?atDesc="+$("#atDesc").val(),
				type:"get",
				success:function(res){
					$("#atDesc").val("");
					alert(res.msg);
				}
			});
		});
		$("#empSubmit").click(function(){
			$("#empInfo").submit(function(){return false;});
			if($("#eName").val().length==0||$("#eAge").val().length==0||$("#eBorn").val().length==0||$("#ePhone").val().length==0||$("#eEmail").val().length==0||$("#eAddress").val().length==0||$("#eNumber").val().length==0){
				alert("不能输入空的内容!");
			}
			else{
				$.ajax({
					url:"${pageContext.servletContext.contextPath }/employee/updateEmpInfo",
					data:$("#empInfo").serialize(),
					type:"post",
					success:function(res){
						alert(res.msg);
					}
				});
			}
		});
		$("#model").click(function(){
			$("#empInfo").submit(function(){return false;});
		});
		$("#sub").click(function(){
			/* console.log($("#pwdUp").serialize()); */
			$.ajax({
				url:"${pageContext.servletContext.contextPath }/employee/upEmpPwd",
				data:$("#pwdUp").serialize(),
				type:"post",
				success:function(res){
					alert(res.msg);
				}
			});
		}); 
	});
</script>
</html>
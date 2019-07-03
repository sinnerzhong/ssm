<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<% String path= request.getScheme() +"://"  
	+ request.getServerName() + ":" 
	+ request.getServerPort() 
	+ request.getContextPath()  + "/"; %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=path%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.9.1.min.js" ></script>
<script type="text/javascript">
$(function(){
	//删除超链接被点击
	$(".delete").click(function(){
		//获取被点击的超链接中href属性值
		var href = $(this).attr("href");
		//赋值给删除表单的href属性
		$("#deleteUserForm").attr("action", href).submit();	
		//阻止超链接跳转
		return false;
	});
		
});

</script>
</head>
<body>
	<h3>显示所有用户</h3>
	<a href="sysmanagement/user">添加用户</a>
	<table border="1" align="center">
		<tr>
			<th>ID</th>
			<th>用户名</th>
			<th>密码</th>
			<th>月薪</th>
			<th>出生日期</th>
			<th>性别</th>
			<th>组织Id</th>
			<th>手机</th>
			<th>状态</th>
			<!-- <th>描述</th> -->
			<th colspan="2">操作</th>
		</tr>
		<c:forEach var="user" items="${requestScope.userList}">
		<tr>
			<td>${user.userId}</td>
			<td>${user.userName}</td>
			<td>${user.password}</td>
			<td>${user.salary}</td>
			<td>${user.birthday}</td>
			<td>${user.gender}</td>
			<td>${user.orgId}</td>
			<td>${user.telephone}</td>
			<td>${user.status}</td>
			<%-- <td>${user.description}</td> --%>
			<td><a href="sysmanagement/user/${user.userId}">修改</a></td>
			<td>
				<a class="delete" href="sysmanagement/user/${user.userId}">删除(禁用)</a>
			</td>
		</tr>
		</c:forEach>
	</table>
	<!-- 隐藏一个form表单 -->
	<form action="" method="POST" id="deleteUserForm">
		<input type="hidden" name="_method" value="DELETE"/>		
	</form>
	
	
	
</body>
</html>
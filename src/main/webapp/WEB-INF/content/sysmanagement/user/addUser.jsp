<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>  

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
</head>
<body>
	<h3>添加用户</h3>
	<sf:form action="sysmanagement/user" modelAttribute="user" method="POST">
		<table>
			<tr>
				<td>
					用户名
				</td>
				<td>
					<sf:input path="userName"/>
				</td>
				<td>
					<sf:errors path="userName"/>
				</td>
			</tr>
			<tr>
				<td>
					密码
				</td>
				<td>
					<sf:input path="password"/>
				</td>
				<td>
					<sf:errors path="password"/>
				</td>
			</tr>
<%-- 			<tr>
				<td>
					重复密码
				</td>
				<td>
					<sf:input path="repwd"/>
				</td>
				<td>
					<sf:errors path="repwd"/>
				</td>
			</tr> --%>
			<tr>
				<td>
					手机
				</td>
				<td>
					<sf:input path="telephone"/>
				</td>
				<td>
					<sf:errors path="telephone"/>
				</td>
			</tr>
			<tr>
				<td>
					月薪
				</td>
				<td>
					<sf:input path="salary"/>
				</td>
				<td>
					<sf:errors path="salary"/>
				</td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="添加"/>
				</td>
			</tr>
		</table>
		
	</sf:form>
	
	
</body>
</html>
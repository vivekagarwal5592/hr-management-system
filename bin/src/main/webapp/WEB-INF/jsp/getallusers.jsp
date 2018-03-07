<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<table border="2px solid black">
		<tr>
			<th>ID</th>
			<th>Username</th>
			<th>Operations</th>
		</tr>
		<c:forEach items="${users}" var="user">
			<tr>
				<td>${user.id}</td>
				<td>${user.username}</td>
				<td>${user.password}</td>
				<td>${user.email}</td>
				<td>${user.phone}</td>
				<td><a href="edituser.html?id=${user.id}">Edit User</a></td>
			</tr>
		</c:forEach>
	</table>



</body>
</html>
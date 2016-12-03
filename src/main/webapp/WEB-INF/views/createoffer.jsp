<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<link rel="stylesheet" type="text/css"
href="${pageContext.request.contextPath}/resources/css/main.css">
<title>Insert title here</title>
<style>

</style>
</head>
<body>
	<form method="get" action="${pageContext.request.contextPath}/docreate">
		<table class="formtable">
			<tr>
				<td class="label">Name:</td>
				<td class="control"><input name="name" type="text" />
				<sf:errors path="name"></sf:errors>
				</td>
				
			</tr>
			<tr>
				<td class="label">Email:</td>
				<td class="control"><input name="email" type="text" />
				<sf:errors path="eamil"></sf:errors>
				</td>
			</tr>
			<tr>
				<td class="label">text:</td>
				<td class="control"><textarea name="text" type="text" rows="10"
						cols="10" /></textarea></td>
			</tr>
			<tr>
				<td></td>
				<td><input value="Create offer" type="submit" /></td>
			</tr>
		</table>
	</form>

</body>
</html>
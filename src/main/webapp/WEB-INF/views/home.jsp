<%@ page contentType="text/html;charset=euc-kr"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>

<p><a href="${pageContext.request.contextPath}/offers"> 학기별 이수 학점</a>
<p><a href="${pageContext.request.contextPath}/type">이수 구분별 학점 조회</a>
<p><a href="${pageContext.request.contextPath}/createoffer"> Add a new offer</a>


</body>
</html>

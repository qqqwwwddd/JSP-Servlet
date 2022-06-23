<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:if test="${requestScope.command == 'emp'}">
	직원번호 ${requestScope.empno}
	직원이름 ${requestScope.ename}
</c:if>
<c:if test="${requestScope.command == 'dept'}">
	부서번호 ${requestScope.deptno}
	부서번호 ${requestScope.dname}
</c:if>
</body>
</html>
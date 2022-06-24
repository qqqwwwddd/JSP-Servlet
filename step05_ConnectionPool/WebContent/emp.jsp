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
	<form action="emp">
		<input name="empno" placeholder="사원번호 입력"></input>
		<button type="submit">직원정보보기</button>
	</form>
	<c:if test="${requestScope.ename != null}">
		<div>직원번호 ${requestScope.empno}</div>
		<div><span>직원이름</span><span>${requestScope.ename}</span> </div>
	</c:if>
	
	<c:if test="${requestScope.ename == null}">
		<div>직원 정보 없습니다.</div>
	</c:if>
	
	
</body>
</html>
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
	<form action="dept">
		<input name="deptno" placeholder="부서번호 입력"></input>
		<button type="submit">부서정보보기</button>
	</form>
	<c:if test="${requestScope.dname != null}">
		<div>부서번호 ${requestScope.deptno}</div>
		<div><span>부서이름</span><span>${requestScope.dname}</span> </div>
	</c:if>
	
	<c:if test="${requestScope.dname == null}">
		<div>부서 정보가 없습니다.</div>
	</c:if>
	
</body>
</html>
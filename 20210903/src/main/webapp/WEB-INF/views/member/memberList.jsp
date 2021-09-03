<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Member List</title>
</head>
<body>
	<c:forEach var="member" items="${members }">
		${member.id } : ${member.password } : ${member.name } <br/>
	</c:forEach>
	
	<a href="noticeList.do">게시글 목록</a>
	<a href="memberInsert.do">멤버 추가</a>
</body>
</html>
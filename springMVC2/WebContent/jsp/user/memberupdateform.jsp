<%@page import="java.util.List"%>
<%@page import="kr.ac.sku.dao.MemberDAO"%>
<%@page import="kr.ac.sku.vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


	<%
		request.setCharacterEncoding("utf-8");
		MemberDAO dao = new MemberDAO();

		MemberVO vo = dao.getMember(request.getParameter("id"));
	%>
	<form action="memberupdate" method="post">
		id :<input type="hidden" value="<%=vo.getId()%>" name="id" /> <br>password
		: <input type="text" value="<%=vo.getPassword()%>" name="password" />
		<br> name : <input type="text" value="<%=vo.getName()%>"
			name="name" /> <br> email : <input type="text"
			value="<%=vo.getEmail()%>" name="email" /> <br> <input
			type="submit" value="수정">
	</form>






</body>
</html>



<%@page import="kr.ac.sku.vo.GuestBookVO"%>
<%@page import="kr.ac.sku.dao.GuestBookDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


<%-- <%
	request.setCharacterEncoding("utf-8");
		GuestBookDAO dao = new GuestBookDAO();
		GuestBookVO vo = new GuestBookVO();
		int no = Integer.parseInt(request.getParameter("no"));
		
		System.out.println(request.getParameter("no"));
		System.out.println(no);
		vo = dao.getGuestBook(no);
		
			
		
	%> --%>
	
	<form action="guestupdate" method = "post">
	no : <input type = "text" <%-- value"<%=vo.getNo() %>" --%> name = "no"/><br>
	id :<input type="text" <%-- value="<%=vo.getId()%>" --%> name = "id"/>
	<br> name :	<input type="text" <%-- value="<%=vo.getName()%>"  --%>name = "name"/>
	<br>password : <input type="text" <%-- value="<%=vo.getPassword()%>" --%> name = "password"/>
	<br> content : <input type="text" <%-- value="<%=vo.getContent()%>" --%>name = "content"/><br>
	<a href = "guestbookupdateform<%-- ?id=<%=vo.getId() %> --%>">수정</a>
	<a href = "guestbookdelete<%-- ?id=<%=vo.getId() %> --%>">삭제</a>
	</form>
	
</body>
</html>
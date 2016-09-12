<%@page import="kr.ac.sku.vo.GuestBookVO"%>
<%@page import="java.util.List"%>
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

<%
		  GuestBookDAO dao = new GuestBookDAO();
		List<GuestBookVO> guestbookList = dao.getGuestBookList();   
		//List<GuestBookVO> guestbookList = (List <GuestBookVO>) request.getAttribute("guestlist.sku");
		
	
	%>
	
	<h1>회원목록</h1>
	<table>
		<tr>
			<th>번호</th>
			<th>아이디</th>
			<th>이름</th>
			<th>비밀번호</th>
			<th>방명록</th>
			<th>가입일</th>
		</tr>
		<%
			for(int i = 0; i<guestbookList.size();i++){
				GuestBookVO vo = guestbookList.get(i);
			
		
		%>	<tr>
			<td><%=vo.getNo() %></td>
			<td><%=vo.getId() %></td>
			<td><%=vo.getName() %></td>
			<td><%=vo.getPassword() %></td>
			<td><%=vo.getContent() %></td>
			<td><%=vo.getRegdate() %></td>
		</tr>
		
		<% }%>
		
	</table>

</body>
</html>
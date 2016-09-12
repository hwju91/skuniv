
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
		  


	
	/* GuestBookDAO dao = new GuestBookDAO();
		
		List<GuestBookVO> guestbookList = dao.getGuestBookList();  */
		List<GuestBookVO> guestbookList = (List <GuestBookVO>) request.getAttribute("guestbookList");
		
		
	
	%>
	
	<h1>회원목록</h1>
	<table>
		<tr>
			<th>번호</th>
			<th>아이디</th>
			<th>이름</th>
			
		</tr>
		<%
			for(int i = 0; i<guestbookList.size();i++){
				GuestBookVO vo = guestbookList.get(i);
			
		
		%>	<tr>
			<td><input type="hidden" name = "no" value = "<%=vo.getNo()%>"><a href = "selectlist.sku?no=<%=vo.getNo()%>"><%=vo.getNo() %></a></td>
			<td><input type = "text" value = "<%=vo.getId() %>" name = "id"></td>
			<td><input type = "text" value = "<%=vo.getName() %>" name = "name"></td>
			
		</tr>
		
		<% }%>
		
	</table>


</body>
</html>
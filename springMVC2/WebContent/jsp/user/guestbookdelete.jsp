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
		int a = Integer.parseInt(request.getParameter("no"));
		int resultCount = dao.delete(a);
		if(resultCount == 1 ){
			response.sendRedirect("guestlist");
		}else{
			out.print("삭제되지 않았습니다.");
			
		}
	
	%>
</body>
</html>
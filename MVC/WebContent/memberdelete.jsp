<%@page import="kr.ac.sku.dao.MemberDAO"%>
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
		MemberDAO dao = new MemberDAO();
		int resultCount = dao.delete(request.getParameter("id"));
		if(resultCount == 1 ){
			response.sendRedirect("memberlist.sku");
		}else{
			out.print("삭제되지 않았습니다.");
			
		}
	
	%>
</body>
</html>
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
<%
	request.setCharacterEncoding("utf-8");
	GuestBookDAO dao = new GuestBookDAO();
	GuestBookVO vo = new GuestBookVO();
	
	
	//int a = Integer.parseInt(request.getParameter("no"));
	vo.setNo(Integer.parseInt(request.getParameter("no")));
	vo.setId(request.getParameter("id"));
	vo.setName(request.getParameter("name"));
	vo.setPassword(request.getParameter("password"));
	vo.setContent(request.getParameter("content"));
	
	
	int resultCount = dao.update(vo);
	 
	
	if(resultCount==1){
		
		response.sendRedirect("guestlist.sku");
	} 
%>


</body>
</html>
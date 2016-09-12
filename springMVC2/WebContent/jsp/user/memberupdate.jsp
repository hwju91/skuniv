<%@page import="kr.ac.sku.vo.MemberVO"%>
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
		MemberVO vo = new MemberVO();
		
		
			
		
		vo.setId(request.getParameter("id"));
		vo.setName(request.getParameter("name"));
		vo.setEmail(request.getParameter("email"));
		vo.setPassword(request.getParameter("password"));
		
		
		dao.update(vo);
		MemberVO rvo = dao.getMember(vo.getId());
		
		if(rvo != null && rvo.getId() != null) {
			
			response.sendRedirect("memberlist");
			
		}
				
	%>

</body>
</html>
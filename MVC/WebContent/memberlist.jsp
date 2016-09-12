<%@page import="java.util.List"%>

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
	MemberVO user = (MemberVO)session.getAttribute("loginInfo");
%>
<%=user.getId() %>님 환영합니다.
<a href = "logout"><input type="submit" value = "로그아웃"></a>



	<%
		 MemberDAO dao = new MemberDAO();
		List<MemberVO> memberList = dao.getMemberList(); 
		//List<MemberVO> memberList = (List <MemberVO>) request.getAttribute("memberlist.sku");
		
	%>
	
	<h1>회원목록</h1>
		
	
	<table>
		<tr>
			<th>이름</th>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>이메일</th>
			<th>가입일</th>
		</tr>
		<%
			for(int i = 0; i<memberList.size();i++){
				MemberVO vo = memberList.get(i);
			
		
		%>	<tr>
			<td><%=vo.getName() %></td>
			<td><%=vo.getId() %></td>
			<td><%=vo.getPassword() %></td>
			<td><%=vo.getEmail() %></td>
			<td><%=vo.getRegdate() %></td>
			<td><a href = "memberdelete.sku?id=<%=vo.getId() %>">삭제</a></td>
			<td><a href = "memberupdateform.sku?id=<%=vo.getId() %>">수정</a></td>
				</tr>
		
		<% }%>
		
	</table>

</body>
</html>
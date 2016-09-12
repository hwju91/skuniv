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

String[] idMsg2 = new String[2];
idMsg2 = (String[])session.getAttribute("new1");
if(idMsg2 != null){
	out.print(idMsg2[1]);
	
	
	
}
	
	String defaultid2 = " ";
%>
	<h1>게스트</h1>
	<form action="guestlist" method="post">
	<%
	if(idMsg2 != null){
		defaultid2 = idMsg2[0];
		session.removeAttribute("new1");
	}
	%>
	
	<br>
	아이디 : <input type = "text" name = "id" value="<%=defaultid2%>"><br>
	비밀번호 : <input type="password" name = "password"/><br>
	방명록 : <br><textarea cols="50" rows="10" name = "content"/></textarea><br>
	<input type = "submit" value="등록"/>
	<input type = "reset" value="취소"/>
	
	</form>
</body>
</html>
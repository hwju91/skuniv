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
 
String[] idMsg = new String[2];

	//String msg = (String) session.getAttribute("msg");
	//String id = (String) session.getAttribute("id");
	idMsg=(String[])session.getAttribute("fail");
	if(idMsg != null){
		
		out.print(idMsg[1]);
		
	}
	
/* if(msg != null){
	
	out.print(id+msg);
	
	session.removeAttribute("msg");
	session.removeAttribute("id");
	
}  */
	String defaultid = "";

%>
	
<h1>로그인</h1>
	<form action="memberlist" method="post">
	
<%	if(idMsg != null){
		
		
		defaultid = idMsg[0];
		session.removeAttribute("fail");
	}
	
	%>
	아이디 : <input type="text" name="id" value = "<%=defaultid%>"><br>
	비밀번호 : <input type="password" name="password"/><br>
	<input type="submit" value="로그인"/>
	<input type="reset" value="취소"/>
	</form>


	
</body>
</html>
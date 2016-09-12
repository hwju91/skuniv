<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>게스트</h1>
	<form action="guestbook.sku" method="post">
		
	<br>
	아이디 : <input type = "text" name = "id" ><br>
	이름 : <input type = "text" name = "name"><br>
	비밀번호 : <input type="password" name = "password"/><br>
	방명록 : <br><textarea cols="50" rows="10" name = "content"/></textarea><br>
	<input type = "submit" value="등록"/>
	<input type = "reset" value="취소"/>
	
	</form>
</body>
</html>
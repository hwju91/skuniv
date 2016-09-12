<%@page import="sun.awt.RepaintArea"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String cookieName = request.getParameter("cookieName");
	String cookieValue = request.getParameter("cookieValue");
	
	Cookie cookie = new Cookie(cookieName,cookieValue);
	cookie.setPath("/");
	cookie.setMaxAge(-1); //쿠키 저장 시간 / 초단위    -1 -> 브라우저가 유지될때 까지
	
	response.addCookie(cookie);
	
	response.sendRedirect("cookieList.jsp");
	
%>
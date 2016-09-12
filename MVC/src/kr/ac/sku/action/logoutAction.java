package kr.ac.sku.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class logoutAction {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		/*Cookie cookie = new Cookie("loginOK", "");
		cookie.setPath("/");
		cookie.setMaxAge(0);
		response.addCookie(cookie);*/

//세션을 이용한 로그아웃


		HttpSession session = request.getSession();
		session.removeAttribute("loginInfo");
		
	// session.invalidate(); 세션객체를 아예 삭제하고 싶을때
		
		response.sendRedirect("memberlist.sku");

		
	
	
//3-2, 아이디에 해당하는 사용자가 있다는 것은 회원 가입을 하지 않은 사용자이므로 회원 가입화면으로 보내준다.


}
}

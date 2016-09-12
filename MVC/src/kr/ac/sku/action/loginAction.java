package kr.ac.sku.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.ac.sku.dao.MemberDAO;
import kr.ac.sku.fw.Action;
import kr.ac.sku.vo.MemberVO;

public class loginAction extends Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		//1.사용자가 보내준 아이디와 패스워드를 꺼낸다
				String id = request.getParameter("id");
				String password = request.getParameter("password");
				
				//2. 아이디에 해당하는 사용자가 db에 있는지 확인
				MemberDAO dao = new MemberDAO();
				MemberVO user = dao.getMember(id);
				HttpSession session = request.getSession();
				String[] idMsg= new String[2];
				String[] idMsg2 = new String[2];
				if(user!=null && user.getId() != null){
				//3. 아이디에 해당하는 사용자가 있을 경우  -  사용자가 보낸 패스워드와 DB에서 꺼내온 패스워드가 일치하는지 확인.
					if(user.getPassword().equals(password)){
						
				//4-1. 패스워드가 일치하는 경우. 로그인해준다. 리스트 보여주는 화면으로 이동
						//로그인 해준다는 것은 상태정보를 유지하는 것
						//쿠키로 유지하는 방법
						/*Cookie cookie = new Cookie("loginOK", id);
						cookie.setPath("/");
						cookie.setMaxAge(-1);
						response.addCookie(cookie);*/
						session.setAttribute("loginInfo", user);
						
						
						response.sendRedirect("memberlist.sku");
						
					}else{
						
				//4-2. 패스워드가 일치하지 않은 경우 다시 로그인 폼 화면으로 보내준다.
						String msg="비밀번호가 일치하지 않습니다. 다시 확인해주세요";
						//request.setAttribute("id", id);				
						//request.setAttribute("msg", "비밀번호가 일치하지 않습니다. 다시 확인해주세요");
						
						idMsg[0] =id;
						idMsg[1] =msg;
						session.setAttribute("fail", idMsg);
						response.sendRedirect("loginform.sku");
					}
				}else{
					
				//3-2, 아이디에 해당하는 사용자가 있다는 것은 회원 가입을 하지 않은 사용자이므로 회원 가입화면으로 보내준다.
					String msg = "없는 아이디 입니다 회원가입 해주세요";
					idMsg2[0] = id;
					idMsg2[1] = msg;
					session.setAttribute("new", idMsg2);
					
					
					
					response.sendRedirect("memberform.sku");
			}	
			

	}

}

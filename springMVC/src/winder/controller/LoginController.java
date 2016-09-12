package winder.controller;

import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import winder.service.MemberService;
import winder.service.ProjectService;
import winder.service.TeamService;
import winder.vo.MemberVO;
import winder.vo.TeamVO;

@Controller
public class LoginController {
	
	private MemberVO membervo;
	@Autowired
	private MemberService memberService;

	@Autowired
	private ProjectService projectService;
	
	@Autowired
	private TeamService teamService;
	
	@RequestMapping(value={"/","/home"})
	public String home(){
		return "index";
	}
	
	@RequestMapping(value="/login")
	public String login(){
		return "loginform";
	}
	
	@RequestMapping(value="/loginchk", method={RequestMethod.GET,RequestMethod.POST})
	public String loginchk(HttpServletRequest request,HttpSession session){
		
		String id=request.getParameter("id");
		String password=request.getParameter("password");
		MemberVO user = memberService.selectMember(id);
		
		//id가 있는지 확인.
		if(user != null && user.getId() != null){
			// id가 있다면 , 해당 id에 대해서 password가 일치하는지 확인.
			
			if(memberService.chkMember(user)==1 && password.equals(user.getPassword())){
				session.setAttribute("id", id);
				session.setAttribute("loginchk", "loginok");
				return "redirect:/home";
			}
			// password가 일치 하지않는다면,
			else{
				System.out.println("password 불일치");
				return "loginform";	// 패스워드가 불일치, loginform으로 돌아간다. 
			}
			
		}
		// id가 없다면,
		else{	
			System.out.println("id 없음");
			return "loginform";
		}
		/*membervo = new MemberVO();	
		HttpSession session = req.getSession();
		if((membervo=memberService.selectMember(req.getParameter("id")))!=null){
			// member DB에 회원 id가 있을 경우,비밀번호가 일치하는지 확인한다.
			if((req.getParameter("password")).equals(membervo.getPassword()))
			{
				System.out.println("비밀번호 일치.");
				flag=true;
				session.setAttribute("member", membervo);
				session.setAttribute("loginchk", flag);
				return "index2";
			}
			else{
				System.out.println("일치하지 않음.");
				session.setAttribute("loginchk", flag);
				return "loginform";
			}
			
		}else{	// DB에 id가 없을경우,
			System.out.println("id 없음");
			session.setAttribute("loginchk", flag);
			return "loginform";
		}*/
		
		
	}
	@RequestMapping("logout")
	public String logout(HttpSession session){
		session.removeAttribute("loginchk");
		session.removeAttribute("id");
		return "redirect:/home";
	}

	
	@RequestMapping(value="/signup",method={RequestMethod.GET,RequestMethod.POST})
	public String signup(HttpServletRequest req){
		
		return "signup";
		
	}
	
	@RequestMapping(value="/signchk",method={RequestMethod.POST,RequestMethod.GET})
	public String signchk(HttpServletRequest req){
		String password=req.getParameter("password");
		int count=0;
		
		if(password.equals(req.getParameter("password1"))){
			membervo=new MemberVO();
			membervo.setId(req.getParameter("id"));
			membervo.setName(req.getParameter("name"));
			membervo.setPassword(req.getParameter("password"));
			membervo.setEmail(req.getParameter("email"));
			membervo.setPhone(req.getParameter("phone"));
			count=memberService.insertMember(membervo);
			System.out.println("insert member : " +count);
			return "index";
		}
		
		else{
			System.out.println("password 불일치.");
			return "loginform";
		}
	}
	/*@RequestMapping(value="/projecttest")
	public String projecttest(){
		return "testproject";
	}*/
}

package winder.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.sf.json.JSON;
import net.sf.json.JSONObject;
import winder.service.MemberService;
import winder.service.MembersService;
import winder.service.ProjectService;
import winder.service.TeamService;
import winder.vo.MemberVO;
import winder.vo.MembersVO;
import winder.vo.MypageTeamInfoVO;
import winder.vo.TeamVO;

@Controller
public class MemberController {

	@Autowired
	private MemberService memberService;
	@Autowired
	private TeamService teamService;
	@Autowired
	private ProjectService projectService;
	@Autowired
	private MembersService membersService;
	//회원 가입 처리
	@RequestMapping(value = "/signchk", method = { RequestMethod.POST, RequestMethod.GET })
	public String memberJoin(MemberVO vo, HttpSession session) {
		try {
			int count = memberService.insertMember(vo);
			if (count == 1) {

				return "redirect:/home";
			} else {
				return "redirect:/login";
			}
		} catch (Exception e) {			return "redirect:/login";
		}

	}

	//회원 가입 form
	@RequestMapping(value = "/signup", method = { RequestMethod.GET, RequestMethod.POST })
	public String signup(HttpServletRequest req) {

		return "user/signup";

	}
	
	/*
	 * MyPage controleer
	 */
	
	/*// mypage form 
	@RequestMapping(value="/mypage")
	public String mypage(Model model,HttpSession session,MemberVO vo){
		String id = (String)session.getAttribute("id");
		model.addAttribute("teammenu", teamService.selectTeamList(id));
		model.addAttribute("projectmenu", projectService.selectProjectMenu(id));
		vo=memberService.selectMember(id);
		model.addAttribute("member", vo);
		List<MembersVO> memberslist = membersService.selectAllMembersTno(id);
		List<TeamVO> teamlist = new ArrayList<>();
		for (MembersVO members : memberslist) {
			System.out.println("##"+members.getTno());
			for(int i=0; i<memberslist.size(); i++){
				 TeamVO team = teamService.selectTeamName(members.getTno());
				 System.out.println("## name value : "+team.getName());
				//System.out.println("##"+ teamService.selectTeamName(members.getTno()));
				//System.out.println(i+"## teamlist value : "+teamlist.get(i));
			}		
		}
		return "mypage/mypagemain";
	}
	@RequestMapping(value="/profilemain")
	public String profilemain(HttpSession session,Model model,MemberVO vo){
		
		String id = (String)session.getAttribute("id");
		model.addAttribute("teammenu", teamService.selectTeamList(id));
		model.addAttribute("projectmenu", projectService.selectProjectMenu(id));
		vo=memberService.selectMember(id);
		model.addAttribute("member", vo);
		return "mypage/profilemain";
	}
	
	// 개인 정보 수정 폼 요청. 
	@RequestMapping(value="/profileupdateform")
	public String profileupdateform(HttpServletRequest req,HttpSession session,Model model,MemberVO vo){
		String id = (String)session.getAttribute("id");
		model.addAttribute("teammenu", teamService.selectTeamList(id));
		model.addAttribute("projectmenu", projectService.selectProjectMenu(id));
		vo=memberService.selectMember((String)session.getAttribute("id"));
		model.addAttribute("member", vo);
		
		return "mypage/profileupdateform";
	}
	
	// 개인정보 수정.
	@RequestMapping(value="/profileupdate")
	public String profileupdate(MemberVO member,HttpSession session){
		
		try{
			member.setId((String)session.getAttribute("id"));
			int count=memberService.updateMember(member);
			System.out.println(member);
			if(count==1){
				System.out.println(session.getAttribute("id")+" profile update success");
				return "redirect:/home";
			}else{
				System.out.print(session.getAttribute("id")+" profile update fail");
				return "redirect:/home";
			}
		
		}catch(Exception e){
			e.printStackTrace();
			return "redirect:/home";
		}
	
		
	}
	
	// 비밀번호 변경 폼 요청.
	@RequestMapping(value="/passwordupdateform")
	public String passwordupdateform(){
		return "mypage/passwordupdateform";
	}
	
	// 비밀번호 변경.
	@RequestMapping(value="/passwordupdate")
	public String passwordupdate(HttpSession session,HttpServletRequest req,MemberVO member){
		String id=(String)session.getAttribute("id");
		String beforepassword=(String)req.getParameter("beforepassword");
		String updatepassword=(String)req.getParameter("updatepassword");
		String updatepassword2=(String)req.getParameter("updatepassword2");
		
		member=memberService.selectMember(id);
		//System.out.println("member password : "+member.getPassword());
		//System.out.println("input password : "+beforepassword);
		if(member.getPassword().equals(beforepassword)){
			// 이전 비밀번호가 일치한다면, 새로운 비밀번호를 세팅.
			
		    if(updatepassword.equals(updatepassword2)){
				member.setPassword(updatepassword);
				try{
					int count=memberService.updatePassword(member);
					System.out.println("password update success. count : "+count);
					return "redirect:/mypage";
				}catch(Exception e){
					e.printStackTrace();
					System.out.println("password update fail.");
					return "redirect:/home";
				}
		    }else{
		    	System.out.println("again input new password");
		    	return "redirect:/passwordupdate";
		    }
		   
		}else{	// 이전 비밀번호 불일치,
			//System.out.println("Old password does not match.");
			return "redirect:/home";
		}
		
		
	}
	@RequestMapping(value="teaminfo")
	public String teaminfo(HttpSession session,Model model,MemberVO vo){
		String id = (String)session.getAttribute("id");
		model.addAttribute("teammenu", teamService.selectTeamList(id));
		model.addAttribute("projectmenu", projectService.selectProjectMenu(id));
		vo=memberService.selectMember(id);
		
	
		TeamVO team = new TeamVO();
		MypageTeamInfoVO teaminfovo = null;
		List<MypageTeamInfoVO> teaminfo = new ArrayList<>();
		List<TeamVO> teamlist =  teamService.selectTeamList(id);
		List<MembersVO> memberslist = new ArrayList<>();
		List<MembersVO> memberslist2 = null;
		
		for (TeamVO teamvo : teamlist) {	//teamlist의 팀들을 하나씩 꺼내서 각각의 tno를 통해 tname을 구함.
			
			teaminfovo = new MypageTeamInfoVO();
			memberslist2 = new ArrayList<>();
			team = teamService.selectTeamName(teamvo.getTno());
			teaminfovo.setName(teamvo.getName());
			teaminfovo.setTno(teamvo.getTno());
			memberslist = membersService.selectAllMembersTno(teamvo.getTno());
			
			for (MembersVO membersvo : memberslist) {
				if(membersvo.getPosition().equals("leader")){
					teaminfovo.setLeader(membersvo.getId());
				}
				else{
					memberslist2.add(membersvo);
				}
			}
			
			teaminfovo.setMembers(memberslist2);
			teaminfo.add(teaminfovo);
		}
		model.addAttribute("teaminfo", teaminfo);
		return "mypage/teaminfolist";
	}
	
	
	@RequestMapping(value="teamout")
	public String teamdelete(HttpServletRequest req,HttpSession session,MembersVO members){
		
		try{
			members.setTno(Integer.parseInt(req.getParameter("tno")));
			members.setId((String)session.getAttribute("id"));
			int count = membersService.deleteMembersTeamOut(members);
			System.out.println("delete team count : "+count);
		}catch(Exception e){
			System.out.println("team delete fail.");
			e.printStackTrace();
		}
		return "redirect:/mypage";
	}
*/
	
}

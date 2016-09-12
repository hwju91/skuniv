package winder.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import winder.service.ProjectService;
import winder.service.TeamService;
import winder.vo.TeamVO;

@Controller
public class TeamController {
	
	@Autowired
	private TeamService teamService;
	@Autowired
	private ProjectService projectService;
	
	//메뉴 팀 선택
	@RequestMapping(value="team")
	public String team(Model model, HttpSession session, HttpServletRequest request){
		String id=(String)session.getAttribute("id");
		model.addAttribute("teammenu", teamService.selectTeamList(id));
		model.addAttribute("projectmenu", projectService.selectProjectMenu(id));
		model.addAttribute("projectlist", projectService.selectProjectList(request.getParameter("tno")));
		return "project/projectList";
	}
	
	//팀 생성 form
	@RequestMapping(value="teamform")
	public String teamForm(Model model, HttpSession session){
		String id=(String)session.getAttribute("id");
		model.addAttribute("teammenu", teamService.selectTeamList(id));
		model.addAttribute("projectmenu", projectService.selectProjectMenu(id));
		return "team/teamCreate";
	}
	
	//팀 생성
	@RequestMapping(value="teamcreate")
	public String teamCreate(TeamVO vo, HttpSession sesstion){
		try {
			int count=teamService.insertTeam(vo);
			if(count==1){
				return "redirect:/team";
			}else{
				return "redirect:/index";
			}
		} catch (Exception e) {
			return "redirect:/index";
		}
	}
	

}

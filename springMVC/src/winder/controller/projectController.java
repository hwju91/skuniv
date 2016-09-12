package winder.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import winder.service.ProjectService;
import winder.vo.ProjectVO;

@Controller
public class projectController {
	
	private ProjectVO projectvo;
	@Autowired
	private ProjectService projectService;
	
	@RequestMapping(value="/projectlist")
	public String projectlist(HttpServletRequest req){
		projectvo = new ProjectVO();
		
		int tno=Integer.parseInt(req.getParameter("tno"));
		System.out.println("projectController.java : " + tno);
		
		List<ProjectVO> projectAll = new ArrayList<>();
		projectAll=projectService.selectAllProject(tno);
		System.out.println("##projectlist"+projectAll);
		req.setAttribute("projectlist", projectAll);
		
		
		return "projectList";
	}
	
	@RequestMapping(value="/projectcreate")
	public String projectcreate(){
		return "projectCreate";
		
	}
	
	@RequestMapping(value="/makeproject",method={RequestMethod.GET,RequestMethod.POST})
	public String makeproject(HttpServletRequest req){
		
		projectvo = new ProjectVO();
		projectvo.setTitle(req.getParameter("projecttitle"));
		projectvo.setName(req.getParameter("makeuserid"));
		int count=projectService.insertProject(projectvo);
		System.out.println("insert project count : "+ count);
		
		return "teamInfo";
	}
	

}

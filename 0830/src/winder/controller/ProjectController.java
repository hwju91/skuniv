package winder.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.swing.plaf.synth.SynthSeparatorUI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import winder.service.MembersService;
import winder.service.ProjectService;
import winder.service.TeamService;
import winder.vo.ProjectVO;

@Controller
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;
	@Autowired
	private TeamService teamService;
	@Autowired
	private MembersService membersService;
	
	//프로젝트 생성 form
	@RequestMapping(value="projectform")
	public String projectForm(HttpServletRequest req,Model model, HttpSession session){
		String id=(String)session.getAttribute("id");
		System.out.println("(projectcontorller)project tno : "+req.getParameter("tno"));
		model.addAttribute("teammenu", teamService.selectTeamList(id));
		model.addAttribute("projectmenu", projectService.selectProjectMenu(id));
		model.addAttribute("tno",req.getParameter("tno"));
		return "project/projectCreate";
	}
	
	//프로젝트 생성
	@RequestMapping(value="projectcreate")
	public String project(HttpServletRequest req,ProjectVO vo, HttpSession session){
		
		vo.setName((String)req.getParameter("projectname"));
		vo.setContent((String)req.getParameter("projectcontent"));
		vo.setExdate((String)req.getParameter("projectexdate"));
		vo.setTno(Integer.parseInt(req.getParameter("tno")));
		//System.out.println("(projectcontroller)project create vo's value : "+vo);
		//System.out.println("(projectcontroller)project tno value : "+req.getParameter("tno"));
		
		try {
			int count=projectService.insertProject(vo);
			if(count==1){
				System.out.println("insert success , insert count : "+count);
				return "redirect:/home";
			}else{
				System.out.println("insert fail , insert count : "+count);
				return "redirect:/home";
			}
		} catch (Exception e) {
			return "redirect:/home";
		}
	}
	
	//프로젝트 목록
	@RequestMapping(value="projectlist")
	public String projectlist(Model model, HttpSession session, HttpServletRequest request){
		String id = (String) session.getAttribute("id");
		model.addAttribute("plist", projectService.selectProjectList(request.getParameter("tno")));
		model.addAttribute("teammenu", teamService.selectTeamList(id));
		model.addAttribute("projectmenu", projectService.selectProjectMenu(id));
		//추가
		model.addAttribute("tno",request.getParameter("tno"));
		return"project/projectselect";
	}
	//프로젝트 메인
	@RequestMapping(value="projectmain")
	public String projectmain(Model model, HttpSession session, HttpServletRequest request){
		String id = (String) session.getAttribute("id");
		String pno=(String)request.getParameter("pno");
		model.addAttribute("pno", pno);
		model.addAttribute("teammenu", teamService.selectTeamList(id));
		model.addAttribute("projectmenu", projectService.selectProjectMenu(id));
		return"project/projectmain";
	}
	
	// 프로젝트 관리
	@RequestMapping(value="projectmanagement")
	public String projectupdate(Model model,HttpSession session,HttpServletRequest req,ProjectVO vo){
		model.addAttribute("pno", (String)req.getParameter("pno"));
		
		int pno=Integer.parseInt(req.getParameter("pno"));
		try{
			vo = projectService.selectProject(pno);
			model.addAttribute("pvo", vo);
			return "project/projectupdate";
		}catch(Exception e){
			System.out.println("project select error.!");
			return "redirect:/home";
		}
		//System.out.println(vo);
		
	}
	//project 관리 form 요청.
	@RequestMapping(value="projectmanagementform")
	public String projectmanagementtest(Model model,HttpSession session,HttpServletRequest req,ProjectVO vo){
		//System.out.println("(project controller)projectmanagement : "+(String)req.getParameter("pno"));
		model.addAttribute("pno", (String)req.getParameter("pno"));
		int pno=Integer.parseInt(req.getParameter("pno"));
		try{
			vo=projectService.selectProject(pno);
			model.addAttribute("pvo", vo);
			return "project/projectmanagement";
		}catch(Exception e){
			System.out.println("(projectController)project select error.");
			return "redirect:/home";
		}
	}
	//project update form 요청.
	@RequestMapping(value="projectupdateform")
	public String projectupdateform(Model model,HttpServletRequest req,ProjectVO vo){
		//String pno = req.getParameter("pno");
		int pno=Integer.parseInt(req.getParameter("pno"));
		try{
			vo = projectService.selectProject(pno);
			model.addAttribute("pvo", vo);
			return "project/projectupdate";
		}catch(Exception e){
			System.out.println("project select error.!");
			return "redirect:/home";
		}
	}
	//project 삭제.
	@RequestMapping(value="projectdelete")
	public String projectdelete(Model model,HttpServletRequest req,ProjectVO vo){
		int pno=Integer.parseInt(req.getParameter("pno"));
		try{
			int count=projectService.deleteProject(pno);
			if(count>=1){
				System.out.println("delete count : "+count);
				return "redirect:/home";
			}
			else{
				System.out.println("delete count : 0");
				return "redirect:/project/projectselect";
			}
		}catch(Exception e){
			System.out.println("delete fail");
			return "redirect:/home";
		}
	}
	
	@RequestMapping(value="projectupdate",method={RequestMethod.GET,RequestMethod.POST})
	public String updateproject(HttpServletRequest req,ProjectVO vo){
		
		String pno=(String)req.getParameter("pno");
		String exdate=(String)req.getParameter("pexdate");
		//System.out.println("exdate : "+exdate);
		/*SimpleDateFormat format= new SimpleDateFormat("yyyy-mm-dd");
		Date date=format.parse(exdate);
		System.out.println("format : "+date);*/
		vo.setPno(Integer.parseInt(pno));
		vo.setExdate(exdate);
		vo.setName((String)req.getParameter("pname"));
		vo.setContent((String)req.getParameter("pcontent"));

		try{
			int count=projectService.updateProject(vo);
			if(count>=1){
				System.out.println("update count : "+count);
				return "project/projectmain";
			}
			else{
				System.out.println("update fail");
				return "redirect:/project/projectupdate";
			}
		}catch(Exception e){
			System.out.println(pno+"'s project update fail");
			return "redirect:/project/projectupdate";
		}
		
	}
	
}

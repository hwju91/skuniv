package winder.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.junit.runner.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import winder.service.TeamService;
import winder.vo.TeamVO;

@Controller
public class teamController   {

	private TeamVO teamvo;
	@Autowired
	private TeamService teamService;

	@RequestMapping(value="/teamcreate")
	public String teamcreate(){
		
		return "teamCreate";
	}
	
	@RequestMapping(value="/teamlist")
	public String teamList(HttpServletRequest req){
		
		List<TeamVO> teamAll = new ArrayList<>();
		teamAll=teamService.selectAllTeam();
		req.setAttribute("teamlist", teamAll);
		return "teamList";
	}
	
	@RequestMapping(value="/teamInfo",method={RequestMethod.GET, RequestMethod.POST})
	public String teaminfo(HttpServletRequest request){
		
		System.out.println("(Controller)teamno :" +request.getParameter("teamno"));
		request.setAttribute("tno", request.getParameter("teamno"));
		
		/*
		teamvo=new TeamVO();
		teamvo.setName(request.getParameter("teamname"));
		teamvo.setCode(request.getParameter("teampassword"));
		teamvo.setContent(request.getParameter("teamcomment"));
		System.out.println("######"+teamvo);
		request.setAttribute("teamvo", teamvo);
		teamService.insertTeam(teamvo);*/
		
		return "teamInfo";
		
	}
	@RequestMapping(value="/profile")
	public String profile(){
		return "profile";
	}
	
	@RequestMapping(value="/foreachtest")
	public String foreachtest(){
		return "foreachtest";
	}
	
	
}

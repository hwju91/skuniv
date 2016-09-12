package winder.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import winder.service.ProjectService;
import winder.service.TeamService;
import winder.service.TodoListService;
import winder.service.TodoService;
import winder.vo.TodoJoinVO;
import winder.vo.TodoVO;

@Controller
public class TodoController {
	
	@Autowired
	private ProjectService projectService;
	@Autowired
	private TeamService teamService;
	@Autowired
	private TodoListService todolistService;
	@Autowired
	private TodoService todoService;
	
	//메뉴 프로젝트 목록 선택
	@RequestMapping(value="todo")
	public String todo(Model model, HttpSession session, HttpServletRequest request){
		String id=(String)session.getAttribute("id");
		model.addAttribute("teammenu", teamService.selectTeamList(id));
		model.addAttribute("projectmenu", projectService.selectProjectMenu(id));
		
		//프로젝트 진행률
		int temp=0;
		List<TodoJoinVO> plist=todolistService.selectTodoList(Integer.parseInt(request.getParameter("pno")));
		for(int i=0; i<plist.size(); i++){
			if(plist.get(i).getState().equals("2")){
				temp++;				
			}
		}
		double per=(double)temp/(double)plist.size()*100.0;
		model.addAttribute("per", per);
		
		//todo bar
		HashMap<String, Integer> hm=new HashMap<>();
		List<TodoVO> tdlist=todoService.listTodo(Integer.parseInt(request.getParameter("pno")));
		int temp2=0;
		int state=0;
		double dou=0;
		for(int i=0; i<tdlist.size(); i++){
			temp2=0;
			state=0;
			for(int j=0; j<plist.size(); j++){
				//todo의 content tilte, todolist의 content 같을 경우 hashmap에 content를 key로 저장
				//content 같을 때 state=2일 경우 진행률 계산 위해 +1
				if(tdlist.get(i).getContent().equals(plist.get(j).getTitle())){
					temp2++;
					if(plist.get(j).getState().equals("2")){
						state++;
					}
				}
			}
			dou=(double)state/(double)temp2*100.0;
			hm.put(tdlist.get(i).getContent(), (int)dou);
		}
		List<HashMap<String, Integer>> tdmap=new ArrayList<>();
		tdmap.add(hm);
		model.addAttribute("ab", hm);
		model.addAttribute("tdlist", tdmap);
		model.addAttribute("todo", plist);
		return "project/progress";
	}
	

}

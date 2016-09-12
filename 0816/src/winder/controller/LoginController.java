package winder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import winder.service.MemberService;

@Controller
public class LoginController {
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value={"/","/home"})
	public String home(){
		return "index";
	}
	
	@RequestMapping(value="/login")
	public String login(){
		return "login";
	}

}

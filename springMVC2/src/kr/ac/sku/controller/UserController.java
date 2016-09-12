package kr.ac.sku.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.ac.sku.vo.MemberVO;
@Controller
public class UserController {
	@RequestMapping("joinform.sku")
	public String joinForm(){
		return "user/member";
	}
	
	@RequestMapping("join")
	public String join(MemberVO vo){
		//request로 부터 값을 꺼내서 사용함
		System.out.println(vo);
		//꺼내서 DB에 저장한다
		return "redirect;/list.sku"; //리다이렉트로 넘겨준다.
		
		
	}
	
	@RequestMapping("info.sku")
	public String info(@RequestParam("id") String id){
		System.out.println(id);
		return "hello";
	}
}

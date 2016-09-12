package kr.ac.sku.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping("hello.sku")
	public String hello(){
		return "hello";
	}
	
	@RequestMapping("hi.sku")
	public String hi(){
		return "hi";
	}
	
	@RequestMapping("abc.sku")
	public String abc(){
		return "abc";
	}
	@RequestMapping("list.sku")
	public ModelAndView list(){
		//화면이 보여줄 리스트를 얻어내기 위한 코드를 쓴다.
		ModelAndView mv = new ModelAndView("user/list");
		//리스트를 꺼내왔다면
		//mv.addObject("list",attributeValue) 맡기는 거
		
		return mv;
	}
}

package kr.ac.sku.controller;

import javax.jws.WebParam.Mode;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.ac.sku.vo.MemberVO;

@Controller

public class memberController {

	@RequestMapping("loginform") // loginform
	public String loginForm() {

		return "user/loginform";
	}

	@RequestMapping("memberlist") // memberlist
	public String memberlist(MemberVO vo) {
		System.out.println(vo);
		return "/user/memberlist";
	}

	@RequestMapping("memberupdate") // memberupdate
	public String memberUpdate(MemberVO vo) {
		System.out.println(vo);
		return "user/memberupdate";

	}

	@RequestMapping("memberupdateform") // memberupdateform
	public String memberUpdateForm(MemberVO vo) {
		System.out.println(vo);
		return "user/memberupdateform";
	}

	@RequestMapping("memberdelete") // memberdelete
	public String memberDelete(MemberVO vo) {
		System.out.println(vo);
		return "user/memberdelete";
	}

	@RequestMapping("memberform") // memberform
	public String memberForm() {

		return "user/memberForm";
	}

	@RequestMapping("member") // member(추가시키는것)
	public String member(MemberVO vo) {
		System.out.println(vo);
		return "user/member";
	}

	@RequestMapping("hello")
	public String hello() {
		return "hello";
	}

	@RequestMapping("read/{id}")
	public String read(@PathVariable int id, Model model) {

		System.out.println(id);
		model.addAttribute("id", "kim");
		MemberVO vo = new MemberVO();
		vo.setEmail("asdfwegw@agewgweg");
		vo.setId("khr");
		vo.setPassword("1234");
		vo.setName("김화랑");
		model.addAttribute("userVO", vo);
		return "read";
	}

}

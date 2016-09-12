package winder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import winder.service.MemberService;
import winder.vo.MemberVO;

@Controller
@RequestMapping("/user")
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	// 회원 가입 페이지
		@RequestMapping("/member")
		public String member() {
			System.out.println("eeee");
			return "user/member";
		}

		// 회원 가입 처리
		@RequestMapping("/memberjoin")
		public String memberJoin(MemberVO vo) {
			System.out.println("ssssssss");
			try {
				int count = memberService.insertMember(vo);
				System.out.println(vo);
				System.out.println(count);
				if (count == 1) {
					return "redirect:/user/member";
				} else {
					return "redirect:/login";
				}
			} catch (Exception e) {
				System.out.println("dddddd");
				return "redirect:/login";
			}

		}

}

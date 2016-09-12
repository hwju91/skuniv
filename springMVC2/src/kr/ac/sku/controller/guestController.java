package kr.ac.sku.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class guestController {

	@RequestMapping("selectbook") // selectguestbook
	public String selectGuestbook() {

		return "user/selectguestbook";
	}

	@RequestMapping("guestbook") // guestbook
	public String guestBook() {

		return "user/guestbook";
	}

	@RequestMapping("guestbookdelete") // guestbookdelete
	public String guestDelete() {

		return "user/guestbookdelete";
	}

	@RequestMapping("guestbookupdate") // guestbookupdate
	public String guestupdate() {

		return "user/guestbookupdate";
	}

	@RequestMapping("guestbookupdateform") // guestbookupdateform
	public String guestbookupdateform() {

		return "user/guestbookupdateform";

	}

	@RequestMapping("guestform") // guestform
	public String guestform() {
		return "user/guestForm";
	}

	@RequestMapping("guestlist") // guestlist
	public String guestlist() {
		return "user/guestlist";
	}
}

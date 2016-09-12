package kr.ac.sku.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.ac.sku.dao.GuestBookDAO;
import kr.ac.sku.fw.Action;
import kr.ac.sku.vo.GuestBookVO;

public class guestbooklistAction extends Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		
		GuestBookDAO dao = new GuestBookDAO();
		List<GuestBookVO> guestbookList = dao.getGuestBookList();
		request.setAttribute("guestbookList",guestbookList);
		RequestDispatcher rd = request.getRequestDispatcher("guestbooklist.jsp");
		rd.forward(request, response); 

	}

}

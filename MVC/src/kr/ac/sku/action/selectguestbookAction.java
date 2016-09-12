package kr.ac.sku.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.ac.sku.dao.GuestBookDAO;
import kr.ac.sku.fw.Action;
import kr.ac.sku.vo.GuestBookVO;

public class selectguestbookAction extends Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		GuestBookDAO dao = new GuestBookDAO();
		
		int no = Integer.parseInt(request.getParameter("no"));
		GuestBookVO vo = dao.getGuestBook(no);
		request.setAttribute("guestbookdetail",vo);
		
		
		
		
		RequestDispatcher rd = request.getRequestDispatcher("selectguestbook.jsp");
		rd.forward(request, response); 

	}

}

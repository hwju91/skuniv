package kr.ac.sku.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.ac.sku.dao.GuestBookDAO;
import kr.ac.sku.fw.Action;
import kr.ac.sku.vo.GuestBookVO;

public class guestbookupdateAction extends Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		RequestDispatcher rd = request.getRequestDispatcher("guestbookupdate.jsp");
		rd.forward(request, response);
	}

}

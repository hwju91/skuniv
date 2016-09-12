package kr.ac.sku.fw;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ActionServlet extends HttpServlet {

	private static final long serialVersionUID = -3160576197970154166L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = request.getRequestURI();
		String contextPath = request.getContextPath();
		String path = url.substring(contextPath.length());
		System.out.println(path);
		
		try{
			ActionFactory factory = ActionFactory.getInstance();
			Action action = factory.getAction(path);
			action.execute(request, response);
		}catch(Exception ex){
			System.out.println(ex);
		}
	}
	
}

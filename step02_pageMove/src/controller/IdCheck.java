package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/IdCheck")
public class IdCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public IdCheck() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	// id 값이 busan 이라고 한다면 -> / valid 매핑 되어 있는 servlet화면 이동
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("uname");
		String psw = request.getParameter("psw");

		if ("busan".equals(id)) {

			// valid 매핑 되어있는 servlet 화면 이동
			//
//			response.sendRedirect("valid");
			request.getRequestDispatcher("valid").forward(request, response);
		} else {
			response.sendRedirect("invalid");
		}
	}

}

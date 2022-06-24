package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.EmpDAO;

@WebServlet("/emp")
public class EmpController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EmpController() {
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int empno = Integer.parseInt(request.getParameter("empno"));
		// ServletInputStream input = request.getInputStream();

		System.out.println(request.getParameter("empno"));

		// 메소드 정의
		/*
		 * step01 : 데이터 획득 empno 사번 -> ename 사원의 이름을 반환 받으려고 합니다! String ename =
		 * EmpDAO.getName(empno);
		 * 
		 * step02 : 페이지 이동(forward VS redirect) ename 있다고 한다면? -> view.jsp 이름값을 전달
		 * (forward) ename 없다고 한다면? -> view.jsp "사원의 이름이 없습니다" 문자열 전달 ( 만약에 SQLException
		 * 발생한다면? -> failView.jsp 로 이동
		 * 
		 */
		try {
			String ename = EmpDAO.getName(empno);
			if (ename != null) {
				System.out.println(ename);
				request.setAttribute("empno", empno);
				request.setAttribute("ename", ename);

			} else {
				System.out.println("이름이 없음");
				request.setAttribute("ename", null);

			}
			request.setAttribute("command", "emp");
			request.getRequestDispatcher("emp.jsp").forward(request, response);

		} catch (SQLException e) {
			e.printStackTrace();
			response.sendRedirect("failView.jsp");
		}

	}

}

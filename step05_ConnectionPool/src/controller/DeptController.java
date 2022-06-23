package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DeptDAO;

@WebServlet("/dept")
public class DeptController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DeptController() {
		super();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int deptno = Integer.parseInt(request.getParameter("deptno"));

		try {
			String dname = DeptDAO.getDname(deptno);
			if (dname != null) {
				System.out.println(deptno);
				System.out.println(dname);
				request.setAttribute("deptno", deptno);
				request.setAttribute("dname", dname);
				request.setAttribute("command", "dept");
				request.getRequestDispatcher("view.jsp").forward(request, response);
			} else {
				System.out.println("부서명이 없음");
			}
		} catch (SQLException e) {
			e.printStackTrace();

		}

	}

}

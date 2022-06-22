package view;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class InvalidView
 */
@WebServlet("/invalid")
public class InvalidView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public InvalidView() {
        super();
    }

    // SessionFinal 로그아웃 버튼 클릭 했을 때  -> 현재의 Servlet에서 세션 무효화
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		System.out.println(session.getAttribute("lecture"));
		session.invalidate();
//		System.out.println(session.getAttribute("lecture"));
		
		response.sendRedirect("login.html");
	}

}

package step02.apply;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/check")
public class IdCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public IdCheck() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("doGet()");
		// step01
		// Client가 입력한 데이터를 추출
		System.out.println(request.getParameter("id"));
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost()");		
		process(request, response);
//		System.out.println(request.getParameter("id"));
//		String id = request.getParameter("id");
//		String pw = request.getParameter("pw");
		
	}
	
	// 공통된 로직으로 구현되는 사용자 정의 메소드 

	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");

		// 한글 데이터 브라우저 응답 방법
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		
		
		PrintWriter out =  response.getWriter();
		
		out.println("안녕하세요 " + id);
		
	}
	
}

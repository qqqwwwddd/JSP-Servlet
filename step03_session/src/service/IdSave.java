package service;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class IdSave
 */
@WebServlet("/save")
public class IdSave extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IdSave() {
        super();
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("save servlet");
		
		// step02 session
		HttpSession session2 = request.getSession();
		System.out.println("IdSave - " + session2.getId());
		
		response.sendRedirect("sessionFinal");
		
		
		
/*		//step01 cookie
		Cookie cookie3 = new Cookie("myName", "jeongin");
		cookie3.setMaxAge(60 * 60 * 24);
		response.addCookie(cookie3);
		response.sendRedirect("final");
	
*/
	}
}

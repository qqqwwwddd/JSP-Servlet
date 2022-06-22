package view;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/final")
public class Final extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Final() {
        super();
    }
    
    // client 에 있는 cookie 정보 획득 - 해당 서비스에서 발생시킨 쿠키 정보에 한해서만 확인

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// myId, myAge, myName 으로 지정되어 있는 모든 쿠키 출력
		
		Cookie[] cookie = request.getCookies();
		for(int i = 0; i < cookie.length; i++) {
			System.out.println(cookie[i].getValue());
		}
		// myName에 대한 쿠키만 삭제? 
		
//		Cookie delMyName = new Cookie("myName",null);
//		delMyName.setMaxAge(0);
//		response.addCookie(delMyName);
//		
	}

}

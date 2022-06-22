package step02.apply;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/print")
public class ValuePrint extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ValuePrint() {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	System.out.println("get");
    	request.setCharacterEncoding("UTF-8");
    	
    	System.out.println(request.getQueryString());
    	System.out.println(URLDecoder.decode(request.getQueryString()));
    	
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		process(request, response);
	
	}

	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("post");
		request.setCharacterEncoding("UTF-8");
		
		ServletInputStream input = request.getInputStream();
		System.out.println(input);
		int length = request.getContentLength();
		byte[] data = new byte[length];		
		input.readLine(data, 0, length);
		
		// post방식으로 넘어온 request 객체의 body 정
		String str  = new String(data);
		System.out.println(str);
		System.out.println(URLDecoder.decode(str, "UTF-8"));
		
		
//		String[] likes = request.getParameterValues("like");
//		
//		PrintWriter out =  response.getWriter();
//		
////		for(int i = 0; i < like.length; i++) {
//		
//		for (String like : likes) {
//		System.out.println(like);
//		}
	}

	
}

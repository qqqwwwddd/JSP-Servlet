package util;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class RequestListner implements ServletRequestListener, ServletRequestAttributeListener {

	public RequestListner() {
		System.out.println("리스너 객체 생성");
	}

	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println("리스너 객체 해제");
	}

	public void attributeRemoved(ServletRequestAttributeEvent srae) {
	}

	public void requestInitialized(ServletRequestEvent sre) {
	}

	public void attributeAdded(ServletRequestAttributeEvent srae) {
	}

	public void attributeReplaced(ServletRequestAttributeEvent srae) {
	}

}

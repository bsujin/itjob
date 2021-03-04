package kr.or.itjob.listener;

import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.or.itjob.model.ItJobUserVo;

public class LoginUserListener implements HttpSessionAttributeListener{
	private static final Logger logger = LoggerFactory.getLogger(LoginUserListener.class);
	private Set<String> users = new HashSet<>();
	
	@Override
	public void attributeAdded(HttpSessionBindingEvent event) {
		
		if(event.getName().equals("S_USER")) {
			ItJobUserVo user =  (ItJobUserVo)event.getValue();
			logger.debug("added user : {}",user.getUsers_id());
			users.add(user.getUsers_id());
			
			 event.getSession().getServletContext().setAttribute("USER_SET", users);
		}
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent event) {
		ItJobUserVo user =  (ItJobUserVo)event.getValue();
		logger.debug("removed user : {}",user.getUsers_id());
		
		
		users.remove(user.getUsers_id());
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent event) {
		
	}
	
	
	
	
	
}

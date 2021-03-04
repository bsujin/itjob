package kr.or.itjob.listener;

import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.or.itjob.model.ItJobAdminVo;

public class LoginAdminListener implements HttpSessionAttributeListener{
	private static final Logger logger = LoggerFactory.getLogger(LoginAdminListener.class);
	
	private Set<String> admins = new HashSet<>();
	
	@Override
	public void attributeAdded(HttpSessionBindingEvent event) {
		
		if(event.getName().equals("S_ADMIN")) {
			ItJobAdminVo admin =  (ItJobAdminVo)event.getValue();
			logger.debug("added user : {}",admin.getAdmin_id());
			admins.add(admin.getAdmin_id());
			
			 event.getSession().getServletContext().setAttribute("USER_SET", admin);
		}
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent event) {
		ItJobAdminVo admin =  (ItJobAdminVo)event.getValue();
		logger.debug("removed user : {}",admin.getAdmin_id());
		
		
		admins.remove(admin.getAdmin_id());
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent event) {
		
	}
	
	
	
	
	
}

package kr.or.itjob.log.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.or.itjob.log.repository.ItJobAdminDao;
import kr.or.itjob.model.ItJobAdminVo;

@Service("itjobadminservice")
public class ItJobAdminService implements ItJobAdminServiceI{
	
	@Resource(name = "itjobadminDao")
	private ItJobAdminDao dao;

	@Override
	public ItJobAdminVo selectAdmin(String admin_id) {
		
		return dao.selectAdmin(admin_id);
	}
	
	
	

}

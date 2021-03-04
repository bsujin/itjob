package kr.or.itjob.log.service;

import kr.or.itjob.model.ItJobAdminVo;

public interface ItJobAdminServiceI {
	
	 // 기업 한명의 조회(하섭)
		ItJobAdminVo selectAdmin(String admin_id);
}

package kr.or.itjob.log.repository;

import kr.or.itjob.model.ItJobAdminVo;

public interface ItJobAdminDaoI {
	
    // 기업 한명의 조회(하섭)
	ItJobAdminVo selectAdmin(String admin_id);
}

package kr.or.itjob.log.service;

import java.util.List;

import kr.or.itjob.model.ItJobComUsersVo;

public interface ItJobComUsersServiceI {
	
			// 전체 기업 조회(하섭)
			List<ItJobComUsersVo> selectAllCom();
			
			// 기업 한명의 조회(하섭)
			ItJobComUsersVo selectCom(String com_id);
}

package kr.or.itjob.log.service;

import java.util.List;

import kr.or.itjob.log.model.ItJobComVo;

public interface ItJobComServiceI {
	
			// 전체 기업 조회(하섭)
			List<ItJobComVo> selectAllCom();
			
			// 기업 한명의 조회(하섭)
			ItJobComVo selectCom(String com_id);
}

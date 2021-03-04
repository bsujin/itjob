package kr.or.itjob.log.service;

import java.util.List;

import kr.or.itjob.model.ItJobUserVo;

public interface ItJobUserServiceI {
	
	
	/**
	 * 전체 사용자 조회
	 * 만든이 : 송하섭
	 * 
	 * @return
	 */
	
	List<ItJobUserVo> selectAllUser();
	
	/**
	 * 사용자 한명 조회
	 * 만든이 : 송하섭
	 * @param users_id
	 * @return
	 */
	
	ItJobUserVo selectUser(String users_id);
	
	// 회원가입 등록(하섭)
	int usersigninsert(ItJobUserVo userVo);
}

package kr.or.itjob.log.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.or.itjob.log.repository.ItJobUserDao;
import kr.or.itjob.model.ItJobUserVo;


@Service("itjobuserService")
public class ItJobUserService implements ItJobUserServiceI{
	
	@Resource(name = "itjobuserDao")
	private ItJobUserDao itjobuserDao;

	// 전체 사용자 조회
	@Override
	public List<ItJobUserVo> selectAllUser() {
		
		return itjobuserDao.selectAllUser();
	}
	
	// 사용자 한명의 조회(하섭)
	@Override
	public ItJobUserVo selectUser(String users_id) {
		
		return itjobuserDao.selectUser(users_id);
	}

	@Override
	public int usersigninsert(ItJobUserVo userVo) {
		return itjobuserDao.usersigninsert(userVo);
	}
	
	

}

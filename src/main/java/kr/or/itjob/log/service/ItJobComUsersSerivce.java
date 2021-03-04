package kr.or.itjob.log.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.or.itjob.log.repository.ItJobComUsersDao;
import kr.or.itjob.model.ItJobComUsersVo;

@Service("itjobcomusersService")
public class ItJobComUsersSerivce implements ItJobComUsersServiceI{
	
	@Resource(name="itjobcomusersDao")
	private ItJobComUsersDao itjobcomDao;

	@Override
	public List<ItJobComUsersVo> selectAllCom() {
		return itjobcomDao.selectAllCom();
	}

	@Override
	public ItJobComUsersVo selectCom(String com_id) {
		return itjobcomDao.selectCom(com_id);
	}



}

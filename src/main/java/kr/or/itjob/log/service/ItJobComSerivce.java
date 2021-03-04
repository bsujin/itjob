package kr.or.itjob.log.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.or.itjob.log.model.ItJobComVo;
import kr.or.itjob.log.model.ItJobUserVo;
import kr.or.itjob.log.repository.ItJobComDao;

@Service("itjobcomService")
public class ItJobComSerivce implements ItJobComServiceI{
	
	@Resource(name="itjobcomDao")
	private ItJobComDao itjobcomDao;

	@Override
	public List<ItJobComVo> selectAllCom() {
		return itjobcomDao.selectAllCom();
	}

	@Override
	public ItJobComVo selectCom(String com_id) {
		return itjobcomDao.selectCom(com_id);
	}



}

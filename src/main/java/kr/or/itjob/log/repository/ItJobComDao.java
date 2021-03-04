package kr.or.itjob.log.repository;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.or.itjob.log.model.ItJobComVo;

@Repository("itjobcomDao")
public class ItJobComDao implements ItJobComDaoI{
	
	@Resource(name = "sqlSessionTemplate")
	private SqlSessionTemplate template;
	
	@Override
	public List<ItJobComVo> selectAllCom() {
		
		return template.selectList("com.selectAllCom");
	}

	@Override
	public ItJobComVo selectCom(String com_id) {
		
		return template.selectOne("com.selectCom",com_id);
	}

}

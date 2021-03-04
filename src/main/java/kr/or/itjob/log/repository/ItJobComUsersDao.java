package kr.or.itjob.log.repository;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.or.itjob.model.ItJobComUsersVo;

@Repository("itjobcomusersDao")
public class ItJobComUsersDao implements ItJobComUsersDaoI{
	
	@Resource(name = "sqlSessionTemplate")
	private SqlSessionTemplate template;
	
	@Override
	public List<ItJobComUsersVo> selectAllCom() {
		
		return template.selectList("comusers.selectAllCom");
	}

	@Override
	public ItJobComUsersVo selectCom(String com_id) {
		
		return template.selectOne("comusers.selectCom",com_id);
	}

}

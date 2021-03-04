package kr.or.itjob.log.repository;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.or.itjob.model.ItJobAdminVo;

@Repository("itjobadminDao")
public class ItJobAdminDao implements ItJobAdminDaoI{

	@Resource(name = "sqlSessionTemplate")
	private SqlSessionTemplate template;
	
	@Override
	public ItJobAdminVo selectAdmin(String admin_id) {
		
		return template.selectOne("admin.selectAdmin", admin_id);
	}

}

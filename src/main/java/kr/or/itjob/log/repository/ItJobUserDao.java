package kr.or.itjob.log.repository;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.or.itjob.model.ItJobUserVo;


@Repository("itjobuserDao")
public class ItJobUserDao implements ItJobUserDaoI{
	
	@Resource(name = "sqlSessionTemplate")
	private SqlSessionTemplate template;
	
	
	// 전체 사용자 조회(하섭)
	@Override
	public List<ItJobUserVo> selectAllUser() {
		return template.selectList("user.selectAllUser");
	}

	// 사용자 한명의 조회(하섭)
	@Override
	public ItJobUserVo selectUser(String users_id) {
		return template.selectOne("user.selectUser",users_id);
	}

	@Override
	public int usersigninsert(ItJobUserVo userVo) {
		return template.insert("user.insertUser", userVo);
	}

}

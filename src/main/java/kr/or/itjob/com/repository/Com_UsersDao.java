package kr.or.itjob.com.repository;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository("com_UsersDao")
public class Com_UsersDao  implements Com_UsersDaoI {
	
	@Resource(name="sqlSessionTemplate")
	private SqlSessionTemplate template;
	
	
	
}

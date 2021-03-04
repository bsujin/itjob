package kr.or.itjob.job.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import kr.or.itjob.job.model.Job_BoardVo;
import kr.or.itjob.job.repository.Job_BoardDao;
import kr.or.itjob.page.model.PageVo;

@Service("jobBoardService")
public class Job_BoardService implements Job_BoardServiceI {

	@Resource(name="jobBoardDao")
	private Job_BoardDao job_BoardDao;
	
	@Override
	public Map<String, Object> PagingJob_Board(PageVo pageVo) {
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		resultMap.put("pageVo", pageVo);
		resultMap.put("jobList", job_BoardDao.PagingJob_Board(pageVo));
		resultMap.put("pagination", (int)Math.ceil( (double)job_BoardDao.CountAllJob_Board() / pageVo.getPageSize()));
		return resultMap;
	}
	
}

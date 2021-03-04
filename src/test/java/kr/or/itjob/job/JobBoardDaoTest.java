package kr.or.itjob.job;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;

import kr.or.itjob.config.ModelTestConfig;
import kr.or.itjob.job.model.Job_BoardVo;
import kr.or.itjob.job.repository.Job_BoardDaoI;
import kr.or.itjob.job.service.Job_BoardService;
import kr.or.itjob.page.model.PageVo;

public class JobBoardDaoTest extends ModelTestConfig {
	
	@Resource(name="jobBoardDao")
	private Job_BoardDaoI jobBoardDao;

	
	// jobBoard 페이징 처리
	@Test
	public void PagingTest () {
		List<Job_BoardVo> pageList  =	jobBoardDao.PagingJob_Board(new PageVo(1,5));
		/***Then***/
		assertEquals(1, pageList.size());
	}
	@Test
	public void CountTest () {
		int cnt = jobBoardDao.CountAllJob_Board();
		assertEquals(1, cnt);
	}

	

}

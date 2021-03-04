package kr.or.itjob.job;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;

import kr.or.itjob.config.ModelTestConfig;
import kr.or.itjob.job.model.Job_BoardVo;
import kr.or.itjob.job.service.Job_BoardService;
import kr.or.itjob.page.model.PageVo;

public class JobBoardServiceTest extends ModelTestConfig {
	
	@Resource(name="jobBoardService")
	private Job_BoardService jobBoardService;
	
	// jobBoard 페이징 처리
	@Test
	public void pagingTest () {
		Map<String, Object> map =	jobBoardService.PagingJob_Board(new PageVo(1,5));
		List<Job_BoardVo> boardList = (List<Job_BoardVo>) map.get("jobList");

		/***Then***/
		assertEquals(1, boardList.size());
		
	}

	

}

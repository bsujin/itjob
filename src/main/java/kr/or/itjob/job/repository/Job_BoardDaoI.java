package kr.or.itjob.job.repository;

import java.util.List;

import kr.or.itjob.job.model.Job_BoardVo;
import kr.or.itjob.page.model.PageVo;

public interface Job_BoardDaoI {
	
	// 게시판 페이징 처리
	List<Job_BoardVo> PagingJob_Board(PageVo pageVo);
	
	// 전체 게시판 갯수 조회
	int CountAllJob_Board();
	
	// 게시글 상세 조회
	List<Job_BoardVo> detailjob_Board(Job_BoardVo job_BoardVo);
	
	
}

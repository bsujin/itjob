package kr.or.itjob.job.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.or.itjob.job.service.Job_BoardServiceI;
import kr.or.itjob.page.model.PageVo;

@Controller	
@RequestMapping("jobBoard")
public class Job_BoardController {
	
	@Resource(name="jobBoardService")
	private Job_BoardServiceI job_BoardService;
	
	@RequestMapping("job_Main")
	public String Main() {
		return "Main";
	}
	
	@RequestMapping(path = "job_BoardList", method = RequestMethod.GET)
	public String pagingJob_Board(@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int pageSize,
			Model model) {
		 model.addAllAttributes(job_BoardService.PagingJob_Board(new PageVo(page, pageSize)));
		return "/itjob/jobs";
	}
	
//	@RequestMapping(path = "detailjob_Board", method = RequestMethod.GET)
//	public String detailjob_Board(Job_BoardVo jobBoardVo, Model model) {
//		model.addAllAttributes(job_BoardService.PagingJob_Board(new PageVo(page, pageSize)));
//		return "job_board/job_BoardMain";
//		return " /itjob/job_details";
//	}
	
	

}

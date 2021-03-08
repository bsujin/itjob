package kr.or.itjob.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.or.itjob.job.service.Job_BoardServiceI;
import kr.or.itjob.log.service.ItJobAdminService;
import kr.or.itjob.log.service.ItJobComUsersSerivce;
import kr.or.itjob.log.service.ItJobUserService;
import kr.or.itjob.model.ItJobUserVo;
import kr.or.itjob.page.model.PageVo;

@RequestMapping("itjobView")
@Controller
public class ItjobViewController {
	
	@Resource(name="jobBoardService")
	private Job_BoardServiceI job_BoardService;

	@RequestMapping(path = "job_BoardList", method = RequestMethod.GET)
	public String pagingJob_Board(@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int pageSize,
			Model model) {
		 model.addAllAttributes(job_BoardService.PagingJob_Board(new PageVo(page, pageSize)));
		return "/itjob/jobs";
	}
	
	@RequestMapping("login")
	public String loginView() {
		return "/login/login";
	}
	
	@RequestMapping("imageboard")
	public String imageboardView() {
		return "/itjob/imageboard";
	}
	
	@RequestMapping("codingTest")
	public String codingTestView() {
		return "/itjob/codingTest";
	}
	
	@RequestMapping("main")
	public String mainView() {
		return "/itjob/main";
	}
	
	@RequestMapping("candidate")
	public String candidateView() {
		return "/itjob/candidate";
	}
	
	@RequestMapping("contact")
	public String contactView() {
		return "/itjob/contact";
	}
	
	@RequestMapping("elements")
	public String elementsView() {
		return "/itjob/elements";
	}
	
	@RequestMapping("job_details")
	public String job_detailsView() {
		return "/itjob/job_details";
	}
	
	// 게시판 용 
	@RequestMapping("singleblog")
	public String singleblogView() {
		return "/itjob/single-blog";
	}
	
	//채용 공고 메인 페이지
	@RequestMapping("jobs")
	public String jobsView() {
		return "/itjob/jobs";
	}
	
	// 공고 상세보기 페이지 
	@RequestMapping("calendar")
	public String calendarView() {
		return "/itjob/calendar";
	}
	
	
}

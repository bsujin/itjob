package kr.or.itjob.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("itjobView")
@Controller
public class ItjobViewController {
	
	@RequestMapping("login")
	public String loginView() {
		return "/login/login2";
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
	
	@RequestMapping("singleblog")
	public String singleblogView() {
		return "/itjob/single-blog";
	}
	
	@RequestMapping("jobs")
	public String jobsView() {
		return "/itjob/jobs";
	}
	
	@RequestMapping("calendar")
	public String calendarView() {
		return "/itjob/calendar";
	}
	
	
}

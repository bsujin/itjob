package kr.or.itjob.log.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.or.itjob.log.service.ItJobAdminService;
import kr.or.itjob.log.service.ItJobComUsersSerivce;
import kr.or.itjob.log.service.ItJobUserService;
import kr.or.itjob.model.ItJobAdminVo;
import kr.or.itjob.model.ItJobComUsersVo;
import kr.or.itjob.model.ItJobUserVo;

@RequestMapping("itjob")
@Controller
public class ItJobLoginController {
	
	@Resource(name = "itjobuserService")
	private ItJobUserService itjobuserService;
	
	@Resource(name = "itjobcomusersService")
	private ItJobComUsersSerivce itjobcomService;
	
	@Resource(name = "itjobadminservice")
	private ItJobAdminService itjobadminService;
	
	
	/**
	 * 로그인페이지
	 * 만든이 : 송하섭
	 * @return
	 */
	
	@RequestMapping("login")
	public String loginView() {
		return "login";
	}
	
	/**
	 * user로그인페이지
	 * 만든이 : 송하섭
	 * @param userVo
	 * @param model
	 * @param session
	 * @return
	 */
	
	@RequestMapping(path="userloginview", method = RequestMethod.GET)
	public String userloginView() {
		return "userloginview";	
	}
	
	@RequestMapping("comloginview")
	public String comloginview() {
		return "comloginview";
	}
	
	@RequestMapping("adminloginview")
	public String adminloginview() {
		return "adminloginview";
	}
	
	/**
	 * user로그인 성공후 메인페이지
	 * 만든이 : 송하섭
	 * @param userVo
	 * @param session
	 * @return
	 */
	
	@RequestMapping(path = "userloginok", method = RequestMethod.POST)
	public String userloginOk(ItJobUserVo userVo, HttpSession session, RedirectAttributes ra) {
		ItJobUserVo dbUser = itjobuserService.selectUser(userVo.getUsers_id());
		
		if(dbUser != null && userVo.getUsers_pass().equals(dbUser.getUsers_pass())) {
			session.setAttribute("S_USER", dbUser);
			return "itjobusermain";
		}else {
			ra.addFlashAttribute("msg",	"로그인 정보가 옳지 않습니다");
			return "redirect:/itjob/userloginview";
		}
		
	}
	@RequestMapping(path = "comloginok", method = RequestMethod.POST)
	public String comloginok(ItJobComUsersVo comVo, HttpSession session,RedirectAttributes ra) {
		
		ItJobComUsersVo dbUser = itjobcomService.selectCom(comVo.getCom_id());
		
		if(dbUser != null && comVo.getCom_pass().equals(dbUser.getCom_pass())) {
			session.setAttribute("S_COM", dbUser);
			return "itjobcommain";
		}else {
			ra.addFlashAttribute("msg",	"로그인 정보가 옳지 않습니다");
			return "redirect:/itjob/comloginview";
		}
		
	}
	
	@RequestMapping(path = "adminloginok", method = RequestMethod.POST)
	public String adminloginok(ItJobAdminVo adminVo, HttpSession session,RedirectAttributes ra) {
		
		ItJobAdminVo dbUser = itjobadminService.selectAdmin(adminVo.getAdmin_id());
		
		if(dbUser != null && adminVo.getAdmin_pass().equals(dbUser.getAdmin_pass())) {
			session.setAttribute("S_ADMIN", dbUser);
			return "itjobadminmain";
		}else {
			ra.addFlashAttribute("msg",	"로그인 정보가 옳지 않습니다");
			return "redirect:/itjob/adminloginview";
		}
		
	}
	
	@RequestMapping("usersignview")
	public String usersingview() {
		
		
		
		return "/user/usersignview";
	}
	
	
	@RequestMapping("comsignview")
	public String comSignview() {
		return "/user/comsignview";
	}
	
	@RequestMapping("adminsignview")
	public String adminSignview() {
		return "/user/adminsignview";
	}
	
	@RequestMapping("capchaimage")
	public String capcha() {
		return "/user/capchakeyimage";
	}
	
	@RequestMapping("capchakey")
	public String capchakey() {
		return "/user/capchakey";
	}
	
	@RequestMapping(path = "usersignok", method = RequestMethod.POST )
	public String usersignok(@Valid ItJobUserVo userVo,BindingResult result, String users_id) {
		
		int insertCnt = 0;
		
		try {
			insertCnt = itjobuserService.usersigninsert(userVo);
			
		} catch (Exception e) {
			e.printStackTrace();
			insertCnt =0;
		}
		if(insertCnt ==1) {
			return "userloginview";
		}else {
			return "/user/usersignview";
		}
		
	}
	
	
}

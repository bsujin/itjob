package kr.or.itjob.log.model;

public class ItJobAdminVo {
	private String admin_id;
	private String admin_pass;
	
	public ItJobAdminVo() {}
	
	
	public String getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
	}
	public String getAdmin_pass() {
		return admin_pass;
	}
	public void setAdmin_pass(String admin_pass) {
		this.admin_pass = admin_pass;
	}
	@Override
	public String toString() {
		return "ItJobAdminVo [admin_id=" + admin_id + ", admin_pass=" + admin_pass + "]";
	}
	
	
}

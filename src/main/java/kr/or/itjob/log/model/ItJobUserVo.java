package kr.or.itjob.log.model;

public class ItJobUserVo {
	
	private String users_id;
	private String users_nm;
	private String users_pass;
	private String users_em;
	
	
	public ItJobUserVo() {}
	
	public ItJobUserVo(String users_id, String users_nm, String users_pass, String users_em) {
		super();
		this.users_id = users_id;
		this.users_nm = users_nm;
		this.users_pass = users_pass;
		this.users_em = users_em;
	}
	
	
	public String getUsers_id() {
		return users_id;
	}
	public void setUsers_id(String users_id) {
		this.users_id = users_id;
	}
	public String getUsers_nm() {
		return users_nm;
	}
	public void setUsers_nm(String users_nm) {
		this.users_nm = users_nm;
	}
	public String getUsers_pass() {
		return users_pass;
	}
	public void setUsers_pass(String users_pass) {
		this.users_pass = users_pass;
	}
	public String getUsers_em() {
		return users_em;
	}
	public void setUsers_em(String users_em) {
		this.users_em = users_em;
	}
	@Override
	public String toString() {
		return "ItJobUserVo [users_id=" + users_id + ", users_nm=" + users_nm + ", users_pass=" + users_pass
				+ ", users_em=" + users_em + "]";
	}
	
	
}

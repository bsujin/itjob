package kr.or.itjob.model;

import java.util.Date;

public class ItJobUserVo {
	
	private int users_num;
	private String users_id;
	private int users_com;
	private String users_nm;
	private String users_pass;
	private String users_em;
	private Date users_logindate;
	private int users_passfailcnt;
	private int users_act;
	private Date act_dt;
	
	public ItJobUserVo() {}
	
	public int getUsers_num() {
		return users_num;
	}
	public void setUsers_num(int users_num) {
		this.users_num = users_num;
	}
	public String getUsers_id() {
		return users_id;
	}
	public void setUsers_id(String users_id) {
		this.users_id = users_id;
	}
	public int getUsers_com() {
		return users_com;
	}
	public void setUsers_com(int users_com) {
		this.users_com = users_com;
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
	public Date getUsers_logindate() {
		return users_logindate;
	}
	public void setUsers_logindate(Date users_logindate) {
		this.users_logindate = users_logindate;
	}
	public int getUsers_passfailcnt() {
		return users_passfailcnt;
	}
	public void setUsers_passfailcnt(int users_passfailcnt) {
		this.users_passfailcnt = users_passfailcnt;
	}
	public int getUsers_act() {
		return users_act;
	}
	public void setUsers_act(int users_act) {
		this.users_act = users_act;
	}
	public Date getAct_dt() {
		return act_dt;
	}
	public void setAct_dt(Date act_dt) {
		this.act_dt = act_dt;
	}
	@Override
	public String toString() {
		return "ItJobUserVo [users_num=" + users_num + ", users_id=" + users_id + ", users_com=" + users_com
				+ ", users_nm=" + users_nm + ", users_pass=" + users_pass + ", users_em=" + users_em
				+ ", users_logindate=" + users_logindate + ", users_passfailcnt=" + users_passfailcnt + ", users_act="
				+ users_act + ", act_dt=" + act_dt + "]";
	}
	
	
	
	
}

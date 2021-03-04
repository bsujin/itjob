package kr.or.itjob.model;

import java.sql.Date;

public class ItJobComUsersVo {
	
	private int com_num;
	private String com_id;
	private String com_pass;
	private String com_nm;
	private String com_email;
	private String com_ph;
	private String com_addr;
	private String com_no;
	private int com_empcnt;
	private String com_form;
	private String com_spec;
	private String com_boss_nm;
	private Date com_date;
	private int com_income;
	private String com_info;
	private int com_report_cnt;
	private int com_act;
	private String com_logo_nm;
	private String com_logo_path;
	
	public ItJobComUsersVo() {}
	
	public int getCom_num() {
		return com_num;
	}
	public void setCom_num(int com_num) {
		this.com_num = com_num;
	}
	public String getCom_id() {
		return com_id;
	}
	public void setCom_id(String com_id) {
		this.com_id = com_id;
	}
	public String getCom_pass() {
		return com_pass;
	}
	public void setCom_pass(String com_pass) {
		this.com_pass = com_pass;
	}
	public String getCom_nm() {
		return com_nm;
	}
	public void setCom_nm(String com_nm) {
		this.com_nm = com_nm;
	}
	public String getCom_email() {
		return com_email;
	}
	public void setCom_email(String com_email) {
		this.com_email = com_email;
	}
	public String getCom_ph() {
		return com_ph;
	}
	public void setCom_ph(String com_ph) {
		this.com_ph = com_ph;
	}
	public String getCom_addr() {
		return com_addr;
	}
	public void setCom_addr(String com_addr) {
		this.com_addr = com_addr;
	}
	public String getCom_no() {
		return com_no;
	}
	public void setCom_no(String com_no) {
		this.com_no = com_no;
	}
	public int getCom_empcnt() {
		return com_empcnt;
	}
	public void setCom_empcnt(int com_empcnt) {
		this.com_empcnt = com_empcnt;
	}
	public String getCom_form() {
		return com_form;
	}
	public void setCom_form(String com_form) {
		this.com_form = com_form;
	}
	public String getCom_spec() {
		return com_spec;
	}
	public void setCom_spec(String com_spec) {
		this.com_spec = com_spec;
	}
	public String getCom_boss_nm() {
		return com_boss_nm;
	}
	public void setCom_boss_nm(String com_boss_nm) {
		this.com_boss_nm = com_boss_nm;
	}
	public Date getCom_date() {
		return com_date;
	}
	public void setCom_date(Date com_date) {
		this.com_date = com_date;
	}
	public int getCom_income() {
		return com_income;
	}
	public void setCom_income(int com_income) {
		this.com_income = com_income;
	}
	public String getCom_info() {
		return com_info;
	}
	public void setCom_info(String com_info) {
		this.com_info = com_info;
	}
	public int getCom_report_cnt() {
		return com_report_cnt;
	}
	public void setCom_report_cnt(int com_report_cnt) {
		this.com_report_cnt = com_report_cnt;
	}
	public int getCom_act() {
		return com_act;
	}
	public void setCom_act(int com_act) {
		this.com_act = com_act;
	}
	public String getCom_logo_nm() {
		return com_logo_nm;
	}
	public void setCom_logo_nm(String com_logo_nm) {
		this.com_logo_nm = com_logo_nm;
	}
	public String getCom_logo_path() {
		return com_logo_path;
	}
	public void setCom_logo_path(String com_logo_path) {
		this.com_logo_path = com_logo_path;
	}
	@Override
	public String toString() {
		return "ItJobComVo [com_num=" + com_num + ", com_id=" + com_id + ", com_pass=" + com_pass + ", com_nm=" + com_nm
				+ ", com_email=" + com_email + ", com_ph=" + com_ph + ", com_addr=" + com_addr + ", com_no=" + com_no
				+ ", com_empcnt=" + com_empcnt + ", com_form=" + com_form + ", com_spec=" + com_spec + ", com_boss_nm="
				+ com_boss_nm + ", com_date=" + com_date + ", com_income=" + com_income + ", com_info=" + com_info
				+ ", com_report_cnt=" + com_report_cnt + ", com_act=" + com_act + ", com_logo_nm=" + com_logo_nm
				+ ", com_logo_path=" + com_logo_path + "]";
	}
	
	
}

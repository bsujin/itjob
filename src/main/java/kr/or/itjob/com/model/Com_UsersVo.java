package kr.or.itjob.com.model;

import java.util.Date;

public class Com_UsersVo {

	private String com_id; //기업아이디
	private String pass; //비밀번호
	private String com_nm; //기업 이름
	private String com_email; //이메일
	private String com_ph;  // 전화번호
	private String com_addr; // 주소
	private String com_num; //사업자 등록번호
	private int com_empcnt;	//사원수
	private String com_form; // 기업형태
	private String com_spec; // 업종
	private String com_boss_nm; // 대표자명
	private Date com_date; // 설립일
	private int com_income; // 매출액
	private String com_info; // 기업정보
	private String com_logo_nm; //회사로고파일이름
	private String com_logo_path; //회사로고파일주소
	
	public Com_UsersVo() {}

	public Com_UsersVo(String com_id, String pass, String com_nm, String com_email, String com_ph, String com_addr,
			String com_num, int com_empcnt, String com_form, String com_spec, String com_boss_nm, Date com_date,
			int com_income, String com_info, String com_logo_nm, String com_logo_path) {
		super();
		this.com_id = com_id;
		this.pass = pass;
		this.com_nm = com_nm;
		this.com_email = com_email;
		this.com_ph = com_ph;
		this.com_addr = com_addr;
		this.com_num = com_num;
		this.com_empcnt = com_empcnt;
		this.com_form = com_form;
		this.com_spec = com_spec;
		this.com_boss_nm = com_boss_nm;
		this.com_date = com_date;
		this.com_income = com_income;
		this.com_info = com_info;
		this.com_logo_nm = com_logo_nm;
		this.com_logo_path = com_logo_path;
	}

	@Override
	public String toString() {
		return "ComVo [com_id=" + com_id + ", pass=" + pass + ", com_nm=" + com_nm + ", com_email=" + com_email
				+ ", com_ph=" + com_ph + ", com_addr=" + com_addr + ", com_num=" + com_num + ", com_empcnt="
				+ com_empcnt + ", com_form=" + com_form + ", com_spec=" + com_spec + ", com_boss_nm=" + com_boss_nm
				+ ", com_date=" + com_date + ", com_income=" + com_income + ", com_info=" + com_info + ", com_logo_nm="
				+ com_logo_nm + ", com_logo_path=" + com_logo_path + "]";
	}

	public String getCom_id() {
		return com_id;
	}

	public void setCom_id(String com_id) {
		this.com_id = com_id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
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

	public String getCom_num() {
		return com_num;
	}

	public void setCom_num(String com_num) {
		this.com_num = com_num;
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
	
	
}

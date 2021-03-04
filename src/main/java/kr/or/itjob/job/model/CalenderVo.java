package kr.or.itjob.job.model;

import java.util.Date;

public class CalenderVo {

	private int cal_num; // 번호
	private Date cal_str; // 시작 일자
	private Date cal_end; // 종료 일자
	private String cal_cont; // 내용
	private String com_id; // 기업아이디
	private String users_id; // 회원아이디
	
	public CalenderVo() {}

	public CalenderVo(int cal_num, Date cal_str, Date cal_end, String cal_cont, String com_id, String users_id) {
		this.cal_num = cal_num;
		this.cal_str = cal_str;
		this.cal_end = cal_end;
		this.cal_cont = cal_cont;
		this.com_id = com_id;
		this.users_id = users_id;
	}

	@Override
	public String toString() {
		return "CalenderVo [cal_num=" + cal_num + ", cal_str=" + cal_str + ", cal_end=" + cal_end + ", cal_cont="
				+ cal_cont + ", com_id=" + com_id + ", users_id=" + users_id + "]";
	}

	public int getCal_num() {
		return cal_num;
	}

	public void setCal_num(int cal_num) {
		this.cal_num = cal_num;
	}

	public Date getCal_str() {
		return cal_str;
	}

	public void setCal_str(Date cal_str) {
		this.cal_str = cal_str;
	}

	public Date getCal_end() {
		return cal_end;
	}

	public void setCal_end(Date cal_end) {
		this.cal_end = cal_end;
	}

	public String getCal_cont() {
		return cal_cont;
	}

	public void setCal_cont(String cal_cont) {
		this.cal_cont = cal_cont;
	}

	public String getCom_id() {
		return com_id;
	}

	public void setCom_id(String com_id) {
		this.com_id = com_id;
	}

	public String getUsers_id() {
		return users_id;
	}

	public void setUsers_id(String users_id) {
		this.users_id = users_id;
	}

}

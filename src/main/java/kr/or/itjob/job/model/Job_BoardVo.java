package kr.or.itjob.job.model;

import java.util.Date;

public class Job_BoardVo {

	private String com_id; // 기업아이디
	private String job_title; // 제목
	private String job_task; // 직무
	private String job_type; // 고용형태
	private String job_career; // 경력
	private String job_cont; // 내용
	private String job_loc; // 위치
	private Date job_date; // 기간
	private int job_cate_num; // 카테고리번호

	public Job_BoardVo() {}

	public Job_BoardVo(String com_id, String job_title, String job_task, String job_type, String job_career, String job_cont,
			String job_loc, Date job_date, int job_cate_num) {
		this.com_id = com_id;
		this.job_title = job_title;
		this.job_task = job_task;
		this.job_type = job_type;
		this.job_career = job_career;
		this.job_cont = job_cont;
		this.job_loc = job_loc;
		this.job_date = job_date;
		this.job_cate_num = job_cate_num;
	}

	public String getCom_id() {
		return com_id;
	}

	public void setCom_id(String com_id) {
		this.com_id = com_id;
	}

	public String getJob_title() {
		return job_title;
	}

	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}

	public String getJob_task() {
		return job_task;
	}

	public void setJob_task(String job_task) {
		this.job_task = job_task;
	}

	public String getJob_type() {
		return job_type;
	}

	public void setJob_type(String job_type) {
		this.job_type = job_type;
	}

	public String getJob_career() {
		return job_career;
	}

	public void setJob_career(String job_career) {
		this.job_career = job_career;
	}

	public String getJob_cont() {
		return job_cont;
	}

	public void setJob_cont(String job_cont) {
		this.job_cont = job_cont;
	}

	public String getJob_loc() {
		return job_loc;
	}

	public void setJob_loc(String job_loc) {
		this.job_loc = job_loc;
	}

	public Date getJob_date() {
		return job_date;
	}

	public void setJob_date(Date job_date) {
		this.job_date = job_date;
	}

	public int getJob_cate_num() {
		return job_cate_num;
	}

	public void setJob_cate_num(int job_cate_num) {
		this.job_cate_num = job_cate_num;
	}

	@Override
	public String toString() {
		return "JobVo [com_id=" + com_id + ", job_title=" + job_title + ", job_task=" + job_task + ", job_type="
				+ job_type + ", job_career=" + job_career + ", job_cont=" + job_cont + ", job_loc=" + job_loc
				+ ", job_date=" + job_date + ", job_cate_num=" + job_cate_num + "]";
	}

}

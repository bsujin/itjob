package kr.or.itjob.model;

// 직업 카테고리
public class JobCateVo {
	private int job_cate_num; // 번호
	private String job_cate_nm; // 카테고리 명
	private String job_cate_act; // 활성화

	public JobCateVo() {}

	public JobCateVo(int job_cate_num, String job_cate_nm, String job_cate_act) {
		this.job_cate_num = job_cate_num;
		this.job_cate_nm = job_cate_nm;
		this.job_cate_act = job_cate_act;
	}

	@Override
	public String toString() {
		return "JobCateVo [job_cate_num=" + job_cate_num + ", job_cate_nm=" + job_cate_nm + ", job_cate_act="
				+ job_cate_act + "]";
	}

	public int getJob_cate_num() {
		return job_cate_num;
	}

	public void setJob_cate_num(int job_cate_num) {
		this.job_cate_num = job_cate_num;
	}

	public String getJob_cate_nm() {
		return job_cate_nm;
	}

	public void setJob_cate_nm(String job_cate_nm) {
		this.job_cate_nm = job_cate_nm;
	}

	public String getJob_cate_act() {
		return job_cate_act;
	}

	public void setJob_cate_act(String job_cate_act) {
		this.job_cate_act = job_cate_act;
	}

}

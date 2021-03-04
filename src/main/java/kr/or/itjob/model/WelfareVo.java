package kr.or.itjob.model;

// 복지
public class WelfareVo {
	private int wel_num; // 번호
	private String wel_title; // 제목
	private String wel_cont; // 내용
	private int wel_act; // 활성화
	private String com_id; // 기업아이디

	public WelfareVo() { }

	public WelfareVo(int wel_num, String wel_title, String wel_cont, int wel_act, String com_id) {
		this.wel_num = wel_num;
		this.wel_title = wel_title;
		this.wel_cont = wel_cont;
		this.wel_act = wel_act;
		this.com_id = com_id;
	}

	@Override
	public String toString() {
		return "WelfareVo [wel_num=" + wel_num + ", wel_title=" + wel_title + ", wel_cont=" + wel_cont + ", wel_act="
				+ wel_act + ", com_id=" + com_id + "]";
	}

	public int getWel_num() {
		return wel_num;
	}

	public void setWel_num(int wel_num) {
		this.wel_num = wel_num;
	}

	public String getWel_title() {
		return wel_title;
	}

	public void setWel_title(String wel_title) {
		this.wel_title = wel_title;
	}

	public String getWel_cont() {
		return wel_cont;
	}

	public void setWel_cont(String wel_cont) {
		this.wel_cont = wel_cont;
	}

	public int getWel_act() {
		return wel_act;
	}

	public void setWel_act(int wel_act) {
		this.wel_act = wel_act;
	}

	public String getCom_id() {
		return com_id;
	}

	public void setCom_id(String com_id) {
		this.com_id = com_id;
	}

}

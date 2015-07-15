package com.fruntime.weneed.domin;

/**
 * 发布需求的界面的工作 bean
 * 
 * @author 温坤哲
 * @date 2015-7-13
 */
public class WorkInfo {

	private int _id;
	private String subject;
	private String date;
	private String detail;
	private String address;

	public WorkInfo() {
		super();
	}

	public WorkInfo(String subject, String date, String detail, String address) {
		super();
		this.subject = subject;
		this.date = date;
		this.detail = detail;
		this.address = address;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Work [_id=" + _id + ", subject=" + subject + ", date=" + date
				+ ", detail=" + detail + ", address=" + address + "]";
	}

}

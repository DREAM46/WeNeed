package com.fruntime.weneed.domin;

public class PersonInfo {

	private String firstName;
	private String secondName;
	/**
	 * 性别,1表示男，0表示女
	 */
	private int sex;
	// 暂时写死数据距离，往后改成根据地址从百度地图获取数据
	private String distance;
	private String experince;
	private String detail;

	public PersonInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonInfo(String firstName, String secondName, int sex,
			String distance, String experince, String detail) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
		this.sex = sex;
		this.distance = distance;
		this.experince = experince;
		this.detail = detail;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public String getExperince() {
		return experince;
	}

	public void setExperince(String experince) {
		this.experince = experince;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

}

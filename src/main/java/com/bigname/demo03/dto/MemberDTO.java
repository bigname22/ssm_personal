package com.bigname.demo03.dto;

public class MemberDTO {

	public static int CODE_SUCCESS = 999;
	public static int CODE_ERROR_NAME = 1000;
	public static int CODE_ERROR_PASS = 1001;

	public static String MSG_ERROR_NAME = "暂无该账户";
	public static String MSG_ERROR_PASS = "密码错误";

	private int id;
	private String name;
	private String password;
	public MemberDTO(){}
	public MemberDTO(int id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", password=" + password
				+ "]";
	}

}

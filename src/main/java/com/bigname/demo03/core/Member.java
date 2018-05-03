package com.bigname.demo03.core;

public class Member {
	private int id;
	private String name;
	private String password;
	private String role;
	private String course;
	private String content;

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Member(String name, String password, String role, String course, String content) {

		this.name = name;
		this.password = password;
		this.role = role;
		this.course = course;
		this.content = content;
	}

	public Member(int id, String name, String password, String role, String course, String content) {

		this.id = id;
		this.name = name;
		this.password = password;
		this.role = role;
		this.course = course;
		this.content = content;
	}

	public Member(){}
	public Member (String name ,String password) {
		this.name = name;
		this.password = password;
	}
	public Member (String name,String password, String role) {
		this.name = name;
		this.password = password;
		this.role = role;
	}

	public Member(int id, String name, String password) {
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Member{" +
				"id=" + id +
				", name='" + name + '\'' +
				", password='" + password + '\'' +
				", role='" + role + '\'' +
				'}';
	}
}

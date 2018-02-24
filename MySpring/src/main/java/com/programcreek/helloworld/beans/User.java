package com.programcreek.helloworld.beans;

//用户类
public class User {

	//用户名
	private String username;
	//毕业学校
	private String university;
	
	//无参数构造方法
	public User() {
		this.username = null;
		this.university = null;
	}
	//有参构造方法
    public User(String username,String university){
    	this.username = username;
    	this.university =university;
    }
    public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
}

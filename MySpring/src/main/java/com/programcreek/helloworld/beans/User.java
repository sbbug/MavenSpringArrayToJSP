package com.programcreek.helloworld.beans;

//�û���
public class User {

	//�û���
	private String username;
	//��ҵѧУ
	private String university;
	
	//�޲������췽��
	public User() {
		this.username = null;
		this.university = null;
	}
	//�вι��췽��
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

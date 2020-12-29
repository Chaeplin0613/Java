package com.my.vo; //value object 값객체(고객 값이 들어갈 객체)

public class Customer {
//	String id; //동일 패키지에서 누구나 접근 가능
	private String id; //누구나 접근 못함
	private String pwd;
	private String name;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String id, String pwd) {
		super();
		this.id = id;
		this.pwd = pwd;
	}


	public Customer(String id, String pwd, String name){
		this.id = id;
		this.pwd = pwd;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
//	public String getId() {
//		return id;
//	}
	
}

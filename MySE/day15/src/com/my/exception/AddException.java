package com.my.exception;

public class AddException extends Exception {

	public AddException() {
		super(); //부모생성자(Exception)을 호출하라는 뜻 
	}

	public AddException(String msg) {
		super(msg);
	}
	
}

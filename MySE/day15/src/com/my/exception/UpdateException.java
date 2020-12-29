package com.my.exception;

public class UpdateException extends Exception {

	public UpdateException() {
		super(); //부모생성자(Exception)을 호출하라는 뜻 
	}

	public UpdateException(String msg) {
		super(msg);
	}
	
}

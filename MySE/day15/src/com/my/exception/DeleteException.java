package com.my.exception;

public class DeleteException extends Exception {

	public DeleteException() {
		super(); //부모생성자(Exception)을 호출하라는 뜻 
	}

	public DeleteException(String msg) {
		super(msg);
	}
	
}

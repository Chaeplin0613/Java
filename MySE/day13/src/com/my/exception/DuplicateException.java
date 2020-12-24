package com.my.exception;

public class DuplicateException extends AddException {

	public DuplicateException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DuplicateException(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	} //중복시 발생하는 Exception 
	//상속관계에서 생성자는 자식쪽에 상속되지 않음
	//new DuplicateException(); 매개변수 없는 생성자 호출은 가능
	//new DuplicateException("아이디중복"); 문자열을 생성자 인자로 처리할 수 없다
	
	

}

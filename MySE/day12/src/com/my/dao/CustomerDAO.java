package com.my.dao; //Data Access Object 데이터를 처리(추가,수정,조회,삭제) 할 객체의 약자 

import com.my.vo.Customer;

public interface CustomerDAO { //인터페이스 설계, 인터페이스는 무조건 모두 추상메소드 
	//인터페이스으 ㅣ모든 메서드는 public abstract가 생략된거
	
	/**
	 * 저장소에 고객정보를 저장한다
	 * @param c 고객객체 
	 */
	void insert(Customer c); //인터페이스가 갖는 메소드는 모두 추상메소드이기 때문에 중괄호 {} 열고닫고는 생략한다
	
	/**
	 * 저장소의 모든 고객을 반환한다 
	 * @return 저장소의 모든 고객. 고객이 한명도 없으면 null을 반환한다 
	 */
	abstract Customer[] selectAll();
	
	/**
	 * 저장소의 아이디에 해당고객을 반환한다 
	 * @param id 아이디 
	 * @return 반환되는 값은 고객객체. 아이디에 해당고객이 없으면 null을 반환한다 
	 */
	public abstract Customer selectById(String id);
	Customer update(Customer c);
	Customer delete(String id);
	
}






















	
	
	
	

	
	
	
	
	
	
	
package com.my.dao; //Data Access Object 데이터를 처리(추가,수정,조회,삭제) 할 객체의 약자 
import java.util.List;

import com.my.exception.AddException;
import com.my.exception.DeleteException;
import com.my.exception.FindException;
import com.my.exception.UpdateException;
import com.my.vo.Customer;

public interface CustomerDAO { //인터페이스 설계, 인터페이스는 무조건 모두 추상메소드 
	//인터페이스의 모든 메서드는 public abstract가 생략된거
	
	/**
	 * 저장소에 고객정보를 저장한다 
	 * @param c 고객객체 
	 * @throws AddException 아이디가 이미 존재하는 경우 or 저장소가 꽉찬 경우 발생한다.
	 */
	void insert(Customer c) throws AddException;//인터페이스가 갖는 메소드는 모두 추상메소드이기 때문에 중괄호 {} 열고닫고는 생략한다
	
	/**
	 * 저장소의 모든 고객을 반환한다 
	 * @return 저장소의 모든 고객
	 * @throws FindException 고객이 한명도 없으면 예외가 발생한다
	 */
	abstract List<Customer> selectAll() throws FindException;
	
	/**
	 * 저장소의 아이디에 해당고객을 반환한다 
	 * @param id 아이디 
	 * @return 고객객체.  
	 * @throws FindException 아이디에 해당고객이 없으면 예외가 발생한다
	 * 
	 */
	public abstract Customer selectById(String id) throws FindException;
	public abstract Customer update(Customer c) throws UpdateException;
	public abstract Customer delete(String id) throws DeleteException;
	
}






















	
	
	
	

	
	
	
	
	
	
	
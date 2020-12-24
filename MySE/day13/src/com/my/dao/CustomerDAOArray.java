package com.my.dao;

import com.my.exception.AddException;
import com.my.exception.DuplicateException;
import com.my.exception.FindException;
import com.my.vo.Customer;
//제공자 코드 
public class CustomerDAOArray implements CustomerDAO{
	private Customer[] customers;
	private int cnt;
	public CustomerDAOArray() {
		customers = new Customer[10];
	}
	public CustomerDAOArray(int size) {
		customers = new Customer[size];
	}
	
	@Override
	public void insert(Customer c) throws AddException{
		System.out.println("CustomerDAOArray의 insert()");
//		customers[cnt] = c;
//		cnt++;
//		위의 두줄을 customers[cnt++] = c; //로 표현할 수 있지만 ++연산자와 =연산자를 동시에 쓰는 것은 좋지 않다.

		//아이디 중복확인
		try {
		Customer c1 = selectById(c.getId());
		throw new DuplicateException("이미 존재하는 아이디입니다.");
		}catch(FindException fe) {
			try{
				customers[cnt] = c;
				}catch(ArrayIndexOutOfBoundsException e) {
					throw new AddException("저장소가 꽉 찼습니다.");
				}
				cnt++;
			}
		}

		//cnt가 0이면 추가성공
		//cnt가 1이면 추가성공
		//cnt가 2이면 ArrayIndexOutOfBoundsException발생
		
		//인터페이스 모든 접근 제어자는 public이다.
	

	@Override
	public Customer[] selectAll()throws FindException {
		System.out.println("CustomerDAOArray의 selectAll()");
		if(cnt == 0) {
//			return null;
			throw new FindException("고객이 한명도 없습니다");
		}
		Customer[]all = new Customer[cnt];
		System.arraycopy(customers, 0,        all,    0,    cnt); //arraycopy는 static메소드이기때문에 클래스명.으로 사용가능 
		//(여기의, 여기부터복사해서, 여기에, 여기부터, 여기만큼) 붙여넣을거다.
		return all;
	}                 
	

	@Override
	public Customer selectById(String id) throws FindException {
		for(int i=0; i<cnt; i++) {
			Customer c = customers[i];
			String cId = c.getId();
			if(cId.equals(id)) {
				return c;
			}
		}
//		return null;
		throw new FindException("아이디에 해당하는 고객이 없습니다.");
	}

	@Override
	public Customer update(Customer c) {
		return null;
	}

	@Override
	public Customer delete(String id) {
		return null;
	} //인터페이스는 모두 추상메소드, 추상메소드는 재정의필요 

}

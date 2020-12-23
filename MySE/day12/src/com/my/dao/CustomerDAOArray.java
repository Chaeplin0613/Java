package com.my.dao;

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
	public void insert(Customer c) {
		System.out.println("CustomerDAOArray의 insert()");
		customers[cnt] = c;
		cnt++;
		//위의 두줄을 customers[cnt++] = c; 로 표현할 수 있지만 ++연산자와 =연산자를 동시에 쓰는 것은 좋지 않다.
	}

	@Override
	public Customer[] selectAll() {
		System.out.println("CustomerDAOArray의 selectAll()");
		if(cnt == 0) {
			return null;
		}
		Customer[]all = new Customer[cnt];
		System.arraycopy(customers, 0,        all,    0,    cnt); //arraycopy는 static메소드이기때문에 클래스명.으로 사용가
		//(여기의, 여기부터복사해서, 여기에, 여기부터, 여기만큼) 붙여넣을거다.
		return all;
	}                 
	

	@Override
	public Customer selectById(String id) {
		for(int i=0; i<cnt; i++) {
			Customer c = customers[i];
			String cId = c.getId();
			if(cId.equals(id)) {
				return c;
			}
		}
		return null;
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

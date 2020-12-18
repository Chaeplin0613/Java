package com.my.dao;

import com.my.vo.Customer;

public class CustomerDAO { //클래스 생성
	private Customer[] customers; //int a; 고객저장소
	private int cnt=0; //멤버필드
	public CustomerDAO(int size) { //객체생성
		customers = new Customer[size];
		// 저장소의 크기를 사용자에게 맡기기 위해
	}
	public Customer[] selectAll() { 
		//생성자는 클래스 이름과 생성자 이름이 같아야 하고 return타입이 없고
//		return null;
		// 참조형에는 null값 넣을 수 있음 
		//일반 메서드는 이름은 임의대로 짓고 리턴타입이 반드시 있어야 한다.
//		return customers; //Customer[]배열 타입으로 customers를 리턴
		
		//저장소의 고객들이 저장된 새로운 배열생성
		Customer[] cArr = new Customer[cnt];
		
		//저장소의 고객들을 새로운 배열에 복붙
//		for(int i=0; i<cArr.length; i++) {
//			cArr[i] = customers[i];
//		}
//		return cArr;
		                  //복사시작
		System.arraycopy(customers, 0, cArr, 0, cnt);
		return cArr;
		
	}
	
	public void insert	(Customer c) {
		//여기는 지역변수 자리
		this.customers[cnt] = c;
		cnt++;
	}
	public Customer selectById(String id) {
		/*
		 * 저장소의 고객ID값과 매개변수  ID값이 같은경우 
		 * 저장소의 고객객체를 반환
		 */
		for(int i=0; i<cnt; i++) {
			Customer c = customers[i];
			String cId = c.getId();
//			String cId = c.id;
			if(cId.equals(id)) {
				return c;
			}
		}
		return null;
	}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		customers = new Customer[num];  // a = new int[num]
////		int[] a = new int[3];
//		for(int i=0; i<customers.length; i++) {
//			customers[i] = new Customer();
//		}
//	}
//
//	public Customer[] selectAll() {
//		if(customers[0].getId() == null) {
//			return null;
//		}
//		return customers;
//	} //private:비공개 ,자료형은 Customer배열타입의, Customers변수 생성 
//	
//	
//	
//	
//	
//	//                  객체                변수명
//	public void insert(Customer customer) {
//		for(int i=0; i<customers.length; i++) {
//			if(customers[i].getId() == null) {
//				customers[i].setId(customer.getId());
//				customers[i].setPwd(customer.getPwd());
//				customers[i].setName(customer.getName());
//			}
//		}
//	}
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
}

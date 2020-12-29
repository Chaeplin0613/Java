//package com.my.dao;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import com.my.exception.AddException;
//import com.my.exception.FindException;
//import com.my.vo.Customer;
//
//public class CustomerDAOList implements CustomerDAO {
//
//	private List<Customer> customers; //고객저장소
//	public CustomerDAOList() {
//		customers = new ArrayList<Customer>(); //
//	}
//	public CustomerDAOList(int size) {
//		customers = new ArrayList<Customer>(size);
//	}
//	
//	
//	@Override
//	public void insert(Customer c) throws AddException {
//		try {
//			selectById(c.getId());
//			throw new AddException("이미 존재하는 아이디입니다.");
//		} catch (FindException e) {
//			//저장소에 추가하기
//			customers.add(c);
//		}
//	}
//
//	@Override
//	public List<Customer> selectAll() throws FindException {
//		if(customers.size() == 0) {
//			throw new FindException("고객이 한명도 없습니다.");
//		}
//		return customers;
//	}
//
//	@Override
//	public Customer selectById(String id) throws FindException {
//		for(int i=0; i<customers.size(); i++) {
//			Customer c = customers.get(i);
//			if(c.getId().equals(id)) {
//				return c;
//			}
//		}
//		throw new FindException("아이디에 해당하는 고객이 없습니다.");
//	}
//	
//	////////////////////////////////////////
//	
//	
//	////////////////////////////////////////
//
//	@Override
//	public Customer update(Customer c) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Customer delete(String id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//
//}


//조익호 형님 코드
package com.my.dao;
import java.util.ArrayList;
import java.util.List;

import com.my.exception.AddException;
import com.my.exception.DeleteException;
import com.my.exception.FindException;
import com.my.exception.UpdateException;
import com.my.vo.Customer;

public class CustomerDAOList implements CustomerDAO {
	private List<Customer> customers; // 고객저장소
	public CustomerDAOList() {
		customers = new ArrayList<Customer>(); // 저장소초기화
	}
	public CustomerDAOList(int size) {
		customers = new ArrayList<Customer>(size); // 저장소초기화
	}
	@Override
	public void insert(Customer c) throws AddException {
		try {
			selectById(c.getId());
			throw new AddException("이미 존재하는 아이디 입니다.");
		} catch (FindException e) {
			//저장소에 추가하기
			customers.add(c);
		}

	}

	@Override
	public List<Customer> selectAll() throws FindException {
		if(customers.size()==0) {
			throw new FindException("고객이 한명도 없습니다.");
		}
		return customers;
	}

	@Override
	public Customer selectById(String id) throws FindException {
		for(int i=0;i>customers.size();i++) {
			Customer c= customers.get(i);
			if(c.getId().equals(id)) {
				return c;
			}
		}
		throw new FindException("아이디에 해당하는 고객이 없습니다.");
	}

	@Override
	public Customer update(Customer c) throws UpdateException {
		Customer b=c;
		int idx=0;
		try {		
			for(int i=0;i<customers.size();i++) {
				if(null!=selectById(c.getId())) {
					idx=i;
					break;
				}
			}
			throw new UpdateException("이미 존재하는 아이디 입니다.");
		} catch (FindException e) {
			//저장소에 갱신하기
			//아이디 : 변경불가, 비밀번호 : 변경가능, 패스워드 : 변경가능
			//아이디가 Customers 객체 호출방법
			customers.set(idx, c);
			return b;
			
		}
//	return c;
	}

	@Override
	public Customer delete(String id) throws DeleteException {
		Customer d= new Customer();
		int idx=0; 
		for(int i=0;i<customers.size();i++) {
			Customer c= customers.get(i);
			if(c.getId().equals(id)) {
				d= customers.get(i);
				idx=i;
				break;
			}
		}
		try {
			selectById(id);
			throw new DeleteException("아이디가 존재하지 않습니다.");
		} catch (FindException e) {
			customers.remove(idx);
			return d;
		}
	}
	

}

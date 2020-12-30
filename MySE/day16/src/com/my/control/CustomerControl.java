package com.my.control;

import java.util.List;

import com.my.exception.FindException;
import com.my.service.CustomerService;
import com.my.view.CustomerView;
import com.my.vo.Customer;

public class CustomerControl {

	private CustomerService service = new CustomerService();
	private CustomerView view = new CustomerView();
	private FailView failview = new FailView();
	public void findAll() {
		try {
			List<Customer> cAll = service.findAll();
			for(int i=0; i<cAll.size(); i++) {
			Customer c = cAll.get(i);
			view.findView(c);
		}
		} catch (FindException e) {
		failview.printMessage(e.getMessage());
		}
	}
}

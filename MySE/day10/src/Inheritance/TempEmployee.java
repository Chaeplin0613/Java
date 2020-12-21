package Inheritance;

public class TempEmployee extends Employee {
	private int time;

	public TempEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TempEmployee(String no, String name,int time, int salary) {
		super(no, name, salary);
		this.time = time;
	}

	public TempEmployee(String no, String name) {
		super(no, name);
		// TODO Auto-generated constructor stub
	}

	public TempEmployee(String no) {
		super(no);
		// TODO Auto-generated constructor stub
	}

	

}

	

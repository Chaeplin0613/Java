package Inheritance;

public class Employee extends Person{ //제공자측 코드, 상 
	
	private String no;
	
	private int salary; //멤버필드 완성
	
	
	public Employee() { //생성자, 비우는 이유: 사용자가 능동적으로 사용할 수 있도록 하기위함
	}
	
	public Employee(String no) {
		this.no = no;
	}

	public Employee(String no, String name) { //생성자, 비우는 이유: 사용자가 능동적으로 사용할 수 있도록 하기위함
		setName(name);
		this.no = no;
	}
	
	public Employee(String no, String name, int salary) {
		this.no = no;
		setName(name);
		this.salary = salary;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void calcSalary() {
		System.out.println("계산된 연봉은 "+salary*12+"입니다.");
	}
	
	
	

}

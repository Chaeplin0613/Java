package Inheritance;

public class EmployeeTest {
	public static void main(String[] args) {
		int cnt = 0;
		Employee[] employees = new Employee[100];
		employees[cnt++] = new Employee("001", "오문정", 1000);
		employees[cnt++] = new Employee("002", "홍길동", 800);
		employees[cnt++] = new TempEmployee("003", "비정규1", 100, 1000);
		employees[cnt++] = new TempEmployee("004", "비정규2", 50, 800);
		
		for(int i=0; i<cnt; i++) {
			Employee e = employees[i];
			String no = e.getNo();
			String name = e.getName();
			int salary = e.getSalary();	
			System.out.print("사번("+ no + ")" + name +"사원의 기본급은" + salary+",");
			employees[i].calcSalary();	
		}
	}
}
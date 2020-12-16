class Employee{ //제공자
	//001 00년에 입사한 사원
	//011 01년에 입사한 사원
	String no; //0부터 시작할 경우 문자 또는 문자열 타입으로 선언해야 한다.번호
	String name; //사원이름
	int salary; //급여
	
	Employee() { //매개변수 없는 생성자 //디폴트 생성자
		
	}
	
	Employee(String no, String name, int salary){ //생성자 생성, 클래스 이름과 같게, return타입 없이(void같은)
		this.no = no;
		this.name = name;
		this.salary = salary;
	} //이처럼 생성자를 만들면 사용자측에서 편리하기 때문에 가능한 생성자를 제공해주는 것이 좋다
}














class Rectangle{
	
	int row;
	int col;
	double display;
	
	Rectangle(int row, int col){
		this.row = row;
		this.col = col;
	}
	
	void calcArea(){
		int num1=row;
		int num2=col;
		display = (num1*num2);
	}
	
	void display() {
		System.out.println("가로"+row+", 세로"+col+"인 사각형의 면적은"+(double)(display)+"입니다.");
	}
}


public class ConstructorTest { //사용자
	public static void main(String[] args) {
//		Employee e1;
//		e1 = new Employee(); //매개변수 없는 디폴트 생성자Employee()는 생성자가 아예 없을 때 만들어짐
//		e1.no = "001"; e1.name="채플린"; e1.salary=100;
		Employee e1 = new Employee("001", "오문정", 100);
		
		Employee e2 = new Employee();
		e2.no = "002"; e2.name="홍길동"; e2.salary=200;
		
		Employee e3 = new Employee();
		e3.no = "003"; e3.name="나자바"; 
		
		Rectangle r1 = new Rectangle(3,4); //가로3, 세로4길이 사각형객체
		r1.calcArea(); //사각형의 면적을 계산한다
		r1.display(); //"가로3, 세로4인 사각형의 면적은 12.0입니다"가 출력된다.

	}

}


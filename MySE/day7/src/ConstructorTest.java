class Employee{ //제공자 //001 00년에 입사한 사원//011 01년에 입사한 사원
	String no; //0부터 시작할 경우 문자 또는 문자열 타입으로 선언해야 한다.번호
	String name; //사원이름
	int salary; //급여
	
	Employee() {} //매개변수 없는 생성자 //디폴트 생성자
	Employee(String no, String name){
//		this.no = no;
//		this.name = name;
		this(no, name, 0); //2개짜리 데이터(적은순)에서 -> 3개짜리 데이터로(많은순) //this생성자는 첫머리에 위치해야함
		System.out.println("...");
	}
	Employee(String no, String name, int salary){ //생성자 생성, 클래스 이름과 같게, return타입 없이(void같은)
		this.no = no;
		this.name = name;
		this.salary = salary;
	} //이처럼 생성자를 만들면 사용자측에서 편리하기 때문에 가능한 생성자를 제공해주는 것이 좋다
}

public class ConstructorTest { //사용자
	public static void main(String[] args) {
		Employee[] employees; //Employee라는 참조자료형 배열타입의 employees
		employees = new Employee[10]; //배열 0~9번 각 방은 null값으로 자동초기화
		
//		Employee e1;
//		e1 = new Employee(); //매개변수 없는 디폴트 생성자Employee()는 생성자가 아예 없을 때 만들어짐
//		e1.no = "001"; e1.name="채플린"; e1.salary=100;
		Employee e1 = new Employee("001", "채플린", 500); //생성자
		employees[0] = e1;
		
//		Employee e2 = new Employee();
//		e2.no = "002"; e2.name="홍길동"; e2.salary=200;
		Employee e2 = new Employee("002","홍길동",200);
		employees[1] = e2;
		
//		Employee e3 = new Employee();
//		e3.no = "003"; e3.name="나자바"; 
		Employee e3 = new Employee("011","나자바");
		employees[2] = e3;
		
		int totalSalary = 0;
//		for(int i=0; i<employees.length; i++) {
		for(int i=0; i<3; i++) {
			totalSalary += employees[i].salary; //비어있는 방값을 참조할 경우 nullPointException오류발생
			 								   //.연산자 앞에 있는 애가 null값인지 확인
		}
		System.out.println("총급여: "+totalSalary);
//		int totalSalary = e1.salary + e2.salary +e3.salary;
//		System.out.println("총급여: "+totalSalary);
		
		Rectangle r1 = new Rectangle(3,4); //가로3, 세로4길이 사각형객체
		r1.calcArea(); //사각형의 면적을 계산한다 //전달된 인자가 없는 메소드
		r1.display(); //"가로3, 세로4인 사각형의 면적은 12.0입니다"가 출력된다.

		Rectangle r2 = new Rectangle(5); //가로5, 세로5인 사각형 객체
		r2.calcArea();
		r2.display();
		
	}
}

//Q. this생성자가 똑같은 유형이 2개 이상이라면?

//묵시적 초기화 : 자동 초기화 멤버필드
class Rectangle{
	int width; //int타입 멤버필드 width는 객체생성시 자동초기화
	int height;
	double display;
	double area; //강사님
	
	Rectangle(int size){ //생성자는 void 타입등이 없어야 한다. 5*5
//		this.width = size; //객체의 멤버필드에 대입하는 생성자를 통한 초기화를 명시적 초기화라 한다.
//		this.height = size;
		this(size, size); //괄호열고의 뜻, this생성자 호출은 생성자 중에서 다른  또 다른 생성자를 호출하라를 명령어
	}
	Rectangle(int width, int height){ //매개변수 width, height 3*4
		this.width = width;
		this.height = height;
	}
	
//	void calcArea(){ //매개변수 () 없음
//		int num1=width;
//		int num2=height;
//		display = (num1*num2);
//	}
	
	void calcArea() { //강사님
		area = this.width*height;
	}
	void display() {
		System.out.println("가로"+width+", 세로"+height+"인 사각형의 면적은"+(double)(area)+"입니다.");
	}
	
	

	
}


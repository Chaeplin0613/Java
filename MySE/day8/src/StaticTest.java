class A{
//	int mf; //객체생성시 자동초기화, HEAP
//	static int smf; //클래스 로드시 자동초기화, CLASS AREA, 가장 먼저 생겨서 가장 오래 살아있는다
//	void method1() {
//		System.out.println("method1()입니다");
//		System.out.println(mf); //mf 앞에는this. 이 생략된 것과 같다. 객체 메소드 안에서는 this를 이용하여 멤버필드를 사용
//		method2(); //가능하다. 앞에this가 생략된 것과 같다.
//		
//		System.out.println(smf); //non-static메소드에서는 객체 생성없이 쓸수있는 static 필드 사용가능
//		smethod2(); //non-static메소드에서는 객체 생성없이 쓸수있는 static 메소드 사용가능
//	}
//	void method2() {
//	}
//	static void smethod1() {
//		System.out.println("smethod1()입니다.");
////		System.out.println(this.mf); //this도 사용 못하고 
////		method2(); // this생략된 non-static메소드 사용도 불가
//		System.out.println(smf); //같은 클래스 안에있는 static method에서는 static필드(smf)만 사용가능
//		smethod2(); //같은 클래스 안에 있는 static method만 사용가능
//		//객체 생성 안하고 A.smethod1()도 쓸수 있고 객체생성 안하고 a1.smethod1()도 쓸수 있따.
//		A.smethod2(); //클래스명.static method도 사용가능(같은 클래스 안에서)
//
//	}
//	static void smethod2() {
//	}
//	//메인(메소드 외부)에서는 non-static변수는 객체 a1을 먼저 만들고 a1.필드명으로 사용할 수 있고 
//	// 내부(메소드 내부==이미 객체가 생성된 상태를 뜻함)에서는 바로 필드명 mf 혹은 이 메소드를 가리키는 this.mf를 통해 사용할 수 있다.
}
public class StaticTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(A.smf); //static필드는 클래스 이름으로 바로 사용이 가능하다. 왜냐하면 이미 초기화 돼있고 메모리도 확보가 돼있기 때문
//		
//		A a1 = new A(); //a1 객체 안에는 non-static 필드인 mf 필만 들어있고 이때 mf값이 초기화 된다. non-static메소드인 method1과 2가 들어있다. 
//		               //객체 안에는 static필드, 메소드는 없다
//		System.out.println(a1.mf); //non-static 권장밥법 참조변수명.필드명 //객체 밖에서는 참조변수를 통해 멤버필드를 사용
//		System.out.println(a1.smf); //객체 안에는 static은 업지만 A클래스의 내용을 찾아가서 smf를 출력하게 된다. 
//									//static은 클래스이름.필드명으로 선호하고 참조변수명.필드명은 선호하지 않는다 
//		a1.mf++;
//		a1.smf++;
//		
//		A a2 = new A();
//		System.out.println(a2.mf); //0
//		System.out.println(a2.smf); //자바에서 static필드를 선언하면 객체간의 같이 공유변수가 된다.
//		
//		System.out.println(A.smf); //static권장밥법 클래스명.필드명
//		
////		A.method1(); //클래스이름으로 non-static 안된다. 
//		a1.method1(); //객체이름으로 해야된다.
//		a2.method1(); //a1과 a2가 가리키는this는 각각 다르다
//		A.smethod1(); //클래스 이름으로 static 된다.
		
		double radius = 5.2;
		double area = Math.pow(radius, 2)* Math.PI; //Math.pow(값, 제곱할 수)
		
		//직각삼각형 빗변길이계산
		double width = 3.0;
		double height = 4.0;
		double hypo; //빗변 hypo^2 = width^2 + height^2
		hypo = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
		System.out.println(hypo);
		
		//변수 앞에 final이 붙으면 상수처럼 쓸 수 있다. (값 변경 불가)
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

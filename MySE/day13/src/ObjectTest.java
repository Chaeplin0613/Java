class B{
	String sub;
	B(String sub){
		this.sub = sub;
	}
	public String toString() {
		return "B의 subject은 java입니다";
	}
}

class A{ //class A extends Object 로 컴파일할 때 바뀜 
	int num;
	A(int num){ //생성자 
		this.num = num;
	}
	
	public String toString()
	{
		return "A의 num은 "+num+"입니다";
	}

	@Override
	public boolean equals(Object obj) {
		//현재 객체의 num값과 
		//매개변수로 전달된 객체의 num값이 같으면 true반환
		//그외에는 모두 false반환
		if(obj instanceof A) {
			A a = (A)obj;
//			if(this.num == obj.num) {
			if(this.num == a.num) {
				return true;
			}	
		}
		return false;
	}
	
}

	public class ObjectTest {
		public static void test(Object   p) {
			System.out.println(p.toString());
			System.out.println(p);
		}
	
	public static void test(Object obj1, Object obj2) {//Object클래스는 조상클래스이기 때문에 다르더라도 자동으로 upcasting이 될 수 있다. 
		System.out.println("equals test메서드: "+obj1.equals(obj2)); //==와 같은 의미, 메모리 번지수를 비교 
		
//		System.out.println("obj1객체정보는"+ obj1); //문자열 + 참조변수 = 참조변수의 toString을 호출하는 것과 같다
		//println메소드를 호출할 때 참조변수의 toString 메소드가 자동으로 호출된다
	}
	//test(a1, a2);
	
	public static void main(String[] args) {
		A a1,a2;
		a1 = new A(10); //num값이 10으로 초기화된 객체를 만듬 
		a2 = new A(10); //num값이 10으로 초기화된 객체를 만듬 
//		System.out.println(a1.toString()); //Object클래스의 toString이 상속됨. 
											//A클래스의 toString이 재정의됨. 출력결과 A의 num은 10입니다.
		test(a1,a2); //true
		
		
		test(a1);
		
		B b1,b2;
		b1 = new B("java");
//		System.out.println(b1.toString()); //B클래스의 toString이 재정의됨. "B의 subject은 java입니다"
		test(b1);
		
		b2 = new B("c++");
//		System.out.println(b2.toString()); //"B의 subject은 c++입니다"
		test(b2);
		test(b1, b2);  //false 출력
		B b3;
		b3 = b2;
		test(b2, b3); //true
						//1. A타입, B타입 매개변수를 갖고 메소드를 각각 만들거나
					   //2. 둘다 한번에 하려면 Object타입의 메소드를 만든다.
		
		
		test(a1);
		test(a1);
		test(a1);
		test(a1);
		test(a1);
		test(a1);
		
		System.out.println(a1.equals(a2)); //Object클래스의 equals가 상속됨. ==와 같은 효과, false가 나옴

		test(a1,b1); //false
		
		
		Object o1,o2;
		o1 = new Object(); //o1 객체 생성 
		o2 = new Object(); //o2 객체 생성 
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
//		System.out.println(o1.toString());
		test(o1);
//		System.out.println(o2.toString());
		test(o2);
		System.out.println(o1 == o2);
		System.out.println(o1.equals(o2));
		
	}

}

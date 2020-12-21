package Inheritance;
class Parent{
	int mf = 10;
	int mf1 = 20;
}
class Child extends Parent{
	String mf = "child"; //부모,자식 멤버변수는 다르게 줘야 한다 
	String mf2 = "child2";
	void cm() {
		System.out.println(this.mf); //this는 현재 사용주인 객체, 즉 자식 자신이고 생략가능 //child 
		System.out.println(super.mf); //현재 객체(child)의 부모를 super로 표현, 생략불가 //10
		System.out.println(mf1); //20
	}
}
public class VariableTest {

	public static void main(String[] args) {

		Parent p = new Parent();
		System.out.println(p.mf);
		System.out.println(p.mf1);
//		System.out.println(p.mf2); //부모는 자식의 변수를 쓸 수 없다.
		Child c = new Child();
		System.out.println(c.mf); //내 것이 우선이다
		System.out.println(c.mf1);//부모 변수지만 상속됐기에 자식이 사용가능하다.
		System.out.println(c.mf2); //내 것이 우선이다
		
		c.cm(); //c(Child)메소드값 호
	}
	

}


//	타이어 클래스 설명
public class car{
	private int speed;
	private Tire t1,t2,t3,t4;
	public Car() {
		t1 = new Hankook();
		t2 = new Kumho();
		t3 = new Kumho();
		t4 = new Hnakook();
	}
}

public void setT1(Tire t) {
	this.t1 = t;
}

package Inheritance;

public class UpcastingTest {

	public static void main(String[] args) {
		Circle c = new Circle(); //Circle타입으로 객체를 생성했기 때문에 Circle타입이 유지
		c.setRadius(5.0);
		Shape s;
		s = c; //s변수에 Circle타입의 객체 생
		s.makeArea(); //Shape은 가려지고 Circle의 메소드가 호출
		c.display();
	
	}

}

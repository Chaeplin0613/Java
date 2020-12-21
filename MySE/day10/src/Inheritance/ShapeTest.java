package Inheritance;

public class ShapeTest {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.setRadius(5);
		c.makeArea();
		c.display();
		
		Rectangle r = new Rectangle(3,4);
		r.makeArea();
		r.display();
		
		Triangle t = new Triangle(2,3);
		t.makeArea();
		t.display();
		
		Shape []sArr = new Shape[3];
		sArr[0] = c; //자식타입c가 객체가 부모타입 Shape으로 업캐스팅 가능 //자식 타입을 부모타입으로 형변환 =upcasting
		sArr[1] = r; //자식타입r가 객체가 부모타입 Shape으로 업캐스팅 가능
		sArr[2] = t; //자식타입t가 객체가 부모타입 Shape으로 업캐스팅 가능
		
		
//		for(int i = 0; i<sArr.length ; i++) {
//			System.out.println(sArr[i].getArea());
//		}
//		sArr[0].makeArea(); //부모가 지원하는 메소드만 가능, makeArea는 Shape에 없 
//		sArr[0].getArea(); //
		
		//향상된 for문
		for(Shape s: sArr) {
			System.out.println(s.getArea());
		}
		
	}

}

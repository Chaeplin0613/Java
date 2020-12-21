
public class ShapeTest {

	public static void main(String[] args) {

		//Circle 클래스 
	//  클래스명 변수명 
		Circle c1 = new Circle(); //클래스 연
		c1.setRadius(5.0); //반지름 설정  
		c1.makeArea();  //면적계산  
		c1.display();  //결과값 보여주기
	
	
		//Rectangle 클래스 
		Rectangle r1 = new Rectangle(3, 4); //가로3, 세로4인 사각형 객체 만들기, 이렇게 숫자를 미리 대입하면 
											//생성자를 만들어야 한다.
		r1.makeArea(); //면적 계산한다 
		r1.display(); //결과를 출력하다 가로3.0, 세로4.0인 사각형의 면적은 12.0입니다.
		
		Triangle t1 = new Triangle(2,3); //밑변2, 높이가 3인 이등변삼각형객체를 만들기 
		t1.makeArea();
		t1.display(); //
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}

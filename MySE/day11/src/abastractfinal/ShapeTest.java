package abastractfinal;

abstract class Shape {
//	private double area; 
	protected double area; //protected는 private과 public의 중간 단
							//protected: 동일패키지 접근가능, 다른 패키지 하위클래스에서도 가능 
	public double getArea() {
		return area;
	}
	abstract public void makeArea(); //부모쪽에 메소드가 있어야 컴파일도 되고 
							  //자식 쪽에서 만들어 쓸 수 있기 때문에 하위클래스에서 재정의되기 위해 빈칸으로 만듬 
}								//하위클래스에서 재정의되기 위해서는 껍데기메소드(추상화)를 abstract로 만들고  
                    			//포함된 클래스도 abstract 로 만든다.
								//추상 클래스에서는 추상메소드가 있든 없든 상관없지만
								//추상 메소드는 반드시 추상클래스에 속해야 한다. 
class Circle extends Shape {
	private double radius;
	public void makeArea() {
		area = Math.pow(radius,  2) * Math.PI;
		//부모 private에 접근하는 방법
		//public으로 선언된 set, get선
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	
}
//형제 간에는 오버라이딩이 되지 않고, 부모자식(상위 하위)간에서만 오버라이딩이 된다. 
class Rectangle extends Shape {
	private double width, height;
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	public void makeArea() {
		area = width * height;
	}
}
//
public class ShapeTest{ //main 메소드를 갖는클래스는 반드시 public 으로 지정되어야 하고 그 클래스명은 .java파일명이어야 한다.
	public static void test(Shape s) { 
		s.makeArea();
	}
	public static void main(String[] args) {
		Shape s;
		s = new Circle(5);
		test(s);
		s = new Rectangle(3,4);
		test(s);
		
		
		
	}
	
	
	
	
	
	
}
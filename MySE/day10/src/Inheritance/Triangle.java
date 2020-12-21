package Inheritance;

public class Triangle extends Shape{
	private double base; //밑변 
	private double height; //높이 
	public Triangle() {
															//Q. 이것이 의미하는 바가 무엇인지?
	}
	
	public Triangle(double base, double height) {
		this.base = base; //또는 setBase(base); 도 가
		this.height = height;
	}
	
	public void setBase(double base) {
		if(base <= 0) {
			System.out.println("밑변은 0이상이어야 합니다.");
			return;
		}
		this.base = base;
	}
	
	public void makeArea() {
		setArea(base * height / 2);
	}
	
	public void display() {
		System.out.println("밑변 "+base+"이고 높이 "+height+"인 이등변 삼각형의 넓이는 "+getArea()+"입니다 ");
	}
}

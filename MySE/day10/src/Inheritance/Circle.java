package Inheritance;

public class Circle extends Shape{ //Shape로부터 상속받는 Circle클래스 
	private double radius; //멤버변수 반지
	
	public void makeArea() { //makeArea 메서드 
		//this.area = Math.pow(radius, 2) * Math.PI; //pow(radius의 2제곱)  *  원주율 파이 
		setArea(Math.pow(radius, 2) * Math.PI); 
	} 
	public void display() {
		System.out.println("반지름이"+radius+"인 원의 면적은"+getArea()+"입니다.");
	}
	
	public void setRadius(double radius) {
		if(radius <= 0) {
			System.out.println("반지름은 0보다 커야합니다. ");
			return;
		}
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	
	
	
	
	
}

//*
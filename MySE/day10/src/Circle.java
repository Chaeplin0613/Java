
public class Circle {
	private double radius; //멤버변수 반지
	private double area; //멤버변수 원의 면적 
	
	public void makeArea() { //makeArea 메서드 
		this.area = Math.pow(radius, 2) * Math.PI; //pow(radius의 2제곱)  *  원주율 파이 
	} 
	public void display() {
		System.out.println("반지름이"+radius+"인 원의 면적은"+area+"입니다.");
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
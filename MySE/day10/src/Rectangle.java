
public class Rectangle { //클래스 이름은 첫글자 대문자로 하세요
	private double width; //멤버변수 가로 
	private double height; //멤버변수 세로 
	private double area; //멤버변수 사각형의 면적
	
	public Rectangle(double width, double height) { 
		//이것이 생성자  new Rectangle(에 숫자가 있기 때문 만듬)
		this.width = width;
		this.height = height;
	}

	public void makeArea() { //return값이 없으니 void로 선언 
		if(width<=0 || height<=0) {
			System.out.println("0보다 커야합니다.  ");
			return; //메서드종료 
		}
		this.area = width * height;
	}
	
	public void display() {
		System.out.println("가로 " +width+" 세로 "+height+"의 면적은 "+area+"입니다 ");
	}



}

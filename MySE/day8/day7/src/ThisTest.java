/**
 * 원 객체용 클래스입니다.
 * @author 채플린
 * @version 1.0
 *
 */
class Circle{
	/**
	 * 반지름 역할을 하는 멤버필드
	 */
	double radius; //4)Circle 클래스 멤버필드에 double타입의 멤버변수 선언, 멤버필드 할당)
	
	/**
	 * 전달된 매개변수 반지름 값이 0보다 작으면 "0이상으로 입력하시오" 문구 출력
	 * @param radius 반지름 파람은 매개변수를 의미 radius는 매개변수 이름
	 */
	void setRadius(double radius) { //누군가 setRadius메소드 안에(집어넣는 숫자가 if 조건이라면 ~~)
//방법1	if(radius<0) {
//			System.out.println("0이상으로 입력하시오");
//			return;
//		} else {
//			radius = r;
//		}
		
/*방법2*/	if(radius<0) {
			System.out.println("0이상으로 입력하시오");
			return;
		} 
		this.radius /*대입될곳, 현재사용중객체의 멤버필드*/ = radius; //우측 매개변수가 우선setRadius
		}
		
	}


public class ThisTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1; // 1) 참조형 지역변수(c1)선언하고, stack영역에 할당
		c1 = new Circle(); // 2) 선언부에는 new키워드로 c1변수 객체 생성을 한다. ()가 생성자 자동호출 뜻
						   // new를 만나면 heap 메모리공간 할당
		c1.radius = 5.7; //3) 멤버필드에다 값을 대입하는 것을 의미, 
		                 //c1이 참조하고 있는 객체 안에 radius가 있어야 한다는 뜻
		//c1.radius = -1.2;
		c1.setRadius(5.7); //setRadius메소드 기능으로 5.7을 입력
//		c1.setRadius(-1.2); 
		
		Circle c2 = new Circle();
		c2.setRadius(2.3);
	}

}

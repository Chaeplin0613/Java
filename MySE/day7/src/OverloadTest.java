class Calculator{
	int plus(int a, int b) { //int타입 매개변수
		return a+b;
	}
	
	double plus(double a, double b) {
		return a+b;
	}
	    //메소드명      //매개변수명
	double plus(double a, double b, double c) { //메소드이름이 같고 매개변수가 다른 것을 오버로드라고 한다
		return a+b+c;
	}
	
	//plus 메소드 이름은 똑같이 하되 타입, 순서를 다르게 하면 다양하게 쓸 수 있다.
}

public class OverloadTest {

	public static void main(String[] args) {
		Calculator c; 
		c = new Calculator(); //객체생성 or 인스턴스화
		int result1 = c.plus(3,4); //3+4계산결과를 반환한다. //3은 a에 4는 b에 들어가서 연산 후 return으로 result1에 대입
		System.out.println(result1); //7
		
		double result2 = c.plus(3.1, 4.2);
		System.out.println(result2);
		
		double result3 = c.plus(3, 4, 5.0); //인자 3, 4, 5.0 //int타입3,4는 double타입로 자동 형변환
     	System.out.println(result3);						//3.0 과 4.0으로 바뀜 5.0은 그대로 이동
	}
}



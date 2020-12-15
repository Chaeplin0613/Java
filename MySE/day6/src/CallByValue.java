
public class CallByValue { 
	public static void test(int a) { //test메소드
		a=99; //지역변수
	}
	public static void test(int[]arr) {
		arr[0] = 99;
	}
	public static void main(String[] args) { //main메소드
		int a=1; //매개변수
		test(a); //3번 라인에 있는 첫번째 test메소드 호출, 매개변수의 메소드 자료형하고 전달되는 인자의 자료형(int)이 일치해야함
		System.out.println(a); //1? 99? => 1출력
		
		int []arr = {1,2,3}; //int 배열타입의 arr 지역변수
		test(arr);
		System.out.println(arr[0]); //1? 99? => 99출력
		
		//인자값이 그대로 복사돼서 붙여넣는 거를 콜바이밸류

	}

}

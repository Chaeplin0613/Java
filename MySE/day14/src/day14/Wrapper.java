package day14;

public class Wrapper {

	public static void main(String[] args) {

		int i = 7;
		Object obj;
		obj = i; //원래는 안 되는데 자바에서 아래 두줄의 코드를 자동적으로 바꾸는 기능을 제공함
//		Integer inte = new Integer(i); //기본형 i를 -> 참조형으로 변환시킴(박싱)
//		obj = inte; //upcasting
		
		int j;
		j = (Integer)obj; //컴파일시 아래 2줄 코드로 변환됨(오토언박싱) downcasting은 (Integer)를 써서 명식적으로 표현해줘야 가
//		Integer inte2 = (Integer)obj; //downcasting
//		j = inte2.intValue(); //참조형 inte2를 -> 기본형 int타입 j로 변환(언박싱)
		//자바 4이후부터는 오토박싱과 오토언박싱 기능을 제공

		//기본형은 .메소들 호출불가
		//기본형은 직접 값을 갖고 있는데 .메소드는 다른 메모리를 참조하겠다는 뜻이라 안 됨
		Integer inte = new Integer(i);
		inte.toString();
		System.out.println(Integer.MAX_VALUE); //MAX_VALUE상수는 해당 타입이 표현할 수 있는 최대값 구하는 기능

		Object[] arr = new Object[10];
		arr[0] = new Object();
		arr[1] = new String("hello");
		arr[2] = new StringBuffer("hello");
		arr[3] = 10; //오토박싱 됨, 컴파일시 arr[3] = new Integer(10);
		arr[4] = true; //오토박싱 됨, 컴파일시 arr[4] = new Boolean(true);
		
		}
	}


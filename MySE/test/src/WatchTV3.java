
public class WatchTV3 {

	public static void main(String[] args) {
		
		TV3 tv3;
		tv3 = new TV3();
//		TV3 tv3 = new TV3();
		tv3.volume = 5; // volume값 5로 세팅
		System.out.println(tv3.volume); //volume값 5출력

		tv3.volumeUp();
		System.out.println(tv3.volume); //volume값 +1해서 6 출력
		
		for(int i=0; i<10; i++) { //volumeUp +1 메소드 10회 반복
			tv3.volumeUp();
		}
		System.out.println(tv3.volume); //volume값 +10해서 16출력
		
		for(int i=0; i<10; i++) { //volumeDown -1 메소드 10회 반복
			tv3.volumeDown();
		}
		System.out.println(tv3.volume); //volume값 -10해서 6출력
		
		tv3.setChannel(11); //괄호()안에 들어간 숫자는 setChannel메소드에 의해
		         		    //channel필드의 값으로 리턴
		System.out.println(tv3.channel); //setChannel로부터 입력받은 값이
		 								 //channel값으로 출력
		
		tv3.channelUp(); // channelUp메소드를 이용해 channel값 +1
		System.out.println(tv3.channel); //channel값 +1해서 12출력
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		TV3 tv1;
//		tv1 = new TV3(); // 2) TV클래스를 갖는 객체생성
////		TV3 tv1 = new TV3();
//		tv1.volume = 5; // 4) tv1이 참조하는 클래스의 필드를 참조
//		System.out.println(tv1.volume);
//		tv1.powerOn(); // 6) 메소드 기능 실행
//		tv1.channelSet(5);
//		tv1.channelUp();
//		for(int i=0; i<10; i++) {
//			tv1.channelUp();
//		}
//		System.out.println(tv1.channel);
//		tv1.showPrice(1000);
//		System.out.println(tv1.price);
//		tv1.discount(1000);
//		System.out.println(tv1.price);
//	}
}
}

public class WatchTV {

	public static void main(String[] args) {
//		TV tv1;
//		tv1 = new TV(); // 2) TV클래스를 갖는 객체생성
//		tv1.volume = 5; // 4) tv1이 참조하는 클래스의 필드를 참조
//		
//		tv1.powerOn(); // 6) 메소드 기능 실행
//		
//		tv1.channelSet(5);
//		tv1.channelUp();
//		System.out.println(tv1.channel);
		
//		// TODO Auto-generated method stub
		TV tv1; //tv1의 지역변수는 TV클래스 참조형, 선언만
		tv1 = new TV(); //new키워드로 TV객체생성할 때 TV클래스 변수 자동초기화진행 
//		tv1.power = true;
		tv1.powerOn();
		tv1.volume = 5;
		for(int i =0; i<10; i++) {
			tv1.volumeUp();
		}
		System.out.println(tv1.volume); //6
//		tv1.channel = 11;
//		
//		
//		tv1.setChannel(11);
//		System.out.println(tv1.channel);//
//		tv1.channelUp();
//		System.out.println(tv1.channel);//
//		tv1.sum(3,4);
//		System.out.println(tv1.num);
	}

}

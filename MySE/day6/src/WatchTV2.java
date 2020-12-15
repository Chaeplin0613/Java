
public class WatchTV2 {

	public static void main(String[] args) {
		TV2 tv1;
		tv1 = new TV2(); // 2) TV클래스를 갖는 객체생성
		tv1.volume = 5; // 4) tv1이 참조하는 클래스의 필드를 참조
		System.out.println(tv1.volume);
		tv1.powerOn(); // 6) 메소드 기능 실행
		tv1.channelSet(5);
		tv1.channelUp();
		System.out.println(tv1.channel);
	}
}

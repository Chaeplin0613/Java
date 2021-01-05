import java.text.SimpleDateFormat;
import java.util.Date;

class A extends Thread{ //Thread에 상속함으로써 하위 메소드들을 사용할 수 있게 됨
	public void run() { //run 메소드 오버라이딩(재정의)
		for(int i=1; i<=100; i++) { //스레드 시작시 run 메소드 자동호출
			System.out.print("현재 스레드 이름: " + this.getName()+">>"); //this는 A가 아닌 부모인 Thread를 가리킴
			System.out.println(i); //3 또는 4, 점유 순서는 보장못함
		}
	}
}
//-----------------------------------------------------------------------------------------------------//
class B extends Thread{
	//스레드가 할일: 10번반복수행하면서 현재시간값출력한다.
	public void run() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //분은 소문자 m
		for(int i=0; i<10; i++) {
			Date today = new Date();
//			System.out.println(today);
//			System.out.println(new Date());
			System.out.println(sdf.format(new Date())); //이 작업이 시간이 소요돼서 순서를 보통 뺏김
			//1초 일시중지
			long millis = 1000; // 밀리세컨 = 1000분의 1초 즉 1000이면 1초
			try {
				Thread.sleep(1000 /*또는 millis*/);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} 
	}
}
//-----------------------------------------------------------------------------------------------------//
public class ThredTest {
	public static void main(String[] args) {
		System.out.print("현재 스레드 이름: ");
		Thread now = Thread.currentThread(); // 현재 사용중인 스레드를 반환
		String threadName = now.getName(); //1
		System.out.println(threadName);
		
		B b = new B();
		b.start();
		
		A a = new A();
		A a1 = new A();
		
		a1.start();
		a.start(); //객체 생성후 start 메소드를 호출해야 스레드가 시작됨 //2
//		a.run(); //run 메소드를 직접호출하면 메인스레드 혼자 일하는 것임
//		a1.run();
		System.out.println("main메소드의 끝입니다."); //3 또는 4, 점유 순서는 보장못함
	}
}

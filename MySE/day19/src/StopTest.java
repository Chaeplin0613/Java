import java.util.Scanner;

class D extends Thread{
	boolean flag = true;
	public void run() {
		while(flag) {
//			System.out.println("반복");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class StopTest {
	public static void main(String[] args) {
		D d = new D();
		d.start();
//		d.stop();
		System.out.println("종료하시려면 quit을 입력하세요");
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		if(line.equals("quit")) {
			d.flag = false;
		}
		d.flag = false; //자연스럽게 종료시키려면 반복문을 제어하면 된다.
	}

}

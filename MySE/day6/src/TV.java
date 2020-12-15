
public class TV { // 1) TV클래스 생성
	
//	int volume; //3) 필드생성
//	boolean power;
//	int channel;
//	
//	
//	
//	void powerOn() { //5) 메소드 생성
//		power=true;
//	}
//	
//	void channelUp() {
//		channel++;
//	}
//	
//	void channelSet(int c) { //(
//		channel = c;
//	}
	boolean power; //전원, false값으로 자동초기화
	int volume; //볼륨, 0값으로 자동초기화
	int channel; //채널, 0값으로 자동초기화
	int num; //합계
	void powerOn() {
		power = true;
	}
	void powerOff() {
		power = false;
	}
	
	void volumeUp() {
		volume++;
	}
	
	void setChannel(int ch) {
		channel=ch;
	}
	
	void channelUp() {
		channel++;
	}
//	
//	void sum(int a, int b) {
//		num=a+b;
//	}
	
}

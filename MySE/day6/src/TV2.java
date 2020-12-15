
public class TV2 {
	int volume; //3) 필드생성
	boolean power;
	int channel;
	
	
	
	void powerOn() { //5) 메소드 생성
		power=true;
	}
	
	void channelUp() {
		channel++;
	}
	
	void channelSet(int c) { //(
		channel = c;
	}
}

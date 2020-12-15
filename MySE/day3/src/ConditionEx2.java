
public class ConditionEx2 {

	public static void main(String[] args) {
		//if에서 사용하는 조건식의 비교연산자가  == 이라면
		//switch 구문으로 사용될 수 있다.
		java.util.Calendar now;
		now = java.util.Calendar.getInstance();
		
		int year = now.get(java.util.Calendar.YEAR);
		int month = now.get(java.util.Calendar.MONTH); //0부터 출력하기 때문에 +1을 해줘야한다.
		int date = now.get(java.util.Calendar.DATE);
		System.out.println(year + "년 " + (month+1) +"월 " + date+"일");
		
		//월에 따라 4분기 형식으로 표현 
		

		if(month <3) {
			System.out.println("1분기입니다.");
		} else if(month <6) {
			System.out.println("2분기입니다.");
		} else if(month <9) {
			System.out.println("3분기입니다.");
		} else {
			System.out.println("4분기입니다.");
		}
		
		
		switch(month+1) {
		case 1:
		case 2:
		case 3:
			System.out.println("1분기입니다.");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("2분기입니다.");
			break;
		case 7:
		case 8:
		case 9:
			System.out.println("3분기입니다.");
			break;
		case 10:
		case 11:
		case 12:
			System.out.println("4분기입니다.");
			break;
		}
		
		
		int ampm = now.get(java.util.Calendar.AM_PM);
		System.out.println(ampm);
		if(ampm==0) {
			System.out.println("오전입니다.");
		} else {
			System.out.println("오후입니다.");
		}
		
		switch(ampm) {
		case 0:
			System.out.println("오전");
		break;
		default:
			System.out.println("오후");
		}
		
		//TODO 사용자로부터 출생년도 입력받기
		//int타입 birthYear 변수에 
		System.out.println("출생년도를 입력해주세요.");
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int birthYear = sc.nextInt();
		
		int mod = birthYear%12;
		
		switch(mod){
			case 0:
				System.out.println("원숭이");
				break;
			case 1:
				System.out.println("닭");
				break;
			case 2:
				System.out.println("개");
				break;
			case 3:
				System.out.println("돼지");
				break;
			case 4:
				System.out.println("쥐");
				break;
			case 5:
				System.out.println("소");
				break;
			case 6:
				System.out.println("호랑이");
				break;
			case 7:
				System.out.println("토끼");
				break;
			case 8:
				System.out.println("용");
				break;
			case 9:
				System.out.println("뱀");
				break;
			case 10:
				System.out.println("말");
				break;
			case 11:
				System.out.println("양");
				break;
		}
	    
		if(mod==0) {
			System.out.println("당신은 원숭이띠입니다.");
		}
		if((birthYear%12)==1) {
			System.out.println("당신은 닭띠입니다.");
		}
		if((birthYear%12)==2) {
			System.out.println("당신은 개띠입니다.");
		}
		if((birthYear%12)==3) {
			System.out.println("당신은 돼지띠입니다.");
		}
		if((birthYear%12)==4) {
			System.out.println("당신은 쥐띠입니다.");
		}
		if((birthYear%12)==5) {
			System.out.println("당신은 소띠입니다.");
		}
		if((birthYear%12)==6) {
			System.out.println("당신은 호랑이띠입니다.");
		}
		if((birthYear%12)==7) {
			System.out.println("당신은 토끼띠입니다.");
		}
		if((birthYear%12)==8) {
			System.out.println("당신은 용띠입니다.");
		}
		if((birthYear%12)==9) {
			System.out.println("당신은 뱀띠입니다.");
		}
		if((birthYear%12)==10) {
			System.out.println("당신은 말띠입니다.");
		}
		if((birthYear%12)==11) {
			System.out.println("당신은 양띠입니다.");
		}
//		TODO 년도에 해당 동물이름을 출력하시오
//		년도를 12로 나눈 나머지 값이 0이면 원숭이, 1이면 닭, 2이면 개, 3이면 돼지
//		4이면 쥐, 5이면 소, 6이면 호랑이, 7이면 토끼, 8이면 용, 9이면 뱀, 10이면 말, 11이면 양 
		
		//반복문
		
		
	}

}

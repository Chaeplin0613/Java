package day14;

import java.util.Calendar;
import java.util.Date;

public class DateCalendar {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		
//		Calendar c = new Calendar(); //import했는데 객체생성 안되는 이유는 abstract클래스라서 안됨
		//자식인 그레고리안 객체가 생성될때 매개변수 없는 부모 생성자가 먼저 생김
		
		Calendar c = Calendar.getInstance();
		Class clazz = c.getClass();
		System.out.println("Calendar객체의 실제 클래스 타입은: "+clazz.getName());
		
		int ampm = c.get(Calendar.AM_PM);
//		if(ampm == 0) {
		if(ampm == Calendar.AM) {
			System.out.println("오전");
		} else {
			System.out.println("오후");
		}
		
		System.out.println(c.get(Calendar.MONTH)+1+"월");
	switch(c.get(Calendar.DAY_OF_WEEK)) {
	case Calendar.SUNDAY:
		System.out.println("일요일");
		break;
	case Calendar.SATURDAY:
		System.out.println("토요일");
		break;
	default:
		System.out.println("주중");
		break;
	}
	Calendar feb = Calendar.getInstance();
//	feb.set(2020, 1,1); //set메소드로 년월일 강제 세팅, 1월 1일이 아니고 2월 1일을 의미
//	System.out.println(feb.getActualMaximum(Calendar.DAY_OF_MONTH));
	feb.set(2021, 2-1,1); //2월을 표현하고 싶으면 해당월을 입력하고 -1을 해야함
	System.out.println("마지막 날짜: "+feb.getActualMaximum(Calendar.DATE));
	
	//----------------------
	//2021년도 2월 달력
	//"일 월 화 수 목 금 토"
	//    1 2  3 4 5  6 

	System.out.println("\n2021년 2월 달력");
	System.out.print("일   월   화  수  목   금   토");

	int maxDate = feb.getActualMaximum(Calendar.DATE);
	int cnt = 0;
	switch(feb.get(Calendar.DAY_OF_WEEK)) {
	case Calendar.SATURDAY:
		cnt++;
	case Calendar.FRIDAY:
		cnt++;
	case Calendar.THURSDAY:
		cnt++;
	case Calendar.WEDNESDAY:
		cnt++;
	case Calendar.TUESDAY:
		cnt++;
	case Calendar.MONDAY:
		cnt++;
	}
	for(int i=0; i<cnt; i++) {
		System.out.println("    ");
	}
	for(int date=1; date<=maxDate; date++, cnt++) {
		if(cnt%7 == 0) {
			System.out.println();
			cnt=0;
		}
		System.out.print(date);
		if(date<10) {
			System.out.print("   ");
		} else {
			System.out.print("  ");
		}
	}
	
	}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	

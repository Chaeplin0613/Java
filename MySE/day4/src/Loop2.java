
public class Loop2 {

	public static void main(String[] args) {
		
		//10,9,8,7,6,5,4,3,2,1을 출력하시오(줄바꿈 포함)
//		int num=10;
//		while(num>=1) {
//			System.out.println(num);
//			num--;
//		}
		
//		int num=10;
//		for(;num>=1;num--) {
//			System.out.print(num);
//		}
		
		//10,9,8,7,6,5,4,3,2,1을 출력하시오(줄바꿈 없이, 마지막 콤마는 생략) while
//		int num=10;
//		while(num>=1) {
//			if(num < 10) {
//				System.out.print(", ");
//			}
//			System.out.print(num);
//			num--;	
//		}
		
		//10,9,8,7,6,5,4,3,2,1을 출력하시오(줄바꿈 없이, 마지막 콤마는 생략) for
//		int num;
//		for(num=10; num>=1; num--) {
//			if(num<10) {
//				System.out.print(", ");
//			}
//			System.out.print(num);
//		}
		
		
		// 10,9,8,7,6
		// 5,4,3,2,1출력 while
//		int num=10;
//		while(num>=1) {
//			if(num < 10) {
//				System.out.print(", ");
//			}
//			if(num == 5) {
//				System.out.print("\n");
//			}
//			System.out.print(num);
//			num--;
//		}
//		
		// 10,9,8,7,6
		// 5,4,3,2,1출력 for
//		int num;
//		for(num=10; num>=1; num--) {
//			if(num<10) {
//				System.out.print(", ");
//			}
//			if(num==5) {
//				System.out.println();
//			}
//			System.out.print(num);
//		}
		
		// 10,9,8,7,6
		// 5,4,3,2,1출력 for 강사님 코드
//		int num;
//		for(num=10; num>=1; num--) {
//			if(num%5 != 0) {
//				System.out.print(", ");
//			} else {
//				System.out.println();
//			}
//			System.out.print(num);
//		}
		
		//구구단 3단 구하기
		//출력화면 : "3단의 결과 : 3 6 9 12 15 18 21 24 27"
		//3단의 결과중 2의 배수는 출력하지 않음
//		int dan=3;
//		System.out.print(dan+"단 결과 : ");
//		for(int i=1; i<=9; i++) {
//			if(dan*i % 2==0) {
//			continue;			
//			}
//			System.out.print(dan*i);
//			System.out.print(' ');
//		}
		
		//3단~7단까지의 구구단 결과를 출력하시오.
		//3 6 9 12 15 18 21 25
		
		//결과가 50이상인 경우는 출력하지 않음
		
		//결과가 100 이상인 경우는 반복 빠져나오기
//		int dan;
//		int i;
//		System.out.println();
//		out:for(dan=2; dan<=14; dan++) {
//			System.out.print(dan+"단: ");
//			for(i=1; i<=9; i++) {
//				if(dan*i>=100) {
//					break out;
//				}
//				System.out.print(dan*i);
//				System.out.print(' ');
//			}
//			System.out.println();
//		}
		
		// 1
		// 2 3
		// 4 5 6
		// 7 8 9 10 출력하기
//		System.out.println();
//		int num=1;
//		int row=0; //행
//		while(row<4) { //1번 while문
//			int col=0; //열 //2번 while문 끝나면 무조건 0으로 초기화하라는 뜻
//			while(col<=row) { //2번 while문
//				System.out.print(num);
//				System.out.print(' ');
//				col++;
//				num++;
//			}
//			System.out.println();
//			row++;
//		}
				
		
		
		
//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		while(true) {
//			System.out.println("출생년도를 입력해주세요\n[종료하려면 0을 입력하세요.]");
//			int birthYear = sc.nextInt();
//			if(birthYear == 0) {
//				break;
//			}
//			int mod = birthYear%12;
//			switch(mod){
//				case 0:
//					System.out.println("원숭이");
//					break;
//				case 1:
//					System.out.println("닭");
//					break;
//				case 2:
//					System.out.println("개");
//					break;
//				case 3:
//					System.out.println("돼지");
//					break;
//				case 4:
//					System.out.println("쥐");
//					break;
//				case 5:
//					System.out.println("소");
//					break;
//				case 6:
//					System.out.println("호랑이");
//					break;
//				case 7:
//					System.out.println("토끼");
//					break;
//				case 8:
//					System.out.println("용");
//					break;
//				case 9:
//					System.out.println("뱀");
//					break;
//				case 10:
//					System.out.println("말");
//					break;
//				case 11:
//					System.out.println("양");
//					break;
//			}
//			System.out.println();
//		}	
//			
//		int[]scores = {83,90,87};
//		
//		System.out.println();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//break 예제
//		while(true) {
//			int num = (int)(Math.random()*6)+1;
//			System.out.println(num);
//			if(num == 6) {
//				break;
//			}
//		}
//		System.out.println("프로그램 종료");
		
		//continue 예제_짝수구하기
//		for(int i=1; i<=10; i++) {
//			if(i%2 != 0) {
//				continue; //true구간: 다음 단계로 넘어가지 말고 다시 위로 올라가라는 뜻
//			}
//			System.out.println(i); //false구간에 있으므로 나머지가 0이 맞다면 뜻
//		}
//		
		int num=1;
		while(num<=10) {
			if(num%2!=0) {
				num++;
				continue;
				
			}
			System.out.println(num);
			num++;
		}
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

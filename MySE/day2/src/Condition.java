package day2;

public class Condition {

	public static void main(String[] args) {
		int num;
		num = 500;
		if(num>10) {
			System.out.println(num+"은 10보다 큰 수입니다.");
		} 
		
		
		
		System.out.println("==========");
//		int kor = 97;
//		int math = 29;
//		int eng = 70;
		//총점이 50점 이상이면 "합격"을 출력하시오
//		if((kor+math+eng)/3 >= 90) {
//		System.out.println("합격");
//		} else {
//		System.out.println("불합격");
//		}
		
		//평균이 50.6점 이상이면 "합격"을 출력하시오.
		
		int kor = 97;
		int math = 29;
		int eng = 70;
		
		double avg = (kor+math+eng)/3.0;
		if(avg >= 50.6) {
			System.out.println("평균"+avg+"점으로 합격");
			  if(avg>=90.0) {
				System.out.println("A등급");
			} else if(avg>=80) {
				System.out.println("B등급");
			} else if(avg>=70) {
				System.out.println("C등급");
			} else {
				System.out.println("D등급");
			}
		} else {
			System.out.println("평균"+avg+"점으로 불합격");
		}
		
		//int year = 2020;
		
		System.out.print("연도를 입력하세요 : ");
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int year = sc.nextInt();
		
		if(year%12 == 4) {
			System.out.println("쥐띠 해입니다.");
		} else if(year%12==5) {
			System.out.println("소띠 해입니다.");
		} else if(year%12==6) {
			System.out.println("호랑이띠 해입니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}


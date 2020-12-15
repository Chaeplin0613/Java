public class Operator {

	public static void main(String[] args) {
		// 연산자종류
        /* 산술연산자 : +, -, *, /, %
		      대입연산자 : =, +=, -+, *=, /=, %=, 
		      증감연산자 : ++, -- 단항연산자
		      비교연산자 : >, >=, <, <=, ==, !=
		      논리연산자 : &, &&, |, ||, !
		      삼항연산자 : ?:
		*/
		int num1, num2;
		num1 = (1+2)*3 % 2;
		num2 = num1;
		
		char c = 'A'; //아스키코드값: 65
		int d = 68;
		

		System.out.println(c+3); //65 + 3 = 68 char타입 c변수가 int타입으로 자동 형변환
		System.out.println((char)(c)); //A
		System.out.println((int)(c)); //65
		System.out.println(c); //A
		System.out.println((char)(c+3)); //D
		System.out.println((int)(c+3)); //68
		System.out.println(c+3); //68
		System.out.println((char)(68)); //D
		System.out.println(68); //68
		System.out.println((char)(d)); //D
		System.out.println("===========");
		
		num1 = 2;
		num2 = 3;
		System.out.println(num1/num2); //정수 나누기 정수는 무조건 정수 0

		System.out.println("===========");
		
		short s1,s2,s3;
		s1 = 2;
		s2 = 3;
		s3 = (short)(s1 + s2);
		//System.out.println(s3 = s1 + s2);
		System.out.println(s3);
		
		byte b = 127;
		b++;
		System.out.println(b); //-128
		
		System.out.println("===========");
		
		
		num2 = 1;
		num2 += 3; // 대입연산자, num2 = num2+3과 같은 코드
		
		num2 = 1;
		num2++;
		
		System.out.println("===========");
		
		num2 = 1;
		num1 = num2++;
		System.out.println(num1); //1
		System.out.println(num2); //2
		
		
		num2 = 1;
		num1 = ++num2;
		System.out.println(num1); //2
		System.out.println(num2); //2
		
		//비교연산자의 결과는 True 또는 False형태로 출력
		num1 = 100;
		System.out.println(num1 >= 50); //True
		
		num1++; //101
		System.out.println(num1%2 == 0); //False
		System.out.println(num1%3 != 0); //True
		
		//논리연산자 
		//and & (~은 ~이고, ~은 ~이다) 둘 다 참이어야 true를 반환
		//or  | (~이거나 ~이다) 둘 중 하나만 참이어도 true를 반환
		num1=4;
		num2=25;
		System.out.println(num1%2==0 && num2%5==0); //true
		System.out.println(num1%2==1 && num2%5==0); //false
		System.out.println(num1%2==0 && num2%5!=0); //false
		System.out.println(num1%2==1 && num2%5!=0); //false
		
		System.out.println("===========");
		
		System.out.println(num1%2==0 || num2%5==0); //true
		System.out.println(num1%2==1 || num2%5==0); //true
		System.out.println(num1%2==0 || num2%5!=0); //true
		System.out.println(num1%2==1 || num2%5!=0); //false
		
		System.out.println("===========");
		
		System.out.println(!(num1%2==0 && num2%5==0)); //false

		System.out.println("===========");
		
		//삼항연산자
		num1 = 20;
		System.out.println(num1%2==0?"짝수":"홀수"); 
		  //2로나눈 나머지가 짝수라면 "짝수"를 아니면 "홀수"를 출력
                                        		
		//double r = Math.random();
		//System.out.println(r);

		//Math.random()메서드의 반환값범위를 1<=    <4로 조절
//		double a = Math.random();
//		System.out.println((int)(a*3)+1);
//		System.out.println(a);
		int r = (int)(Math.random()*3+1); // 1 <= random값   < 4.0
		System.out.println(r);
//		System.out.print(r==1?"가위":"");
//		System.out.print(r==2?"바위":"");
//		System.out.println(r==3?"보":"");
		
		System.out.println((r==1)?"가위":(r==2)?"바위":"보");
		int x = 10;
		int y = 20;
		int z = ++x + y--;
		System.out.println(z);
		System.out.println(y);
		System.out.println(x);
		
		int score = 85;
		String result = (!(score>90))?"가":"나";
		System.out.println(result);
		
		System.out.println(534%30);
		
		//조건문
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

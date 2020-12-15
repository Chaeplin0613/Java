
public class Loop {

	public static void main(String[] args) {
//		System.out.println("hello");
//		System.out.println("hello");
//		System.out.println("hello");
//		System.out.println("hello");
//		System.out.println("hello");
		//while, for, do~while
		
//		int cnt = 5; // 반복 횟수
//		int i = 0; //
//		while( i < cnt ) {            // ()괄호 안에는 조건을 {}블록 안에는 true일 경우 실행문을 입력
//			System.out.println(i +">>hello"); //true일 때 hello출력
//			i++; //hello 출력후 i의 값을 1 증가
//		}
		
//		int cnt,i;		
//		for( cnt = 5, i = 0 ; i < cnt ;    i++  ) {
//               //초기화 선언           //조건비교	 //증가치	
//			System.out.println("hello");
//		}
//		
		
		//i=~~값으로 주고;
		//TODO 1,2,3,4,5,6,7,8,9,10을 출력하시오
		
//		int i, cnt;
//		for(i=1, cnt = 10; i<=10; i++) {
//			System.out.println(i);
//		}
		
//		int cnt = 10;
//		int i = 1;
//		while(i <= cnt) {
//			System.out.println(i);
//			i++;
//		}
		
		//TODO 1,3,5,7,9,13,15,17,19,21을 출력하시오
//		int cnt, num;
//		for(cnt=10,num=1; num < cnt; num+=2) {
//			System.out.println(num);
//		}
		
//		int i, cnt, num;
//		for(cnt=10,num=1, i=0; i < cnt; num+=2, i++) {
//			System.out.println(num);
//		}
		
//		int cnt = 10;
//		int i = 0;
//		int num = 2;
//		while( i < cnt ) {
//			System.out.println(num);
//			i++;
//			num+=2;
//		}
		//1~5까지의 합 구하기
//		int sum, num;
//		for(sum=0,num=0; num<=5; sum+=num) {
//			num++;
//						
//		}
//		System.out.println(sum);
		
//		int sum = 0; //합이 저장될 변수
//		num = 1;
//		sum += num; // = sum +num; // =0+1
//		num++; //2
//		sum += num; // sum = sum + num; //=(0+1)+2
//		num++; //3
//		sum += num; // sum = sum + num; //=(0+1+2)+3
//		num++; //4
//		sum += num; // sum = sum + num; //=(0+1+2+3)+4
//		num++; //5
//		sum += num; // sum = sum + num; //=(0+1+2+3+4)+5
		
		//TODO 1+2+3+4+5 값을 출력하시오
//		int sum = 0;
//		int num = 1;
//		while(num <= 5) {
//			sum += num;
//			num++;
//		}
//		System.out.println(sum);
		
		//TODO 1~10사이의 홀수 1+3+5+7+9 합을 구하시오

//		int sum = 0;
//		int num = 1;
//		while ( num <= 10) {
//			sum += num;
//			num += 2;
//		}
//		System.out.println(sum);
		
//		int sum=0;
//		int num=1;
//		for(;num<=10; num+=2) {
//			sum += num;
//		}
//		System.out.println(sum);

//		int sum = 0;
//		int num = 0;
//		while ( num <= 10) {
//			sum += num;
//			num += 2;				
//		}
//		System.out.println(sum);
		
		//TODO 1~10사이의 숫자중 홀수합과 짝수합을 구하시오
//		int oddsum = 0; //홀수합
//		int evensum = 0; //짝수합
//		int num = 1;
//		while(num <= 10) {
//			if(num%2 == 0) {
//				evensum += num;
//			} else {
//				oddsum += num;
//			}
//			num ++;
//		}
//		System.out.println("홀수합: " + oddsum + ", 짝수합: " + evensum);
		
//		int oddsum = 0; //홀수값
//		int evensum = 0; //짝수값
//		int num = 1; 
//		while(num <= 10) {
//			if(num%2==0) {
//				evensum += num;
//			} else {
//				oddsum += num;
//			}
//			num++;
//		}
//		System.out.println("홀수의 합은 : "+oddsum+" 짝수의 합은 : "+evensum);
		
		
		//TODO 해당숫자가 소수인 경우 "소수입니다",
		//             소수가 아닌 경우 "소수가  아닙니다"를 출력하시오
//		int primeNum = 5;
//		int num = 2;
//		while(num < primeNum) {
//		if((primeNum%num)==0) {
//			System.out.println(primeNum+"은(는) 소수가 아닙니다.");
//		} else {
//			System.out.println(primeNum+"은(는) 소수입니다.");
//		}
//		num++;
//		System.out.println(num);
//		}
		
//		int primeNum = 5;
//		int num=2;
//		boolean isPrime = true; //소수이다
//		while(num < primeNum) {
//			if(primeNum % num == 0) {
//				isPrime = false; //소수가 아니다
//			}
//			num++;
//		}
//		if(isPrime) { //if(isPrime == true)
//			System.out.println("소수입니다");
//		} else {
//			System.out.println("소수가 아닙니다");
//		}
		
//		TODO 숫자 1부터의 합이 10미만인 최대숫자를 출력하시오
	
	    int num=1;
	    int sum=0;
	    while(sum+num<10)
	    	{
	    		sum=sum+num;
			    System.out.println(num);
	    		num++;
	    	}
//	    num--;
//	    System.out.println("최대숫자는"+num);

	    
	    //강사님 코드
//		int sum, num;
//	    sum = 0;
//	    num = 1;
//	    while((sum+num)<100) {
//	    	sum+=num;
//	    	System.out.println(num+ ":" + sum);
//	    	num++;
//	    }
//	    num--;
//	    System.out.println("최대숫자는"+num);
	    
	    //do{}while()
//		int sum, num;
//	    sum = 0;
//	    num = 0;
//	    do {
//	    	num++;
//	    	sum += num;
//	    	System.out.println(num + ":" + sum);
//	    } while ((sum+num) < 100);
//	    System.out.println("최대숫자는 " + num);
	    
	    
	}
}
		
	


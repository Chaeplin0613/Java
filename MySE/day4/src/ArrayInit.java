
public class ArrayInit {

	public static void main(String[] args) {
		// 배열초기화
//		int amount1; // 1월에 입금액
//		int amount2; // 2월에 입금액
//		int amount3; // 3월에 입금액
		//월별 입금액 총합, 평균액 구하기
		
		int []amount = {100, 1000, 50, 0, 35, 170, 500, 600, 20, 300, 40, 60};
//		System.out.println(amount[0]); //100
//		System.out.println(amount[1]); //1000
//		System.out.println("index="+amount.length); //12, 배열의 length필드
//		int totalAmount=0; //총금액
//		for(int index=0; index<amount.length; index++ )
//		{
//			totalAmount+=amount[index];
//		}
//		System.out.println(totalAmount);
//		System.out.println("평균금액: "+((double)totalAmount/amount.length));
		
		//최대금액 코드★★★
		int max = amount[0];
//		for(int index=1; index<amount.length; index++) {
//			if(max < amount[index]) {
//				max = amount[index];
//			}
//		}
//		System.out.println("최대금액: "+max);

		//월까지 포함한 최대금액★★★
		int maxIndex = 0;
		for(int index=1; index<amount.length; index++) {
			if(amount[maxIndex] < amount[index]) {
				maxIndex = index;
			}
		}
		String maxMonth = maxIndex+1+"월";
		max = amount[maxIndex];
		System.out.println("최대금액: "+maxMonth+", "+max);
		
		
		
		
		
		
		
//		max = amount[0]; //1월금액
//		
//		if(max < amount[1]) { //2월금액
//			max = amount[1]; 
//		}
//		if(max < amount[2]) { //3월금액
//			max = amount[2];
//		}
//		if(max < amount[3]) { //4월금액
//			max = amount[3];
//		}
		
		

}
}
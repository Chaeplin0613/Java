public class Week1 {

public static void main(String[] args) {

//TODO 1. 다음 금액을 최소동전개수로 환전하시오
//금액이 1243원인 경우
//출력결과 500원-2개, 100원-2개, 10원-4개, 1원-3개
//금액이 150원인 경우
//출력결과 100원-1개, 50원-1개
//int money=1243;
//TODO 1. 채플린 코드
// int money = 1243;
// int []coin = {500,100,50,10,1};
// for (int i = 0; i < coin.length; i++) {
// System.out.print(coin[i]+"원-"+money/coin[i]+", ");
// money%=coin[i];
// }
//TODO 1. 강사님 코드
//int coin500=500;
//int coin100=100;
//int coin50=50;
//int coin10=10;
//int coin1=1;
//int cnt500=1243/coin500;
//int cnt100=(1243%coin500)/coin100;
//int cnt50=((1243%coin500)%coin100)/coin50;
//int cnt10=(((1243%coin500)%coin100)%coin50)/coin10;
//int cnt1=((((1243%coin500)%coin100)%coin50)%coin10)/coin1;
//
//System.out.println(cnt500+", "+cnt100+", "+cnt50+", "+cnt10+", "+cnt1);

 

//TODO 2. 숫자 1,2,3,4,...10까지 for문으로 출력하시오
//TODO 2. 채플린 코드
// int i;
// for(i=1; i<=10; i++) {
//	 if(i>1) {
//		 System.out.print(", ");
//	 }
//	 System.out.print(i);
// }


//TODO 3. 알파벳 'A','B','C','D',....'Z'을 출력하시오
//TODO 3. 채플린 코드 수정 
// int num;
// for(num=65; num<91; num++) {
//	 if(num>65) {
//		 System.out.print(", ");
//	 }
// System.out.print((char)(num));
// }
//TODO 3. 강사님 코드 
//System.out.println();
//for(char c='A'; c<='Z'; c++) {
//	System.out.print(c+", ");
//}



//TODO 4. 피보나치 수열 10개를 출력하시오
//    피보나치 수열자료를 찾아보세요
//    출력결과는 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
//TODO 4. 채플린 코드
// int sum, num, i;
// i=1;
// sum=0;
// num=1;
//
// while(i<=5) {
// System.out.print((num+=sum)+", ");
// System.out.print((sum+=num)+", ");
// i++;
// }
//Q.마지막 콤마 출력은 어떻게 제하지?
//TODO 4. 강사님 코드
// int bb,b,c;
// bb=1;
// b=0;
//for(int i=0; i<10; i++) {
//	c=bb+b;
//	bb=b;
//	b=c;
//}
 
 
 
 

//TODO 5. 년도에해당하는 동물을 출력하시오
//  단, zodiacSign배열에 저장된 동물값을 출력합니다.
// String[] zodiacSign = {"원숭이", "닭", "개", "돼지", "쥐", "소",
//  "호랑이", "토끼", "용", "뱀", "말", "양"};
// int year = 2020;
//TODO 5TODO 1. . 채플린 코드
// java.util.Scanner sc = new java.util.Scanner(System.in);
// while(true) {
// System.out.println("출생년도를 입력해주세요 \n[종료하려면 0을 입력해주세요]");
// int birthYear = sc.nextInt();
// if(birthYear == 0) {
// break;
// }
// int i = birthYear%12;
// String []zodiacSign = {"원숭이", "닭", "개", "돼지", "쥐", "소", "호랑이", "토끼", "용", "뱀", "말", "양"};
// System.out.println(zodiacSign[i]);
// System.out.println();
// }




//TODO 6.다음 numArr배열은 1부터 10사이의 숫자들로 구성되어있다.
//     숫자들의 출현횟수를 출력하시오
//출력결과는 1의 출현횟수는 2회
//        2의 출현횟수는 1회
//        3의 출현횟수는 4회
//        4의 출현횟수는 0회
//        5의 출현횟수는 1회
//        6의 출현횟수는 0회
//        7의 출현횟수는 0회
//        8의 출현횟수는 1회
//        9의 출현횟수는 0회
//        10의 출현횟수는 2회
//  int[] numArr = {1, 3, 1, 10, 3, 5, 8, 3, 10, 2, 3};

//TODO 6. 채플린 코드
// int[] numArr = {1, 3, 1, 10, 3, 5, 8, 3, 10, 2, 3};
// int cnt, j;
// for(int i=1 ; i<=10; i++) {
// for(j=0, cnt=0; j<numArr.length; j++) {
// if(i==numArr[j]) {
// cnt++;
// }
// }
// System.out.println(i+"의 출현횟수는 "+cnt+"");
// }
 //TODO 6. 강사님 코드
// int[] numArr = {1,3,1,10,3,5,8,3,10,2,3};
// int[] cntArr = new int[10];
// 
// for(int i=0; i<numArr.length; i++) {
//	 int num = numArr[i];
//	 cntArr[num-1]++;
// }
// for(int i=0; i<cntArr.length; i++) {
//	 System.out.println((i+1)+"의 출현횟수는" + cntArr[i] +"회");
// }
 
 
 
 
 
 
 
 
 
 
 
 




}
}
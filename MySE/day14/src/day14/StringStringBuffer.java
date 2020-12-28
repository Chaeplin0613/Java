package day14;

import java.util.StringTokenizer;

public class StringStringBuffer {

	public static void main(String[] args) {

		String s1,s2,s3,s4;
		s1 = new String("hello");
		s2 = new String("hello");
		s3 = "hello";
		s4 = "hello";
		
		System.out.println(s1==s2); //new예약어로 객체를 새로 생성했기 때문에 번지수가 달라 false를 출력
		System.out.println(s1==s3);
		System.out.println(s3==s4); //가리키는 메모리가 서로 같기 때문에 true출력
		System.out.println("----------------------");
		System.out.println(s1.equals(s2)); //문자열 내용이 같기 때문에 true출력
		System.out.println(s1.equals(s3)); //문자열 내용이 같기 때문에 true출력
		System.out.println(s3.equals(s4)); //문자열 내용이 같기 때문에 true출력
		System.out.println("----------------------");
		System.out.println(s1+"java"); //+연산자로 문자열 연결, s1내용변경 안됨
		System.out.println(s1);
		
//		StringBuffer sb1, sb2, sb3, sb4;
//		sb1 = new StringBuffer("hello");
//		sb2 = new StringBuffer("hello");
//		sb3 = new StringBuffer("hello");
//		sb4 = new StringBuffer("hello");
//		System.out.println("----------------------");
//
//		StringBuffer sb1,sb2,sb3,sb4;
//		sb1 = new StringBuffer("hello");
//		sb2 = new StringBuffer("hello");
//		sb3 = new StringBuffer("hello");
//		sb4 = new StringBuffer("hello");
//
//		System.out.println(sb1 == sb2);
//		System.out.println(sb1 == sb3);
//		System.out.println(sb3 == sb4);
//		System.out.println(sb1.equals(sb2)); //overriding이 안돼서 Object의 equals를 사용하기 때문에 문자열이 아닌 메모리를 비교하게됨
//		System.out.println("----------------------");
//
//		System.out.println(sb1.append("java")); //sb1에 java를 추가하게 됨
//		System.out.println(sb1); //hellojava
//		System.out.println("----------------------");
//
//		char c = s1.charAt(0); //s1변수 hello의 0번째값 h반환
//		int size = s1.length(); //String타입의 length는 문자열이다 보니 ()괄호 열고 닫고를 
//		byte[] bytes = s1.getBytes(); //hello의 byte값들로 구성 e는 101번 출
//		for(byte b:bytes) {
//			System.out.print(b);
//			System.out.print(",");
//		}
//		System.out.println();
//		
//		//앞뒤가 같은 문자열 :ABBA
////분석필요
//		s1 = "ABBA";
//		size = s1.length(); //4개
//		int i=0;
//		for(i=0; i<size/2; i++) { //
//			if(s1.charAt(i) != s1.charAt(size-1-i)) {
//				break;
//			}
//		}
//		
//		if(i==size/2) {
//			System.out.println("앞뒤가 같은 팰리드롬 문자열입니다.");
//		} else {
//			System.out.println("앞뒤가 다른 문자열입니다.");
//		}
//		
//		s1 = "ABCD.javaABCD.javaABCD.java";
//		int index = s1.indexOf("D"); //D문자에 해당하는 인덱스를 반환
//		System.out.println(index); //3
//		int lastIndex = s1.lastIndexOf("D");
//		System.out.println(lastIndex); //21
//		System.out.println(s1.indexOf("D", 10)); //10번째부터 D값이 몇번째에 위치하는
//		
//		System.out.println(s1.indexOf("JAVA")); //해당문자열이 없을 경우 -1을 반환
//		
////		String[]arr = s1.split("."); //.을 기준으로 문자열을 자를 수 없다. .은 예약어이기 때문이다
//		String[]arr = s1.split("\\.java"); //.을 기준으로 문자열을 자르려면 \\을 두번 붙여준다.
//		for(String s: arr) {
//			System.out.print(s);
//			System.out.print(",");
//		}
//		System.out.println();
//		
//		s1 = "90:85::70"; //국어90, 영어85, 수학 미응시, 과학70
//		s2 = "80:60:0:20"; //국어80, 영어60, 수학0, 과학20
//		String[]arr1 = s1.split(":");
//		String[]arr2 = s2.split(":");
//		for(String s:arr1) {
//			System.out.print(s);
//			if(s.equals("")) {
//				System.out.println("미응시");
//			}
//			System.out.print(",");
//		}
//		System.out.println();
//		for(String s:arr2) {
//			System.out.print(s);
//			System.out.print(",");
//		}
//		System.out.println();
//		
//		StringTokenizer stk = new StringTokenizer(s1, ":"); 
//		while(stk.hasMoreTokens()) {
//			String s = stk.nextToken();
//			System.out.print(s);
//			System.out.print(",");
//		}
		//hello또는 안녕하세요 와 같은 의미 있는 문자열이 토큰 공백, 줄바꿈, 탭은 토큰이 아님
	}

}

package day2;

public class ConditionEx1_review {

	public static void main(String[] args) {

		System.out.println("지금부터 게임을 시작하지");
		System.out.println("[0: 가위    1: 바위    2: 보]");
		System.out.println("무엇을 내겠는가?");

		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int user = sc.nextInt();
		if(user==0) {
			System.out.println("당신은 가위를 냈습니다.");
		}
		if(user==1) {
			System.out.println("당신은 바위를 냈습니다.");
		}
		if(user==2) {
			System.out.println("당신은 보를 냈습니다.");
		}
		
		int com = (int)(Math.random()*3);
		if(com==0) {
			System.out.println("컴퓨터는 가위를 냈습니다.");
		}
		if(com==1) {
			System.out.println("컴퓨터는 바위를 냈습니다.");
		}
		if(com==2) {
			System.out.println("컴퓨터는 보를 냈습니다.");
		}
		
		if(user==0) {
			if(com==0) {
				System.out.println("당신은 비겼습니다.");
			}
			if(com==1) {
				System.out.println("당신은 졌습니다.");
			}
			if(com==2) {
				System.out.println("당신은 이겼습니다.");
			}
		}
		
		if(user==1) {
			if(com==0) {
				System.out.println("당신은 이겼습니다.");
			}
			if(com==1) {
				System.out.println("당신은 비겼습니다.");
			}
			if(com==2) {
				System.out.println("당신은 졌습니다.");
			}
		}
		
		if(user==2) {
			if(com==0) {
				System.out.println("당신은 졌습니다.");
			}
			if(com==1) {
				System.out.println("당신은 이겼습니다.");
			}
			if(com==2) {
				System.out.println("당신은 비겼습니다.");
			}
		}
		
//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		int user = sc.nextInt();
		
//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		int user = sc.nextInt();
		
	}

}

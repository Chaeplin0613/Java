
public class ConditionEx1 {

	public static void main(String[] args) {

		System.out.println("지금부터 가위바위보 게임을 시작하겠습니다.");
		System.out.println("[0: 가위, 1: 바위, 2: 보]");
		System.out.println("무엇을 내시겠습니까? : ");		
		
		java.util.Scanner sc = new java.util.Scanner(System.in); //사용자로부터 입력값 받기
		int user = sc.nextInt();
		if(user==0) {
			System.out.println("당신: 가위");
		}
		if(user==1) {
			System.out.println("당신: 바위");
		}
		if(user==2) {
			System.out.println("당신: 보");
		}
		
				
		int com = (int)(Math.random()*3); //컴퓨터로부터 랜덤값 받기
		if(com==0) {
			System.out.println("컴퓨터: 가위");
		}
		if(com==1) {
			System.out.println("컴퓨터: 바위");
		}
		if(com==2) {
			System.out.println("컴퓨터: 보");
		}
		
		if(user==0) // 사람이 가위일 때
		{
			if(com==0) {
				System.out.println("비겼습니다1.");
			}
			if(com==1) {
				System.out.println("졌습니다1.");
			}
			if(com==2) {
				System.out.println("이겼습니다1.");
			}
			
		}
		
		if(user==1) // 사람이 바위일 때
		{
			if(com==0) {
				System.out.println("이겼습니다2.");
			}
			if(com==1) {
				System.out.println("비겼습니다2.");
			}
			if(com==2) {
				System.out.println("졌습니다2.");
			}
		}
		
		if(user==2)	// 사람이 보일 때
		{	
			if(com==0) {
				System.out.println("졌습니다3.");
			}
			if(com==1) {
				System.out.println("이겼습니다3.");	
			}		
			if(com==2) {
				System.out.println("비겼습니다3.");
			}
		}						
	} 
}
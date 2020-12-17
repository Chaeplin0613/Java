import World.Asia.Japan; //World.Asia.Japan에 있는 모든 클래스를 사용하겠다
import World.Asia.Korea; //World.Asia.Korea에 있는 모든 클래스를 사용하겠다 //명확히 쓰는 것이 좋은 방법 *별표 쓰지마라
import World.Europe.France;
import java.util.Scanner;
//import World.Asia.*; //World.Asia에 있는 모든 클래스를 사용하겠다 //리소스를 많이 잡아먹거나 그러진 않음. 단순 허용

public class CountryTest {

	public static void main(String[] args) {
//		World.Asia.Korea k; //참조형Korea타입의 k지역변수 선언 
//		k = new World.Asia.Korea();
//		
//		World.Asia.Japan j = new World.Asia.Japan();
//		
//		World.Europe.France f = new World.Europe.France();
		
		Korea k = new Korea();
		Japan j = new Japan();
		France f = new France(); //ctrl + shift + o (import 자동생성)
		
//		Scanner sc = Scanner(System.in);
		k.setPopulation(0);
		int koreaPopulation = k.getPopulation();
		System.out.println("현재 한국의 인구는" + koreaPopulation+"명");
		k.population = 0; //한국의 인구
		k.language = "일본어"; //한국의 언어
		k.capital = "워싱턴";
		
		
		
		
		
		
		
	}

}

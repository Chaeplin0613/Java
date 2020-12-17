package World.Asia;

public class Korea {
	private int population; //인구, 본인 클래스에서만 접근이 가능
	String language; //언어 // 같은 패키지 안에서는 접근이 가능, Japan은 가능 France는 불가
	public String capital; //수도
	void k() {
		population = 10;
		language = "한국어";
		capital = "서울";
		//자기 클래스에서는 모두 사용가능
	}
	public void setPopulation(int population) {
		if(population <= 0) {
			System.out.println("인구는 0 이상이어야");
		}
		this.population = population;
	}
	public int getPopulation() {
		return population
	}
}

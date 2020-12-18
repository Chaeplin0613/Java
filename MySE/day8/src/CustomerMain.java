import com.my.dao.CustomerDAO; 
import com.my.vo.Customer;

public class CustomerMain {
	public static void main(String[] args) {
		
		
		CustomerDAO dao = new CustomerDAO(3); 
		//생성자 호출코드니까 생성자를 먼저 만들어야 한다. 매개 변수를 갖는 생성자를 직접 만들어야 한다.
		
		Customer[] cAll = dao.selectAll(); //Customer배열타입
		
		System.out.println(">>1. 고객 전체 조회<<");
		
		if(cAll != null) {
		for(int i=0; i<cAll.length; i++) {
			Customer c = cAll[i];
			System.out.println(c.getId() + "," + c.getPwd() + ", " + c.getName());
		}
		}
		
		System.out.println(">>2. 고객추가<<");
//		dao.insert("id1","p1","n1"); //매개변수 3개짜리
		dao.insert(new Customer("id1", "p1", "n1")); //매개변수 1개짜리
		dao.insert(new Customer("id2", "p2", "n2"));

		System.out.println(">>3. 고객 전체 조회<<"); //저장소에 있는 고객들을 반환해서 출력
		Customer[] cAll3 = dao.selectAll();
		for(int i=0; i<cAll3.length; i++) {
			Customer c = cAll3[i];
			System.out.println(c.getId() + "," + c.getPwd() + ", " + c.getName());
		}
		
		System.out.println(">>4. 고객 ID로 조회<<");
		String id = "id2";
		Customer c4 = dao.selectById(id);
		if(c4 != null) { //이곳이 출력
			System.out.println(c4.getId() + "," + c4.getPwd() + ", " + c4.getName());
		}else {
			System.out.println("ID가 존재하지 않습니다");
		}
		
		System.out.println(">>5. 고객 ID로 조회<<");
		String id1 = "id9";
		Customer c5 = dao.selectById(id1);
		if(c5 != null) {
			System.out.println(c5.getId() + "," + c5.getPwd() + ", " + c5.getName());
		}else {//이곳이 출력
			System.out.println("ID가 존재하지 않습니다"); 
		}		
	}
}


import com.my.dao.CustomerDAO;
import com.my.dao.CustomerDAOArray;
import com.my.exception.AddException;
import com.my.exception.FindException;
import com.my.vo.Customer;
//사용자용 코드 
public class CustomerDAOTest {
	public static void main(String[] args) {
		CustomerDAO dao;
//		dao = new CustomerDAO(); //인터페이스는 추상이라 new키워드로 구체화된 객체생성 못하는 특수한 클래스고, 객체생성하는 용도가 아님 
//		dao = new CustomerDAOArray(); //클래스가 인터페이스 타입으로 업캐스팅 가능 
//		dao = new CustomerDAOFile(); //upcasting
		dao = new CustomerDAOArray(2); //두명만 저장할 수 있는 저장소 
		
		Customer[] all;
		try {
			all = dao.selectAll();
			for(Customer c: all) {
				System.out.println(c.getId() + ":" + c.getName());
			}
		} catch (FindException e) {
			System.out.println(e.getMessage());
		} //객체생성 당시의 제공됐던 메소드가 유지 , 오버라이딩된 메소드가 호출됨, 
						//실제사용은 클래스의 객체지만 인터페이스에 해당하는 설명서,
		
		//1.반복문 내부에서 예외처리 
//		for(int i=0; i<10; i++) {
//			Customer c = new Customer("id"+i, "p"+i, "n"+i);
//			try {
//			dao.insert(c);  //<<이곳이 예외발생 코드
//		} catch (ArrayIndexOutOfBoundsException e) { //e는 매개변수이름인데 뭘 써도 상관없다  
////			System.out.println("저장소가 꽉 찼습니다. 현재인원은"+dao.cnt+"입니다.");
//			System.out.println("저장소가 꽉 찼습니다.");
//		}
//		}
		
		//2. 반복문 외부에서 예외처리 
		try {
//			dao.insert(new Customer("id0","paaa"));
			for(int i=0; i<10; i++) {
				Customer c = new Customer("id"+i, "p"+i, "n"+i);
				dao.insert(c);  //<<이곳이 예외발생 코드
			}	
		}
		catch (AddException e) { //e는 매개변수이름인데 뭘 써도 상관없다  
//			System.out.println("저장소가 꽉 찼습니다. 현재인원은"+dao.cnt+"입니다.");
			System.out.println(e.getMessage());
		}
		
//		if(all != null) {
			
//		}
		
		
	}

}

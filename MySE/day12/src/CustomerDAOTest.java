import com.my.dao.CustomerDAO;
import com.my.dao.CustomerDAOArray;
import com.my.vo.Customer;
//사용자용 코드 
public class CustomerDAOTest {
	public static void main(String[] args) {
		CustomerDAO dao;
//		dao = new CustomerDAO(); //인터페이스는 추상이라 new키워드로 구체화된 객체생성 못하는 특수한 클래스고, 객체생성하는 용도가 아님 
//		dao = new CustomerDAOArray(); //클래스가 인터페이스 타입으로 업캐스팅 가능 
		dao = new CustomerDAOFile(); //upcasting
		Customer[] all = dao.selectAll(); //객체생성 당시의 제공됐던 메소드가 유지 , 오버라이딩된 메소드가 호출됨, 
						//실제사용은 클래스의 객체지만 인터페이스에 해당하는 설명서,
		if(all != null) {
			for(Customer c: all) {
				System.out.println(c.getId() + ":" + c.getName());
				
			}
		}
		
		
	}

}

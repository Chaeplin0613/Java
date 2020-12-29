import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class JCF { //Java Collection Framework = 자료구조용 라이브러리
	
	public static void test(Collection c) { //Collection은 라이브러리를 뜻함 
		c.add(new Object()); //add메소드는 추상메소드 
		c.add(new String("1"));
		c.add(new Integer(2));
		c.add(3.0); //컴파일시 c.add(new Double(3.0));으로 바뀜
		c.add(3.0);
		//add객체 총 5개 저
		
		System.out.println("자료수: "+c.size());
		System.out.println("자료들: "+c); //c.toString()자동호출됨
		Iterator iterator = c.iterator(); //import 필요
		while(iterator.hasNext()) {
			Object element = iterator.next();
			System.out.println("자료: "+element);
		}
	}
	public static void test(Map m) {
		m.put("one", new Object());
		m.put("two", new String("1"));
		m.put("three", new Integer(2));
		m.put("four", 3.0); //값중복
		m.put("five", 3.0); //값중복
		m.put("two", true); //키중복, 키중복되면 나중 값이 덮어씌워짐
		System.out.println("-----Map-----");
		System.out.println("자료수: "+m.size());
		System.out.println("자료들: "+m);
		Set keys = m.keySet(); //키를 정확히 모르면 키들을 다 찾고
		Iterator iterator = keys.iterator();
		while(iterator.hasNext()) { 
			Object key = iterator.next(); //키하나씩을 찾고
			Object element = m.get(key); //키를 이용해서 get메소드로 값을 찾음
			System.out.println("자료:키= "+key+",값 = "+element);
		}
		
	}
	
	public static void main(String[] args) {

		Collection c; // Collection 타입의 c변수, import필요
//		c = new Collection(); // 인터페이스 타입, 추상은 new키워드로 객체생성 못함
		c = new ArrayList(); //import 필요 
		test(c);
		System.out.println("----------------");
		
		c = new HashSet();
		test(c);
		System.out.println("----------------");
		
		Map m = new HashMap();
		test(m);
	}

}

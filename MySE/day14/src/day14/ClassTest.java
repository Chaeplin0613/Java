package day14;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ClassTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("로드할 클래스 이름을 패키지까지 정확히 입력하세요.");
		String className = sc.nextLine();
		try {
			Class clazz = Class.forName(className);
			Object obj = clazz.newInstance(); //newInstance()는 로드된 클래스를 갖고 객체생성하는 작업
			Field[] fields = clazz.getDeclaredFields();
			for(Field f: fields) {
				System.out.print(f.getName());
				System.out.print(",");
			}
			System.out.println();
			Method[] methods = clazz.getDeclaredMethods();
			for(Method m: methods) {
				System.out.print(m.getName());
				System.out.print(",");
				if(m.getName().equals("toSring"));{
					try {
					Object result = m.invoke(obj);
					System.out.println("\n"+result);
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
			}A
				
			System.out.println();
			} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //msin메소드 호출하기전 ClassTest, String, Scanner, System, ClassNotFoundException
		catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
}

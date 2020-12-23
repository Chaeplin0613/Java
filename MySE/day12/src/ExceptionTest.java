import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
	public static void test(int a) {
		int result = 5/a;
		System.out.println(result);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요: ");
		try {
			int num = sc.nextInt(); //0->ArithmeticException
									//a->InputMismatchException
			if(num != 0) {
				test(num);
			}
		} catch (InputMismatchException e) {
			System.out.println("숫자를 입력해주세요");
		}
	}
}


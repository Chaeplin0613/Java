import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {
	public static void writeTest() {
String fileName = "a.txt";
		
		
		//파일바이트단위출력스트림
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(fileName);
			fos.write(65);
			fos.write('B');
			fos.write('1');
			byte[] bytes = "가".getBytes();
//			for(byte b: bytes) {
//				fos.write(b);
//			}
			fos.write(bytes);
//			fos.write('가'); //버퍼에 쓰기됨, 목적지에 전달안됨
			fos.flush(); //여러바이트로 구성돼있는 내용이 버퍼에 남아있을 수 있고 목적지에 전달이 안 될 수 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String fileName2 = "/Users/chaeplin/Documents/test.txt";
		
		//파일 문자단위 출력스트림
		FileWriter fw = null;
		try {
			fw = new FileWriter(fileName2);
			fw.write("A");
			fw.write("b");
			fw.write("1");
			fw.write("가");
			fw.write("AB1가");
			fw.flush();
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws IOException {
		String fileName = "a.txt";
		//파일 바이트입력 스트림
		
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(fileName);
			int readValue = fis.read();
			while( (readValue = fis.read()) != -1) {
				char c = (char)readValue;
				System.out.println(c);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

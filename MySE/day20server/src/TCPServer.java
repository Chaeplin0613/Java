import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
public class TCPServer {
   public static void main(String[] args) {
      ServerSocket ss = null;
      int port = 5432; //서버 포트
      Socket s = null;
//      InputStreamReader ios = null;
      DataInputStream dis = null;
      DataOutputStream dos = null;
      try { //사용할 수 없는 포트번호 사용할떄 예외발생 //이미 사용중인 포트번호나 다른 포트번호; 사용가능한 포트번호만 넣어줘야한다.
         ss = new ServerSocket(port);//서버 포트 열기
         while(true) { //클라이언트를 기다리는 역할의 반복문
	         s = ss.accept();//클라이언트의 접속 기다리기 Socket s (소켓 생성시키기)
	         String clientIp = s.getInetAddress().getHostAddress();
	         String clientName = s.getInetAddress().getHostName();
        	 try {									//아이피
		         System.out.println("IP: "+clientIp+" // 이름: "+clientName+" 님이 접속됨!");
		         dis =new DataInputStream(s.getInputStream());
		         dos = new DataOutputStream(s.getOutputStream());
		         String receiveMsg = "quit";
		         while(!(receiveMsg = dis.readUTF()).equals("quit")) {
		        	 System.out.println(clientIp+"님이 보낸 msg >> " + receiveMsg);
		        	 dos.writeUTF(receiveMsg);
		         }
             } catch(EOFException e) {
             } catch(SocketException e) {
             } catch (IOException e) {	 
            	 e.printStackTrace();
        	 } finally {
        	   	  System.out.println(clientIp+" 님이 접속해제했습니다.");
        	   	if(dos != null) {
    				try {
    					dos.close();
    				} catch (IOException e) {
    				}
    			}
        	         if(s != null) {
        	            try {
        	               s.close();
        	            } catch (IOException e) {
        	               e.printStackTrace();
        	            }//s닫기 //트라이블럭안에 선언되면 트라이블럭에서만 사용가능
        	         }
        	 }
         }

      } catch (IOException e) {
         e.printStackTrace();
      }finally {
         if(ss != null) {
            try {
               ss.close();
            } catch (IOException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
            }//ss닫기
         }
      }
   }
}
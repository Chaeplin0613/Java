public class DataType{
    public static void main(String[] args){
        byte b;
        //b = 128;
        b = -127;
        System.out.println(b);
        b = 0;
        System.out.println(b);

        long l = 12345678901L;
        System.out.println(l);

        double d;
        d = 12.34567;
        System.out.println(10); //int타입으로 이해
        System.out.println(10L); //Long타입으로 이해
        System.out.println(10.4F); //Float타입으로 이해
        System.out.println(10.4); //double타입으로 이해
 
        char c;
        c = '가';
        System.out.println(c);
        c = 44032; 
        System.out.println(c);

        c = 97;
        System.out.println(c);
        c = 45;
        System.out.println(c);

        boolean flag;
        flag = true;
        //flag = 1; // true와 1은 다르다
        flag = false;
        //flag = 0; //flase와 0은 다르다
    }    
}
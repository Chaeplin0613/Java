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
        System.out.println(10); //intŸ������ ����
        System.out.println(10L); //LongŸ������ ����
        System.out.println(10.4F); //FloatŸ������ ����
        System.out.println(10.4); //doubleŸ������ ����
 
        char c;
        c = '��';
        System.out.println(c);
        c = 44032; 
        System.out.println(c);

        c = 97;
        System.out.println(c);
        c = 45;
        System.out.println(c);

        boolean flag;
        flag = true;
        //flag = 1; // true�� 1�� �ٸ���
        flag = false;
        //flag = 0; //flase�� 0�� �ٸ���
    }    
}
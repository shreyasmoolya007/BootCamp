public class W1 {
    public static void main(String[] args) {
        byte b=5;
        short s=10;
        int i=15;
        long l=151;
        float f=10.5f;
        double d=5.5;
        char c='a';
        boolean b1=false;

        Byte obj1=Byte.valueOf(b);
        System.out.println(obj1);
        Short obj2=Short.valueOf(s);
        System.out.println(obj2);
        Integer obj3=Integer.valueOf(i);
        System.out.println(obj3);
    }
}

import java.util.Hashtable;

public class HashTable1 {
    public static void main(String[] args) {
        Hashtable<Integer,String> obj1=new Hashtable();

        obj1.put(1,"Kaito");
        obj1.put(3,"Kid");
        obj1.put(4,"Phantom");
        obj1.put(2,"Kudo");
        //obj1.put(null,null);  NPE

        System.out.println(obj1);
    }
}

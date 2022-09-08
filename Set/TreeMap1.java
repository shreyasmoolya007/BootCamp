import java.util.TreeMap;

public class TreeMap1 {
    public static void main(String[] args) {
        TreeMap obj1=new TreeMap();

        obj1.put(3,"Banglore");
        obj1.put(2,"Manglore");
        obj1.put(1,"Coimbtore");

        System.out.println(obj1);

        obj1.remove(2);

        System.out.println(obj1);
    }
}

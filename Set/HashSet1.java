import java.util.HashSet;
import java.util.Set;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet s1=new HashSet();

        s1.add("Kudo");
        s1.add("Kaito");
        s1.add("Tanjiro");
        s1.add(null);
        s1.add("Kaito");

        System.out.println(s1);
        System.out.println(s1.contains("Tanjiro"));

        System.out.println(s1.size());
    }
}
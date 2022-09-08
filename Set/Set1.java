import java.util.LinkedHashSet;
import java.util.Set;

public class Set1 {
    public static void main(String[] args) {
        Set<String> s1=new LinkedHashSet();

        s1.add("Kudo");
        s1.add("Kaito");
        s1.add("Tanjiro");
        s1.add("Kaito");

        System.out.println(s1);
    }
}

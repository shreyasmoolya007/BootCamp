import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {
    public static void main(String[] args) {
        LinkedHashSet<String> ls=new LinkedHashSet();

        ls.add("Kaito");
        ls.add("Kuruba");
        ls.add("Shinichi");

        //System.out.println(ls);

        Iterator<String> i=ls.iterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}

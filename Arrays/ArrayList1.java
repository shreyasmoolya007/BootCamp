

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);

        Iterator i = list.listIterator();

//        System.out.println(i.hasNext());
//        System.out.println(i.next());
//        System.out.println(i.next());
//        System.out.println(i.next());
//        System.out.println(i.next());
//        System.out.println(i.next());
//        System.out.println(i.hasNext());
//        System.out.println(i.next());
//        System.out.println(i.next());
//        System.out.println(i.next());
//        System.out.println(i.hasNext());
//        System.out.println(i.next());

        while (i.hasNext()) {
            System.out.println(i.next());
        }

        ArrayList<Character> al = new ArrayList<>();
        Iterator i2 = al.listIterator();

        al.add('A');
        al.add('B');
        al.add('C');
        al.add('D');
        al.add('E');

        System.out.println(al);
        for (int j = 0; j < al.size(); j++) {
            System.out.println(al.get(j));
        }

        for (Object o: al) {
            System.out.println("="+o);
        }

        Collections.reverse(al);
        System.out.println(al);

        Collections.sort(al);
        System.out.println(al);
    }
}
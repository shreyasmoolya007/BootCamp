public class BookDriver {
    public static void main(String[] args) {
        Book[] b=new Book[5];

        b[0]=new Book("Java",1);
        b[1]=new Book("Python",3);
        b[2]=new Book("M2",2);
        b[3]=new Book("JavaScript",4);

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}

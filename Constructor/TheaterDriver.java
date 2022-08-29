public class TheaterDriver {
    public static void main(String[] args) {
        Theater t1=new Theater();
        Theater t2=new Theater("INOX");
        Theater t3=new Theater("BHARATH","Manipal");
        Theater t4=new Theater("KALPANA","Udupi",100);

        t1.details();
        System.out.println("-------------");
        t2.details();
        System.out.println("-------------");
        t3.details();
        System.out.println("-------------");
        t4.details();

    }
}

public class Child extends Parent{
    int c=30;
    int d=40;

    public static void main(String[] args) {
        Child c=new Child();
        System.out.println(c.c);
        System.out.println(c.a);

        Parent p=new Parent();
        System.out.println(p.a);
        //System.out.println(p.d); CTE(Parent cant access child class)

        Parent p1=new Child();
        System.out.println(p1.a);
        //System.out.println(p1.c);
    }
}

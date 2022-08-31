public class Sheela extends Ram {
    int b=10;

    public static void main(String[] args) {
        Sheela s=new Sheela();
        System.out.println(s.a);
        System.out.println(s.b);

        Ram r=new Ram();
        System.out.println(r.a);
        //System.out.println(r.b);  CTE

        Ram r1=new Sheela(); //UPCASTING
        System.out.println(r1.a);

        Sheela s1=(Sheela) r1; //DOWNCASTING
        System.out.println(s1.b);


    }
}
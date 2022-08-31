public class CollegeDriver {
    public static void main(String [] args){
        College c1=new College("Alvas","Manglore");
        College c2=c1;
        College c3=c2;

        System.out.println(c2.name);
        System.out.println(c3.name);
        System.out.println(c1.name);
    }
}

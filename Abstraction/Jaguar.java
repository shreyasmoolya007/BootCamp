public class Jaguar extends Car2{
    public String run(){
        return "Run Method is Executing";
    }

    public static void main(String[] args) {
        Car2 c=new Jaguar();
        System.out.println(c.run());
    }
}

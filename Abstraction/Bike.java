public class Bike extends Vehicle {
    public int getNoOfWheels(){
        return 2;
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        Vehicle v=new Bike();
        System.out.println(v.getNoOfWheels());
    }
}

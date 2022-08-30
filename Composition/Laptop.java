public class Laptop {

    String name;
    String color;
    int price;
    MotherBoard m;


    Laptop(){}

    Laptop(String name){
        this.name=name;
    }

    Laptop(String name,String color){
        this(name);
        this.color=color;
    }

    Laptop(String name,String color,int price){
        this(name,color);
        this.price=price;
    }

    Laptop(String name, String color, int price, MotherBoard m) {
        this(name,color,price);
        this.m = m;
    }

    public void details(){
        System.out.println(this.name);
        System.out.println(this.color);
        System.out.println(this.price);
        System.out.println(m.brand);
        System.out.println(m.capacitor);
        System.out.println(m.memory);
    }
}

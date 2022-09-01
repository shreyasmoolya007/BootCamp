public class Vegetable {
    String name;
    String color;
    double price;

    Vegetable(String name,String color,double price){
        this.name=name;
        this.color=color;
        this.price=price;
    }

    public void details(){
        System.out.println(name);
        System.out.println(color);
        System.out.println(price);
    }
}

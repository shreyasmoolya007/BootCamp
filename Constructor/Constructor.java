public class Constructor {
    String name;
    String color;
    String price;

    Constructor(){

    }

    Constructor(String name){
        this.name=name;
    }

    Constructor(String name,String color){
        this(name);
        this.color=color;
    }

    Constructor(String name,String color,String price){
        this(name,color);
        this.price=price;
    }

    public  void details(){
        System.out.println(name);
        System.out.println(color);
        System.out.println(price);
    }
}

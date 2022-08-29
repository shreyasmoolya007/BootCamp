public class Theater {

    String name;
    String address;
    int price;

    Theater(){}

    Theater(String name){
        this.name=name;
    }

    Theater(String name,String address){
        this(name);
        this.address=address;
    }

    Theater(String name, String address, int price){
        this(name,address);
        this.price=price;
    }

    public void details(){
        System.out.println(this.name);
        System.out.println(this.address);
        System.out.println(this.price);

    }

}

public class Mobile {
    String brand;
    double price;

    Earphone e;

    Mobile(String brand,double price){
        this.brand=brand;
        this.price=price;
    }

    public void insertEarphone(Earphone e){
        if(this.e==null){
            this.e=e;
            System.out.println("Earphone is inserted successfully");
        }
        else
            System.out.println("Earphone already exists");
    }

    public void removeEarphone(){
        if(this.e==null){
            System.out.println("No earphone to remove");
        }
        else{
            this.e=null;
            System.out.println("Earphone is removed successfully");
        }
    }

    public void details(){
        if(this.e==null)
            System.out.println("No earphone is found to show details");
        else{
            System.out.println(this.brand);
            System.out.println(this.price);
            System.out.println(e.brand);
            System.out.println(e.color);
            System.out.println(e.price);
        }
    }
}

public class College {
    String name;
    String address;

    College(String name,String address){
        this.name=name;
        this.address=address;
    }

    public void details(){
        System.out.println(name);
        System.out.println(address);
    }
}

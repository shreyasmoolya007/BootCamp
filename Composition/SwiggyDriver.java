public class SwiggyDriver {
    public static void main(String[] args) {
        Swiggy s1= new Swiggy();

        s1.setHotelName("Garam Masala");
        s1.setGstNo(101);
        s1.setAddress("Manipal");
        s1.setBill(1000);

        s1.details();
    }
}

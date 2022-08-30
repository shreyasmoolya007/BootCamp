public class Swiggy {
    private String hotelName;
    private int gstNo;
    private String address;
    private int bill;

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getGstNo() {
        return gstNo;
    }

    public void setGstNo(int gstNo) {
        this.gstNo = gstNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    public void details(){
        System.out.println(getHotelName());
        System.out.println(getGstNo());
        System.out.println(getAddress());
        System.out.println(getBill());
    }
}

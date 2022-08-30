public class MotherBoard {

    String brand;
    int capacitor;
    int memory;

    MotherBoard(){}

    MotherBoard(String brand){
        this.brand=brand;
    }

    MotherBoard(String brand,int capacitor){
        this(brand);
        this.capacitor=capacitor;
    }

    MotherBoard(String brand,int capacitor,int memory){
        this(brand,capacitor);
        this.memory=memory;
    }
}

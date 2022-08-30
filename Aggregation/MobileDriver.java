import java.util.Scanner;

public class MobileDriver {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Mobile m=new Mobile("I Phone",100000);

        boolean exit=true;

        while(exit){
            System.out.println("Enter the choice\n1]Insert Earphone\n2]Remove Earphone\n3]Earphone details");
            int choice=sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter the brand");
                    String brand=sc.next();
                    System.out.println("Enter the color");
                    String color=sc.next();
                    System.out.println("Enter the price");
                    double price=sc.nextInt();
                    m.insertEarphone(new Earphone(brand,color,price));
                    System.out.println("Earphone is inserted");
                    break;


                case 2:
                    m.removeEarphone();
                    break;

                case 3:
                    m.details();
                    break;

                case 4:
                    exit=false;
                    break;

                default:
                    System.out.println("Invalid choice");


            }
        }
    }
}

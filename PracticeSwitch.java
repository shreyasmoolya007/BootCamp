import java.util.Scanner;

public class PracticeSwitch {
    public static void main(String[] args) {
        /*int ch = 3;

        switch(ch){
            case 1:
                System.out.println("Good Morning");
                break;

            case 2:
                System.out.println("Good Night");
                break;

            default:
                System.out.println("Good Afternoon");
        }

        Scanner scan =new Scanner(System.in);
        int ch=scan.nextInt();

        switch(ch){
            case 1:
                System.out.println("Addition");
                break;

            case 2:
                System.out.println("Subtraction");
                break;

            case 3:
                System.out.println("Multiplication");

            case 4:
                System.out.println("Division");
        }*/

        Scanner scan =new Scanner(System.in);


        System.out.println("1.IDLY\n2.DOSA\n3.VADA\n4.TEA");
        int ch=scan.nextInt();
        switch (ch){
            case 1:
                System.out.println("IDLY IS ON THE WAY");
                break;

            case 2:
                System.out.println("DOSA IS ON THE WAY");
                break;

            case 3:
                System.out.println("VADA IS ON THE WAY");
                break;

            case 4:
                System.out.println("TEA IS ON THE WAY");
        }
    }
}

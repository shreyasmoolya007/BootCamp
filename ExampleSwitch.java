import java.util.Scanner;

public class ExampleSwitch {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int ch=scan.nextInt();

        switch(ch){
            case 1:
                System.out.println("Singing");
                break;
            case 2:
                System.out.println("Dancing");
                break;
            case 3:
                System.out.println("Sleeping");
                break;
            case 4:
                System.out.println("Mono Acting");
                break;
            default:
                System.out.println("Pass");
        }
    }
}

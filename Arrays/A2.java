import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
        int n=5;
        int[] arr=new int[n];
        Scanner in=new Scanner(System.in);

        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}

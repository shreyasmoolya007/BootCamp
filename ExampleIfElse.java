import java.util.Scanner;

public class ExampleIfElse {
    public static void main(String[] args) {
        /*char a='1';
        if((a>='A' && a<='Z') || (a>='a' && a<='z'))
            System.out.println("Alphabet");
        else if(a>='0' && a<='9')
            System.out.println("Digit");
        else
            System.out.println("Special");

        //---Lucky number---

        Scanner scan = new Scanner(System.in);
        int a=scan.nextInt();

        String result=(a%5==0)?"Lucky":"Do nothing";
        System.out.println(result);

        //---UpperCase Lucky---

        Scanner scan = new Scanner(System.in);
        char a=scan.next().charAt(0);

        String result=(a>='A' && a<='Z')?"Lucky":"Do nothing";
        System.out.println(result);

        //---Largest from user---

        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int p=scan.nextInt();
        int q=scan.nextInt();

        if(n>p && n>q)
            System.out.println(n);
        else if(p>n && p>q)
            System.out.println(p);
        else
            System.out.println(q);*/

        //---Smallest from user---

        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int p=scan.nextInt();
        int q=scan.nextInt();

        if(n<p && n<q)
            System.out.println(n);
        else if(p<n && p<q)
            System.out.println(p);
        else
            System.out.println(q);

    }
}


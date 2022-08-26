import java.util.Scanner;

public class ExampleLoop {
    public static void main(String[] args) {
       /*
       ----Example 1---
       int a=1;
        int b=3;

        while(a<=b){
            System.out.println("Hi Raja");
            System.out.println(a);
            a++;
        }
        System.out.println(a);

        System.out.println("Main Start");
        int a=10;

        do{
            System.out.println("Hii Sheela");
            a++;
        }
        while(a<=14);

        ---Example 2---
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();

        for(int i=1;i<=n;i++){
            System.out.println(i);
        }


        ---Example 3---
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int sum=0;

        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);


        ---Example 4---
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int sum=1;

        for(int i=1;i<=10;i++){
            sum=n*i;
            System.out.println(n+" * "+i+" = "+sum);
        }


        ---Example 5---
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int a=1;

        for(int i=n;i>0;i--){
            a=a*i;
        }
        System.out.println(a);


        ---Example 6---
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();

        n=n+m;
        m=n-m;
        n=n-m;

        System.out.println(n+" "+m);


        ---Example 7---
        int a=10;

        for(int i=1;i<=a;i++){
            if(a%i==0)
                System.out.println(i);
        }


        ---Example 8---
        int n=121;
        int a=n;
        int sum=0,r;
        while(n>0){
            r=n%10;
            n=n/10;
            sum=(sum*10)+r;
        }
        if(a==sum)
        System.out.println("Palindrome");


        ---Example 9---
        int a=27;
        int n=a/2;
        int flag=0;

        for(int i=2;i<=n;i++){
            if(a%i==0)
                flag=1;
        }
        if(flag==1)
            System.out.println("Not Prime");
        else
            System.out.println("Prime");

        ---Example 10---
        int n=12345;
        int a=n;
        int sum=0,r;
        while(n>0){
            r=n%10;
            n=n/10;
            sum=(sum*10)+r;
        }
        System.out.println(sum);


        ---Example 11---
        display();
    }
        public static void display(){
        for (char i = 'a'; i <='z' ; i++) {
            System.out.print(i + " ");
        }

        }


        ---Example 12---
            System.out.println("Main start");
            ravi();
            System.out.println("main end");
        }
        public static void ravi() {
            System.out.println("Hii from ravi");
            radha();
            System.out.println("Bye from ravi");
        }
        public static void radha() {
            System.out.println("Hii from radha");
            laila();
            System.out.println("Bye from radha");
        }
        public static void laila() {
            System.out.println("Hii from laila");
            System.out.println("Byee from laila");
        }


        ---Example 13---
        int a = 10, b = 20;
        int res = add(a, b);
        System.out.println(res);
    }

    public static int add(int num1, int num2) {
        return num1+num2;
    }


        ---Example 14-- -
        int r = 10;
        double ans = area(r);
        System.out.println(ans);
    }

    public static double area(int rad) {
        return 2 * 3.14 * rad;
    }

        ---Example 15---
        int a = 70;
        int b = 80;

        int ans=stu(a,b);

        if(ans==a)
            System.out.println("QWERTY");
        else
            System.out.println("YTREWQ");

    }

    public static int stu(int first, int second) {
        if (first < second)
            return second;
        else
            return first;
    }*/

        int a = 10, b = 20;
        int x=add(a,b);
        System.out.println(x);

        int y=sub(a,b);
        System.out.println(y);

        int z=mul(a,b);
        System.out.println(z);

        int v=div(a,b);
        System.out.println(v);

    }

    public static int add(int a,int b){
        return a+b;
    }

    public static int sub(int a,int b){
        return a-b;
    }

    public static int mul(int a,int b){
        return a*b;
    }

    public static int div(int a,int b){
        return a/b;
    }


}

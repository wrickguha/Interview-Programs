import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n1=0,n2=1,n3;
        System.out.println("Enter the range: ");
        int num=sc.nextInt();
        System.out.println(n1+" "+n2);
        for(int i=2;i<num;i++)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
        sc.close();
    }
}

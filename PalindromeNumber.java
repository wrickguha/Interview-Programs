import java.util.Scanner;
public class PalindromeNumber{
    public static void main(String[] args) {
        int reverse=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number=sc.nextInt();
        int num=number;
        while(num!=0)
        {
            int remainder=num%10;
            reverse=reverse*10+remainder;
            num=num/10;
        }
        if(number==reverse)
        {
            System.out.println("The number "+number+" is a palindrome number");
        }
        else
        {
            System.out.println("The number "+number+" is not a palindrome number");
        }
        sc.close();
    }
}
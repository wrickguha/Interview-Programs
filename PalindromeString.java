import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str= sc.nextLine();
        String reverse="";
        for(int i=0;i<str.length();i++)
        {
            reverse=str.charAt(i)+reverse;
        }
        if(str.equals(reverse))
        {
            System.out.println("The String is a palindrome string");
        }
        else
        {
            System.out.println("The String is not a palindrome string");
        }

        sc.close();
    }
}

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str= sc.nextLine();
        String reverse="";
        for(int i=0;i<str.length();i++)
        {
            reverse=str.charAt(i)+reverse;
        }
        System.out.println("The reversed string is "+reverse);
        sc.close();
    }
}

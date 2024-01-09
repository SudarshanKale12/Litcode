import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(int x) {
        if(x < 0)
        {
            return false;
        }
        int rev=0;

        for (int i=x ; i!=0; i/=10)
        {
            int rem=i % 10;

            rev=rev*10 + rem;
        }

        return x == rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        boolean result =isPalindrome(num);
        System.out.println(result);

    }
}

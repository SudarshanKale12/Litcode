//Given a positive integer num, return true if num is a perfect square or false otherwise.
//A perfect square is an integer that is the square of an integer. In other words, it is the product of some
// integer with itself.
//You must not use any built-in library function, such as sqrt.
import java.util.Scanner;

public class PerfectSqRt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean result=isPerfectSquare(num);
        System.out.println(result);
    }
    public static boolean isPerfectSquare(int num)
    {
        if (num==1)
        {
            return true;
        }
        for (int i = 2; i <= num/2; i++)
        {

            if ( i*i==num)
            {
                System.out.println(i);
                return true;
            }
        }
        return false;
    }
}

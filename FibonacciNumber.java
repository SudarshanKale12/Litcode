//The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence,
// such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
//F(0) = 0, F(1) = 1
//F(n) = F(n - 1) + F(n - 2), for n > 1.
//Given n, calculate F(n).

import java.util.Scanner;
public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
//        if(n>0)
//        {
        System.out.println(fib(n));
//        }
//        else if (n==0) {
//            System.out.println(n);
//        }
    }
    public static int fib(int n)
    {
        int n1=0;
        int n2=1;
        int n3=1;
        if (n==0){
            return n;
        }
        for (int i=0; i<=n-2 ; i++)
        {
            n3=n1+n2;
            n1=n2;
            n2=n3;
        }
        return n3;
    }
}

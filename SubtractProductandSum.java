import java.util.Scanner;
//Given an integer number n, return the difference between the product of its digits and the sum of its
// digits.
public class SubtractProductandSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
//        System.out.println("sum"+sumOfDigits(num));
//        System.out.println("product"+productOfDigits(num));
//        System.out.println( "result="+subtractProductAndSum(productOfDigits(num),sumOfDigits(num)));
        int product = productOfDigits(num);
        int sum = sumOfDigits(num);
        System.out.println("result="+subtractProductAndSum(product,sum));

    }
    public static int productOfDigits(int num) {
        int product = 1;
        while (num != 0) {
            int rem = num % 10;
            if (rem != 0) {
                product = product * rem;
            }
            num /= 10;
        }
//        System.out.println(product);
        return product;
    }
    public static int sumOfDigits(int num){
        int sum=0;
        while (num!=0)
        {
            int rem=num%10;
            if (rem!=0)
            {
                sum=sum+rem;
            }
            num/=10;
        }
        return sum;
    }
    public static int subtractProductAndSum( int product, int sum) {
        return (product-sum);

    }
}


import java.util.Scanner;

public class AddTwoNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1=sc.nextInt();
        System.out.println("Enter 2nd number");
        int num2=sc.nextInt();
        System.out.println(sum(num1, num2));
    }
    public static int sum(int num1, int num2) {
        return num1+num2;
    }
}

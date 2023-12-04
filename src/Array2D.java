//find the x number from matrix/2d arry and then print its position(row and column)
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("rows");
        int rows=sc.nextInt();
        System.out.println("columns");
        int col= sc.nextInt();

        int[][] matrix=new int[rows][col];

        //inputs
        for(int i=0; i<rows;i++)//rows
        {
            for (int j=0;j<col;j++)//columns
            {
                matrix[i][j]=sc.nextInt();
            }
        }

        //print
//        for(int i=0; i<rows;i++)//rows
//        {
//            for (int j = 0; j < col; j++)//columns
//            {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }

        //find
        System.out.println("enter a number you want to find");
        int find=sc.nextInt();

        for(int i=0; i<rows;i++)//rows
        {
            for (int j = 0; j < col; j++)//columns
            {
                if (find==matrix[i][j])
                {
                    System.out.println("row "+i+"column "+j);
                }
            }
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1D Array, List
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] myarray = new int[n];
        for(int i=0; i<n; i++)
        {
            myarray[i] = input.nextInt();
        }

        for(int item : myarray)
        {
            System.out.println(item + ", ");
        }

        //2D Array, Matrix
        int row, column;
        row = input.nextInt();
        column = input.nextInt();
        int[][] matrix = new int[row][column];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                matrix[i][j] = input.nextInt();
            }
        }

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        //Jagged Array
        int[][] jagged;
        jagged = new int[3][];
        jagged[0] = new int[]{1,2};
        jagged[1] = new int[]{3,4,5};
        jagged[2] = new int[]{6};

        for(int[] array: jagged)
        {
            for(int value: array)
            {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

}
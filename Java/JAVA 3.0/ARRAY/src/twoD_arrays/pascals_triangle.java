package twoD_arrays;

import java.util.Scanner;

public class pascals_triangle {
    static void input(int[][] arr,int r)
    {
        for(int i = 0;i<r;i++)
        {
            // ith row has i+1 columns
            arr[i] = new int[i+1];
            for(int j = 0; j<i+1;j++)
            {
                if(i == j || j == 0  )
                {
                    arr[i][j] = 1;
                }
                else {
                    arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
                }
            }
        }
    }
    static void print(int[][] arr,int r)
    {
        for(int i = 0; i< r;i++)
        {
            for(int j = 0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of the pascals triangle");
        int r = sc.nextInt();
        int[][] pascalsTriangle = new int[r][];
        input(pascalsTriangle,r);
        print(pascalsTriangle,r);
    }
}

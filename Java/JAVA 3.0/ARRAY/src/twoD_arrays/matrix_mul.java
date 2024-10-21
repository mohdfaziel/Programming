package twoD_arrays;

import java.util.Scanner;

public class matrix_mul {
    static void multiplication(int[][] arr1,int[][] arr2,int r1,int c1,int r2,int c2)
    {
        if(r2!=c1)
        {
            System.out.println("Matrix are not suitable for multiplication");
            return;
        }
        int[][] mul = new int[r1][c2];
        for(int i = 0;i<r1;i++)
        {
            for(int j = 0;j<c2;j++)
            {
               for(int k = 0; k<r2;k++)
               {
                   mul[i][j] += arr1[i][k]*arr2[k][j];
               }
            }
            System.out.println();
        }
        printArr(mul,r1,c2);
    }

    static void printArr(int[][] arr,int r,int c)
    {
        for(int i = 0;i<r;i++)
        {
            for(int j = 0;j<c;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void inputArr(int[][] arr,int r,int c)
    {
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<r;i++)
        {
            for(int j = 0;j<c;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows of first matrix");
        int r1 = sc.nextInt();
        System.out.println("Enter no. of columns first matrix");
        int c1 = sc.nextInt();
        int[][] arr1 = new int[r1][c1];
        System.out.println("Enter no. of rows of second matrix");
        int r2 = sc.nextInt();
        System.out.println("Enter no. of columns second matrix");
        int c2 = sc.nextInt();
        int[][] arr2 = new int[r2][c2];
        System.out.println("Enter elements of first matrix");
        inputArr(arr1,r1,c1);
        System.out.println("Enter elements of second matrix");
        inputArr(arr2,r2,c2);
        multiplication(arr1,arr2,r1,c1,r2,c2);


    }
}

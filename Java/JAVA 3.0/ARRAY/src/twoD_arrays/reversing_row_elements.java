package twoD_arrays;

import java.util.Scanner;

public class reversing_row_elements {
    static void reverseRow(int[][] arr,int r,int c)
    {
        for(int i = 0; i< r;i++)
        {
            int j = 0;
            int k = c-1;
            while(j<k)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[i][k];
                arr[i][k] = temp;
                j++;
                k--;
            }
        }
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
        System.out.println("Enter no. of rows");
        int r = sc.nextInt();
        System.out.println("Enter no. of columns");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        inputArr(arr,r,c);
        reverseRow(arr,r,c);
        printArr(arr,r,c);

    }

}

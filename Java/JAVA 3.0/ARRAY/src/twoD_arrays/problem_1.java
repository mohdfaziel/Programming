package twoD_arrays;

import java.util.Scanner;

// given a matrix rotate it be 90 degree
public class problem_1 {

    static void transpose(int[][] arr,int n)
    {
        for(int i = 0;i<n;i++)
        {
            for(int j = i;j<n;j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    static void reverseArr(int[] arr)
    {
        int i = 0;
        int j = arr.length-1;
        while(i<j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    static void rotate(int[][] arr, int n)
    {
        transpose(arr,n);
        for(int i = 0; i<n;i++)
        {
            reverseArr(arr[i]);
        }
    }


    static void printArr(int[][] arr, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void inputArr(int[][] arr, int r, int c) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows of  matrix");
        int r1 = sc.nextInt();
        System.out.println("Enter no. of columns  matrix");
        int c1 = sc.nextInt();
        int[][] arr1 = new int[r1][c1];
        System.out.println("Enter elements of  matrix");
        inputArr(arr1, r1, c1);
        rotate(arr1,r1);
        printArr(arr1,r1,c1);
        System.out.println(arr1[0].length);
    }
}

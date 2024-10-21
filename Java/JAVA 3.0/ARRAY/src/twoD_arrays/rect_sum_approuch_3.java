package twoD_arrays;

import java.util.Scanner;

public class rect_sum_approuch_3 {
    static void inputArr(int[][] arr, int r, int c) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
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

    static void prefixSumRow(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                matrix[i][j] = matrix[i][j] + matrix[i][j - 1];
            }
        }
    }
    static void prefixSumCol(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        for (int i = 0; i < c; i++) {
            for (int j = 1; j < r; j++) {
                matrix[j][i] = matrix[j][i] + matrix[j-1][i];
            }
        }
    }

    static int rectSum(int[][] matrix, int l1, int r1, int l2, int r2) {
        prefixSumRow(matrix);
        prefixSumCol(matrix);
        System.out.println("Now the matrix became");
        printArr(matrix,matrix.length,matrix[0].length);
        int sum = matrix[l2][r2];
        int top = 0;
        int left = 0;
        int topLeft = 0;
        if(l1>0)
        {
            top = matrix[l1-1][r2];
        }
        if(r1>0)
        {
            left = matrix[l2][r1-1];
        }
        if(l1>0 && r1>0)
        {
            topLeft = matrix[l1-1][r1-1];
        }
        sum = sum - top - left + topLeft;
        return sum;
    }
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimensions of the matrix rxc");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        System.out.println("Enter the elements of the array");
        inputArr(matrix, r, c);
        System.out.println("Enter the value of l1");
        int l1 = sc.nextInt();
        System.out.println("Enter the value of r1");
        int r1 = sc.nextInt();
        System.out.println("Enter the value of l2");
        int l2 = sc.nextInt();
        System.out.println("Enter the value of r2");
        int r2 = sc.nextInt();
        int sum = rectSum(matrix, l1, r1, l2, r2);
        System.out.println("Sum of the elements under the given range is: " + sum);
    }
}

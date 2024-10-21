package twoD_arrays;

import java.util.Scanner;

// wap to find sum of a rectangle from its vertices in a 2d array
public class rectangle_sum {
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

    static void prefixSum(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                matrix[i][j] = matrix[i][j] + matrix[i][j - 1];
            }
        }
    }

    static int rectSum(int[][] matrix, int l1, int r1, int l2, int r2) {
        prefixSum(matrix);
        int sum = 0;
        for (int i = l1; i <= l2; i++) {
            if (r1 >= 1) {
                sum += matrix[i][r2] - matrix[i][r1 - 1];
            } else {
                sum += matrix[i][r2];
            }
        }
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


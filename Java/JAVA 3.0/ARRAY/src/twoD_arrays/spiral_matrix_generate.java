package twoD_arrays;

import java.util.Scanner;

public class spiral_matrix_generate {
    static int[][] generateMatrix(int n) {
        int[][] spiralMatrix = new int[n][n];
        int topRow = 0;
        int rightCol = n-1;
        int bottomRow = n-1;
        int leftCol = 0;
        int value = 1;
        while(value <= n*n )
        {
            for(int i = leftCol; i<=rightCol && value <= n*n ;i++)
            {
                spiralMatrix[topRow][i]= value;
                value++;
            }
            topRow++;
            for(int j = topRow;j<=bottomRow && value <= n*n;j++)
            {
                spiralMatrix[j][rightCol]=value;
                value++;
            }
            rightCol--;
            for(int k = rightCol; k>=leftCol && value <= n*n;k--)
            {
                spiralMatrix[bottomRow][k]=value;
                value++;
            }
            bottomRow--;
            for(int i = bottomRow; i>=topRow && value <= n*n ;i--)
            {
                spiralMatrix[i][leftCol]=value;
                value++;
            }
            leftCol++;
        }
        return spiralMatrix;

    }
    static void printArr(int[][] arr, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt();
        int[][] spiralMatrix = generateMatrix(n);
        printArr(spiralMatrix,n,n);
    }
}
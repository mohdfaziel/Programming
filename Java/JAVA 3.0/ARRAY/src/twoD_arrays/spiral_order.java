package twoD_arrays;

import java.util.Scanner;

public class spiral_order {
    static void spiralPrint(int[][] arr,int r,int c)
    {
       int topRow = 0;
       int rightCol = c-1;
       int bottomRow = r-1;
       int leftCol = 0;
       int totalTraversal = 0;
       while(totalTraversal < r*c )
       {
           //printing top row from 0 to rightcol
           for(int i = leftCol; i<=rightCol && totalTraversal < r*c ;i++)
           {
               System.out.print(arr[topRow][i]+" ");
               totalTraversal++;
           }
           topRow++;
           // printing right column from toprow+1 to bottomrow
           for(int j = topRow;j<=bottomRow && totalTraversal < r*c;j++)
           {
               System.out.print(arr[j][rightCol]+" ");
               totalTraversal++;
           }
           rightCol--;
           //printing bottom row from rightcol-1 to leftcol
           for(int k = rightCol; k>=leftCol && totalTraversal < r*c;k--)
           {
               System.out.print(arr[bottomRow][k]+" ");
               totalTraversal++;
           }
           bottomRow--;
           //printing left column from bottomrow-1 to toprow +1
           for(int i = bottomRow; i>=topRow && totalTraversal < r*c ;i--)
           {
               System.out.print(arr[i][leftCol]+" ");
               totalTraversal++;
           }
           leftCol++;
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
        spiralPrint(arr,r,c);

    }
}

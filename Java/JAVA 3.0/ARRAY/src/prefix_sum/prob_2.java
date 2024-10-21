package prefix_sum;

import java.util.Scanner;
//given an array of integers of size n and q queries where you need to print the sum of the values in a given
//range of indices from l to r (both included)
public class prob_2 {
    static void input(int[] arr)
    {
        Scanner sc = new Scanner(System.in);
        for(int i = 1;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
    }
    static void prefixSum(int[] arr)
    {
        for(int i = 1; i<arr.length;i++)
        {
            arr[i] = arr[i-1] + arr[i];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size+1];
        System.out.println("Enter the values of the array");
        input(arr);
        prefixSum(arr);
        System.out.println("Enter the number of queries");
        int queries = sc.nextInt();
        while(queries-->0)
        {
            System.out.println("Enter the range l and r");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int answer = arr[r] - arr[l-1];
            System.out.println("Sum: "+ answer);

        }
    }

}

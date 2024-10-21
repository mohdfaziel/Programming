package prefix_sum;

import java.util.Scanner;
public class prob_1 {
    static void input(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
    static void prefixSum(int[] arr)
    {
        for(int i = 1;i<arr.length;i++)
        {
            arr[i] = arr[i-1] + arr[i];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        input(arr);
        prefixSum(arr);
        for(int i = 0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

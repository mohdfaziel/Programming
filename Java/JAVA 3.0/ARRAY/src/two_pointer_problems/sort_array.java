package two_pointer_problems;

import java.util.Scanner;

public class sort_array {
    static void input(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
    static int noOfZeroes(int[] arr)
    {
        int count = 0;
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                count++;
            }
        }
        return count;
    }
    static void sort(int[] arr,int zeroes)
    {
        for(int i =0;i<zeroes;i++)
        {
            arr[i] = 0;
        }
        for(int i = zeroes;i<arr.length;i++)
        {
            arr[i] = 1;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        input(arr);
        int zeroes = noOfZeroes(arr);
        sort(arr,zeroes);
        for(int i = 0; i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

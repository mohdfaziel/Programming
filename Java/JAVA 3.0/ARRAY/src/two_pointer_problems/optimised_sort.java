// optimized sort of array containing only 1 and 0
package two_pointer_problems;

import java.util.Scanner;

public class optimised_sort {
    static void input(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
    static void optimized_sort(int[] arr)
    {
        int left = 0;
        int right = arr.length - 1;
        while(left<right)
        {
            if((arr[left]==1) && (arr[right]==0))
            {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            if(arr[left]==0)
            {
                left++;
            }
            if(arr[right]==1)
            {
                right--;
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        input(arr);
        optimized_sort(arr);
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

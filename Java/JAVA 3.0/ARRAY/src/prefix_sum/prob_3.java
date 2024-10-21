package prefix_sum;

import java.awt.*;
import java.util.Scanner;

// check if the partition the array into two subarrays with equal sum more
public class prob_3 {
    static void input(int[] arr)
    {
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
    }
    static int totalSum(int[] arr)
    {
        int total = 0;
        for(int i = 0;i<arr.length;i++)
        {
            total +=arr[i];
        }
        return total;
    }

    static boolean partition(int[] arr)
    {
        int totalSum = totalSum(arr);
        int prefSum = 0;
        for(int i = 0;i<arr.length;i++)
        {
            prefSum+=arr[i];
            int sufSum = totalSum - prefSum;
            if(sufSum==prefSum)
            {
                return true;
            }

        }
        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the values of the array");
        input(arr);
        boolean answer = partition(arr);
        System.out.println("Equal partition: "+answer);
    }

}

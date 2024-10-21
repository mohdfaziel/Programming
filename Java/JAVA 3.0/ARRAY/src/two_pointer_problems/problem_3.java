// given an array a sorted in non-decreasing order return an array if the square of each no. sorted
//in non-decreasing order
package two_pointer_problems;

import java.util.Scanner;

public class problem_3 {
    static void input(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
    static void reverse(int[] arr)
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

    static int[] non_decreasing_square_array(int[] arr)
    {
        int left = 0;
        int right = arr.length - 1;
        int[] newArr = new int[arr.length];
        int index = 0;
        while(left<=right)
        {
            if((Math.abs(arr[left]))>(Math.abs(arr[right])))
            {
                newArr[index++] = arr[left] * arr[left];
                left++;
            }
            else
            {
                newArr[index++] = arr[right]*arr[right];
                right--;
            }
        }
        reverse(newArr);
        return newArr;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        input(arr);
        int[] newArr = non_decreasing_square_array(arr);

        for(int i = 0;i<newArr.length;i++)
        {
            System.out.print(newArr[i]+" ");
        }
    }
}

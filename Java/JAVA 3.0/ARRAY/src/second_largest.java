import java.util.Scanner;

public class second_largest {
    static void input(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
    static int secondLargest(int[] arr)
    {
        int max = arr[0];
        for(int i = 0; i<arr.length;i++)
        {
            if(arr[i]>= max)
            {
                max = arr[i];
            }
        }
        for(int i = 0; i< arr.length;i++)
        {
            if(arr[i]==max)
            {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int max_2 = arr[0];
        for(int i = 0; i<arr.length;i++)
        {
            if(arr[i]>= max_2)
            {
                max_2 = arr[i];
            }
        }
        return max_2;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        input(arr);
        int secondLargest = secondLargest(arr);
        System.out.println(("Second largest element in this array is: "+secondLargest));

    }
}

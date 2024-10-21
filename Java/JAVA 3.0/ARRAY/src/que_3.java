import java.util.Scanner;

// check if array is sorted or not
public class que_3 {
    static void input(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
    static boolean isSorted(int[] arr)
    {
        boolean answer = true;
        for(int i = 1; i< arr.length; i++)
        {

            if(arr[i-1]>arr[i])
            {
                answer = false;
                break;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        input(arr);
        boolean x = isSorted(arr);
        if(x)
        {
            System.out.println("Array is sorted");
        }
        else
        {
            System.out.println("Array is not sorted");
        }
    }

}

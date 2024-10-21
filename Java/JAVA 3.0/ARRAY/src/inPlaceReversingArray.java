import java.util.Scanner;

public class inPlaceReversingArray {
    static void input(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
    static void swap(int[] arr,int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reversedArray(int[] arr)
    {
        int i = 0;
        int j = arr.length - 1;
        while(i<j)
        {
            swap(arr,i,j);
            i++;
            j--;
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        input(arr);
        reversedArray(arr);
        System.out.print("Reversed array is: ");
        for(int i = 0; i<arr.length;i++)
        {
            System.out.print(arr[i]+"\t");
        }

    }
}

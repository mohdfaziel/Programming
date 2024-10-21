import java.util.Scanner;

public class InplaceRotationArray {
    static void input(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
    static void reverseArray(int[] arr,int i,int j)
    {
        while(i<j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    static int[] InplaceRotate(int[] arr,int k)
    {
        int n = arr.length;
        k = k%n;
        reverseArray(arr,0,n-k-1);
        reverseArray(arr,n-k,n-1);
        reverseArray(arr,0,n-1);
        return arr;
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        input(arr);
        System.out.println("Enter the no of steps of rotation");
        int k = sc.nextInt();
        System.out.println("Hence inplace Rotated Array is: ");
        InplaceRotate(arr,k);
        for(int i = 0; i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}

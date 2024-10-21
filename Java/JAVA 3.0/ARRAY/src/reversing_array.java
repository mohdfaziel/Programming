import java.util.Scanner;

public class reversing_array {
    static void input(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
    static int[] reversedArray(int[] arr)
    {
        int[] reversearr = new int[arr.length];
        int j = 0;
        for(int i = arr.length-1;i>=0;i--)
        {
            reversearr[j++] = arr[i];
        }
        return reversearr;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        input(arr);
        int[] reversed = reversedArray(arr);
        System.out.print("Reversed array is: ");
        for(int i = 0; i<reversed.length;i++)
        {
            System.out.print(reversed[i]+"\t");
        }

    }
}

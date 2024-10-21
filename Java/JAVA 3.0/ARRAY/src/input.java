import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        for(int i = 0; i< arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}

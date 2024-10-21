import java.util.Scanner;

//wap to create a method which takes an array A input and returns another
// array B of two elements where first element of B is the smallest
// element of A and second element is the largest element of A
public class que_4 {
    static void input(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
    static int[] special(int[] arr)
    {
        int min = arr[0];
        int max = arr[0];
        for(int i = 0; i< arr.length ;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
            if(arr[i]<min)
            {
                min = arr[i];
            }
        }
        int[] arr_2 = {min,max};
        return arr_2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        input(arr);
        int[] newArr = special(arr);
        System.out.println("Smallest element of the array is: "+ newArr[0]);
        System.out.println("Greatest element of the array is: "+ newArr[1]);

    }
}

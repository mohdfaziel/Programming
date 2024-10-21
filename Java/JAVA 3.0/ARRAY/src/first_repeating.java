import java.util.Scanner;

public class first_repeating {
    static void input(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
    static int firstRepeating(int[] arr)
    {
        int answer = -1;
        for(int i = 0; i< arr.length ; i++)
        {
            for(int j = i+1; j< arr.length; j++)
            {
                if(arr[i]==arr[j])
                {
                    return arr[i];
                }
            }
        }
        return -1;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        input(arr);
        int firstRepeating = firstRepeating(arr);
        System.out.println("First repeating term is: "+ firstRepeating);


    }
}

import java.util.Scanner;

public class rotationInArray {
    static void input(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
    static int[] rotated(int[] arr,int k)
    {
        int n = arr.length;
        k = k%n;
        int[] rotatedArray = new int[n];
        int z = 0;
        for(int i = n-k ; i<= n-1; i++)
        {
            rotatedArray[z++] = arr[i];
        }
        for(int j = 0; j<=n-k-1;j++)
        {
            rotatedArray[z++] = arr[j];
        }
        return rotatedArray;
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
        int[] answerArray = rotated(arr,k);
        System.out.println("Rotated array is: ");
        for(int i = 0;i< answerArray.length;i++)
        {
            System.out.print(answerArray[i]+ " ");
        }
        }
}

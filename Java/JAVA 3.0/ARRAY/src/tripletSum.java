import java.util.Scanner;

public class tripletSum {
    static void input(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
    static int tripletSum(int[] arr,int target)
    {
        int count = 0;
        for(int i = 0; i< arr.length ; i++)
        {
            for(int j = i+1;j<arr.length;j++)
            {
                for(int k = j+1; k<arr.length;k++)
                {
                    if((arr[i]+arr[j]+arr[k]==target))
                    {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        input(arr);
        System.out.println("Enter the target element");
        int target = sc.nextInt();
        int count = tripletSum(arr,target);
        System.out.println("Number of pairs whose sum is equal to the target is: "+ count);

    }
}

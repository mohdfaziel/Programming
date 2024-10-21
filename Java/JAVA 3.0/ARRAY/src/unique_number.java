import java.util.Scanner;

public class unique_number
{
    static void input(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
    static int uniqueNumber(int[] arr)
    {
        int answer = -1;
        for(int i = 0; i<arr.length;i++)
        {
            for(int j = i+1;j<arr.length;j++)
            {
                if(arr[i] == arr[j])
                {
                    arr[i] = arr[j] = -1;
                }
            }

        }
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > 0)
            {
                answer = arr[i];
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
        int element = uniqueNumber(arr);
        if(element==-1)
        {
            System.out.println("No element is unique");
        }
        else
        {
            System.out.println("Unique element is: "+ element);
        }


    }
}

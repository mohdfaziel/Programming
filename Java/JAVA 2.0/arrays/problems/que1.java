import java.util.Scanner;

//print only the positive numbers of an array
class positiveNumbers{
    public void pn(int arr[],int size)
    {
        for(int i = 0; i< size; i++)
        {
            if(arr[i]>0)
            {
                System.out.println(arr[i]);
            }
        }
    } 

}
public class que1{
    public static void main(String[] args) {
        positiveNumbers obj = new positiveNumbers();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        for(int i = 0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        obj.pn(arr, size);
    }
}

import java.util.Scanner;

// last occurence of an element
public class que_2 {
    static int lastOccurrence(int[] arr,int element)
    {
        int index = -1;
        for(int i = 0; i<arr.length ; i++)
        {
            if(arr[i] == element){
            index = i;
            }
        }
        return index;
    }
    static void input(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        array.input(arr);
        System.out.println("Enter the element whose last occurrence is to be find");
        int element = sc.nextInt();
        int occurrence = lastOccurrence(arr,element);
        System.out.println("Last occurrence of the element is at index "+occurrence);
    }

}

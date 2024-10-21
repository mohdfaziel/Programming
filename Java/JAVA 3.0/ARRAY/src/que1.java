import java.util.Scanner;

//count the no. of occurrence of the element x in the array
class array {
    static int occurrence(int[] arr, int element) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                count++;
            }
        }
        return count;

    }

    static void input(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
}

    public class que1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the array");
            int size = sc.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter the elements of the array");
            array.input(arr);
            System.out.println("Enter the element which is to be count");
            int element = sc.nextInt();
            int count = array.occurrence(arr,element);
            System.out.println("No. of times elements is present in the array is: "+count);
        }
    }


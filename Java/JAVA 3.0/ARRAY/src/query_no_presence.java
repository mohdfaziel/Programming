import java.util.Scanner;

public class query_no_presence {
    static void input(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
    static int[] freqArr(int[] arr)
    {
        int size = (int)(Math.pow(10.0,5.0));
        int[] frequencyArr = new int[size+1];

        for(int i = 0; i < arr.length ; i++)
        {
            frequencyArr[arr[i]]++;
        }
        return frequencyArr;
    }
    static void queries(int[] fArr,int quries)
    {
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i<= quries;i++)
        {
            System.out.println("Enter query number: "+ i);
            int query = sc.nextInt();
            if(fArr[query]>0)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        input(arr);
        System.out.println("Enter the number of queries");
        int queries = sc.nextInt();
        int[] FreqArr = freqArr(arr);
        queries(FreqArr,queries);

    }
}

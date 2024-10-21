package ARRAYLIST;
import java.util.ArrayList;
import java.util.Scanner;

public class reversing_list {
    static void reverse(ArrayList<Integer> l1)
    {
        int i = 0;
        int j = l1.size() - 1;
        while(i<j)
        {
            int temp = l1.get(i);
            l1.set(i,l1.get(j));
            l1.set(j,temp);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> l1 = new ArrayList<>();
        System.out.println("Enter the size of the arraylist");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the arraylist");
        for(int i = 0; i<size;i++)
        {
            l1.add(i,sc.nextInt());
        }
        System.out.println("ArrayList: "+ l1);
        reverse(l1);
        System.out.println("Reversed arrayList is");
        System.out.println(l1);
    }
}


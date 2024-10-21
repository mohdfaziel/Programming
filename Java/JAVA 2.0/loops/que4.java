// count the number of digits in the number

import java.util.Scanner;

public class que4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int temp = num;
        int count = 0;
        while(temp>0)
        {
            count++;
            temp /=10;
        }
        System.out.println("Number of digits in " + num + " are " + count);
        sc.close();
    }
}
// reversing a number

import java.util.Scanner;

public class que5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reverse = 0;
        while (n>0) {
            int remainder = n%10;
            reverse = reverse * 10 + remainder;
            n = n/10;
        }
        System.out.println("Reverse of the number is "+reverse);
        sc.close();
    }
}

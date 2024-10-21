import java.util.Scanner;
public class que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int num = sc.nextInt();
        if (num % 2 == 0 && num % 3 == 0) {
            System.out.println("Hence the number " + num + " is even and divisible by 3");
        }
        sc.close();
    }
}
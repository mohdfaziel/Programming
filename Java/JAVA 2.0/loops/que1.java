
// add numbers entered by the user
import java.util.Scanner;

public class que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the number");
        int num = sc.nextInt();
        while (num != -1) {
            sum += num;
            System.out.println("Enter the number");
            num = sc.nextInt();

        }
        System.out.println("Sum of the entered numbers is " + sum);
        sc.close();
    }

}

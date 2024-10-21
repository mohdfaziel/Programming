// Find the sum of the series 1-2+3-4+5-6+7...n

import java.util.Scanner;

public class que6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n = sc.nextInt();
        int result = 0;
        for(int i = 1; i<=n ; i++)
        {
            if(i%2==0)
            {
                result = result - i;
            }
            else{
                result = result + i;
            }
        }
        System.out.println("Sum of the series till "+n+" is "+result);
        sc.close();
    }
}

import java.util.Scanner;

public class numeric_pyramid {
     public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r = sc.nextInt();
        for(int i = 1; i<=r;i++)
        {
            for(int j = 1;j<=r-i;j++)
            {
              System.out.print(" ");
            }
            for(int j = 1; j<=i ; j++)
            {
                System.out.print(j);
            }
            for(int k = i-1; k>=1 ; k--)
            {
                System.out.print(k);
            }
            System.out.println();
        }
        sc.close();
}
}

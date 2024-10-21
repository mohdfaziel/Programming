import java.util.Scanner;

public class rev_triangle {
     public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r = sc.nextInt();
        for(int i = 0; i<r;i++)
        {
            for(int j = 0;j<r-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}

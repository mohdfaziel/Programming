import java.util.Scanner;
public class rect_pattern{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns");
        int c = sc.nextInt();

        for(int i = 0; i<r;i++)
        {
            for(int j = 0;j<c;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
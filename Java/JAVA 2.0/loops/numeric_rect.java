import java.util.Scanner;

public class numeric_rect {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r = sc.nextInt();

        for(int i = 0; i<r;i++)
        {
        
           for(int j = i+1; j<=r;j++)
           {
            System.out.print(j);
           }
           for(int k = 1; k<=i; k++)
           {
                System.out.print(k);
           }
           System.out.println();
        }
        sc.close();
}
}

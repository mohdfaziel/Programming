import java.util.Scanner;

public class hollow_rect {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns");
        int c = sc.nextInt();

        for(int i = 0; i<r;i++)
        {
            for(int j = 0;j<c;j++)
            {
               if(i==0 || j == 0 || i == r-1 || j== c-1)
               {
                System.out.print("*");
               }
               else{
                System.out.print(" ");
               }
            }
            System.out.println();
        }
        sc.close();
}}

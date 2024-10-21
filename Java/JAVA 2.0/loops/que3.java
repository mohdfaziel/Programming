// wap to print all the numbers between 1 to 1000 except multiples of 3

import java.util.Scanner;

public class que3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<=1000; i++)
        {
            if(i%3==0)
            {
                continue;
            }
            else
            {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
package RECURSION;

import java.util.Scanner;

public class fibo {
    static int fibo(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else if(n==1)
        {
            return 1;
        }
        else{
            return fibo(n-1) + fibo(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms of fibonacci series");
        int num = sc.nextInt();
        for(int i = 0;i<num;i++)
        {
            int term = fibo(i);
            System.out.print(term+" ");
        }
    }
}

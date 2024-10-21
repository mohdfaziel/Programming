// print first multiple of 5 which is also the multiple of seven

import java.util.Scanner;

public class que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        int answer;
        while(true)
        {
            if(n%5==0 && n%7==0)
            {
                answer = n;
                break;
            }
            n++;
        }
        System.out.println("First multiple of 5 and 7 is "+answer);
        sc.close();
    }
}

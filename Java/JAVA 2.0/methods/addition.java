import java.util.Scanner;
class add_{
    public int sum(int a,int b)
    {
        return a+b;
    }
}
public class addition{
    public static void main(String[] args)
    {
        add_ obj = new add_();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum of " + a +","+ b + " is " + obj.sum(a,b));
        sc.close();
    }

    public int add(int i, int j) {
        return 0;
    }
}
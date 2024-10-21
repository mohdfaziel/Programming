package RECURSION;

public class from_n_to_1 {
    static void printN_1(int n)
    {
        if(n==0)
        {
            return;
        }
        else {
            printN_1(n-1);
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
        printN_1(15);
    }
}

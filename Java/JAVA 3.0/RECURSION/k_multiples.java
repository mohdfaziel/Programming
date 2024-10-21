package RECURSION;

public class k_multiples {
    static void multiples(int num,int k)
    {
        if(k<=0)
        {
            return;
        }
        multiples(num,k-1);
        System.out.print(num*k+" ");
    }

    public static void main(String[] args) {
        multiples(12,5);
    }
}

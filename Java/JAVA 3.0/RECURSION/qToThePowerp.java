package RECURSION;

public class qToThePowerp {

    static int power(int p,int q)
    {
        if(q<=0) return 1;
        return p * power(p,q-1);
    }
    static int power2(int p,int q)
    {
        if(q<=0) return 1;
        int smallPow = power2(p, q / 2);
        if(q%2==0) {
            return smallPow * smallPow;
        }else {
            return smallPow * smallPow * p;
        }
    }
    public static void main(String[] args) {
        System.out.println(power(-2,3));
        System.out.println(power2(-2,3));
    }
}

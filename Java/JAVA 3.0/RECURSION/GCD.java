package RECURSION;

public class GCD {
    static int gdc(int a,int b)
    {
        int min;
        int gdc=1;
        if(a>b)
        {
            min = b;
        }
        else
        {
            min = a;
        }
        for(int i = min;i>0;i--)
        {
            if(a%i==0 && b%i==0)
            {
                gdc = i;
                break;
            }
        }
        return gdc;
    }

    static int gcd2(int a,int b)
    {
        while(a%b!=0)
        {
            int rem = a%b;
            a = b;
            b = rem;
        }
        return b;
    }
    static int euclid(int x,int y)
    {
        if(y==0) return x;
        return euclid(y,x%y);
    }
    static int lcm(int x,int y)
    {
        int gcd = euclid(x,y);
        int lcm = (x*y)/gcd;
        return lcm;
    }

    public static void main(String[] args) {
        System.out.println(gdc(82,15));
        System.out.println(gcd2(82,15));
        System.out.println(euclid(82,15));
        System.out.println(lcm(82,15));
    }
}

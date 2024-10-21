package Oops;

public class fractionProb {
    public static fraction add(fraction f1, fraction f2)
    {
        int n = f1.num*f2.den + f2.num*f1.den;
        int d = f1.den* f2.den;
        return new fraction(n,d);

    }
    public static class fraction{
        int num;
        int den;
        public void simplify()
        {
            int min = Math.min(num,den);
            for(int i = min;i>=1;i--)
            {
                if(num%i==0 && den%i==0)
                {
                    num = num/i;
                    den = den/i;
                }
            }
        }
        public fraction(int num,int den)
        {
            this.num = num;
            this.den = den;
            simplify();
        }

        public static void printFraction(fraction f)
        {
            System.out.println(f.num+"/"+f.den);
        }

    }
    public static void main(String[] args) {
        fraction f1 = new fraction(3,15);
        fraction.printFraction(f1);
        fraction f2 = new fraction(30,15);
        fraction.printFraction(f2);
       fraction f3 = add(f1,f2);
       fraction.printFraction(f3);

    }
}

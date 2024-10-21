import java.util.Scanner;

public class bn_dn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter binary number");
        int bn = sc.nextInt();
        int power = 1; // 2 ^ 0 = 1
        int dn = 0;
        while(bn>0)
        {
            int unitDigit = bn%10;
            dn = dn + unitDigit*power;
            power *= 2;
            bn = bn/10;
        }
        System.out.println(dn);
        sc.close();
    }
}

import java.util.Scanner;
public class dn_bn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dn = sc.nextInt();
        int power = 1;
        int bn = 0;
        while(dn>0){
            int parity = dn%2;
            bn = bn + parity*power;
            power *=10;
            dn=dn/2;
        }
        System.out.println(bn);
        sc.close();
    }
}

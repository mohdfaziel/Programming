package RECURSION;

public class factorial {
    static int fact(int num)
    {
        if(num == 1)
        {
            return 1;
        }else{
            return num * fact(num-1);
        }
    }

    public static void main(String[] args) {
        int fact = fact(5);
        System.out.println(fact);
    }
}

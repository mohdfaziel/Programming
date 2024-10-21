package RECURSION;

public class alternate_sum {
    static int alternateSum(int n)
    {
        if(n==1 || n==0)
        {
            return n;
        }
        if(n%2==0)
        {
        return alternateSum(n-1)-n;
        }
        else{
            return alternateSum(n-1)+n;
        }
    }

    public static void main(String[] args){
        int sum = alternateSum(10);
        System.out.println(sum);
    }
}

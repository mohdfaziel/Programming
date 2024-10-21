package RECURSION;

public class multiply {
    static int multiply(int x,int y)
    {
        if(y==1) return x;
        return multiply(x,y-1) + x;
    }

    public static void main(String[] args) {
        System.out.println(multiply(5,3));
    }
}

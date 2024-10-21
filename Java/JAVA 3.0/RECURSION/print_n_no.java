package RECURSION;

public class print_n_no {
    void printN(int num)
    {
        if(num==0)
        {
            return;
        }else {
            printN(num-1);
            System.out.print(num+" ");
        }
    }
    public static void main(String[] args) {
        print_n_no obj = new print_n_no();
        obj.printN(10);
    }
}

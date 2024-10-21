package STACKS;
import java.util.Stack;
public class PROB1 {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(4);
        s1.push(6);
        s1.push(7);
        s1.push(2);
        s1.push(9);
        Stack<Integer> s2 = new Stack<>();
        System.out.println(s1);
        while(s1.size()>2)
        {
            s2.push(s1.pop());
        }
        s1.push(99);
        while(s2.size()>0)
        {
            s1.push(s2.pop());
        }
        System.out.println(s1);

    }
}

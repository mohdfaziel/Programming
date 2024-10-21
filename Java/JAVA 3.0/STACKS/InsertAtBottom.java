package STACKS;

import java.util.Stack;

public class InsertAtBottom {
    static void insert(Stack<Integer> s,int element)
    {
        if(s.size()==0)
        {
            s.push(element);
            return;
        }
        int x = s.pop();
        insert(s,element);
        s.push(x);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(4);
        st.push(7);
        st.push(8);
        System.out.println(st);
        insert(st,9);
        System.out.println(st);
    }
}

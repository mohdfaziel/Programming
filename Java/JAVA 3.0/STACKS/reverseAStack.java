package STACKS;

import java.util.Stack;

public class reverseAStack {
    static void rev(Stack<Integer> s)
    {
        if(s.size()==1) return;
        int x = s.pop();
        rev(s);
        insert(s,x);
    }
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
        rev(st);
        System.out.println(st);
    }
}

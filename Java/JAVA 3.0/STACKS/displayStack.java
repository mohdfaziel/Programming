package STACKS;

import java.util.Stack;

public class displayStack {
    public static void display(Stack<Integer> s)
    {
        if(s.size()==0) return;
        int x = s.pop();
        System.out.println(x);
        display(s);
        s.push(x);


    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(4);
        st.push(7);
        st.push(8);
//        int [] arr = new int[st.size()];
//        for(int i = st.size()-1;i>=0;i--)
//        {
//            arr[i] = st.pop();
//        }
//        for(int i = 0;i<arr.length;i++)
//        {
//            st.push(arr[i]);
//            System.out.println(arr[i]);
//        }
        display(st);
        System.out.println(st);
    }
}

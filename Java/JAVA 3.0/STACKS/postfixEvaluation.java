package STACKS;

import java.util.Stack;

public class postfixEvaluation {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        String exp = "953+4*6/-";
        int n = exp.length();
        for(int i = 0;i<n;i++)
        {
            char ch = exp.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii <=57)
            {
                st.push(ascii-48);
            }else{
                int val2 = st.pop();
                int val1 = st.pop();
                if(ch=='+') st.push(val1+val2);
                if(ch=='/') st.push(val1/val2);
                if(ch=='*') st.push(val1*val2);
                if(ch=='-') st.push(val1-val2);
            }

        }
        System.out.println(st.pop());
    }
}

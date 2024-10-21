package STACKS;

import java.util.Stack;

public class infixEvaluation {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Character> op = new Stack<>();
        String str = "4+6*9/(3-6)*2";
        int n = str.length();
        for(int i = 0;i<n;i++)
        {
            char ch = str.charAt(i);
            int ascii = (int) ch;
            if(ascii>=48 && ascii <=57)
            {
                st.push(ascii-48);
            }else if(op.isEmpty() || ch=='(' || op.peek()=='(')
            {
                op.push(ch);
            }else if(ch==')'){
                while(op.peek()!='(')
                {
                    int val2 = st.pop();
                    int val1 = st.pop();
                    if(op.peek()=='+') st.push(val1+val2);
                    if(op.peek()=='-') st.push(val1-val2);
                    if(op.peek()=='*') st.push(val1*val2);
                    if(op.peek()=='/') st.push(val1/val2);
                    op.pop();
                }
                op.pop();
            }else{
                if(ch=='+' || ch=='-')
                {
                    int val2 = st.pop();
                    int val1 = st.pop();
                    if(op.peek()=='+') st.push(val1+val2);
                    if(op.peek()=='-') st.push(val1-val2);
                    if(op.peek()=='*') st.push(val1*val2);
                    if(op.peek()=='/') st.push(val1/val2);

                    op.pop();
                    op.push(ch);
                }else {
                    if(op.peek()=='+' || op.peek()=='-')
                    {
                        op.push(ch);
                    }else{
                        int val2 = st.pop();
                        int val1 = st.pop();
                        if(op.peek()=='*') st.push(val1*val2);
                        if(op.peek()=='/') st.push(val1/val2);
                        op.pop();
                        op.push(ch);
                    }
                }
            }
        }
        while(st.size()>1)
        {
            int val2 = st.pop();
            int val1 = st.pop();
            if(op.peek()=='+') st.push(val1+val2);
            if(op.peek()=='-') st.push(val1-val2);
            if(op.peek()=='*') st.push(val1*val2);
            if(op.peek()=='/') st.push(val1/val2);
            op.pop();
        }
        System.out.println(4+6*9/(3-6)*2);
        System.out.println(st.peek());
    }
}

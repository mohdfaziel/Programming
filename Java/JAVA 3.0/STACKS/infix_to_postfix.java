package STACKS;

import java.util.Stack;

public class infix_to_postfix {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        Stack<Character> op = new Stack<>();
        String str = "9-(5+3)*4/6";
        int n = str.length();
        for(int i = 0;i<n;i++)
        {
            char ch = str.charAt(i);
            int ascii = (int) ch;

            if(ascii>=48 && ascii <=57)
            {
                String s = ""+ch;
                st.push(s);
            }else if(op.isEmpty() || ch=='(' || op.peek()=='(')
            {
                op.push(ch);
            }else if(ch==')'){
                while(op.peek()!='(')
                {
                    String val2 = st.pop();
                    String val1 = st.pop();
                    char x = op.pop();
                    st.push(val1+val2+x);
                }
                op.pop();
            }else{
                if(ch=='+' || ch=='-')
                {
                    String val2 = st.pop();
                    String val1 = st.pop();
                    char x = op.pop();
                    st.push(val1+val2+x);
                    op.push(ch);
                }else{
                    if(op.peek()=='+' || op.peek()=='-')
                    {
                        op.push(ch);
                    }else{
                        String val2 = st.pop();
                        String val1 = st.pop();
                        char x = op.pop();
                        st.push(val1+val2+x);
                        op.push(ch);
                    }
                }
            }
        }
        while(st.size()>1)
        {
            String val2 = st.pop();
            String val1 = st.pop();
            char x = op.pop();
            st.push(val1+val2+x);
        }
        System.out.println("Prefix form is: "+st.peek());
    }
}

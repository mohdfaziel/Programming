package STACKS;

import java.util.Stack;

public class prefixToPostfix {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        String str = "-9/*+5346";
        for(int i = str.length()-1;i>=0;i--)
        {
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii <=57){
                String chr = ""+ch;
                st.push(chr);
            }
            else {
                String s1 = st.pop();
                String s2 = st.pop();
                st.push(s1+s2+ch);
            }
        }
        System.out.println("Prefix: "+str+"\nPostfix: "+st.pop());
    }
}

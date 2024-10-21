package STACKS;

import java.util.Stack;

public class postfixToPrefix {
        public static void main(String[] args) {
            Stack<String> st = new Stack<>();
            String str = "953+4*6/-";
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                int ascii = (int) ch;
                if (ascii >= 48 && ascii <= 57) {
                    String chr = "" + ch;
                    st.push(chr);
                } else {
                    String s2 = st.pop();
                    String s1 = st.pop();
                    st.push(ch + s1 + s2);
                }
            }
            System.out.println("Postfix: " + str + "\nPrefix: " + st.pop());
        }
    }

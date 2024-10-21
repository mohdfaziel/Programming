package STACKS;

import java.util.Scanner;
import java.util.Stack;

public class balancingParenthesis {
    static boolean balanced(String str)
    {
        Stack<Character> st = new Stack<Character>();
        for(int i = 0;i<str.length();i++)
        {
           char ch= str.charAt(i);
           if(ch=='(')
           {
                st.push(ch);
           }else if(ch==')')
           {
               if(st.isEmpty()) return false;
               st.pop();
           }
        }
        if(st.isEmpty()) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string of ()");
        String str = sc.next();
        System.out.println(balanced(str));
    }
}

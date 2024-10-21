package STACKS;

import java.util.Stack;

public class nextGreaterElement {
    public static int [] nextGreater(int [] arr)
    {
        int n = arr.length;
        int [] res = new int[n];
        Stack<Integer> st = new Stack<>();
        res[n-1] = -1;
        st.push(arr[n-1]);
        for(int i = n-2;i>=0;i--)
        {
            while(!st.isEmpty() && st.peek() < arr[i])
            {
                st.pop();
            }
            if(st.isEmpty()) res[i] = -1;
            else res[i] = st.peek();
            st.push(arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int [] arr = {1,3,2,1,8,6,3,4};
        int [] res = nextGreater(arr);
        for(int i = 0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
}

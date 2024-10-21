package STACKS;

import java.util.Stack;

public class consecutiveSequence {
    public static int [] newSeq(int [] arr)
    {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i<n;i++)
        {
            if(st.isEmpty() || st.peek()!=arr[i]) st.push(arr[i]);
            else{
                if(i!=n-1)
                {
                    if(arr[i]!=arr[i+1])
                    {
                        st.pop();
                    }
                }
                else
                    {
                        st.pop();
                    }

            }
        }
        int [] res = new int[st.size()];
        for(int i = st.size()-1;i>=0;i--)
        {
            res[i] = st.pop();
        }
        return res;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,2,3,4,10,10,10,7,8,9,9,9};
        int [] res = newSeq(arr);
        for(int i = 0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
}

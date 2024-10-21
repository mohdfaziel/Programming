package QUEUES;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reorderQueue_InterLeaveFirstAndSecondHalf {
    public static void main(String[] args) {
        // Given question
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);

        // Solution
        Stack<Integer> st = new Stack<>();
        int part = q.size()/2;
        for(int i = 0;i<part;i++)
        {
            st.push(q.remove());
        }
        while(!st.isEmpty())
        {
            q.add(st.pop());
        }
        for(int i = 0;i<part;i++)
        {
            st.push(q.remove());
        }
        for(int i = 0;i<part;i++)
        {
            q.add(st.pop());
            q.add(q.remove());
        }
        while(!q.isEmpty())
        {
            st.push(q.remove());
        } while(!st.isEmpty())
        {
           q.add(st.pop());
        }
        System.out.println(q);
    }
}

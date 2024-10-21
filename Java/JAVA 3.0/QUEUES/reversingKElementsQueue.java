package QUEUES;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reversingKElementsQueue {
    public static void main(String[] args) {
        int k = 3,count=0;
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        q.add(12);
        q.add(98);
        q.add(56);
        q.add(14);
        q.add(84);
        q.add(74);
        System.out.println(q);
        int n = q.size();
        while(count<k)
        {
            st.push(q.remove());
            count++;
        }
        while(!st.isEmpty()) {
            q.add(st.pop());
        }
        for(int i = 0;i<n-k;i++)
        {
            q.add(q.remove());
        }
        System.out.println(q);

    }
}

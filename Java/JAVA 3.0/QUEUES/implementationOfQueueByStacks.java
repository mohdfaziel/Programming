package QUEUES;

import java.util.Stack;

public class implementationOfQueueByStacks {
    public static class queue{
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        void add(int x)
        {
            s1.push(x);
        }
        int remove()
        {
           while(s1.size()>1)
            {
                s2.push(s1.pop());
            }
            int x = s1.pop();
            while(!s2.isEmpty())
            {
                s1.push(s2.pop());
            }
            return x;
        }
        int peek()
        {
            for(int i = 0;i<s1.size()-1;i++)
            {
                s2.push(s1.pop());
            }
            int x = s1.peek();
            while(!s2.isEmpty())
            {
                s1.push(s2.pop());
            }
            return x;
        }

    }

    public static void main(String[] args) {
        queue q = new queue();
        q.add(12);
        q.add(16);
        q.add(23);
        System.out.println(q.remove());
    }
}

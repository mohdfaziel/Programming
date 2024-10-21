package QUEUES;

import java.util.LinkedList;
import java.util.Queue;

public class implementationOfStackByQueues {
    public static class stack{
        Queue<Integer> q = new LinkedList<>();
        void push(int element)
        {
            q.add(element);
        }
        int peek()
        {
            for(int i = 0;i<q.size()-1;i++)
            {
                q.add(q.remove());
            }
            int x = q.peek();
            q.add(q.remove());
            return x;
        } int pop()
        {
            for(int i = 0;i<q.size()-1;i++)
            {
                q.add(q.remove());
            }
            int x = q.remove();
            return x;
        }
        void display()
        {
            Queue<Integer> q2 = new LinkedList<>();
            while(!q.isEmpty()){
                System.out.print(q.peek()+" ");
                q2.add(q.remove());
            }while(!q2.isEmpty()){
                q.add(q2.remove());
            }
            System.out.println();
        }
        int size(){
            return q.size();
        }

    }

    public static void main(String[] args) {
        stack st = new stack();
        st.push(12);
        st.push(14);
        st.push(17);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        System.out.println(st.size());

    }
}

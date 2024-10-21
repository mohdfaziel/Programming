package QUEUES;

import java.util.LinkedList;
import java.util.Queue;

public class STL {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> p = new LinkedList<>();

        q.add(12);
        q.add(45);
        q.add(3);
        q.add(1);
        while(!q.isEmpty())
        {
            int x = q.remove();
            System.out.print(x+" ");
            p.add(x);
        }
        System.out.println();
        while(!p.isEmpty())
        {
            int x = p.remove();
            q.add(x);
        }
        System.out.println(q);
    }
}

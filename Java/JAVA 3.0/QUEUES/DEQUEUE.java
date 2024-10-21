package QUEUES;

public class DEQUEUE {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data)
        {
            this.data = data;
        }
    }
    public static class queue{
        Node left = null;
        Node right = null;
        void addLeft(int data)
        {
            Node n = new Node(data);
            if(left==null)
            {
                left = right = n;
            }else{
               n.next = left;
               left.prev = n;
               left = n;
            }
        }void addRight(int data)
        {
            Node n = new Node(data);
            if(right==null)
            {
                left = right = n;
            }else{
               right.next = n;
               n.prev = right;
               right = n;
            }
        }
        int removeLeft(){
            if(left==null)
            {
                System.out.println("Queue empty");
                return -1;
            }else
            {
                int x = left.data;
                if(left==right) left = right = null;
                else{
                left = left.next;
                left.prev = null;
                }
                return x;
            }
        } int removeRight(){
            if(right==null)
            {
                System.out.println("Queue empty");
                return -1;
            }else
            {
                int x = right.data;
                if(left==right) left = right = null;
                else{
                right = right.prev;
                right.next = null;
                }
                return x;
            }
        }
        void display()
        {
            Node l = left;
            Node r = right;
            while(l!=null)
            {
                System.out.print(l.data+" ");
                l = l.next;
            }
        }
    }
    public static void main(String[] args) {
        queue q = new queue();
        q.addLeft(12);
        q.addLeft(78);
        q.addLeft(34);
        q.addRight(39);
        q.addRight(99);
        q.addRight(67);
        q.display();
    }
}
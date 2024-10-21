package QUEUES;

public class LinkedListImplementation {
    public static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
        }
    }
    public static class queue{
        private Node f = null;
        private Node r = null;
        private int size = 0;
        void add(int data)
        {
            Node n = new Node(data);
            if(f==null)
            {
                f = r = n;

            }else{
                r.next = n;
                r = n;

            }
            size++;
        }
        int remove()
        {
            if(f==null)
            {
                System.out.println("Queue empty");
                return -1;
            }else if(f==r){
                Node n = f;
                f = r = null;
                size--;
                return n.data;
            }else{
                Node n = f;
                f = f.next;
                size--;
                return n.data;
            }
        }
        int peek(){
            if(r==null) {
                System.out.println("Queue empty");
                return -1;
            }
            else return r.data;
        }
        void display(){
            Node temp = f;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp= temp.next;
            }
        }
        int size(){
            return size;
        }
    }

    public static void main(String[] args) {
        queue q = new queue();
        q.add(12);
        q.add(12);
        q.add(12);
        q.add(12);
        q.display();
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.remove();

    }
}

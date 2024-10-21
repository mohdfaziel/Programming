package STACKS;

public class LinkedRepresentation {
    public static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
        }
    }
    public static class Stack{
        Node top = null;
        private int size = 0;
        boolean isEmpty()
        {
            if(top==null) return true;
            else return false;
        }
        void push(int data)
        {
            Node temp = new Node(data);

            temp.next = top;
            top = temp;
            size++;
        }
        int pop()
        {
            if(isEmpty())
            {
                System.out.println("Stack underflow");
                return -1;
            }else
            {
                int x = top.data;
                top = top.next;
                size--;
                return x;
            }
        }
        void displayrec(Node head)
        {
            if(head==null) return;
            displayrec(head.next);
            System.out.print(head.data+" ");
        }
        void display()
        {
// this will print stack in reverse order
//            if(temp==null) return;
//            temp = temp.next;
//            display();
//            System.out.println(temp.data);
            displayrec(top);
            System.out.println(" ");
        }
        int peek()
        {
            if(top==null)
            {
                System.out.println("Stack is empty");
                return -1;
            }
                return top.data;

        }
        int size()
        {
            return size;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(12);
        st.push(84);
        st.push(45);
        st.display();
        st.pop();
        st.display();
    }
}

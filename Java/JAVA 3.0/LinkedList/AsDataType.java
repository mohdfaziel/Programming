package LinkedList;


import java.sql.SQLOutput;

public class AsDataType {
    static class Node {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
        }
    }
    static class linkedList {
        Node head;
        Node tail;
        int size = 0;

        void addEnd(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        void addBeg(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
            size++;
        }
        void addIndex(int data,int index)
        {
            Node temp = new Node(data);
            Node ptr = head;
            int i = 0;
            if(index == length())
            {
                addEnd(data);
                return;
            }
            if(index ==0)
            {
                addBeg(data);
                return;
            }
            while(i<index-1)
            {
                ptr = ptr.next;
                i++;
            }
            temp.next = ptr.next;
            ptr.next = temp;
            size++;
        }
        int get(int index)
        {
            Node temp = head;
            int count = 0;
            while(count++<index)
            {
                temp = temp.next;
            }
            return temp.data;
        }
        void deleteAtIndex(int index)
        {
            if(index ==0)
            {
                head = head.next;
                size--;
                return;
            }
            Node temp = head;
            int count = 0;
            while(count<index-1)
            {
                temp = temp.next;
                count++;
            }
            temp.next = temp.next.next;
            tail = temp;
            size--;
        }

        int length() {
            return size;
        }
        void display()
        {
            Node temp = head;
            while(temp !=null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.addBeg(5);
        ll.addBeg(23);
        ll.addEnd(33);
        ll.addEnd(67);
        ll.addIndex(7,2);
        ll.addIndex(11,0);
        ll.addIndex(22,6);
        ll.display();
        ll.deleteAtIndex(0);
        ll.display();
        System.out.println(ll.tail.data);
        System.out.println(ll.head.data);

    }
}

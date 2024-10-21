package LinkedList;

import java.util.Scanner;

class _node {
    int data;
    _node next;
    _node(int data)
    {
        this.data = data;
    }
}
class linkedList{
    _node head = null;
    _node tail = null;
    void add(int data) {
        _node temp = new _node(data);
        if (head == null)
        {
            head = temp;
            tail = temp;
        }else{
            tail.next = temp;
            tail = temp;
        }
    }
    void display()
    {
        _node temp= head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    int length(){
        _node temp = head;
        int count = 1;
        while(temp.next!=null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }
}

public class intersectionOfLinkedList {
    public static void main(String[] args) {
        int s1,s2;
        linkedList l1 = new linkedList();
        linkedList l2 = new linkedList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the first linkedlist");
        s1 = sc.nextInt();
        System.out.println("Enter the elements of the first linkedlist");
        for(int i = 0;i<s1;i++)
        {
            l1.add(sc.nextInt());
        }
        System.out.println("Enter the size of the second linkedlist");
        s2 = sc.nextInt();
        System.out.println("Enter the elements of the second linkedlist");
        for(int i = 0;i<s2;i++)
        {
            l2.add(sc.nextInt());
        }
        l1.display();
        System.out.println(l1.length());
        l2.display();
        System.out.println(l2.length());
    }
}

package LinkedList;
class node{
    int data;
    node next;
    node(int data)
    {
        this.data = data;
    }
}

public class creation {

    static void traverse(node head)
    {
        if(head !=null)
        {
            traverse(head.next);
            System.out.println(head.data);
        }else{
            return;
        }
    }


    public static void main(String[] args) {
        node a = new node(5);
        node b = new node(7);
        node c = new node(3);
        node d = new node(9);

        a.next = b;
        b.next = c;
        c.next = d;

        traverse(a);

    }
}

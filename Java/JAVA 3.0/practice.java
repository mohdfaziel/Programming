class Node{
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
}
public class practice{
    public static void main(String[] args) {
        Node n1 = new Node(23);
        Node n2 = new Node(3);
        Node n3 = new Node(34);
        Node n4 = new Node(63);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;
        Node temp = n1;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }
}
package LinkedList.LeetCode;
import java.util.*;
// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> st = new Stack<>();

        // Push l1's values into the stack
        while (l1 != null) {
            st.push(l1.val);
            l1 = l1.next;
        }

        int sum1 = 0;
        while (!st.isEmpty()) {
            sum1 = sum1 * 10 + st.pop();
        }

        // Push l2's values into the stack
        while (l2 != null) {
            st.push(l2.val);
            l2 = l2.next;
        }

        int sum2 = 0;
        while (!st.isEmpty()) {
            sum2 = sum2 * 10 + st.pop();
        }

        int finalSum = sum1 + sum2;
        ListNode head = null;

        // Handle the case where the sum is zero
        if (finalSum == 0) {
            return new ListNode(0);
        }

        // Create the linked list in correct order
        while (finalSum != 0) {
            int rem = finalSum % 10;
            ListNode newNode = new ListNode(rem);

            // Insert each new node at the head to maintain correct order
            newNode.next = head;
            head = newNode;

            finalSum = finalSum / 10;
        }

        return head;
    }
}

public class Add2Nos {
    public static void main(String[] args) {
        // Create first linked list: 7 -> 2 -> 4 -> 3 (representing 7243)
        ListNode l1 = new ListNode(9);

        // Create second linked list: 5 -> 6 -> 4 (representing 564)
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);
        l2.next.next.next = new ListNode(9);
        l2.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next.next.next.next = new ListNode(9);

        Solution solution = new Solution();
        ListNode result = solution.addTwoNumbers(l1, l2);

        // Print the resulting linked list
        System.out.print("Result: ");
        printList(result);
    }

    // Helper method to print linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) {
                System.out.print(" -> ");
            }
            head = head.next;
        }
        System.out.println();
    }
}


package STACKS;

import java.util.Scanner;
import java.util.Stack;

public class ArrayImplementation {
    public static class Stack{
        private int [] arr = new int[100];
        private int idx = -1;
        int peek()
        {
            if(idx>0)
            {
                return arr[idx];
            }else
            {
                System.out.println("Stack is empty");
                return -1;
            }
        }
        boolean isEmpty()
        {
            if(idx<0) return true;
            else return false;
        }
        boolean isFull()
        {
            if(idx>99) return true;
            else return false;
        }
        int pop()
        {
            if(isEmpty())
            {
                System.out.println("Stack underflow");
                return -1;
            }else{
                int top = arr[idx];
                arr[idx] = 0;
                idx--;
                return top;
            }
        }
        void push(int element)
        {
            if(isFull())
            {
                System.out.println("Stack overflow");
            }else
            {
                idx++;
                arr[idx] = element;
            }
        }
        void display()
        {
            if(idx==-1)
            {
                System.out.println("Stack is empty");
            }else{
                for(int i = 0;i<=idx;i++)
                {
                    System.out.print(arr[i]+" ");
                }
            }
        }
        int size()
        {
            return idx+1;
        }
        int capacity(){
            return arr.length;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(34);
        st.push(64);
        st.push(31);
        st.push(57);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println("Size of the stack is: "+st.size());
        System.out.println("Capacity of the stack is: "+st.capacity());
        st.display();

    }
}

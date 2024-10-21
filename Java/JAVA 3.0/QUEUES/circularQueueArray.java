package QUEUES;

public class circularQueueArray {
    public static class queue {
        private int[] arr = new int[100];
        private int n = arr.length;
        private int rear = -1, front = -1;
        private int size = 0;

        boolean isEmpty() {
            if (front == -1) return true;
            else return false;
        }

        boolean isFull() {
            if((front == rear + 1) || (front==0 && rear == n-1)) return true;
            else return false;
        }

        void add(int element) {
            if (isFull()) {
                System.out.println("Queue overflow");
                return;
            }
            if(front == -1)
            {
                front++;
                rear++;
            }else if(rear == n-1)
            {
                rear = 0;
            }else{
                rear++;
            }
            arr[rear] = element;
            size++;
        }

        int remove() {
            if (isEmpty()) {
                System.out.println("Queue underflow");
                return -1;
            }else{
                int x = arr[front];
                if(front==rear) front = rear = -1;
                else if(front == n-1) front = 0;
                else front++;
                size--;
                return x;
            }
        }

        int peek() {
            if (isEmpty()) {
                System.out.println("Queue empty");
                return -1;
            } else {
                return arr[front];
            }
        }
        void display(){
            int f = front;
            int r = rear;
            if(f<=r)
            {
                while(f<=r)
                {
                    System.out.print(arr[f]+" ");
                    f++;
                }
            }else{
                while(f<size)
                {
                    System.out.print(arr[f]+" ");
                    f++;
                }
                f = 0;
                while(f<=r)
                {
                    System.out.print(arr[f]+" ");
                    f++;
                }
            }
        }
        int size(){
            return size;
        }
    }

    public static void main(String[] args) {
        queue q = new queue();
        q.add(23);
        q.add(13);
        q.add(26);
        q.remove();
        System.out.println(q.peek());
        System.out.println(q);
    }
}



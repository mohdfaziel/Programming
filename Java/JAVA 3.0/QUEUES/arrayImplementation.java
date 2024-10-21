package QUEUES;

public class arrayImplementation {
    public static class queue {
        private int[] arr = new int[100];
        private int rear = -1, front = -1;
        private int size = 0;

        boolean isEmpty() {
            if (front == -1) return true;
            else return false;
        }

        boolean isFull() {
            if (rear == 99) return true;
            else return false;
        }

        void add(int element) {
            if (isFull()) {
                System.out.println("Queue overflow");
                return;
            } else {
                rear = rear + 1;
                if (front == -1) front++;
                arr[rear] = element;
                size++;
            }
        }

        int remove() {
            if (isEmpty()) {
                System.out.println("Queue underflow");
                return -1;
            }else if(front== rear){
                int x = arr[front];
                front = rear = -1;
                size--;
                return x;
            }else {
                int x = arr[front];
                front++;
                size--;
                return x;

            }
        }
            int peek() {
                if (isEmpty()) {
                    System.out.println("Queue empty");
                    return -1;
                } else {
                    return arr[rear];
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



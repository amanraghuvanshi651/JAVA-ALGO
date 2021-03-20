
public class CircularLinkedList {

    int size = 4;
    int[] queue = new int[size];
    int front = -1;
    int rear = -1;

    public void enqueue(int data) {

        if (((rear + 1) % size) == front) {
            System.out.println("Over Flow");
        } else {
            if (front == -1 && rear == -1) {
                front = 0;
                rear = 0;
                queue[rear] = data;
                System.out.println("Enqueued : " + queue[rear]);
            } else {
                rear = (rear + 1) % size;
                queue[rear] = data;
                System.out.println("Enqueued : " + queue[rear]);
            }
        }
    }

    public void dequeue() {

        if (front == -1 && rear == -1) {
            System.out.println("UnderFlow");
        } else {
            if (front == rear) {
                System.out.println("Dequeued : " + queue[front]);
                queue[front] = 0;
                front = -1;
                rear = -1;
            } else {
                System.out.println("Dequeued : " + queue[front]);
                queue[front] = 0;
                front = (front + 1) % size;
            }
        }
    }

    public void show() {

        int temp = front;

        while (temp != rear) {
            System.out.println(queue[temp]);
            temp = (temp + 1) % size;
        }
        System.out.println(queue[temp]);
        temp = (temp + 1) % size;
    }

    public void printArray() {

        for (int i = 0; i < size; i++) {
            System.out.println(queue[i]);
        }

    }

    public static void main(String[] args) {

        CircularLinkedList queue = new CircularLinkedList();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);

        queue.show();

        queue.dequeue();
        queue.dequeue();

        queue.show();

        queue.enqueue(-1);
        queue.enqueue(0);

        queue.show();

        System.out.println("The array : ");
        queue.printArray();

    }
}
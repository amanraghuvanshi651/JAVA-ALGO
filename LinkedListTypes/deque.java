public class deque {

    int size = 5;
    int[] deque = new int[size];
    int front = -1;
    int rear = -1;

    public void enqueueFront(int data) {
        if (((front + 1) % size) == rear) {
            System.out.println("over flow");
        } else if (front == -1 && rear == -1) {
            front = 0;
            rear = 0;
            deque[front] = data;
        } else if (front == 0) {
            front = size - 1;
            deque[front] = data;
        } else {
            front--;
            deque[front] = data;
        }
    }

    public void enqueueRear(int data) {
        if (((rear + 1) % size) == front) {
            System.out.println("over flow");
        } else {
            if (front == -1 && rear == -1) {
                front = 0;
                rear = 0;
                deque[rear] = data;
            } else {
                rear = (rear + 1) % size;
                deque[rear] = data;
            }
        }
    }

    public void dequeueFront() {
        if (front == -1 && rear == -1) {
            System.out.println("under flow");
        } else {
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % size;
            }
        }
    }

    public void dequeueRear() {
        if (front == -1 && rear == -1) {
            System.out.println("under flow");
        } else if (rear == 0) {
            rear = size - 1;
        } else if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            rear--;
        }
    }

    public void show() {

        int temp = front;
        while (temp != rear) {
            System.out.println(deque[temp]);
            temp = (temp + 1) % size;
        }

        System.out.println(deque[temp]);

    }

    public static void main(String[] args) {

        deque d = new deque();

        d.enqueueRear(1);
        d.enqueueFront(0);

        d.show();

        d.dequeueFront();

        System.out.println("after dequeue : ");
        d.show();
    }
}

import javax.management.QueryEval;

public class Queues {
    class Queue{
        int front;
        int rear;
        int capacity;
        int[] arrray;
    }
    Queue que;
    void creatQueue(int capacity){
        que = new Queue();
        que.capacity = capacity;
        que.arrray = new int[que.capacity];
        que.front = que.rear = -1;
        return;
    }
    void enQueue(int data){
        if(que.front ==que.capacity-1){
            System.out.println("Queue overflow");
            return;
        }
        if(que.front ==-1 && que.rear==-1){
            que.front = que.rear = 0;

        }
        else{
            que.rear = que.rear+1;
        }
        que.arrray[que.rear] = data;
        return;
    }
    int deQueue(){
        int val;
        if(que.front ==-1 || que.front>que.rear){
            System.out.println("queue is empty");
            return -1;
        }
        else{
            val = que.arrray[que.front];
            que.front = que.front+1;
        }
        return val;

    }
    int peek(){
        if(que.front==-1 || que.front>que.rear){
            System.out.println("queue is empty");
            return -1;
        }
        else{
            return que.arrray[que.front];
        }
    }
    void deleteQ(){
        que = null;
        return;
    }
    void show(){
        if(que.front==-1||que.front>que.rear){
            System.out.println("queue is empty");
            return;
        }
        int i =que.front;
        while(i<=que.rear){
            System.out.println(que.arrray[i]);
            i++;
        }
    }
    public static void main(String[] args){
        Queues Q = new Queues();
        Q.creatQueue(10);
        Q.enQueue(10);
        Q.enQueue(12);
        Q.enQueue(13);
        Q.show();
        int top = Q.peek();
        System.out.println("element at front of queue is :"+top);
        System.out.println("element deleted: "+Q.deQueue());
        System.out.println("element deleted: "+Q.deQueue());
        Q.deleteQ();
        Q.show();

    }
}
    


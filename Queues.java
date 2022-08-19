import javax.management.QueryEval;
import dataStructures.Queue;

public class Queues {
    Queue que;
    void creatQueue(int capacity){
        que = new Queue();
        que.capacity = capacity;
        que.array = new int[que.capacity];
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
        que.array[que.rear] = data;
        return;
    }
    int deQueue(){
        int val;
        if(que.front ==-1 || que.front>que.rear){
            System.out.println("queue is empty");
            return -1;
        }
        else{
            val = que.array[que.front];
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
            return que.array[que.front];
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
            System.out.println(que.array[i]);
            i++;
        }
    }
    public static void main(String[] args){
        Queues Q = new Queues();
        Q.creatQueue(5);
        Q.enQueue(10);
        Q.enQueue(12);
        Q.enQueue(13);
        Q.enQueue(15);
        Q.enQueue(17);
        Q.show();
        System.out.println("\n");
        Q.deQueue();
        Q.deQueue();
        Q.enQueue(10);
        Q.show();
       

    }
}
    


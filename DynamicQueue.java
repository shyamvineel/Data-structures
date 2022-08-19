import java.util.Arrays;

import dataStructures.Queue;
public class DynamicQueue {
    
    Queue que;
    void creatQueue(int capacity){
        if(capacity<1){
            System.out.println("sorry cannot create queue with given capacity");
            return;
        }
        que = new Queue();
        que.capacity = capacity;
        que.front = que.rear = -1;
        que.size = 0;
        que.array = new int[que.capacity];
        return;
    }
    boolean isEmpty(){
        return que.size==0?true:false;
    }
    boolean isFull(){
        return que.size==que.capacity?true:false;
    }
    void resize(){
        int size  = que.capacity;
        que.capacity = que.capacity*2;
        que.array = Arrays.copyOf(que.array, que.capacity);
        if(que.front>que.rear){
            for(int i=0;i<que.front;i++){
                que.array[size+i] = que.array[i];
            }
            que.rear = que.rear+size;
        }
    }
    void enQueue(int data){
        if(isFull()){
            resize();
            return;
        }
        if(que.front == -1 && que.rear == -1){
            que.front = que.rear =0;
        }
        else{
            que.rear = (que.rear+1)%que.capacity;
            
        }
        que.array[que.rear] = data;
        que.size +=1;
        return;
        
    }
    int deQueue(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        int data = que.array[que.front];
        if(que.front==que.rear){
            que.front = que.rear = -1;
            que.size = 0;
        }
        else{
            que.array[que.front] =0;
            que.front = (que.front+1)%que.capacity;
            que.size-= 1;
        }
        return data;



    }
    void show(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return;
        }
        else{
            int i = que.front;
            do{
                System.out.println(que.array[i]);
                i = (i+1)%que.capacity;
            }
            while(i!=que.front);
        }
        return;
    }

    public static void main(String[] args){
        DynamicQueue dq = new DynamicQueue();
        dq.creatQueue(5);
        dq.enQueue(5);
        dq.enQueue(10);
        dq.enQueue(15);
        dq.enQueue(20);
        dq.enQueue(25);
        dq.enQueue(30);
        dq.enQueue(35);
        dq.show();
        System.out.println("\n");
        dq.deQueue();
        dq.deQueue();
        dq.deQueue();
        dq.show();
        System.out.println(dq.isFull());
    }
}

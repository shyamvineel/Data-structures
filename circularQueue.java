public class circularQueue {
    class queue{
        int capacity;
        int front,rear;
        int size;
        int array[];
    }
    queue que = new queue();
    void creatQueue(int capacity){
        if(capacity <=0){
            System.out.println("sorry cannot create queue");
            return;
        }
        que.capacity = capacity;
        que.front = que.rear = -1;
        que.array = new int[que.capacity];
        return;
    }
    int size(){
        return que.size;
    }
    int first(){
        return que.array[que.front];
    }
    int last(){
        return que.array[que.rear];
    }
    boolean isEmpty(){
        return que.size==0?true:false;
    }
    boolean isFull(){
        return que.size==que.capacity?true:false;
    }
    void enQueue(int data){
        if(isFull()){
            System.out.println("overflow");
            return;
        }
        if(que.front==-1 && que.rear==-1){
            que.front = que.rear =0;
        }
        else{
            que.rear = (que.rear+1)%que.capacity;
        }
        que.array[que.rear] = data;
        que.size++;
        return;
        
    }
    void deQueue(){
        if(isEmpty()){
            System.out.println("underflow");
            return;
        }
        if(que.front == que.rear){
            que.front = que.rear = -1;
            que.size = 0;
        }
        else{
            que.front = (que.front+1)%que.capacity;
            que.size-=1;
        }
        return;
    }
    void show(){
        if(isEmpty()){
            System.out.println("empty");
            return;
        }
        int i = que.front;
        while(i<=que.rear){
            System.out.println(" "+que.array[i]);
            i++;
        }
        return;
    }
    public static void main(String[] args){
        circularQueue cr = new circularQueue();
        cr.creatQueue(5);
        cr.enQueue(10);
        cr.enQueue(20);
        cr.enQueue(30);
        cr.enQueue(40);
        cr.enQueue(50);
        cr.deQueue();
        cr.deQueue();
        cr.show();
        System.out.println(cr.isEmpty());
        System.out.println(cr.size());
        System.out.println(cr.isFull());
    }
}

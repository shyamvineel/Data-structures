public class Queuelinkedimp {
    class Node{
        int data;
        Node next;
    }
    class Queue{
        Node front;
        Node rear;
    }
    Queue Q;
    void createQueue(){
        Q = new Queue();
        Q.front = Q.rear = null;
        return;
    }
    void enQueue(int data){
        Node newnode = new Node();
        newnode.data = data;
        newnode.next = null;
        if(Q.front == null && Q.rear==null){
            Q.front=Q.rear = newnode;
        }
        else{
            Q.rear.next = newnode;
            Q.rear = newnode;
        }
        return;
    }
    int deQueue(){
        int val;
        if(Q.front==null && Q.front ==null){
            System.out.println("is empty");
            return -1;
        }
        else{
            val = Q.front.data;
            Q.front = Q.front.next;
        }
        return val;
    }
    void show(){
        if(Q.front==null && Q.rear==null){
            System.out.println("empty");
            return;
        }
        else{
            Node tr = Q.front;
            while(tr!=null){
                System.out.println(tr.data);
                tr = tr.next;
            }
        }
    }

    
    public static void main(String[] args){
        Queuelinkedimp q = new Queuelinkedimp();
        q.createQueue();
        q.enQueue(10);
        q.enQueue(15);
        q.enQueue(20);
        q.deQueue();
        q.show();
        
    }
}

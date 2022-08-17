public class StackLL{
    class Node{
        int data;
        Node next;
    }
    Node top;
    void createStack(){
        top = new Node();
        top = null;
        return;
    }
    void push(int data){
        Node newnode = new Node();
            newnode.data = data;
            newnode.next = null;
        if(top==null){
            top = newnode;
            return;
        }
        else{
            
            newnode.data = data;
            newnode.next = top;
            top = newnode;
            return;
        }
    }
    void pop(){
        Node temp = top;
        if(top==null){
            System.out.println("stack underflow");
            return;
        }
        else{
            temp = top.next;
            top = temp;
            return;
        }
    }
    void peek(){
        if(top!=null){
            System.out.println(top.data);
            return;
        }
        System.out.println("empty...");
        return;
    }
    boolean isEmpty(){
        if(top==null){
            return true;
        }
        else return false;
    }
    void show(){
        Node temp = top;
        if(top == null){
            System.out.println("stack is empty...");
            return;
        }
        while(temp!=null){
            System.out.println(temp.data);{
                temp = temp.next;
            }
        }
        return;
    }
    public static void main(String[] args){
        StackLL stk = new StackLL();
        stk.createStack();
        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(40);
        stk.show();
        System.out.println("\n");
        stk.peek();
        System.out.println("\n");
        System.out.println(stk.isEmpty());
        stk.pop();
        stk.show();
        System.out.println("\n");
        stk.pop();
        stk.show();
        System.out.println("\n");
        stk.pop();
        stk.show();
        System.out.println("\n");
        stk.pop();
        stk.show();
        System.out.println("\n");
        stk.pop();
        stk.show();
        System.out.println(stk.isEmpty());
    }
}

import java.util.Arrays;
public class DoubleStack {
    class Stacks{
        int capacity;
        int top;
        int[] array;
    }
    Stacks stc;
    void createStack(int capacity){
        stc = new Stacks();
        stc.capacity = capacity;
        stc.top = -1;
        stc.array = new int[stc.capacity];
        return;
    }
    void doubleStack(){
        
        stc.capacity=stc.capacity*2;
        stc.array = Arrays.copyOf(stc.array, stc.capacity);
        
        return;
    }
    boolean isFull(){
        if(stc.top==stc.capacity-1){
          return true;
        }
        else{
            return false;
        }

        
    }
    boolean isEmpty(){
        if(stc.top==-1){
            return true;
        }
        else return false;
    }
    void push(int data){
        if(isFull()){
            doubleStack();
            return;
        }
        else{
            stc.top++;
            stc.array[stc.top]=data;
            return;
        }
    }
    void pop(){
        if(isEmpty()){
            System.out.println("stack underflow");
            return;
        }
        else{
            stc.top--;
            return;
        }
    }
    void peek(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return;
        }
        else{
            System.out.println(stc.array[stc.top]);
            return;
        }
    }
    void show(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return;
        }
        else{
            int i = stc.top;
            while(i!=-1){
                System.out.println(stc.array[i]);
                i--;
                
            }
        }
    }
    public static void main(String[] args){
        DoubleStack stk = new DoubleStack();
        stk.createStack(10);
        for(int i=0;i<10;i++){
            stk.push(i);
        }
        for(int i=9;i<20;i++){
            stk.push(i);
        }
        stk.show();
    }
}

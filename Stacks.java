public class Stacks{
    class Stak{
        int capacity;
        int top;
        int[] array;
    }
    Stak stc;
    void createStack(int capacity){
        stc = new Stak();
        stc.capacity = capacity;
        stc.top = -1;
        stc.array = new int[capacity];
        return;
    }
    boolean isEmpty(){
        if(stc.top==-1){
            return true;
        }
        else{
            return false;
        }
    }
    boolean isFull(){
        if(stc.top==stc.capacity-1){
            return true;
        }
        else{
            return false;
        }
    }
    int size(){
        if(isEmpty()){
            return -1;
        }
        else{
            return(stc.top+1);
        }
    }
    void push(int data){
        if(isFull()){
            System.out.println("stack overflow");
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
            System.out.println("stack is empty");
            return;
        }
        else{
            stc.top = stc.top-1;
            return;
        }
    }
    void peek(){
        if(isEmpty()){
            System.out.println("empty");
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
        return;
    }
    void deleteStack(){
        stc = null;
        return;
    }
    public static void main(String[]args){
        Stacks stk = new Stacks();
        stk.createStack(15);
        
        
        for(int i=0;i<15;i++){
            stk.push(i);
        }
        
       
        stk.show();
        System.out.println("================new object==============");
        Stacks stk1 = new Stacks();
        stk1.createStack(15);
        for(int i=15;i<30;i++){
            stk1.push(i);
        }

        stk1.show();
        System.out.println("==============adding both stacks=============");
        int total;
        for(int i=0;i<15;i++){
            total = stk.stc.array[i]+stk1.stc.array[i];
            System.out.println(total);
        }
        try{
            stk.deleteStack();
        stk.show();
        }
        catch(Exception e){
            System.out.println("create stack or the stack your trying to acces may be deleted please check..\n"+e);
        }
        


        
        
        
        
        
    }
}
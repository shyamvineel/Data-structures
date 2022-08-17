public class Clist{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public void show(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node cur = head;
        do{
            System.out.println(cur.data);
            cur = cur.next;
        }
        while(cur!=head);
    }
    public void insertlst(int data){
        Node cur = head;
        Node newnode = new Node(data);
        newnode.next = newnode;
        if(head==null){
            head = newnode;
            return;
        }
        while(cur.next!=head){
            cur=cur.next;
        }
        cur.next = newnode;
        newnode.next = head;
        return;
    }
    public void insertfst(int data){
        Node newnode = new Node(data);
        
        Node temp = head;
        newnode.next = newnode;
        if(head==null){
            head = newnode;
            return;
        }
       while(temp.next!=head){
        temp = temp.next;
       }
       newnode.next = head;
       temp.next = newnode;
       head = newnode;
        return;
    }
    public void deletefst(){
        
        Node temp = head;
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        while(temp.next!=head){
            temp = temp.next;
        }
        head = head.next;
        temp.next = head;
        return;
    }
    public void deletelst(){
        Node cur = head;
        Node temp = null;
        if(head==null){
            System.out.println("empty");
            return;
        }
        while(cur.next!=head){
            temp = cur;
            cur = cur.next;
        }
        temp.next = head;
        return;
    }
    public static void main(String[] args){
        Clist ls = new Clist();
        ls.insertlst(10);
        ls.insertlst(20);
        ls.insertlst(30);
        ls.insertfst(40);
        ls.deletefst();
        ls.deletelst();
        ls.show();
    }
}
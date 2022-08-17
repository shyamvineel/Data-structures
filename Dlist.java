public class Dlist {
    Node head;
    static class Node{
        int data;
        Node prev;
        Node next;
        Node(int d){
            this.data = d;
            this.prev = null;
            this.next = null;
        }
        
    }
    public void getcount(){
        int count = 0;
        Node cur = head;
        if(head==null){
            System.out.println(count);
            return;
        }
        while(cur!=null){
            cur = cur.next;
            count++;
        }
        System.out.println(count);
        return;
    }
    public void insert(int data){
        Node newnode = new Node(data);
        if(head==null){
            head = newnode;
            return;
        }
        head.prev = newnode;
        newnode.next = head;
        head=newnode;
        return;
    }
    public void insertlst(int data){
        Node newnode = new Node(data);
        Node cur = head;
        if(head==null){
            head = newnode;
            return;
        }
        while(cur.next!=null){
            cur = cur.next;
        }
        cur.next = newnode;
        newnode.prev = cur;
        return;
    }
    public void insertAt(int data,int pos){
        Node newnode = new Node(data);
        Node cur = head;
        int k =1;
        if(head==null){
            head = newnode;
            return;
        }
        if(pos==1){
            if(head!=null){
                newnode.next  = head;
                head.prev = newnode;
                head = newnode;
                return;
            }
        }
        while(k<pos-1 && cur.next!=null){
            cur = cur.next;
            k++;
        }
        if(k<pos-1){
            System.out.println("position not found or do not exist");
            return;
        }
        newnode.next = cur.next;
        newnode.prev = cur;
        if(cur.next!=null){
            cur.next.prev = newnode;
        }
        cur.next = newnode;
        return;
    }
    public void show(){
        Node cur = head;
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        while(cur!=null){
            System.out.println(cur.data);
            cur = cur.next;
        }
        return;
    }
    public void deletefst(){
        Node cur = head;
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        head = head.next;
        head.prev = null;
        return;
    }
    public void deletelst(){
        Node cur = head;
        Node temp = null;
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        while(cur.next!=null){
            cur = cur.next;
        }
        temp = cur.prev;
        temp.next = cur.next;
        return;
    }
    public void deleteAt(int pos){
        Node cur = head;
        Node temp = null;
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        if(pos==1){
            if(head!=null){
                head = head.next;
                return;
           }
        }
        int k =1;
        while(k<pos && cur.next!=null){
            cur = cur.next;
            k++;
        }
        temp = cur.prev;
        temp.next = cur.next;
        if(cur.next!=null){
            cur.next.prev = temp;
        }
        return;
    }
    public static void main(String[] args){
            Dlist ls = new Dlist();
            ls.insert(10);
            ls.insert(20);
            ls.insertlst(30);
            ls.insertAt(40,3);
            ls.show();
            ls.getcount();
            ls.deletefst();
            ls.deletelst();
            ls.deleteAt(2);
            ls.deleteAt(1);
            ls.show();
    }
}

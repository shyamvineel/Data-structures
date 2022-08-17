class List{
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            this.data = d;
            this.next = null;
        }
        
       
    }
    public void insert(int data){
        Node newnode = new Node(data);
        
        if(head==null){
            head = newnode;
            return;
        }
        Node cur = head;
        while(cur.next!=null){
            cur = cur.next;
        }
        cur.next = newnode;
        return;
    }
    public void insertatbeg(int data){
        Node newnode = new Node(data);
        if(head==null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
        return;
       
    }
    public void insertatpos(int data,int pos){
        Node newnode = new Node(data);
        int k =1;
        if(head==null){
            head = newnode;
            return;
        }
        Node cur = head;
        
        while(k<pos-1 && cur!=null){
            cur = cur.next;
        }
        newnode.next = cur.next;
        cur.next = newnode;
        return;

        
    }
    public void deletelst(){
        Node cur = head;
        Node prev = null;
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        while(cur.next!=null){
            prev = cur;
            cur = cur.next;
        }
        prev.next = null;
        return;
    }
    public void getcount(){
        Node cur = head;
        int count =0;
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
    public void deletfst(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        head = head.next;
        return;
    }
    public void deleteatpos(int pos){
        int k=1;
        Node cur = head;
        Node prev = head;
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        if(pos==1){
            head = head.next;
            return;
        }
        while(k<pos && cur!=null){
            prev = cur;
            cur = cur.next;
            k++;
        }
        if(cur==null){
            System.out.println("pos donot exist");
            return;
        }
        prev.next = cur.next;
        return;
    }
    public void show(){
        Node cur = head;
        if(head==null){
            System.out.print("list is empty");
            return;
        }
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        return;
    }
    public static void main(String args[]){
        List li = new List();
        li.insert(30);
        li.insert(90);
        li.insertatbeg(10);
        li.insertatpos(20, 2);
        li.show();
        li.getcount();
        li.deletelst();
        li.deletfst();
        li.deleteatpos(2);
        li.deleteatpos(1);
        li.show();


    }
}
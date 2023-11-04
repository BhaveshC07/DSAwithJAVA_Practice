package LinkedList_1;

public class doublyLL {
    public static void main(String[] args) {
       doublyLL ll=new doublyLL();
       ll.addFirst(5);
       ll.addFirst(6);
       ll.addFirst(1);
       ll.print();
       ll.removeFirst();
       ll.print();
       ll.addLast(9);
       ll.print();
       ll.removeLast();
       ll.print();
    }
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        size++;
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    public void addLast(int data){
        size++;
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public int removeFirst(){
        if(head==null){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val= head.data;
            size--;
            head=tail=null;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }
    public int removeLast() {
        if (head == null) {
            System.out.println("Ll is empty");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            head = tail = null;
            size--;
        }
        Node prev=head;
        for (int i = 0; i < size-2; i++) {
            prev=prev.next;
        }
        int val=prev.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
}

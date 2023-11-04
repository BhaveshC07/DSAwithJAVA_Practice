package LinkedList_1;

public class create_node {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data= data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){

        //create new node
        Node newNode=new Node(data);

        if(head==null){
            head=tail=newNode;
            return;
        }
        size++;
        //newNode next=head
        newNode.next=head;

        //head=newNode
        head=newNode;
    }

    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void addMiddle(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public void print(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public int removeFirst(){
        if(size==0){
            System.out.println("system is empty");
            return Integer.MIN_VALUE;
        } else if (size==1) {
            int val= head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val= head.data;;
        head=head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if (size==1) {
            int val= head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev=head;
        for (int i = 0; i < size-1; i++) {
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;//mid of ll
    }
    public boolean Check(){
        //base case
        if(head==null || head.next==null){
            return true;
        }
        //first step find mid
        Node mid=findMid(head);

        //step 2=reverse 2nd part
        Node prev=null;
        Node curr=mid;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node rigth=prev;
        Node left=head;

        while (rigth != null) {
            if (left.data != rigth.data) {
                return false;
            }
            left = left.next;
            rigth = rigth.next;
        }
        return true;
    }
    public static void main(String[] args) {
        create_node ll=new create_node();
        ll.addFirst(5);
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(5);
        System.out.println(ll.Check());
    }
}

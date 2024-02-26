package LinkedList_1;

public class insert_DLL {
    public class Node{
        int data;
        Node previous;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }
    public static Node head;
    public static Node tail;
    public void insert(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
            head.previous=null;
            tail.next=null;
        }else{
            tail.next=newNode;
            newNode.previous=tail;
            tail=newNode;
            tail.next=null;
        }
    }

    public void print(){
        Node curr=head;
        if(curr==null){
            System.out.println("list is empty");
            return;
        }
        System.out.println("The given list is ");
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }

    public static void main(String[] args) {
        insert_DLL nn=new insert_DLL();
        nn.insert(20);
        nn.insert(40);
        nn.insert(60);
        nn.insert(80);
        nn.insert(100);
        nn.print();


    }
}

package LinkedList_1;
public class insert {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node Head;
    public static Node Tail;

    public void insert(int data){
        Node newNode=new Node(data);
        if(Head==null){
            Head=newNode;
            Tail=newNode;
        }else {
            Tail.next=newNode;
            Tail=newNode;
        }
    }

    public void print(){
        Node curr=Head;

        if(curr==null){
            System.out.println("🔴List is empty");
            return;
        }
        System.out.println("The given list is ");
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        insert nn=new insert();
//        nn.insert(10);
//        nn.insert(20);
//        nn.insert(30);
//        nn.insert(40);
        nn.print();
    }
}

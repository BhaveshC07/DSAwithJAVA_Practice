package LinkedList_1;

public class insert_begining{
    public class Node{
        int data;
        Node next=null;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head=null;
    public void insert(int data){
        Node newNode=new Node(data);

        if(this.head==null){
            this.head=newNode;
        }else{
            newNode.next=this.head;
            this.head=newNode;
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
        insert_begining nn=new insert_begining();
        nn.insert(10);
        nn.insert(32);
        nn.insert(36);
        nn.print();
    }
}


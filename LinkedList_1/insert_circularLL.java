package LinkedList_1;

public class insert_circularLL {

    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }

    public static Node head;
    public static Node tail;

    public void insert(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
            newNode.next=head;
        }else{
            tail.next=newNode;
            tail=newNode;
            tail.next=head;
        }
    }
    static boolean isCircular(Node head)
    {
        // An empty linked list is circular
        if (head == null)
            return true;

        // Next of head
        Node node = head.next;

        // This loop would stop in both cases (1) If
        // Circular (2) Not circular
        while (node != null && node != head)
            node = node.next;

        // If loop stopped because of circular
        // condition
        return (node == head);
    }
    public void print(){
        Node curr=head;

        if(curr==null){
            System.out.println("list is empty");
            return;
        }
        System.out.println("The given list is ");
        do{
            System.out.print(curr.data+" ");
            curr=curr.next;
        }while(curr!=head);
        System.out.println();
    }

    public static void main(String[] args) {
        insert_circularLL nn=new insert_circularLL();
        nn.insert(50);
        nn.insert(100);
        nn.insert(60);
        nn.print();

        System.out.print(isCircular(head) ? "Yes\n"
                : "No\n");
    }
}

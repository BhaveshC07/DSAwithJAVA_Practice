package LinkedList_1;

public class insert_at_pos {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }
    public static Node head;
    public void insert(int data){
        Node newNode=new Node(data);

        if(this.head==null){
            this.head=newNode;
        }else{
            newNode.next=this.head;
            this.head=newNode;
        }
    }
    public void insertionatpos(int position, int data) {
        Node newNode = new Node(data);
        Node current = this.head;
        Node previous = this.head;
        if (position == 1) {
            newNode.next = head;
            this.head = newNode;
            return;
        }
        int count=1;
        while (current.next != null && position > 0&&count<position) {
            previous = current;
            current = current.next;
            count++;
        }
        previous.next = newNode;
        newNode.next = current;
    }
    public void print(){
        Node curr=head;
        if(head==null){
            System.out.println("Print is empty");
            return;
        }
        System.out.print("the given list is ");
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }

    public static void main(String[] args) {
        insert_at_pos n1=new insert_at_pos();
        n1.insert(8);
        n1.insert(85);
        n1.insert(6);
        n1.insertionatpos(3,12);
        n1.insertionatpos(4,44);
        n1.insertionatpos(4,15);
        n1.print();
    }
}

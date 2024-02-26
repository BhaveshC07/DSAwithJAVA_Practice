package LinkedList_1;

public class insert_at_end {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }

    public static Node head;
    public void insert(int data) {
        Node newNode = new Node(data);
        Node curr = this.head;

        if (curr == null) {
            this.head = newNode;
        } else {

            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
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
        insert_at_end nn=new insert_at_end();
        nn.insert(8);
        nn.insert(85);
        nn.insert(6);
        nn.print();
    }
}

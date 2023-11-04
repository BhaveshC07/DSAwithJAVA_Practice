package LinkedList_1;

import java.util.LinkedList;

public class MergeSort {
    public static void main(String[] args) {
        MergeSort ll=new MergeSort();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.print();
        ll.head=ll.meergeSort(ll.head);
        ll.print();
    }
    public static class Node{
        int data;
        Node next;


        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst (int data){
        Node newNode =new Node(data);

        if(head==null){
            head=tail=null;
        }
        newNode.next=head;
        newNode=head;
    }

    public Node getmid(){
        MergeSort.Node slow = head;
        MergeSort.Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;//mid of ll
    }
    public Node merge(Node head1,Node head2){
        Node mergeLL=new Node(-1);
        Node temp=mergeLL;

        while(head1!=null || head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }else{
                temp.next=head2;
                head2=head1.next;
                temp=temp.next;
            }
        }
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while(head2!=null){
            temp.next=head2;
            head2=head1.next;
            temp=temp.next;
        }
        return mergeLL.next;
    }
    public Node meergeSort(Node head){
        if(head!=null && head.next==null){
            return head;
        }
        Node mid=getmid();

        MergeSort.Node rightHead=mid.next;
        mid.next=null;
        Node newLeft=meergeSort(head);
        Node newRight=meergeSort(rightHead);

        return merge(newLeft,newRight);
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data);
            temp=temp.next;
        }
    }
}

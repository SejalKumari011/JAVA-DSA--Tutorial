public class LinkedList2 {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
public static Node head;
public static Node tail;

        public static boolean isCycle(){
            Node slow = head;
            Node fast = head;
        
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
        
                if (slow == fast) {
                    return true;
                }
            }
            return false;
        }
        public void addFirst(int data){
    Node newNode = new Node(data);
    if (head == null) {
        head = tail = newNode;
    } else {
        newNode.next = head;
        head = newNode;
    }
}

public void print(){
    Node temp = head;
    while(temp != null){
        System.out.print(temp.data + " -> ");
        temp = temp.next;
    }
    System.out.println("null");
}


public static void removeCycle(){
    //detect cycle
    Node slow=head;
    Node fast=head;
    boolean cycle=false;

    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast){
            cycle=true;
            break;
        }
    }

    if(cycle==false){
        return;
    }
    //find meetin point
    slow =head;
    Node prev=null;

    while(slow!=fast){
        prev=fast;
        slow=slow.next;
        fast=fast.next;
    }

    //remove cycle
    prev.next=null;

}


//merge sort on linkedlist
private Node getMid(Node head){
    Node slow=head;
    Node fast=head.next;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;

    }
    return slow; //mid

}

private Node merge(Node head1, Node head2){
    Node mergedll=new Node(-1);
    Node temp=mergedll;

    while(head1!=null && head2!=null){
        if(head1.data<=head2.data){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;

        }else{
            temp.next=head2;
            head2=head2.next;
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
            head2=head2.next;
            temp=temp.next;

        }
        return mergedll.next;
}

public Node mergesort(Node head){
    if(head==null || head.next==null){
        return head;
    }
    //mid
    Node mid=getMid(head);

    //left and right merge sort
    Node rightHead=mid.next;
    mid.next=null;
    Node newLeft=mergesort(head);
    Node newRight=mergesort(rightHead);

    //merge
    return merge(newLeft, newRight);
}

public void zigZag(){
    //mid

    Node slow=head;
    Node fast=head.next;

    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    Node mid=slow; //mid

    //reverse
    
    Node curr=mid.next;
    mid.next=null;
    Node prev=null;
    Node next;
    
    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    Node left=head;
    Node right=prev;

    //zig zag
    Node nextL, nextR;
    while(left!=null && right !=null ){
        nextL=left.next;
        left.next=right;
        nextR=right.next;
        right.next=nextL;

        left=nextL;
        right=nextR;

    }
}


    public static void main(String[] args){
    //    head = new Node(1);
    //    Node temp=new Node(2);
    //    head.next=temp;
    //    head.next.next=new Node(3);
    //    head.next.next.next=temp;  //1->2->3->1
    //    System.out.println(isCycle());
    //    removeCycle();
    //    System.out.println(isCycle());

    LinkedList2 ll=new LinkedList2();
    ll.addFirst(1);
    ll.addFirst(2);
    ll.addFirst(3);
    ll.addFirst(4);
    ll.addFirst(5);

    ll.print();

    ll.zigZag();
    ll.print();


    }
    
}

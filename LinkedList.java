public class LinkedList {

//creating Node
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
 public static int size;

 //adding at first
 public void addFirst(int data){
    Node newnode=new Node(data);
    size++;
    if(head==null){
        head=tail=newnode;
        return;
    }
    newnode.next=head;
    head=newnode;
 }

 //adding at last
 public void addLast(int data){
    Node newnode=new Node(data);
    size++;
    if(head==null){
        head=tail=newnode;
        return;
    }

    tail.next=newnode;
    tail=newnode;
 }

 //adding index wise
 public void add(int idx, int data){
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
 //printing the ll
 public void print(){
    if(head==null){
        System.out.println("LL is empty. ");
        return;

    }
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+"-->");
        temp=temp.next;
    }
    System.out.println("Null");
 }

 //removing at first

 public int removeFirst(){
    if(size==0){
        System.out.println("LL is empty.");
        return Integer.MIN_VALUE;
    }else if(size==1){
        int val=head.data;
        size=0;
        head=tail=null;
        return val;
    }
    int val=head.data;
    head=head.next;
    size--;
    return val;

 }
 //removing at last
 public int removeLast(){
    if(size==0){
        System.out.println("LL is empty.");
        return Integer.MIN_VALUE;
    }else if(size==1){
        int val=head.data;
        head=tail=null;
        return val;
    }
    Node prev=head;
    for(int i=0;i<size-2;i++){
        prev=prev.next;
    }
    int val=prev.next.data; //tail.data
    prev.next=null;
    tail=prev;
    size--;
    return val;

 }
 //searhing iteratively
 public int searchKey(int key){
    int i=0;
    Node temp=head;
    while(temp!=null){
        if(temp.data==key){
            return i;
        }
        temp=temp.next;
        i++;

    }
    return -1;
 }

 //searching recursively
 public int helper(Node head, int key){
    if(head==null){
        return -1;
    }
    if(head.data==key){
        return 0;
    }
    int idx=helper(head.next,key);
    if(idx==-1){
        return -1;
    }
    return idx+1;
 }

 public int RecSearch(int key){
    return helper(head,key);
 }

 public void reverse(){
    Node prev=null;
    Node curr=tail=head;
    Node next;

    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    head=prev;
 }


 public void deleteNthFromend(int n){
    //calc size
    int sz=0;
    Node temp=head;
    while(temp!=null){
        temp=temp.next;
        sz++;
    }

    if(sz==n){
        head=head.next;
        return;
    }

    //sz-n
    int i=1;
    int iTofind=sz-n;
    Node prev=head;
    while(i<iTofind){
        prev=prev.next;
        i++;
    }
    prev.next=prev.next.next;

 }
 //calc mid

 //slow fast
 public Node mid(Node head){
    Node slow=head;
    Node fast=head;

    while(fast!=null && fast.next!=null){
        slow=slow.next; //+1
        fast=slow.next.next; //+2
    }
    return slow;
 }

 //check palindrome

 public boolean isPalindrome(){

    if(head == null || head.next!=null){
        return true;
    }
    //step 1- find mid
    Node midNode=mid(head);

    //step 2-- reverse from mid
    Node prev=null;
    Node curr=midNode;
    Node next;

    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }

    Node right=prev;
    Node left=head;

    //step 3 -- check left and right
    while(right !=null){
        if(left.data!=right.data){
            return false;
        }
        left=left.next;
        right=right.next;
    }
    return true;
 }

    public static void main(String [] args){
        LinkedList L1=new LinkedList();
        L1.addFirst(1);
        L1.addFirst(2);
        L1.addLast(3);
        L1.addLast(4);
        L1.add(2,9);
        L1.print();
        L1.removeFirst();
        L1.print();
        L1.removeLast();
        L1.print();
        L1.reverse();
        L1.print();
        L1.deleteNthFromend(2);
        L1.print();



    }
    
}

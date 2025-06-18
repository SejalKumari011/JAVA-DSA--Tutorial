public class CircularLL {

    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    private Node head=null;
    private Node tail=null;
    private int size=0;

    //add at start

    public void addAtStart(int data){
        Node newnode=new Node(data);

        if(head==null){
            head=tail=newnode;
            newnode.next=head;
            tail.next=head;
            size++;
            return;
        }

        newnode.next=head;
        tail.next=newnode;
        head=newnode;
        size++;

    }

    //add at end
    public void addAtEnd(int data){
        Node newnode=new Node(data);

        if(head==null){
            head=tail=newnode;
            newnode.next=head;
            tail.next=head;
            size++;
            //return tail;
        }

        newnode.next=tail.next;
        tail.next=newnode;
        tail=newnode;
        //return tail;
    }

    //insertion between two nodes

    public void addInBetween(int data){
        Node newnode=new Node(data);  
        newnode.next=head.next;
        head.next=newnode;
        size++;
    }


    //delete first node

    public void deleteFirst(){
       // Node newnode=new Node(data);

        if(head==null){
            System.out.println("CLL is already empty.");
            return;
        }

        if(head==tail){
            head=tail=null;
        }

        head=head.next;
        tail.next=head;
    }

    //delete last node

    public void deleteLast(){
        if(head==null){
            System.out.println("CLL is empty.");
            return;
        }

        if(head==tail){
            head=tail=null;
        }
        
        Node curr=head;

        while(curr.next!=tail){
            curr=curr.next;
        }
        curr.next=head;
        tail=curr;
    }



    public void print(){
        if(head==null){
            System.out.println("CLL is empty.");
            return;
        }
        Node temp=head;

        do{
            System.out.print(temp.data+"->");
            temp=temp.next;
        }while(temp!=head);

        System.out.println("back to head");
    }

    public static void main(String[] args){
        CircularLL cll=new CircularLL();

        cll.addAtStart(3);
        cll.addAtStart(2);
        cll.addAtStart(1);
        cll.addAtEnd(4);
        cll.addInBetween(12);
        cll.print();
        cll.deleteFirst();
        cll.print();
        cll.deleteLast();
        cll.print();
      

    }
    
}

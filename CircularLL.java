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

        cll.print();

    }
    
}

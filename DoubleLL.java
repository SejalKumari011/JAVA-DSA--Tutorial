public class DoubleLL {

    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }

        public static Node head;
        public static Node tail;
        public static int size=0;

        //add first
        public void addFirst(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                size++;
                return;
            }

            newNode.next=head;
            head.prev=newNode;
            head=newNode;
            size++; 
        }

        //print
        public void print(){
            Node temp=head;

            while(temp!=null){
                System.out.print(temp.data+"<->");
                temp=temp.next;
            }
            System.out.println("null");
        }

    //removeFirst
    public int removeFirst(){

        if(head==null){
            System.out.println("DLL is empty.");
            return Integer.MIN_VALUE;
        }

        if(size==1){
            int val=head.data;
            head=tail=null;
            return val;
        }

        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }

    //add last

    public void addLast(int data){
        Node newnode=new Node(data);

        if(head==null){
            head=tail=newnode;
            size++;
            return;
        }

        tail.next=newnode;
        newnode.prev=tail;
        newnode.next=null;
        size++;

    }

    //remove last

    public void removeLast(){
        if(head==null){
            System.out.println("DLL is empty.");
            return;
        }

        if(head==tail){
            
            head=tail=null;
            size--;
            return;
        }

        tail=tail.prev;
        tail.next=null;
        size--;
        return;
    }

    //public void reverse
    public void reverse(){
        Node curr=head;
        Node prev=null;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    


        public static void main(String [] args){
            DoubleLL dll= new DoubleLL();
            dll.addFirst(3);
            dll.addFirst(2);
            dll.addFirst(1);
            dll.addLast(4);

            dll.print();
            System.out.println(dll.size);

            // dll.removeLast();
            // dll.print();

            dll.reverse();
            dll.print();
            

            // dll.removeFirst();
            // dll.print();
            // System.out.println(dll.size);
        }
    
    
}

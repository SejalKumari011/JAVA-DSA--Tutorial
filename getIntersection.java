public class getIntersection {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head1;
    public static Node head2;
    public static Node tail;


    public Node GetIntersection(Node head1, Node head2){
        while(head2!=null){
            Node temp=head1;

            while(temp!=null){
                if(temp==head2){
                    return head2;
                }
                temp=temp.next;
            }
            head2=head2.next;
            
        }
        return null;
    }


    public static void main(String[] args){
        getIntersection list=new getIntersection();
        Node head1, head2;

        head1 = new Node(10);
        head2 = new Node(3);

        Node newNode = new Node(6);
        head2.next = newNode;
        newNode = new Node(9);
        head2.next.next = newNode;
        newNode = new Node(15);
        head1.next = newNode;
        head2.next.next.next = newNode;
        newNode = new Node(30);
        head1.next.next = newNode;
        head1.next.next.next = null;

        Node intersection = list.GetIntersection(head1, head2);
        if (intersection != null) {
            System.out.println("Intersection at node: " + intersection.data);
        } else {
            System.out.println("No intersection found.");
        }


    }
    
}

public class Queue {

    static class Node{
        int data;
        Node  next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }


    static class queue{
          int arr[];
          int size;
         int rear;
         int front;

        static Node head=null;
        static Node tail=null;

         public  boolean isEmpty(){
            return head==null && tail==null;
         }

        
         //add
         public void add(int data){

            Node newnode=new Node(data);

            if(head==null){
                head=tail=null;
                return;  
            }
            tail.next=newnode;
            tail=newnode;

         }

         //remove

         public  int remove(){

            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            int front=head.data;
            //last element delete
            if(tail==head){
                head=tail=null;
            }else{
                head=head.next;
            }
            return front;
         }

         //peek
         public  int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;

         }

    }

    public static void main(String [] args){
        queue q=new queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
    
}

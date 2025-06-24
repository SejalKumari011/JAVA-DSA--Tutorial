import java.util.*;
public class stack {

   static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    static class StackA{

        //push at bottom

        // Stack<Integer> s=new Stack();
        public static void addAtBottom(Stack<Integer> s, int data){

            if(s.isEmpty()){
                s.push(data);
                return;
            }
            int top=s.pop();
            addAtBottom(s, data);
            s.push(top);
        }

        //reverse stack

        public static void reverseStack(Stack<Integer> s){
            if(s.isEmpty()){
              return;
            }

            int top=s.pop();
            reverseStack(s);
            addAtBottom(s, top);
        }

        //print stack
        public static void printStack(Stack<Integer> s){
            while(!s.isEmpty()){
                System.out.println(s.pop());
            }
        }
        //static Node head=null;

        //implemenattaion using linked list

       /* public static boolean isEmpty(){
            return head==null;
        }

        //push
        public static void push(int data){
            Node newnode=new Node(data);
            if(isEmpty()){
                head=newnode;
                return;
            }

            newnode.next=head;
            head=newnode;
        }

        //pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }

            int top=head.data;
            head=head.next;
            return top;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }*/
    
    
        //list
        //ArrayList<Integer> list=new ArrayList<>();
        //Stack implementation using ArrayList

        // //isEmpty
        // public  boolean isEmpty(){
        //     return list.size()==0;
        // }

        // //push
        // public  void push(int data){
        //     list.add(data);
        // }

        // //pop
        // public   int pop(){
        //     if(isEmpty()){
        //         return -1;
        //     }
        //     int top=list.get(list.size()-1);
        //     list.remove(list.size()-1);
        //     return top;
        // }

        // //peek
        // public  int peek(){
        //     if(isEmpty()){
        //         return -1;
        //     }
        //     return list.get(list.size()-1);
        // }


         //reverse a string using stack

         public static String reverseString(String str){

            Stack<Character> s=new Stack<>();
            int idx=0;
            while(idx<str.length()){
                s.push(str.charAt(idx));
                idx++;
            }

            StringBuilder result=new StringBuilder();
            while(!s.isEmpty()){
                char curr=s.pop();
                result.append(curr);
            }
            return result.toString();

         }

    }


    public static void main(String[]args){

        // Stack<Integer>  s=new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);


        // StackA.addAtBottom(s,4);
        // while(!s.isEmpty()){
        //     System.out.println(s.pop());
            
        // }

        // String str="abc";
        // System.out.println(StackA.reverseString(str));
        Stack<Integer> s= new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        StackA.reverseStack(s);
        StackA.printStack(s);



    }
}

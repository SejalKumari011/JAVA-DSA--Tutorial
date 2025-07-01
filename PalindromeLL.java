import java.util.*;
public class PalindromeLL {


    static class Node{
        int data;
        Node ptr;
        Node(int data){
            this.data=data;
            this.ptr=null;
        }
    }


    static boolean isPalindrome(Node head){
        Node slow=head;
        boolean isPalin=true;
        Stack<Integer> s=new Stack<>();

        while(slow!=null){
            s.push(slow.data);
            slow=slow.ptr;
        }
        slow=head;
        while(head!=null){
            int i=s.pop();
            if(head.data==i){
                isPalin=true;
            }else{
                isPalin=false;
                break;
            }
            
             head=head.ptr;
        }
        return isPalin;
    }

    public static void main(String [] agrs){
        Node one=new Node(1);
        Node two=new Node(2);
        Node three=new Node(3);
        Node four=new Node(4);
        Node five=new Node(3);
        Node six=new Node(2);
        Node seven=new Node(1);
        one.ptr=two;
        two.ptr=three;
        three.ptr=four;
        four.ptr=five;
        five.ptr=six;
        six.ptr=seven;

        boolean condition=isPalindrome(one);
        System.out.println(condition);

    }
    
}

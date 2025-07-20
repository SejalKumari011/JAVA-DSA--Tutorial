import java.util.*;
import java.util.Stack;
public class queueUsing2stacks {

    static class queue{
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty(){
            return s1.isEmpty();
        }

        //add
        public void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }

            s1.push(data);

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        //remove
        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty;");
                return -1;
            }
            return s1.pop();
        }

        //peek
         public int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty;");
                return -1;
            }
            return s1.peek();
        }
    }

    public static void main(String [] args){
        queue q1 = new queue();
        q1.add(1);
        q1.add(2);
        q1.add(3);

        while(!q1.isEmpty()){
            System.out.println(q1.peek());
            q1.remove();

        }
    }
}


import java.util.Deque;
import java.util.LinkedList;
public class StackUsingDeque {

    static class Stack{
        
        Deque<Integer> deque=new LinkedList<>();

        public void push(int data){
            deque.addLast(data);
        }

        public void remove(){
            deque.removeLast();
        }

        public int peek(){
            return deque.getLast();
        }

        public boolean isEmpty(){
            return deque.isEmpty();
        }

    }

    public static void main(String [] args){
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("peek: "+s.peek());
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.remove();
        }

    }
    
}

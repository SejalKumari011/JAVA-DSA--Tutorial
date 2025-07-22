import java.util.Deque;
import java.util.LinkedList;
public class QueueUsingDeque {

    static class Queue{
        Deque<Integer> deque=new LinkedList<>();

        public void add(int data){
            deque.addLast(data);
        }

        public void remove(){
            deque.removeFirst();
        }

        public int peek(){
            return deque.getFirst();
        }

        public boolean isEmpty(){
            return deque.isEmpty();
        }
    }

    public static void main(String [] args){
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("Peek: "+q.peek());

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
    
}

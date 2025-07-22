import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
public class reverseFirstK {

    public static void reverse(Queue<Integer> q,int k){
        if (q == null || k <= 0 || k > q.size()) return;

        Stack<Integer> s=new Stack<>();
        int size=q.size();

        for(int i=0;i<k;i++){
            s.push(q.remove());
        }

        while(!s.isEmpty()){
            q.add(s.pop());
        }

        for (int i = 0; i < size -k; i++) {
            q.add(q.remove());
        }

    }

    public static void main(String [] args){
        Queue<Integer> q=new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);

        int k=5;
        reverse(q,k);

        

        while(!q.isEmpty()){
            System.out.println(q.remove());
        }


    }
    
}

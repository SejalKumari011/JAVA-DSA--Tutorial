import java.util.LinkedList;
public class LLCollections {



    public static void main(String[] args){
        //create linkedList
        LinkedList<Integer>ll=new LinkedList<>();

        //add values
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);

        //print
        System.out.println(ll);

        //remoce
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
    
}

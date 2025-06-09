import java.util.ArrayList;
public class arraylist1 {
        public static void main(String[] args ){
        //Array List of Integer type
        ArrayList<Integer> list = new ArrayList<>();

        //Array List of String type
        ArrayList<String> list2=new ArrayList<>();

        //float type
        ArrayList<Float>list3=new ArrayList<>();

        //add elements in a list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        //adding element by index
        list.add(4,10);

        System.out.println("List:" +list);

        //get operation
        System.out.println("Element present at index 2: "+ list.get(2)); //element at 2nd index

        //delete the element
        list.remove(2);  //remove the element at 2nd index
        System.out.println("After removing the element at 2nd index: "+ list);

        //set element at a index
        list.set(2,5);
        System.out.println("Changing the element at index 2: "+ list);

        //if a list contain a particular element
        System.out.println("If list contains element 2: "+list.contains(2));
        System.out.println("If list contains element 12: "+list.contains(12));

        //size of array list
        System.out.print(list.size());
        
        //printing all the element in a array list
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }
    
}

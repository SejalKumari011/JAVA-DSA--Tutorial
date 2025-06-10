import java.util.ArrayList;
import java.util.*;
public class arraylist1 {
    public static void swapElement(ArrayList<Integer>list,int idx1,int idx2){
        //swapping two elements

        // int temp=list.get(idx1);
        // list.set(idx1,list.get(idx2));
        // list.set(idx2,temp);
        // System.out.print(list);

    }
        public static void main(String[] args ){
        //Array List of Integer type
        ArrayList<Integer> list = new ArrayList<>();

        // //Array List of String type
        // ArrayList<String> list2=new ArrayList<>();

        // //float type
        // ArrayList<Float>list3=new ArrayList<>();

        // //add elements in a list
        list.add(1);
        list.add(9);
        list.add(3);
        list.add(4);
        list.add(7);

        // //adding element by index
        // list.add(4,10);

        // System.out.println("List:" +list);

        // //get operation
        // System.out.println("Element present at index 2: "+ list.get(2)); //element at 2nd index

        // //delete the element
        // list.remove(2);  //remove the element at 2nd index
        // System.out.println("After removing the element at 2nd index: "+ list);

        // //set element at a index
        // list.set(2,5);
        // System.out.println("Changing the element at index 2: "+ list);

        // //if a list contain a particular element
        // System.out.println("If list contains element 2: "+list.contains(2));
        // System.out.println("If list contains element 12: "+list.contains(12));

        // //size of array list
        // System.out.print(list.size());
        
        // //printing all the element in a array list
        // for(int i=0;i<list.size();i++){
        //     System.out.println(list.get(i));
        // }
        

        // int idx1=2,idx2=4;
        // swapElement(list, idx1, idx2);

        //sorting elemets in an ArrayList
        System.out.println(list);
        //Ascending
        Collections.sort(list);
        System.out.println("In Ascending Order: "+list);

        //Descending
        Collections.sort(list,Collections.reverseOrder());
        System.out.print("In Descending Order: "+list);
        


    }
    
}

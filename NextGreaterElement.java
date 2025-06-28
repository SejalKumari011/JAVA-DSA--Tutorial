import java.util.*;
import java.util.Arrays;
import java.util.Stack;
public class NextGreaterElement {


    public static int[] nextGreater(int arr[]){
        int NextGreater[]=new int[arr.length];
        Stack<Integer> s=new Stack<>();
    
        for(int i= arr.length-1;i>=0;i--){
            //while loop
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }

            //if else
            if(s.isEmpty()){
                NextGreater[i]=-1;
            }else{

                NextGreater[i]=arr[s.peek()];

            }

            //push
            s.push(i);
        }
        return NextGreater;

    }
    
    public static void main(String[] args){
        int arr[]={6,8,0,1,3};
        
        int result[]=nextGreater(arr);
        System.out.println(Arrays.toString(result));
        
    }
    
}
       

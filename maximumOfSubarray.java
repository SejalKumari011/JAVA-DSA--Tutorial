import java.util.Queue;
import java.util.LinkedList;
public class maximumOfSubarray {

    public static void maximumOfSubarray(int arr[] , int k){
        Queue<Integer> q= new LinkedList<>();
        // int size=q.size();

        for(int i=0;i<arr.length-k;i++){
            q.clear();
            for(int j=i;j<i+k;j++){
                q.add(arr[j]);
            }
            int max=Integer.MIN_VALUE;
            for(int num:q){
                max=Math.max(max,num);
            }
            System.out.print(max+" ");
        }
    }
    public static void main(String [] args){
        int arr[]={1,2,3,1,4,5,2,3,6};
        int k=3;
        maximumOfSubarray(arr, k);
    }
    
}

import java.util.*;
public class MaxAreaInHistogram{


    public static void MaxAreaInHist(int arr[]){

        int maxArea=0;
        int nsl[]=new int[arr.length];
        int nsr[]=new int[arr.length];

        //nsr
        Stack<Integer>s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=-1;
            }else{
                nsr[i]=s.peek();
            }
            s.push(i);
        
        }

        //nsl
        s=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;
            }else{
                nsl[i]=s.peek();
            }
            s.push(i);
        
        }


        //Current area (width=nsr[i]-nsl[i]-1)

        for(int i=0;i<arr.length;i++){
            int height=arr[i];
            int width=nsr[i]-nsl[i]-1;
            int currArea=height*width;
            maxArea=Math.max(currArea, maxArea);
        }
        System.out.println("Max area in histogram: "+maxArea);
    }

    public static void main(String [] args){
        int arr[]={2,1,5,6,2,3};
        MaxAreaInHist(arr);
    }
}
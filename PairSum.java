import java.util.*;
public class PairSum {

    public static boolean pairSum(ArrayList<Integer>arr, int target){
        //brute force

       /* for(int i=0;i<arr.size()-1;i++){
            for(int j=0;j<arr.size()-1;j++){
                if(arr.get(i)+arr.get(j)==target){
                    System.out.println("sum of Values of following indices give the target value: "+i+" , "+j);
                    return true;
                }
            }
        }
        return false;*/

        //2 pointer
        int lp=0,rp=arr.size()-1;

        while(lp!=rp){
            //calculate
            if(arr.get(lp)+arr.get(rp)==target){
                return true;
            }else if(arr.get(lp)+arr.get(rp)<target){
                lp++;
            }else{
                rp--;
            }
           
        }
         return false;
        
    }

    public static void main(String[] args){
        ArrayList<Integer>arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println(pairSum(arr,10));
    }
    
}

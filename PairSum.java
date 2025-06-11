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
        /*int lp=0,rp=arr.size()-1;

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
         return false;*/

        //2 pointer for sorted and rotated array
        int n=arr.size()-1;
        int bp=-1;
        for(int i=0;i<arr.size()-1;i++){
            if(arr.get(i)>arr.get(i+1)){
                bp=i;
            }
        }
        int lp=bp+1;
        int rp=lp;
        while(lp!=rp){

            if(arr.get(lp)+arr.get(rp)==target){
                return true;

            }else if(arr.get(lp)+arr.get(rp)<target){
                lp=(lp+1)%n;
            }else{
                rp=(n+rp-1)%n;
            }
            }
            return false;
        
    }

    public static void main(String[] args){
        ArrayList<Integer>arr=new ArrayList<>();
        arr.add(11);
        arr.add(15);
        arr.add(6);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        System.out.println(pairSum(arr,14));
    }
    
}

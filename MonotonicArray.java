import java.util.*;
public class MonotonicArray {

    public static boolean monotonicAL(ArrayList<Integer>nums){
        boolean inc=true;
        boolean dec=true;
        for(int i=0;i<nums.size()-1;i++){
        if(nums.get(i)>nums.get(i+1)){
              inc=false;

        }else{
            dec=false;

        }
    }
    return inc || dec;

    }

    public static void main(String[] args){
        ArrayList<Integer>nums=new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(4);
        nums.add(3);
        System.out.println(monotonicAL(nums));
    }
    
}

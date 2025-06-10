import java.util.*;
public class WaterContainer {

    public static int waterContainer(ArrayList<Integer>height){
        //Brute force
        /*int maxWater=0;

        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int Height=Math.min(height.get(i),height.get(j));
                int width=j-1;
                int waterStored=Height*width;

                if(maxWater<waterStored){
                    maxWater=waterStored;

                }
            }
        }
        return maxWater;*/

        //2 pointer tech

        int maxWater=0;
        int lp=0,rp=height.size()-1;
        while(lp<rp){

            //calculate
            int ht=Math.min(height.get(lp),height.get(rp));
            int width=rp-lp;
            int waterStored=ht*width;
            maxWater=Math.max(maxWater,waterStored);

            //update
            if(height.get(lp)<height.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }


    public static void main(String[] args){
        ArrayList<Integer>height=new ArrayList<>();
        //adding heights
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println("Maximum water that can be stored: "+waterContainer(height));
    }
    
}

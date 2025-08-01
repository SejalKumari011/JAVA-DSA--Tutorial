import java.util.Comparator;
import java.util.Arrays;

public class fractionalKnapSack {

    public static void main(String [] args){
        int value[]={60,100,120};
        int weight[]={10,20,30};
        int w=50;

        double ratio[][]=new double[value.length][2];
        for(int i=0;i<value.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=value[i]/(double)weight[i];
        }
       int capacity=w;
       int finalVal=0;  
        Arrays.sort(ratio, Comparator.comparingDouble(o->o[1]));
        for(int i=ratio.length-1;i>=0;i--){
            int idx=(int)ratio[i][0];
            if(capacity>=weight[idx]){
                finalVal+=value[idx];
                capacity-=weight[idx]; 

            }else{
                finalVal+=capacity*ratio[i][1];
                capacity=0;
                break;
            }
        }
        System.out.println("Final value: "+finalVal);
    }
    
}

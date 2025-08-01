import java.util.Comparator;
import java.util.ArrayList;
import java.util.Arrays;

public class IndianCoins {
    public static void main(String [] args){
        Integer Coins[]={1,2,5,10,20,50,100,500,2000};
        Arrays.sort(Coins, Comparator.reverseOrder());

        int amount=590;
        int countCoins = 0;
        ArrayList<Integer> ans=new ArrayList<>();

        for(int i=0;i<Coins.length;i++){
            if(Coins[i]<=amount){
                while(Coins[i]<=amount){
                    countCoins++;
                    ans.add(Coins[i]);  
                    amount-=Coins[i];
                }
            }
        }
        System.out.println("No of coins:"+countCoins);
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));

        }
    }
    
}
